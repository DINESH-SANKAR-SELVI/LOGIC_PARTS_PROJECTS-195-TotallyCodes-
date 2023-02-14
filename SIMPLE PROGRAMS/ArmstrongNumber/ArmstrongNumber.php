<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Armstrong Number</title>
</head>
<body>

    <form action="$_SERVER['PHP_SELF']" method="post" >

        <input type=text name='input' />

        <input type=submit name=verify />

    </form>

<?php

    if(is($_POST['verify'])){

        echo "<h1>work</h1>";

    }

?>

    
</body>
</html>