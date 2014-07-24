function treeHouseCompare(a, b) {
    var houseSquareArea = a * a;
    var houseTriangleArea = 0.5 * (a * (a * 2 / 3));
    var treeRectArea = b * b / 3;
    var treeCircleArea = Math.PI * Math.pow(b * 2 / 3, 2);
    var houseArea = houseSquareArea + houseTriangleArea;
    var treeArea = treeRectArea + treeCircleArea;

    if (houseArea > treeArea) {
        console.log("house/" + houseArea.toFixed(2));
    }
    else {
        console.log("tree/" + treeArea.toFixed(2));
    }
}

treeHouseCompare(3, 2);
treeHouseCompare(3, 3);
treeHouseCompare(4, 5);