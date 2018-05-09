
<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, user-scalable=yes">
<link rel='stylesheet prefetch'
	href='https://fonts.googleapis.com/css?family=Open+Sans'>
<link rel="stylesheet" href="../../resources/css/style.css">

</head>
<body>
<form:form method="post" modelAttribute="user" action="loginUser">
	<div class="cont" style="width: 100% !important; position: absolute !important;">
		<div class="demo">
			<div class="login">
				<div class="login__check"></div>
				<div class="login__form">
					<div class="login__row">
						<form:input path="userName" type="text" class="login__input name"
							placeholder="Username"/>
						
					</div>
					<div class="login__row">
						<form:input path="password" type="password" class="login__input pass"
							placeholder="Password"/>
						
					</div>
					<input type="submit" class="login__submit">Sign in</button>
					<p class="login__signup">
						Don't have an account? &nbsp;<a>Sign up</a>
					</p>
				</div>
			</div>
		</div>
	</div>
	</form:form>
	<script
		src='http://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script>
	<script src="../../resources/js/index.js"></script>
</body>
</html>
