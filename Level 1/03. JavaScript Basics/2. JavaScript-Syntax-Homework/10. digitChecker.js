function checkDigit(number) {
    
    var thirdDigit = Math.floor((number / 100)) % 10;
    if (thirdDigit % 3 == 0) {
        console.log(true);
    }
    else {
        console.log(false);
    }
}

checkDigit(1235);
checkDigit(25368);
checkDigit(123456);