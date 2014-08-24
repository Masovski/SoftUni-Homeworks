<?php
$result = "";

if($_SERVER['REQUEST_METHOD'] === 'POST') {
    $n = $_POST['input'];
    $currentYear = getdate()['year'];
    $months = "";
    $rows = "";

    for ($m=1; $m<=12; $m++) {
        $months .= '<th>'. date('F', mktime(0,0,0,$m)) .'</th>' . PHP_EOL;
    }
    for($i = 0; $i < $n; $i++) {
        $year = $currentYear - $i;
        $total = 0;
        $rows .= "<tr>";
        $rows .= "<td>$year</td>";

        for ($j = 0; $j < 12; $j++) {
            $randomNumber = rand(0, 999);
            $total += $randomNumber;
            $rows .= "<td>$randomNumber</td>";
        }
        $rows .= "<td>$total</td>";
        $rows .= "</tr>";
    }
    $result =
    "<table border=\"1\">
        <thead>
            <th>Year</th>
            $months
            <th>Total:</th>
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
    <title>Annual Expenses</title>
</head>
<body>
    <form method="post">
        <label for="input">Enter number of years:
        <input type="text" name="input" id="input"/></label>
        <input type="submit" value="Show Costs"/>
    </form>
<?= $result; ?>
</body>
</html>