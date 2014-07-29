function biggerThanNeighbors(index, arr) {
    var isBigger = arr[index] > arr[index + 1] && arr[index - 1];
    var onlyOne = arr[index - 1] == undefined || arr[index + 1] == undefined;
    var invalidIndex = arr[index] == undefined;

    if (invalidIndex) {
        console.log("invalid index");
    } else if (onlyOne) {
        console.log("only one neighbor");
    } else if (isBigger) {
        console.log("bigger");
    } else {
        console.log("not bigger");
    }
}

biggerThanNeighbors(2, [1, 2, 3, 3, 5]);
biggerThanNeighbors(2, [1, 2, 5, 3, 4]);
biggerThanNeighbors(5, [1, 2, 5, 3, 4]);
biggerThanNeighbors(0, [1, 2, 5, 3, 4]);
