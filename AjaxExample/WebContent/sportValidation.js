var request

function validate(){
	var idField = document.getElementById("name");
	var data = "name=" + encodeURIComponent(idField.value);
	
	if (typeof XMLHttpRequest != "undefined"){
		request = new XMLHttpRequest();
	} else if(window.ActiveXObject){
		request = new ActiveXObject("Microsoft.XMLHTTP");
	}
	
	var url = "ValidatorExample"
	request.open("POST",url,true);
	request.onreadystatechange = inserter
	request.setRequestHeader("Content-Type", "application/x-www-form-urlencoded");
	request.send(data);
}

function inserter(){
	if(request.readyState == 4){
		if(request.status == 200){
			var message = request.responseText
			if(message =""){
				document.getElementById("message").innerHTML = "<div style=\"color:red\">Wrong Name</div>";
				document.getElementById("country").value=''
			}else
				document.getElementById("country").value = message
		}
	}
}