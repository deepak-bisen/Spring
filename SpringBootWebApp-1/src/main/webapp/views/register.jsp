<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Register</title>
<link rel="stylesheet" href="css/style.css" />
</head>
<body class="body_bg">
	<h2>Register Here</h2>
	<br />

	<c:if test="${not empty successMsg}">
		<h4 style="color: green">${successMsg}</h4>
	</c:if>

	<c:if test="${not empty errorMsg}">
		<h4 style="color: red">${errorMsg}</h4>
	</c:if>


	<form action="regForm" method="post">
		<br /> Name : <input type="text" name="name" /> <br /> Email : <input
			type="email" name="email" /> <br /> Password : <input type="password"
			name="password" /><br /> Contact : <input type="text" name="phoneno" /><br />
		<input type="submit" value="Register" />

		<h4>
			if already registered <a href="loginPage">click here</a>
		</h4>
	</form>
</body>
</html>