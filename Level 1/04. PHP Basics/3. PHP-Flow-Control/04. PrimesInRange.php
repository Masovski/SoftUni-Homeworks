<?php
$result = "";
if($_SERVER['REQUEST_METHOD'] === 'POST') {
    $start = $_POST['start'];
    $end = $_POST['end'];
    for($i = $start; $i <= $end; $i++) {
        if(isPrime($i)) {
            $result .= "<strong>$i</strong>,";
        } else {
            $result .= "$i,";
        }
    }
    $result = rtrim($result, ",");
}
function isPrime($num) {

    if($num == 1) {
        return false;
    }

    if($num == 2) {
        return true;
    }

    if($num % 2 == 0) {
        return false;
    }

    return true;
}
?>

<!DOCTYPE html>
<html>
<head>
    <title>Primes in Range</title>
</head>
<body>
    <form method="post">
        <input type="number" name="start"/>
        <input type="number" name="end"/>
        <input type="submit"/>
    </form>
    <?= $result; ?>
</body>
</html>