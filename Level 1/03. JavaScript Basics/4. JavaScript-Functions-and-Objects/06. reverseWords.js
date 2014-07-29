function reverseWordsInString(str) {
    var strArr = str.split(" ");
    var newStr = "";

    for (var i = 0; i < strArr.length; i++) {
        strArr[i] = strArr[i].split("").reverse().join("");
    }
    console.log(strArr.join(" "));

}

reverseWordsInString("Hello, how are you.");
reverseWordsInString("Life is pretty good, isn't it?");