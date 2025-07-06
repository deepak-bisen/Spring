<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
<link rel="stylesheet" href="css/style.css" />
</head>
<body class="body_bg">
	<h2>Login Here</h2>
	<br />


	<c:if test="${not empty errorMsg}">
		<h4 style="color: red">${errorMsg}</h4>
	</c:if>


	<form action="loginForm" method="post">
		<br /> Email : <input type="email" name="email" /> <br /> Password : <input
			type="password" name="password" /><br /> <input type="submit"
			value="Login" />

		<h4>
			if not registered <a href="regPage">click here</a>
		</h4>
	</form>
</body>
</html>