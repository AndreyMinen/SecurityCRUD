<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
  <meta http-equiv="content-type" content="text/html; charset=UTF-8" />
  <link href="../../resources/css/main.css" rel="stylesheet" type="text/css" />
  <title>Delete Records</title>
</head>
<body>
<b><a href="<c:url value="/index"/>">Вернуться назад</a></b>
<br>
<span>Список записей</span>
<div class="readme">
  Нажмитена запись чтобы ее удалить
</div>
<c:if test="${!empty listNotes}">
  <div class="data_table">
    <table border="1">
      <tr>
        <th>ID</th>
        <th>Дата</th>
        <th>Запись</th>
      </tr>
      <c:forEach items="${listNotes}" var="note">
        <tr>
          <td><a href="<c:url value="/delete/${note.id}"/>">${note.id}</a></td>
          <td>${note.date}</td>
          <td>${note.note}</td>
        </tr>
      </c:forEach>
    </table>
  </div>
</c:if>
<c:if test="${empty listNotes}">
  <h2>Список пуст</h2>
</c:if>
</body>
</html>
