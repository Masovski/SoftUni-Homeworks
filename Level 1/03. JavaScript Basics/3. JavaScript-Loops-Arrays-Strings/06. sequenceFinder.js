function findMaxSequence(arr) {
    var result = [];
    var max = [];
    for (var i = 0; i < arr.length; i++) {
        if (arr.length > 1) {
            if (arr[i] === arr[i + 1]) {
                result.push(arr[i]);
                if (arr[i + 1] !== arr[i + 2]) {
                    result.push(arr[i + 1]);
                    if (result.length >= max.length) {
                        max = result;
                        result = [];
                    }
                }
            }
        }
        else {
            max.push(arr[i]);
        }
    }
    console.log(max);
}

findMaxSequence([2, 1, 1, 2, 3, 3, 2, 2, 2, 1]);
findMaxSequence(['happy']);
findMaxSequence([2, 'qwe', 'qwe', 3, 3, '3']);