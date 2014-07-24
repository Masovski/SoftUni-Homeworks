function findPalindromes(str) {
    str = str.toLowerCase();
    var wordsArr = str.split(/\W+/g);
    var finalWordsArr = [];

    for (var word in wordsArr) {
        if (wordsArr[word] == wordsArr[word].split("").reverse().join("") && wordsArr[word] != "") {
            finalWordsArr.push(wordsArr[word]);
        }
    }
    return finalWordsArr.join(", ");
}

console.log(findPalindromes('There is a man, his name was Bob.'));