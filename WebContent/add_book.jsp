<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>添加图书页面</title>
</head>
<body>
	<form action="<%=request.getContextPath()%>/book/addBook.do"
		method="post">

		<c:if test="${errors!=null}">
			<c:forEach items="${errors}" var="e">
				${e.defaultMessage}<br>
			</c:forEach>
		</c:if>


		bookId:<input type="text" name="bookId" /><br> bookName:<input
			type="text" name="bookName" /><br> intoStoreTime:<input
			type="text" name="intoStoreTime" /><br> publishName:<input
			type="text" name="publishName" /><br> price:<input type="text"
			name="price" /><br> <input type="submit" value="添加" />

	</form>
</body>
</html>