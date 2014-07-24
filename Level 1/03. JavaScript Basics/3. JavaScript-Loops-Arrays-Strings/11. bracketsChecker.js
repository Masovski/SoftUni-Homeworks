function checkBrackets(str) {
    var brackets = 0;
    var bCorrectEnds = (str.indexOf("(") < str.indexOf(")")) && (str.lastIndexOf("(") < str.lastIndexOf(")"));
    if (bCorrectEnds) {
        for (var char in str) {
            if (str[char] == "(") {
                brackets++;
            }
            else if (str[char] == ")" && brackets > 0) {
                brackets--;
            }
        }
    }
    else {
        brackets = -1;
    }
    if (brackets == 0) {
        return "correct";
    }
    else {
        return "incorrect";
    }
}

console.log(checkBrackets('( ( a + b ) / 5 – d )'));
console.log(checkBrackets(') ( a + b ) )'));
console.log(checkBrackets('( b * ( c + d *2 / ( 2 + ( 12 – c / ( a + 3 ) ) ) )'));
