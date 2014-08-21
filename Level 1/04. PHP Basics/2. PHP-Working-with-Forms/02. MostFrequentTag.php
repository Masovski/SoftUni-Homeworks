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
    $counts = array_count_values($arr);
    arsort($counts);
    foreach($counts as $key => $value) {
        echo "$key : $value <br/>";
    }
    reset($counts);
    echo "Most Frequent Tag is: " . key($counts);
}
?>
</body>
</html>