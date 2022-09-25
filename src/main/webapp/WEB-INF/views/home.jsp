<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="f" uri="http://java.sun.com/jsp/jstl/fmt" %>
<c:set var="path" value="${pageContext.request.contextPath}" scope="session"/>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8"/>
	<link rel="icon" href="${path}/resources/img/favicon.jpeg" />
	<link rel="stylesheet" href="${path}/resources/css/common.css">
	<link rel="stylesheet" href="${path}/resources/css/slick.css">
	<link rel="stylesheet" href="${path}/resources/css/main.css">
	<script src="${path}/resources/js/jquery-1.12.4.min.js"></script>
	<script src="${path}/resources/js/slick.min.js"></script>
	<title>Elixir</title>
</head>
<body>
<div class="Wrap">
	<jsp:include page="header.jsp"/>
	<section class="mainVisual">
		<ul class="mainSlider">
			<li>
				<div class="desc inner">
					<h2>장르하는 사람들 -  ELIXIR</h2>
					<p>‘미스터리 잡지 한 권이 만들어지기까지 한 달간의 여정을 따라가다’</p>
					<a href="">바로보기</a>
				</div>
			</li>
		</ul>
	</section>
	<section class="newBook inner">
		<h2>NEW BOOK</h2>
		<p>새로 발간된 책을 소개합니다.</p>
		<div class="newBookSlider">
			<div class="product">
				<figure>
					<img src="${path}/resources/img/image_1660884136399_300.jpeg" alt="" />
				</figure>
				<h3>잠 못 드는 밤의 궁궐 기담</h3>
				<p>현찬양</p>
			</div>
			<div class="product">
				<figure>
					<img src="${path}/resources/img/image_1660884136399_300.jpeg" alt="" />
				</figure>
				<h3>잠 못 드는 밤의 궁궐 기담</h3>
				<p>현찬양</p>
			</div>
			<div class="product">
				<figure>
					<img src="${path}/resources/img/image_1660884136399_300.jpeg" alt="" />
				</figure>
				<h3>잠 못 드는 밤의 궁궐 기담</h3>
				<p>현찬양</p>
			</div>
			<div class="product">
				<figure>
					<img src="${path}/resources/img/image_1660884136399_300.jpeg" alt="" />
				</figure>
				<h3>잠 못 드는 밤의 궁궐 기담</h3>
				<p>현찬양</p>
			</div>
		</div>
	</section>
</div>
</body>
</html>
