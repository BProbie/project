$(function main() {
    $("#skinChange").click(function changeSkin() {
        if (getComputedStyle(document.documentElement).getPropertyValue("--colorState")==="black") {
            document.documentElement.style.setProperty("--colorState","white")
            document.documentElement.style.setProperty("--backgroundColor","gainsboro")
            document.documentElement.style.setProperty("--menuColor","skyblue")
        } else if (getComputedStyle(document.documentElement).getPropertyValue("--colorState")==="white") {
            document.documentElement.style.setProperty("--colorState","black")
            document.documentElement.style.setProperty("--backgroundColor","black")
            document.documentElement.style.setProperty("--menuColor","darkslategrey")
        }
    })
})