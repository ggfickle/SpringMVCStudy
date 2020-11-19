<%--
  Created by IntelliJ IDEA.
  User: JulCat
  Date: 2020/11/18
  Time: 23:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="https://code.jquery.com/jquery-3.1.1.min.js"></script>
    <script>
        function a1() {
            $.post({
                url:"${pageContext.request.contextPath}/a1",
                data:{"name":$("#txtName").val()},
                success:function (data,status) {
                    console.log(data);
                    console.log(status);
                }
            })
        }
    </script>
</head>
<body>
用户名:<input type="text" id="txtName" onblur="a1()"/>
</body>
</html>
