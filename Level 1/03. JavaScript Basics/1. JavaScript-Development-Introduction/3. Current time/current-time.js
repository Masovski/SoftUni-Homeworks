
var hours = new Date().getHours();
var minutes = new Date().getMinutes();

console.log(hours + ":" + ('0' + minutes).slice(-2));