<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/3/14
  Time: 11:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>入门案例</title>
    <script src="js/jquery-3.3.1.js"></script>
</head>
<body>


<input id="ss" type="button" value="按钮">
<%--<form action="user/test" method="post">--%>
<%--姓名:<input type="text" name="uname">--%>
<%--年龄:<input type="text" name="age">--%>
<%--生日:<input type="text" name="date">--%>
<%--<input type="submit" name="date">--%>
<%--</form>--%>


<script>
    $(function () {
        $("#ss").click(function () {
          /*  $.ajax({
                url: "user/testJson",
                contentType: "application/json;charset=UTF-8",
                data: '{"uname":"aa","age":100}',
                dataType: "json",
                type: "post",
                success: function (data) {
                    alert(data);
                    alert(data.addressName);
                }
            });*/
        });
    });
</script>
</body>
</html>
