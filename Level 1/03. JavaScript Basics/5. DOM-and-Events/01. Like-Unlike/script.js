function changeStatus() {
    var btn = document.getElementById("button");
    if (btn.innerText.toLowerCase() == "like") {
        btn.innerText = "Unlike";
    } else {
        btn.innerText = "Like";
    }
}