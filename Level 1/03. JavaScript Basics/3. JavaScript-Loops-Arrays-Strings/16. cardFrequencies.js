function findCardFrequency(str) {
    var words = str.split(/\W+/g);
    words.pop();
    var cardFreq = [];

    console.log();

    for (var i = 0; i < words.length - 1; i++) {
        
        if (cardFreq.indexOf(words[i]) == -1) {
            var tempCount = 1;
            for (var j = i + 1; j < words.length; j++) {
                if (words[i] == words[j]) {
                    tempCount++;
                }
            }
            cardFreq.push(words[i]);
            var percentage = ((tempCount / words.length) * 100).toFixed(2) + "%";
            console.log(words[i] + " -> " + percentage);
        }
    }
}

findCardFrequency('8♥ 2♣ 4♦ 10♦ J♥ A♠ K♦ 10♥ K♠ K♦');
findCardFrequency('J♥ 2♣ 2♦ 2♥ 2♦ 2♠ 2♦ J♥ 2♠');
findCardFrequency('10♣ 10♥');