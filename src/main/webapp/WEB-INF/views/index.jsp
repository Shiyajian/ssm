<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="ctx" value="${pageContext.request.contextPath}" />
<!DOCTYPE HTML>
<html>
<body>
	<h2>Hello World!</h2>
	<input type="text" name="account" />
	<br>
	<input type="password" name="password" />
	<br>
	<button type="submit">登录</button>	
	<script src="${ctx}/static/core/jquery/jquery-3.2.1.min.js"></script>
	<script src="${ctx}/static/core/jquery-validator/jquery.validate.min.js"></script>
</body>
</html>
