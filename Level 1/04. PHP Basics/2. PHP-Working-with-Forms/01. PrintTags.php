<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8"/>
    <title>Print Tags</title>
</head>
<body>
<form action="" method="post">
    <input type="text" name="input"/>
    <input type="submit"/>
</form><br/>
<?php
if($_SERVER['REQUEST_METHOD'] === 'POST') {
    $arr = explode(", ", $_POST['input']);
    foreach($arr as $key => $value) {
        echo "$key : $value <br/>";
    }
}
?>
</body>
</html>