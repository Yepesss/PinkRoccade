var baseUrl = "http://localhost:8080";

function save (){
	var name = document.getElementById("name").value;
	
	var gebruikerGegevens = '{"name": "' + name + '"}';
	
	var xhttp = new XMLHttpRequest();
	xhttp.onreadystatechange = function() {
		if (this.readyState == 4 && this.status == 200) {

		}
	};

	xhttp.open("POST", baseUrl + "/save", true);
	xhttp.setRequestHeader("Content-type", "application/json");
	xhttp.send(gebruikerGegevens);
}