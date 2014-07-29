function findNthDigit(arr) {
    var n = arr[0] - 1;
    var num = arr[1].toString().split("").reverse().join("");
    num = num.replace(/[\.-]/, "");

    if (num[n] != undefined) {
        console.log(num[n]);
    } else {
        console.log("The number doesn't have " + num[n] + " digits");
    }
}

findNthDigit([1, 6]);
findNthDigit([2, -55]);
findNthDigit([6, 923456]);
findNthDigit([3, 1451.78]);
findNthDigit([6, 888.88]);