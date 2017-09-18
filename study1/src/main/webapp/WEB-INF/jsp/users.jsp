<%@ page contentType="text/html;charset=UTF-8" language="java" import="java.util.*"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html lang="zh-CN">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
<title>USER显示</title>

<!-- 新 Bootstrap 核心 CSS 文件 -->
<link rel="stylesheet" href="//cdn.bootcss.com/bootstrap/3.3.5/css/bootstrap.min.css">
</head>
<body>
	<h1>SpringMVC 用户显示</h1>
	<hr />

	<h3>
		所有用户 <a href="/users/add" type="button" class="btn btn-primary btn-sm">添加</a>
	</h3>

	<!-- 如果用户列表为空 -->
	<c:if test="${empty userList}">
		<div class="alert alert-warning" role="alert">
			<span class="glyphicon glyphicon-info-sign" aria-hidden="true"></span>User表为空，请<a
				href="/users/add" type="button" class="btn btn-primary btn-sm">添加</a>
		</div>
	</c:if>

	<!-- 如果用户列表非空 -->
	<c:if test="${!empty userList}">
		<table class="table table-bordered table-striped">
			<tr>
				<th>ID</th>
				<th>昵称</th>
				<th>姓名</th>
				<th>密码</th>
				<th>邮箱</th>
				<th>操作</th>
			</tr>

			<c:forEach items="${userList}" var="user">
				<tr>
					<td>${user.id}</td>
					<td>${user.nickName}</td>
					<td>${user.userName}</td>
					<td>${user.password}</td>
					<td>${user.email}</td>
					<td><a href="/users/show/${user.id}" type="button"
						class="btn btn-sm btn-success">详情</a> <a
						href="/users/update/${user.id}" type="button"
						class="btn btn-sm btn-warning">修改</a> <a
						href="/users/delete/${user.id}" type="button"
						class="btn btn-sm btn-danger">删除</a></td>
				</tr>
			</c:forEach>
		</table>
	</c:if>

	<!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
	<script src="//cdn.bootcss.com/jquery/1.11.3/jquery.min.js"></script>

	<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
	<script src="//cdn.bootcss.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
</body>
</html>