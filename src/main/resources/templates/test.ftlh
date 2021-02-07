<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>userlist</title>
</head>
<body>
第一个FreeMaker模板页面
<table border = "1">
    <tr>
        <td>编号</td>
        <td>名称</td>
        <td>年龄</td>
    </tr>
    <#list userList as user>
        <tr>
            <td>${user.id}</td>
            <td>${user.name}</td>
            <td>${user.age}</td>
        </tr>
    </#list>
</table>
</body>
</html>