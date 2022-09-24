<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="f" uri="http://java.sun.com/jsp/jstl/fmt" %>
<c:set var="path" value="${pageContext.request.contextPath}" scope="session"/>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8"/>
	<title>Elixir</title>
</head>
<body>
<h1>
	작업은 여기서 합니다.
</h1>
<a href="${path}/user/signIn">로그인페이지</a>
<a href="${path}/user/signUp">회원가입페이지</a>
<a href="${path}/product/main">상품페이지</a>

<P>노동자들에게 인사를... ${hello}</P>
</body>
</html>
