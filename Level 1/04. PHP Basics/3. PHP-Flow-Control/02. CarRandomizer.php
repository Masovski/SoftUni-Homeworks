<?php
$result = "";
if($_SERVER['REQUEST_METHOD'] === 'POST') {
    $cars = preg_split("/[, ]+/", $_POST['input']);
    $colors = ['black', 'yellow', 'white', 'blue', 'red', 'green', 'purple', 'gray', 'magenta', 'orange', 'sky blue'];


    foreach($cars as $car) {
        $randColor = rand(0,10);
        $count = rand(1, 8);
        $color = $colors[$randColor];

        $result .= "<tr><td>$car</td><td style=\"background-color: $color;\"></td><td>$count</td></tr>";
    }
}
?>

<!DOCTYPE html>
<html>
<head>
    <title>Car Randomizer</title>
    <style>
        table {
            margin: 0 65px;
            margin-top: 10px;
        }
        th, td, tr {
            padding: 5px;
        }

    </style>
</head>
<body>
    <form method="post">
        <label for="input">Enter cars
        <input type="text" name="input" id="input"/></label>
        <input type="submit" value="Show Result"/>

        <table border="1">
            <thead>
                <tr>
                    <th>Car</th>
                    <th>Color</th>
                    <th>Count</th>
                </tr>
            </thead>
            <tbody>
                <?= $result; ?>
            </tbody>
        </table>

    </form>
</body>
</html>