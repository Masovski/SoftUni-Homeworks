var nextId = 0;
var nextId2 = 0;
function addProgLanguage() {
    nextId++;
    var progDiv = document.createElement('div');
    progDiv.setAttribute('id', 'prog-lang' + nextId);
    progDiv.innerHTML = '<input type="text" name="prog-lang[]"/>' + ' <select name="prog-level[]">' + '<option value="Beginner">Beginner</option>' + '<option value="Programmer">Programmer</option>' + '<option value="Ninja">Ninja</option>' + '</select>';
    document.getElementById('prog-langs').appendChild(progDiv);

}

function removeProgLanguage(id) {
    nextId--;
    var progDiv = document.getElementById(id);
    document.getElementById('prog-langs').removeChild(progDiv);
}

function addLanguage() {
    nextId2++;
    var langDiv = document.createElement('div');
    langDiv.setAttribute('id', 'lang' + nextId2);
    langDiv.innerHTML = '<input type="text" name="lang[]"/>' + ' <select name="compr-level[]">' + '<option>-Comprehension-</option>' + '<option value="Beginner">Beginner</option>' + '<option value="Intermediate">Intermediate</option>' + '<option value="Advanced">Advanced</option>' + '</select>' + ' <select name="read-level[]">' + '<option>-Reading-</option>' + '<option value="Beginner">Beginner</option>' + '<option value="Intermediate">Intermediate</option>' + '<option value="Advanced">Advanced</option>' + '</select>' + ' <select name="write-level[]">' + '<option>-Writing-</option>' + '<option value="Beginner">Beginner</option>' + '<option value="Intermediate">Intermediate</option>' + '<option value="Advanced">Advanced</option>' + '</select>';
    document.getElementById('langs').appendChild(langDiv);
}

function removeLanguage(id) {
    nextId2--;
    var langDiv = document.getElementById(id);
    document.getElementById('langs').removeChild(langDiv);
}