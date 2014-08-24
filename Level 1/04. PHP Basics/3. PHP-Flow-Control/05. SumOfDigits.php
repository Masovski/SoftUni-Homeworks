<?php
$result = "";
if($_SERVER['REQUEST_METHOD'] === 'POST') {
    $input = preg_split("/[,]+/",$_POST['input']);
    $rows = "";
    foreach($input as $item) {
        $sum = "I cannot sum that";

        if(is_numeric($item)) {
            $sum = array_sum(str_split($item));
        }
        $rows .= "<tr><td>$item</td><td>$sum</td></tr>";
    }
    $result =
        "<table border=\"1\">
        <thead>
            <th>Value</th>
            <th>Sum:</th>
        </thead>
        <tbody>
            $rows
        </tbody>
    </table>";
}
?>

<!DOCTYPE html>
<html>
<head>
    <title>Sum of Digits</title>
</head>
<body>
    <form method="post">
        <input type="text" name="input"/>
        <input type="submit"/>
    </form>
    <?= $result; ?>
</body>
</html>