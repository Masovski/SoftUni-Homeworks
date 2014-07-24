function divisionBy3(value) {
    var sum = 0;
    var tempNum = value;
    for (var i = 0; i < value.toString().length; i++) {
        sum += tempNum % 10;
        tempNum = Math.floor(tempNum / 10);
    }
    if (sum % 3 == 0) {
        return console.log("the number is divided by 3 without remainder");
    }
    else {
        return console.log("the number is not divided by 3 without remainder");
    }
}

divisionBy3(12);
divisionBy3(188);
divisionBy3(591);