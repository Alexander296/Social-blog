<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
</head>
<body>
<form action="/signIn" method="post">
    <input name="email" placeholder="email">
    <input name="password" type="password" placeholder="password">
    <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}">
    <label>
        <input type="checkbox" name="remember-me">Запомни меня
    </label>
    <input type="submit" value="Sign In">
</form>
</body>
</html>
