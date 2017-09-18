<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
<title>SpringMVC 用户详情</title>

<!-- 新 Bootstrap 核心 CSS 文件 -->
<link rel="stylesheet" href="//cdn.bootcss.com/bootstrap/3.3.5/css/bootstrap.min.css">
</head>
<body>
	<div class="container">
		<h1>SpringMVC 用户详情</h1>
		<hr />

		<table class="table table-bordered table-striped">
			<tr>
				<th>ID</th>
				<td>${user.id}</td>
			</tr>
			<tr>
				<th>Nickname</th>
				<td>${user.nickName}</td>
			</tr>
			<tr>
				<th>User Name</th>
				<td>${user.userName}</td>
			</tr>
			<tr>
				<th>Password</th>
				<td>${user.password}</td>
			</tr>
			<tr>
				<th>Email</th>
				<td>${user.email}</td>
			</tr>
		</table>
	</div>

	<!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
	<script src="//cdn.bootcss.com/jquery/1.11.3/jquery.min.js"></script>

	<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
	<script src="//cdn.bootcss.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
</body>
</html>
