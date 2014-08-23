<?php

$text = $_GET['text'];
$blacklist = $_GET['blacklist'];

preg_match_all('/[0-9A-Za-z_+\-]+@[0-9A-Za-z\-]+\.[0-9A-Za-z\-\.]+/', $text, $matches);

if(strlen($blacklist) > 0) {
    $blacklist = preg_replace('/[*]/', '', $blacklist); // Remove asterisks if found
    $blacklist = preg_replace('/[.]/', '\.', $blacklist); // Replace dots with escaped dots for Regex
    $blacklist = preg_replace('/\s+/','|', $blacklist); // Make Regex 'OR' (Equivalent to || in programming languages)

    foreach ($matches[0] as $key => $value) {
        if(preg_match('/^('. $blacklist .')$|(?='. $blacklist .'\b)/', $value)) {
            $text = preg_replace('/' . $value . '/', str_repeat("*",strlen($value)), $text);
            unset($matches[0][$key]);
        }
    }
}

foreach ($matches[0] as $value) {
    $text = preg_replace('/' . $value . '/', '<a href="mailto:' . $value . '">' . $value . '</a>', $text);
}

echo "<p>$text</p>";
?>