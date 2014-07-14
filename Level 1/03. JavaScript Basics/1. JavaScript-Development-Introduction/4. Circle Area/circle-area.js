function calcCircleArea(r) {
    var area = Math.PI * Math.pow(r, 2);
    return area;
}

function setArea(spanID, areaID) {
    var r = document.getElementById(spanID).innerHTML;
    var area = calcCircleArea(r);
    return document.getElementById(areaID).innerHTML += area;
}

window.onload = function () {
    setArea("radius-1", "area-1");
    setArea("radius-2", "area-2");
    setArea("radius-3", "area-3");
}

