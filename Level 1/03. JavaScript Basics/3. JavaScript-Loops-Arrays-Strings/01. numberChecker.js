function printNumber(n) {
    var str = "";
    for (var i = 1; i <= n; i++) {
        if (i % 4 == 0 || i % 5 == 0) {

        }
        else {
            str = str + i + ", "
        }
    }
    if (str == "") {
        str = "no";
    }
    else {
        str = str.slice(0, -2);
    }
    console.log(str);
}

printNumber(20);
printNumber(-5);
printNumber(13);