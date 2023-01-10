<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>AREA AND PERIMETER</title>
    <link rel="stylesheet" href="Area And Perimeter Of A Square And Rectangle(C).css" />
</head>
    <p id = "Head">AREA AND PERIMER FOR RECTANGLE</p><hr />
    <form method="POST" action="<?php $_SERVER['PHP_SELF']?>" >
        <p id="Valuelen">ENTER THE VALUE OF LENGTH :-<input type="text" name="len" id="Len" value="6" placeholder="6" title="(L*W)"/></p>
        <p id="Valuewid">ENTER THE VALUE OF WIDTH  :-<input type="text" name="wid" id="Wid" value="4" placeholder="4" title="2*(LEN+WID)" /></p>
        <input type="submit" id="Submit" value="PROCESS" name="SUBMIT" /><hr />
    </form>

<?php

    if(isset($_POST["SUBMIT"])){

        $xml = simplexml_load_file("Area And Perimeter Of A Square And Rectangle(C).xml");

        echo "<p id='Main' >".$_POST['len'] * $_POST['wid']."</p><hr />";

        echo "<p id='XmlTitle' >"."USING XML"."</p><hr />";

        $xml->len = $_POST["len"];

        $xml->wid = $_POST["wid"];

        echo "<p id='xmlmain'>".$xml->len * $xml->wid."</p><hr />";
    }
?>
    <p id="jstitle">USING JAVA SCRIPT</p><hr />
    <p id="jsmain" ></p>

<script src="Area And Perimeter Of A Square And Rectangle(C).js"></script>
</body>
</html>