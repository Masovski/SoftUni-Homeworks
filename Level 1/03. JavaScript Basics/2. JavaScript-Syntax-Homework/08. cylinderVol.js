function calcCylinderVol(radius, height) {
    var volume = (Math.PI * Math.pow(radius, 2)) * height;
    return console.log(volume.toFixed(3));
}

calcCylinderVol(2, 4);
calcCylinderVol(5, 8);
calcCylinderVol(12, 3);