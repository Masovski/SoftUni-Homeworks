function convertKWtoHP(value) {
    return (value / 0.745699872).toFixed(2);
}

var firstResult = convertKWtoHP(75);
var secondResult = convertKWtoHP(150);
var thirdResult = convertKWtoHP(1000);

console.log(firstResult);
console.log(secondResult);
console.log(thirdResult);