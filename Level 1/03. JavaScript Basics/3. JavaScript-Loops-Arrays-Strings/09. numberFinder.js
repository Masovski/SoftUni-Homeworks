function findMostFreqNum(arr) {
    var count = 1;
    var max = 0;
    var result = "";

    for (var i = 0; i < arr.length - 1; i++) {
        var tempCount = 1;
        for (var j = i + 1; j < arr.length; j++) {
            if (arr[i] == arr[j]) {
                tempCount++;
                if (tempCount > count) {
                    count = tempCount;
                    max = arr[i];
                }   
            }
            else if (count == 1) {
                max = arr[0];
            }
        }
    }
    result = max + " (" + count + " times)";
    return result;
}

console.log(findMostFreqNum([4, 1, 1, 4, 2, 3, 4, 4, 1, 2, 4, 9, 3]));
console.log(findMostFreqNum([2, 1, 1, 5, 7, 1, 2, 5, 7, 3, 87, 2, 12, 634, 123, 51, 1]));
console.log(findMostFreqNum([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13]));