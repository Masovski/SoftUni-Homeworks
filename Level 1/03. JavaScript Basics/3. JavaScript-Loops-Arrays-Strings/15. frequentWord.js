function findMostFreqWord(str) {
    str = str.toLowerCase();
    var wordCounts = {};
    var words = str.split(/\W+/g);
    var max = -Infinity
    var mostFreq = [];

    console.log();

    for (var i = 0; i < words.length; i++) {
        if (words[i] != "") {
            wordCounts[words[i]] = (wordCounts[words[i]] || 0) + 1;
        }
    }
    for (idx in wordCounts) {
        if (wordCounts[idx] > max) {
            max = wordCounts[idx];
        }
    }
    for (var count in wordCounts) {
        if (wordCounts[count] == max) {
            mostFreq.push(count);
            
        }
    }
    mostFreq.sort();

    for (var word in mostFreq) {
        console.log(mostFreq[word] + " -> " + max + " times");
    }
}

findMostFreqWord('in the middle of the night');
findMostFreqWord('Welcome to SoftUni. Welcome to Java. Welcome everyone.');
findMostFreqWord('Hello my friend, hello my darling. Come on, come here. Welcome, welcome darling.');