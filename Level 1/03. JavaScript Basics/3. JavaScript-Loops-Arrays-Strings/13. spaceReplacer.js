function replaceSpaces(str) {
    return newStr = str.replace(/\s/g, '\xA0');
}

console.log(replaceSpaces("But you were living in another world tryin' to get your message through"));