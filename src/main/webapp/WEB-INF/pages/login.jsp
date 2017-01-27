<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<c:set var="contextPath" value="${pageContext.request.contextPath}" />
<!DOCTYPE HTML>
<html>

<head>

	<meta http-equiv="content-type" content="text/html; charset=UTF-8" />
	<link href="${contextPath}/resources/css/login.css" rel="stylesheet"/>
	<title>CRUD</title>

</head>
<body>

<div id="title">

	Вас приветствует менеджер <b>C</b>reate <b>R</b>ead <b>U</b>pdate <b>D</b>elete

</div>
<div id="form-control">

	<b>Авторизация</b>

	<form method="post" action="${contextPath}/login" id="form-action">

		<ul>

			<li>Логин: <input name="username" autofocus="true" placeholder="Логин" style="margin-left:10px;" type="text"/></li>
			<li>Пароль: <input name="password" type="password" placeholder="Пароль"/> </li>
			<span>${error}</span>
			<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
			<li><input id="btn-sbm" type="submit" value="Войти" /></li>

		</ul>

	</form>
</div>

</body>

</html>