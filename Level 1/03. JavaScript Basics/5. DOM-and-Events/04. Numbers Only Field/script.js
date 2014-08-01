var input = document.getElementById("digit-field");

function checkInput() {
    var content = input.value;
    var regex = /\D/g;
    if (regex.test(content)) {
        input.style.backgroundColor = '#F00';
        setTimeout(function () { input.style.backgroundColor = '#FFF'; }, 200);
        input.value = content.replace(regex, '');
    }
}