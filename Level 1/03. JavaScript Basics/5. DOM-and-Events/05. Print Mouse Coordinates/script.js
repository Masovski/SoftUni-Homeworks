function SetValues() {
    var s = 'X=' + window.event.clientX + ' Y=' + window.event.clientY;
    document.getElementById('mouseInfo').innerText = s;
}