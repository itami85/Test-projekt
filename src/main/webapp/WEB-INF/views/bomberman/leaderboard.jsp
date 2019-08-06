<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>${siteName}</title>
<meta name="description" content=""/>

<spring:url value="/resources/gradients.css" var="gradientsCss"/>
<spring:url value="/resources/styles.css" var="stylesCss"/>
<spring:url value="/resources/set-background.js" var="setBackgroundJs"/>
<spring:url value="/resources/tweet.svg" var="tweetSvg"/>

<link href="${stylesCss}" rel="stylesheet">
<link href="${gradientsCss}" rel="stylesheet">
</head>
<body class="">
<div class="wrapper">

    <h1>Bomberman Hall of Fame</h1>


    <table>
        <thead>
        <tr>
            <th>Name</th>
            <th>Spiele</th>
            <th>Siege</th>
            <th>Niederlagen</th>
            <th>Punkte</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="spieler" items="${results}">
            <tr>
                <td>${spieler.name}</td>
                <td>${spieler.spiele}</td>
                <td>${spieler.siege}</td>
                <td>${spieler.niederlagen}</td>
                <td>${spieler.punkte}</td>
            </tr>
        </c:forEach>
        </tbody>
    </table>


</div>

<footer>
    <p class="footer-contents">Designed and developed with <a href="https://aws.amazon.com/careers/devtools-jobs/">♥</a> in Seattle.</p>
</footer>

<script src={$setBackgroundJs}"></script>
</body>
</html>
