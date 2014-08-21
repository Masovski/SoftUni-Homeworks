<?php
mb_internal_encoding('UTF-8');

if ($_POST) {
    //data normalization
    $fname = trim($_POST['firstName']);
    $lname = trim($_POST['lastName']);
    $mail = trim($_POST['email']);
    $phone = trim($_POST['phoneNumber']);
    $bdate = $_POST['birthdate'];
    $nation = $_POST['nationality'];
    $company = trim($_POST['company']);
    $from = $_POST['from'];
    $to = $_POST['to'];
    $pcLang = $_POST['prog-lang'];
    $pcLevel = $_POST['prog-level'];
    $lang = $_POST['lang'];
    $comprLevel = $_POST['compr-level'];
    $readLevel = $_POST['read-level'];
    $writeLevel = $_POST['write-level'];
    if (!isset($_POST['sex'])) {
        $gender = 'Please select gender!';
    } else {
        $gender = $_POST['sex'];
    }

    if (empty($bdate)) {
        $bdate = 'Please enter Birth Date!';
    }

    if (empty($from)) {
        $from = 'Please select Date!';
    }

    if (empty($to)) {
        $to = 'Please select Date!';
    }
    if (empty($_POST['category'])) {
        $category = [];
    } else {
        $category = $_POST['category'];
    }

    //data validation
    if (!(ctype_alpha($fname)) || mb_strlen($fname) <= 2 || mb_strlen($fname) > 20) {
        $fname = 'Please enter valid First Name!';
    }

    if (!(ctype_alpha($lname)) || mb_strlen($lname) <= 2 || mb_strlen($lname) > 20) {
        $lname = 'Please enter valid Last Name!';
    }
    $length = count($lang);
    for ($i = 0; $i < $length; $i++) {
        if (!(ctype_alpha($lang[$i])) || mb_strlen($lang[$i]) <= 2 || mb_strlen($lang[$i]) > 20) {
            $lang[$i] = 'Please enter valid Language!';
        }
    }

    for ($i = 0; $i < $length; $i++) {
        if ($comprLevel[$i]==='-Comprehension-') {
            $comprLevel[$i]='Please select Comprehension!';
        }
    }
    for ($i = 0; $i < $length; $i++) {
        if ($readLevel[$i]==='-Reading-') {
            $readLevel[$i] = 'Please select Reading!';
        }
    }
    for ($i = 0; $i < $length; $i++) {
        if ($writeLevel[$i]==='-Writing-') {
            $writeLevel[$i] = 'Please select Writing!';
        }
    }

    $length2 = count($pcLang);
    for ($i = 0; $i<$length2;$i++) {
        if (!(ctype_alpha($pcLang[$i])) || mb_strlen($pcLang[$i]) <= 2 || mb_strlen($pcLang[$i]) > 20) {
            $pcLang[$i] = 'Please enter valid Programming Language!';
        }
    }

    if (!(ctype_alnum($company)) || mb_strlen($company) <= 2 || mb_strlen($company) > 20) {
        $company = 'Please enter valid Company Name!';
    }

    if (preg_match('/^[0-9 \' \'+-]+$/', $phone) !== 1) {
        $phone = 'Please enter valid Phone Number!';
    }

    if (filter_var($mail, FILTER_VALIDATE_EMAIL) === false) {
        $mail = 'Please enter valid Email!';
    }
}
?>

<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Result</title>
    <style>
        table,table td{
            border:1px solid black;
            text-align: center;
        }
        table{
            margin-top: 10px;
        }
    </style>
</head>
<body>
<a href="05. CVGenerator.php"><< Back</a>
<table>
    <tbody>
    <tr>
        <td colspan="2">Personal Information</td>
    </tr>
    <tr>
        <td>First Name</td>
        <td><?= $fname ?></td>
    </tr>
    <tr>
        <td>Last Name</td>
        <td><?= $lname ?></td>
    </tr>
    <tr>
        <td>Email</td>
        <td><?= $mail ?></td>
    </tr>
    <tr>
        <td>Phone Number</td>
        <td><?= $phone ?></td>
    </tr>
    <tr>
        <td>Gender</td>
        <td><?= $gender ?></td>
    </tr>
    <tr>
        <td>Birth Date</td>
        <td><?= $bdate ?></td>
    </tr>
    <tr>
        <td>Nationality</td>
        <td><?= $nation ?></td>
    </tr>
    </tbody>
</table>
<table>
    <tbody>
    <tr>
        <td colspan="2">Last Work Position</td>
    </tr>
    <tr>
        <td>Company Name</td>
        <td><?= $company ?></td>
    </tr>
    <tr>
        <td>From</td>
        <td><?= $from ?></td>
    </tr>
    <tr>
        <td>To</td>
        <td><?= $to ?></td>
    </tr>
    </tbody>
</table>
<table>
    <tbody>
    <tr>
        <td colspan="3">Computer Skills</td>
    </tr>
    <tr>
        <td>Programming Languages</td>
        <td>
            <table>
                <tbody>
                <tr>
                    <td>Language</td>
                    <td>Skill Level</td>
                    <?php
                    $length = count($pcLang);
                    for ($i = 0; $i < $length; $i++) {
                        echo '<tr></tr>';
                        echo "<td>$pcLang[$i]</td>";
                        for ($j = $i; $j < $length; $j++) {
                            echo "<td>$pcLevel[$j]</td>";
                            break;
                        }
                    }
                    ?>
                </tr>
                </tbody>
            </table>
        </td>
    </tr>
    </tbody>
</table>
<table>
    <tbody>
    <tr>
        <td colspan="5">Other Skills</td>
    </tr>
    <tr>
        <td>Languages</td>
        <td>
            <table>
                <tbody>
                <tr>
                    <td>Language</td>
                    <td>Comprehension</td>
                    <td>Reading</td>
                    <td>Writing</td>
                    <?php
                    $length2 = count($lang);

                    for ($i = 0; $i < $length2; $i++) {
                        echo '<tr></tr>';
                        echo "<td>$lang[$i]</td>";
                        for ($j = $i; $j < $length2; $j++) {
                            echo "<td>$comprLevel[$j]</td>";
                            for ($k = $j; $k < $length2; $k++) {
                                echo"<td>$readLevel[$k]</td>";
                                for ($p = $k; $p < $length2; $p++) {
                                    echo "<td>$writeLevel[$p]</td>";
                                    break;
                                }
                                break;
                            }
                            break;
                        }
                    }
                    ?>
                </tr>

                </tbody>
            </table>
        </td>
    </tr>
    <tr>
        <td>Driver's License</td>
        <td><?= implode(', ', $category); ?></td>
    </tr>
    </tbody>
</table>
</body>
</html>