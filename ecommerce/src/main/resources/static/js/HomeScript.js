$(document).ready(function () {
    $("a").on("click",function () {
        this.classList.toggle('active');
    })

    const text = $(document.createElement("p"));
    text.textContent = "Hello World from jquery";
    $("products").append(text);
})