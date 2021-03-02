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
<div>
        <table>
            <tr>
                <th>TEXT</th>
                <th>IMAGE</th>
                <th>AUTHOR</th>
            </tr>
            <#list posts as post>
                <tr>
                    <td>${post.text}</td>
                    <td>${post.author.nickname}</td>
                </tr>
            </#list>
        </table>
    </div>
    <div>
        <form action="/posts" method="post" enctype="multipart/form-data">
            <input type="text" name="text">
            <input type="text" name="author">
            <input type="file" name="picture">
            <input type="submit" value="Submit">
            </form>
</div>
</body>
</html>