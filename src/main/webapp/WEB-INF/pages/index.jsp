<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!DOCTYPE HTML>
<html>

<head>

    <meta http-equiv="content-type" content="text/html; charset=UTF-8" />
    <link href="../../resources/css/index.css" rel="stylesheet" type="text/css" />
    <title>CRUD</title>

</head>
<body>

<div id="title">

    Вас приветствует менеджер <b>C</b>reate <b>R</b>ead <b>U</b>pdate <b>D</b>elete

</div>
<div id="form-control">

    Выберите действие:

    <div id="form-action">

        <ul>

            <li><a href="<c:url value="/notes"/>"><b>Просмотреть полный список</b></a> <span>[кол-во записей: ${count}]</span></li>
            <!-- Уж простите, но все ниже для массовки -->
            <li><a href="<c:url value="/create"/>">Добавить запись</a></li>
            <li><a href="<c:url value="/update"/>">Изменить запись</a></li>
            <li><a href="<c:url value="/delete"/>">Удалить запись</a></li>
            <li><a href="<c:url value="/login?logout"/>">Выйти</a></li>

        </ul>

    </div>
    <div id="form-footer">

        Version 0.0.000 alpha
    </div>

</div>

</body>

</html>
