function bitChecker(value) {
    var pos = 3;
    var bit = value >> pos;
    var isOne = bit & 1;

    if (isOne) {
        console.log(true);
    }
    else {
        console.log(false);
    }
}

bitChecker(333);
bitChecker(425);
bitChecker(2567564754);