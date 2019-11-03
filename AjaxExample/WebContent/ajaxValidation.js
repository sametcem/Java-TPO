var req

function validate() {
	var idField = document.getElementById("name");
	var data = "name=" + encodeURIComponent(idField.value);
	if (typeof XMLHttpRequest != "undefined") {
		req = new XMLHttpRequest();
	} else if (window.ActiveXObject) {
		req = new ActiveXObject("Microsoft.XMLHTTP");
	}
	var url = "Validator"
	req.open("POST", url, true);        
	req.onreadystatechange = inserter
	req.setRequestHeader("Content-Type", "application/x-www-form-urlencoded");
	req.send(data);
}

function inserter() {
	if (req.readyState == 4) {
		if (req.status == 200) {
			var msg = req.responseText
			if (msg == "") {
				document.getElementById("msg").innerHTML = "<div style=\"color:red\">Wrong Name</div>";
				document.getElementById("org").value = ''
			}
			else
				document.getElementById("org").value = msg
		}
	}
}