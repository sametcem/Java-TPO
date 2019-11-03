<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>

<html>
<head>
<meta charset="ISO-8859-1">
<title>AJAX CALCULATOR</title>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script>
	
	$(document).ready(function() {
		$("input#a").keydown(function() {
			$("input#a").css("background-color", "yellow");
		});

		$("input#a").keyup(function() {
			$("input#a").css("background-color", "pink");
		});
		
		$("input#b").keydown(function() {
			$("input#b").css("background-color", "yellow");
		});

		$("input#b").keyup(function() {
			$("input#b").css("background-color", "pink");
		});

		$("input#a").keyup(function() {
			$.get("calculate", {
				a : $("#a").val(),
				b : $("#b").val()
			}, function(data) {
				$("#result").html(data);
			});
		});

		$("input#b").keyup(function() {
			$.post("calculate", {
				a : $("#a").val(),
				b : $("#b").val()
			}, function(data) {
				$("#result").html(data);
			});
		});

		$("input#b").click(function() {
			$.get("calculate", {
				a : $("#a").val(),
				b : $("#b").val()
			}, function(data) {
				$("#result").html(data);
			});
		});

		$("input#a").click(function() {
			$.post("calculate", {
				a : $("#a").val(),
				b : $("#b").val()
			}, function(data) {
				$("#result").html(data);
			});
		});

	});
</script>
	</head>
	<body>
	  <input style="position: absolute; top: 60px; left: 0px;" type="text" value="0" id="a"/>
	  <input style="position: absolute; top: 60px; left: 250px;" type="text" value="0" id="b"/>
	  <div style="position: absolute; top: 250px; left: 130px;" id="result"></div>
	</body>
</html>