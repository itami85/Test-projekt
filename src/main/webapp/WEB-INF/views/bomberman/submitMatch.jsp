<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>{$siteName}</title>
    <meta name="description" content=""/>

    <spring:url value="/resources/gradients.css" var="gradientsCss"/>
    <spring:url value="/resources/styles.css" var="stylesCss"/>
    <spring:url value="/resources/set-background.js" var="setBackgroundJs"/>
    <spring:url value="/resources/tweet.svg" var="tweetSvg"/>

    <link href="${stylesCss}" rel="stylesheet">
</head>
<body class="">
<div class="wrapper">
    SUBMITMATCH
</div>

<footer>
    <p class="footer-contents">Designed and developed with <a href="https://aws.amazon.com/careers/devtools-jobs/">♥</a> in Seattle.</p>
</footer>
</body>
</html>
