function findLargestBySumOfDigits(nums) {
    var isValid = true;
    var largest = [-Infinity, -Infinity];

    for (var i = 0; i < arguments.length; i++) {
        if (arguments[i] % 1 === 0) {
            var sum = 0;
            var temp = Math.abs(arguments[i]);

            for (var j = 0; j < Math.abs(arguments[i]).toString().length; j++) {
                sum += temp % 10;
                temp /= 10;
            }
            if (sum > largest[1]) {
                largest[0] = arguments[i];
                largest[1] = sum;
            }
        } else {
            isValid = false;
            break;
        }
    }
    console.log(isValid ? largest[0] : undefined);
}

findLargestBySumOfDigits(5, 10, 15, 111);
findLargestBySumOfDigits(33, 44, -99, 0, 20);
findLargestBySumOfDigits('hello');
findLargestBySumOfDigits(5, 3.3);
