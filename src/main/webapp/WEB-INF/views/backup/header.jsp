<%--
  Created by IntelliJ IDEA.
  User: sohyeoncho
  Date: 2022/09/25
  Time: 4:22 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!DOCTYPE html>
<link rel="stylesheet" href="${path}/resources/css/header.css">

<header class="Header">
    <div class="banner">
        <strong>[공지] 2022년 엘릭시르 미스터리 대상 작품 공모</strong>
    </div>
    <div class="menu inner">
        <h1 class="logo">
            <a href="${path}/">ELIXIR</a>
        </h1>
        <nav class="gnb">
            <ul>
                <li><a href="">ABOUT US</a></li>
                <li><a href="${path}/product/main">BOOKS</a></li>
                <li class="on"><a href="">MYSTERIA</a></li>
                <li><a href="">NEWS</a></li>
                <li><a href="">CONTACT</a></li>
            </ul>
        </nav>
        <div class="user">
            <a href="${path}/user/signIn">로그인</a>
        </div>
    </div>
</header>