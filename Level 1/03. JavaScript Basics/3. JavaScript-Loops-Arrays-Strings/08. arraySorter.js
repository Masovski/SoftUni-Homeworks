function sortArray(arr) {
    var result = [];

    while (arr.length > 0) {
        var min = 0;
     
        for (var i = 0; i < arr.length - 1; i++) {
            for (var j = i + 1; j < arr.length; j++) {
                if (arr[min] > arr[i]) {
                    min = i;
                }
                else if (arr[min] > arr[j]) {
                    min = j;
                }
            }
        }
        result.push(arr[min]);
        arr.splice(min, 1);
        min = 0;
    }
    return result.join(', ');
}

console.log(sortArray([5, 4, 3, 2, 1]));
console.log(sortArray([12, 12, 50, 2, 6, 22, 51, 712, 6, 3, 3]));