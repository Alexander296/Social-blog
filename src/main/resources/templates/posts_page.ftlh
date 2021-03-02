<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0,
          maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
</head>
<body>
<a href="/logout">Выйти</a>
    <div>
        <table>
            <tr>
                <th>TEXT</th>
            </tr>
            <#list posts as post>
                <tr>
                    <td>${post.text}</td>
                </tr>
            </#list>
        </table>
    </div>
    <div>
        <form action="/addPosts" method="post">
            <input type="text" name="text">
            <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}">
            <input type="submit" value="Submit">
            </form>
</div>
</body>
</html>