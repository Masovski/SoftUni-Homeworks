function findMinAndMax(arr) {
    var min = Infinity;
    var max = -Infinity;

    for (var i = 0; i < arr.length - 1; i++) {
        for (var j = i; j < arr.length; j++) {
            if (min > arr[j]) {
                min = arr[j];
            }
            if(max < arr[j]) {
                max = arr[j];
            }
        }
    }
    console.log("Min -> " + min);
    console.log("Max -> " + max);
    console.log();
}

findMinAndMax([1, 2, 3, 4, 5, 6]);
findMinAndMax([2, 2, 2, 2, 2]);
findMinAndMax([500, 1, -23, 0, -300, 28, 35, 12]);