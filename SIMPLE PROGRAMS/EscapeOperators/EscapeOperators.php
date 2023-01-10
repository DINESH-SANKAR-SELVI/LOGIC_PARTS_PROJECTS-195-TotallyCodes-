<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Escape Operators</title>
    <link rel="stylesheet" type="text/css" href="Escape Operators(C).css" />
</head>
<body>
<p id="Head">Escape Operators</p><hr />   

<?php
/*

(NOT FOR PHP)        \a - ALERT
(NOT FOR PHP)        \b - BACK SPACE
        \t - TAB
        \v - VERTICAL TAB
(NOT FOR PHP)        \n - NEW LINE
        \f - FORM FEED
        \r - CARRIAGE RETURN
        \" - DOUBLE QUOTE
(NOT FOR PHP)        \' - SINGLE QUOTE
(NOT FOR PHP) \? - PRINT QUIZ MARK
       \\ - BACK SLASH
        \0 - NULL
        \ooo - OCTAL
        \xhh - HEX DECIMAL
(NOT FOR PHP)        \uxxxx - UNICODE VALUE IN 16 BIT
(NOT FOR PHP)        \uxxxxxxxx - UNICODE VALUE IN 32 BIT

*/

print "\r - CARRIAGE RETURN        \t - TAB     \v - VERTICAL TAB        \f - FORM FEED        \" - DOUBLE QUOTE        \\ - BACK SLASH        \065 - OCTAL        \x24 - HEX DECIMAL     NULL - \0 ";

$xml = simplexml_load_file("Escape Operators(C).xml") or die("unable to load");
echo "<p id='xmlhead'><hr /><br /><br /><br />XML</p><hr />";
echo $xml->INDEX."<hr />";

?>
</body>
</html>