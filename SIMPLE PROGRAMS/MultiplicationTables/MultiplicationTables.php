<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>MULTIPLICATION</title>
	<link rel="stylesheet" type="text/css" href="Multiplication Tables(C).css" />
</head>
<body>
	
	<p id="head"> MULTIPLICATION TABLE </p><hr />
	
	<form method="post" action="Multiplication Tables(C).php">
	
		<p class="input" > ENTER THE VALUE OF TILL <input id="t" type="textbox" name="t" /></p>
		<p class="input" > ENTER THE VALUE OF LENGTH <input id="l" type="textbox" name="l" /></p>		
		<button name ="sent" onclick="process()" >SEND RAW</button><hr />
	</form>
	<p id="answer"> </p>




	<?php

	if(isset($_POST['sent'])){

		$xml = simplexml_load_file("Multiplication Tables(C).xml");
	
		$xml->t=($_t=$_POST['t']);
		$xml->l=($_l=$_POST['l']);
		
		
		for($i=1;$i<=$_l;$i++){
			for($j=1;$j<=$_t;$j++){
				
				echo $i."X".$j."=".$i*$j."<br />" ;				
			
			}
			echo "<br />";
		}

		$xml->asXml("Multiplication Tables(C).xml");
		
	}
	?>

</body>
</html>
