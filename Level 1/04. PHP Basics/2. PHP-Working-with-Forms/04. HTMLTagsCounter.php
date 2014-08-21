<?php
session_start();

$htmlTags = array('a', 'abbr', 'acronym', 'address', 'applet', 'area', 'b', 'base', 'basefont',
    'bdo', 'bgsound', 'big', 'blockquote', 'blink', 'body', 'br', 'button', 'caption', 'center', 'cite', 'code',
    'col', 'colgroup', 'dd', 'dfn', 'del', 'dir', 'dl', 'div', 'dt', 'embed', 'em', 'fieldset', 'font', 'form',
    'frame', 'frameset', 'h1', 'h2', 'h3', 'h4', 'h5', 'h6', 'head', 'hr', 'html', 'iframe', 'img', 'input',
    'ins', 'isindex', 'i', 'kbd', 'label', 'legend', 'li', 'link', 'marquee', 'menu', 'meta', 'noframe',
    'noscript', 'optgroup', 'option', 'ol', 'p', 'pre', 'q', 's', 'samp', 'script', 'select', 'small', 'span', 'strike',
    'strong', 'style', 'sub', 'sup', 'table', 'td', 'th', 'tr', 'tbody', 'textarea', 'tfoot', 'thead', 'title',
    'tt', 'u', 'ul', 'var');
$count = isset($_SESSION['count']) ? $_SESSION['count'] : 0;

if($_SERVER['REQUEST_METHOD'] === 'POST') {
    if(isset($_POST['reset'])) {
        session_destroy();
        $count = 0;
        $result = "";
    } else {
        $tag = $_POST['input'];
        if(in_array($tag, $htmlTags)) {
            $count++;
            $_SESSION['count'] = $count;
            $state = "Valid";
        } else {
            $state = "Invalid";
        }
        $state .= " HTML tag!";
        $result = "{$state}<br> Score: $count";
    }

}

?>
<!DOCTYPE html>
<html>
<head>
    <title>HTML Tags Counter</title>
    <style>
        div {
            font-size: 2rem;
            font-weight: bold;
        }
    </style>
</head>
<body>
    <form method="post">
        <label for="input">Enter HTML tags: <br><br>
        <input type="text" name="input" id="input"/></label>
        <input type="submit" value="Submit"/>
        <input type="submit" name="reset" value="Reset counter"/><br>
        <div>
            <?= $result; ?>
        </div>
    </form>
</body>
</html>