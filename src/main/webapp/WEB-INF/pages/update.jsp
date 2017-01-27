<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
  <meta http-equiv="content-type" content="text/html; charset=UTF-8" />
  <link href="../../resources/css/main.css" rel="stylesheet" type="text/css" />
  <title>Update Records</title>
</head>
<body>
<b><a href="<c:url value="/index"/>">Вернуться назад</a></b>
<br>
<span>Список записей</span>
<div class="readme">
  Нажмите по записи чтобы изменить ее
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
          <td><a href="<c:url value="/update/${note.id}"/>">${note.id}</a></td>
          <td>${note.date}</td>
          <td>${note.note}</td>
        </tr>
      </c:forEach>

    </table>
  </div>
  <c:if test="${!empty note.date}">
    <div class="form-edit">
      <form:form action="/create/add" commandName="note">
        <form:label path="id">
          <spring:message text="ID: " />
        </form:label>
        <form:input path="id" readonly="true" disabled="true"/>
        <form:hidden path="id" />
        <br>
        <form:label path="date">
          <spring:message text="Дата публикации: "/>
        </form:label>
        <form:input path="date" disabled="true" readonly="true" />
        <br>
        <form:label path="note">
          <spring:message text="Запись: "/>
        </form:label>
        <form:input path="note" maxlength="200" />
        <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
        <input type="submit" value="<spring:message text="Отправить"/>"/>
      </form:form>
    </div>
  </c:if>

</c:if>
<c:if test="${empty listNotes}">
  <h2>Список пуст</h2>
</c:if>

</body>
</html>
