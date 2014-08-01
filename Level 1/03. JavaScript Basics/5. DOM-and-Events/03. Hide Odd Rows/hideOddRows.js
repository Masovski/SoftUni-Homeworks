function hideOddRows() {
    var all = document.getElementsByTagName("tr");

    for (var i = 0; i < all.length; i++) {
        if (all[i] % 2 != 0) {
            all[i].parentNode.removeChild(all[i]);
        }
    }
}

document.addEventListener("click", function (e) {
    if (e.target.id == "btnHideOddRows") {
        hideOddRows();
    }
});