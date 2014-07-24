function arrayBuilder(arr) {
    for (var index in arr) {
        arr[index] *= 5;
    }
    console.log(arr.join(", "));
}

arrayBuilder([10, 20, 40, 30]);