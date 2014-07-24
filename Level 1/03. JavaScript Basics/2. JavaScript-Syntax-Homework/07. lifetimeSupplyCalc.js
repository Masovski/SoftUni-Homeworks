function calcSupply(age, maxAge, foodPerDay) {
    var years = maxAge - age;
    var foodPerYear = foodPerDay * 365;
    var overallFoodWeight = Math.round(years * foodPerYear);

    return console.log(overallFoodWeight + "kg of chicken would be enough until I am " + maxAge + " years old.");
}

calcSupply(38, 118, 0.5);
calcSupply(20, 87, 2);
calcSupply(16, 102, 1.1);