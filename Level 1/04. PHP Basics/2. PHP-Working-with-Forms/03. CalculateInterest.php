<?php
header("Content-Type: text/html; charset=UTF-8");
$result = null;

if($_SERVER['REQUEST_METHOD'] === 'POST') {
    $months = $_POST['timePeriod'];
    $amount = $_POST['amount'];
    $cintAmount = $_POST['cintAmount'];
    $monthlyInterest = (($cintAmount / 12) / 100) + 1;

    for($i = 0; $i < $months; $i++) {
        $amount *= $monthlyInterest;
    }

    $amount = round($amount, 2);
    switch($_POST['currency']) {
        case "USD":
            $result = "$ $amount";
            break;
        case "EUR":
            $result = "€ $amount";
            break;
        case "BGN":
            $result = "$amount лв";
            break;
    }
}
?>
<form method="post">
    Enter Amount
    <input type="text" name="amount"/><br>
    <label for="usd"><input type="radio" name="currency" id="usd" value="USD" checked/>USD</label>
    <label for="eur"><input type="radio" name="currency" id="eur" value="EUR"/>EUR</label>
    <label for="bgn"><input type="radio" name="currency" id="bgn" value="BGN"/>BGN</label><br>
    Compound Interest Amount
    <input type="text" name="cintAmount"/><br>
    <select name="timePeriod">
        <option value="6">6 Months</option>
        <option value="12">1 Year</option>
        <option value="24">2 Years</option>
        <option value="60">5 Years</option>
    </select>

    <input type="submit" value="Calculate">
    <?=$result; ?>
</form>