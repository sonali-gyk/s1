<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@page isELIgnored="false"%>
<!doctype html>
<html lang="en">
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">

<title>Hello, world!</title>
</head>
<body>



	<div class="container mt-5">

		<h3 class="text-center">${Header}</h3>
		<p class="text-center">${Desc }</p>

		<form action="add" method="post">

			<div class="form-group">
				<label for="exampleName">name</label> <input type="text"
					class="form-control" id="exampleName" aria-describedby="emailHelp"
					placeholder="Enter name" name="name" required="required">
			</div>


			<div class="form-group">
				<label for="useradd">address</label> <input type="text"
					class="form-control" id="useradd" aria-describedby="emailHelp"
					placeholder="Enter here" name="address" required="required">
			</div>
			<div class="form-group">
				<label for="userNumber">number</label> <input type="text"
					class="form-control" id="userNumber" aria-describedby="emailHelp"
					placeholder="Enter here" name="number" maxlength="16"
					minlength="16" required="required">
			</div>
			<div class="form-group">
				<label for="userPro">profession</label> <input type="text"
					class="form-control" id="userPro" aria-describedby="emailHelp"
					placeholder="Enter here" name="profession" required="required">
			</div>
			<div class="form-group">
				<label for="userCitizen">citizenship</label> 

  <select name="citizenship" id="cars">
    <option value="volvo">Indian</option>
    <option value="saab">NRI</option>
    <option value="opel">NRO</option>
  </select>
			</div>
			<div class="form-group">
				
					  <input type="radio" id="html" name="gender" value="HTML">
  <label for="html"></label>female
  <input type="radio" id="css" name="gender" value="CSS" checked>
  <label for="css"></label>male<br>
 
			</div>
			<div class="form-group">
				<label for="user">date of birth</label> <input type="date"
					class="form-control" id="user" aria-describedby="emailHelp"
					placeholder="Enter here" name="dob" required="required">
			</div>
						<div class="form-group">
				<label for="useraddi">balance</label> <input type="number"
					class="form-control" id="useraddi" aria-describedby="emailHelp"
					placeholder="Enter here" name="balance" required="required" value="500" minlength="3">
			</div>
			


			<div class="container text-center">

				<button type="submit" class="btn btn-success">Sign up</button>


			</div>
		</form>

	</div>



	<!-- Optional JavaScript -->
	<!-- jQuery first, then Popper.js, then Bootstrap JS -->
	<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
		integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
		crossorigin="anonymous"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"
		integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
		crossorigin="anonymous"></script>
	<script
		src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"
		integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
		crossorigin="anonymous"></script>
</body>
</html>