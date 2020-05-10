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

<h2>Basic HTML Table</h2>

<table style="width:100%">
    <tr>
        <th>ID</th>
        <th>Category Name</th>
    </tr>
    <#list categories as c>
    <tr>
        <td>${c.getId()}</td>
        <td>${c.getCategoryName()}</td>
    </tr>
    </#list>

</table>


</body>
</html>