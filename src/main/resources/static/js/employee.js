var name;

function saveEmployee () {
	name = document.getElementById("name").value;
	
	var json = '{"name": "' + name + '"}';
	
	var xhttp = new XMLHttpRequest();
	xhttp.onreadystatechange = function() {
		if (this.readyState == 4 && this.status == 200) {
			alert(this.responseText);
		}
	};

	xhttp.open("POST", "http://localhost:8080/saveEmployee", true);
	xhttp.setRequestHeader("Content-type", "application/json");
	xhttp.send(json);
}

function updateEmployee (id) {
	name = document.getElementById("name").value;
	
	var json = '{"id": "' + id + '", "name": "' + name + '"}';
	
	var xhttp = new XMLHttpRequest();
	xhttp.onreadystatechange = function() {
		if (this.readyState == 4 && this.status == 200) {
			alert(this.responseText);
		}
	};

	xhttp.open("POST", "http://localhost:8080/updateEmployee", true);
	xhttp.setRequestHeader("Content-type", "application/json");
	xhttp.send(json);
}

function deleteEmployee (id) {
	name = document.getElementById("name").value;
	
	var json = '{"id": "' + id + '", "name": "' + name + '"}';
	
	var xhttp = new XMLHttpRequest();
	xhttp.onreadystatechange = function() {
		if (this.readyState == 4 && this.status == 200) {
			alert(this.responseText);
		}
	};

	xhttp.open("POST", "http://localhost:8080/deleteEmployee", true);
	xhttp.setRequestHeader("Content-type", "application/json");
	xhttp.send(json);
}

function show () {
	var checkbox = document.getElementById("checkbox");
	var visual = "none";
	
	if(checkbox.checked){
		visual = "block";
	}
	
	document.getElementById("partnerInput").style.display = visual;
}

function showAllEmployees() {
	
	document.getElementById('tableId').innerHTML = null;
	
	var employees;
	
	var xhttp = new XMLHttpRequest();
	xhttp.onreadystatechange = function() {
		if (this.readyState == 4 && this.status == 200) {
			employees = JSON.parse(this.responseText);
		}
	};

	xhttp.open("GET", "http://localhost:8080/getEmployees", false);
	xhttp.setRequestHeader("Content-type", "application/json");
	xhttp.send();
	
	//Create a dynamic table of all the employees
	var div = document.getElementById("tableId");
	
	if (employees.length == 0) {
		div.innerHTML += "<tr><td>There are no employees.</td></tr>";
	} else {
		div.innerHTML = "<tr><th>Id</th><th>Name</th><th>Partner</th></tr>";
		for (var i = 0; i < employees.length; i++) {
			div.innerHTML += "<tr><td>" + employees[i].id + "</td>" +
			"<td>" + employees[i].name + "</td>" +
			"<td>" + employees[i].partner + "</td>" +
			"<td><button onclick=\"deleteEmployee("+employees[i].id+")\">Delete employee</button></td></tr>";
		}
	}
}