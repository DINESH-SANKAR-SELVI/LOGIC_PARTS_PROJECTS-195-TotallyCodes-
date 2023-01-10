<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>BIGGEST</title>
    <link rel="stylesheet" type="text/css" href="To Find Out Biggest Number Out Of Three Numbers(C).css" />
</head>
<body>
    <p id="head">BIGGEST VALUE FIND</p><hr />
    <form method="post" action="To Find Out Biggest Number Out Of Three Numbers(C).php">
        
        <p class="input" >ENTER THE FIRST VALUE :<input type="text" id="first" name="f" /></p>
        <p class="input" >ENTER THE SECOND VALUE :<input type="text" id="second" name="s"/></p>
        <p class="input" >ENTER THE THIRD VALUE :<input type="text" id="third" name="t"/></p>
        <p class="input" ><button name="sent" onclick="check()">SEND VALUE</button></p>
    </form>
    <hr />
<?php


if(isset($_POST['sent'])){

    $xml=simplexml_load_file("To Find Out Biggest Number Out Of Three Numbers(C).xml") or die("didn't");
    
    $_a=($xml->first=$_POST['f']);
    $_b=($xml->second=$_POST['s']);
    $_c=($xml->third=$_POST['t']);

    if(($_a>$_b)&&($_a>$_c)){
        
        $xml->result=$xml->first;
    }
    else if(($_b>$_a)&&($_b>$_c)){

        $xml->result=$xml->second;
    }
    else{
        $xml->result=$xml->third;
    }
    $xml->asXML("To Find Out Biggest Number Out Of Three Numbers(C).xml");

    echo "<p id=result> THE BEST VALUE IS ".$xml->result."</p><hr />";
}
?>
<script src="To Find Out Biggest Number Out Of Three Numbers(C).js" ></script>
</body>
</html>