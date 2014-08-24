<?php
function printRows() {
    $sum = 0;
    for($i = 0; $i <= 100; $i++) {
        if($i % 2 == 0) {
            $sum += sqrt($i);
            $sqrtRounded = round(sqrt($i), 2);
            echo "<tr><td>$i</td><td>$sqrtRounded</td></tr>";
        }
    }
    $sum = round($sum, 2);
    echo "<tr><td><strong>Sum:</strong></td><td>$sum</td></tr>";
}
?>
<!DOCTYPE html>
<html>
<head>
    <title>Square Root Sum</title>
    <style>
        table {
            border-collapse: collapse;
        }
        tr, th, td {
            border: 1px solid #000;
            padding: 10px;
            text-align: center;
        }
    </style>
</head>
<body>
    <table>
        <thead>
            <tr>
                <th>Number</th>
                <th>Sqrt Number</th>
            </tr>
        </thead>
        <tbody>
            <?= printRows(); ?>
        </tbody>
    </table>
</body>
</html>