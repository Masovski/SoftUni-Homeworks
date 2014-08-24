<?php
$result = "";
if($_SERVER['REQUEST_METHOD'] === 'POST') {
    $input = $_POST['input'];
    $option = $_POST['option'];

    switch($option) {
        case "palindrome":
            $result = "String is ";
            preg_match('/^((.)(?1)\2|.?)$/', $input) ? $result .= "palindrome" : $result .= "not palindrome";
            break;
        case "reverse":
            $result = strrev($input);
            break;
        case "split":
            $result = trim($input);
            $result = str_split($result);
            $result = implode(" ", $result);
            break;
        case "hash":
            $result = crypt($input);
            break;
        case "shuffle":
            $result = str_shuffle($input);
            break;
        default:
            //checkPalindrome($input);
            break;
    }
}
?>

<!DOCTYPE html>
<html>
<head>
    <title>String Modifier</title>
</head>
<body>
<form method="post">
    <input type="text" name="input">
    <label for="palindrome"><input type="radio" name="option" value="palindrome" id="palindrome">Check Palindrome</label>
    <label for="reverse"><input type="radio" name="option" value="reverse" id="reverse">Reverse String</label>
    <label for="split"><input type="radio" name="option" value="split" id="split">Split</label>
    <label for="hash"><input type="radio" name="option" value="hash" id="hash">Hash String</label>
    <label for="shuffle"><input type="radio" name="option" value="shuffle" id="shuffle">Shuffle String</label>

    <input type="submit"/>
</form>
<?= $result; ?>
</body>
</html>