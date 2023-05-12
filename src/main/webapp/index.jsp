<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html>
<html>
<body>
<h2>Hello </h2>
<form action="${pageContext.request.contextPath}/demo1/demo1test.do" method="get">
    <input type="text" name="userId" placeholder="请输入账号">
    <input type="text" name="userPassword" placeholder="请输入密码">
    <input type="submit" value="提交">
</form>

</body>
</html>
