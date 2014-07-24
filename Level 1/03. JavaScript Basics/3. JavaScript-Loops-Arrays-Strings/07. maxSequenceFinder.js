function findMaxSequence(arr) {
    var result = [];
    var max = [];
    for (var i = 0; i < arr.length; i++) {
        if (arr[i] < arr[i + 1]) {
            result.push(arr[i]);
            if (arr[i + 1] > arr[i + 2]) {
                result.push(arr[i + 1]);
            }
        }
        else {
            result = [];
        }
        if (result.length >= max.length) {
            max = result;
        }
    }
    if (max.length > 0) {
        console.log(max);
    }
    else {
        console.log("no");
    }
    
}

findMaxSequence([3, 2, 3, 4, 2, 2, 4]);
findMaxSequence([3, 5, 4, 6, 1, 2, 3, 6, 10, 32]);
findMaxSequence([3, 2, 1]);