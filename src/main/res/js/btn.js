$(function main() {
    $("#skinChange").click(function changeSkin() {
        if (getComputedStyle(document.documentElement).getPropertyValue("--colorState")==="black") {
            document.documentElement.style.setProperty("--colorState","white")
            document.documentElement.style.setProperty("--backgroundColor","wheat")
            document.documentElement.style.setProperty("--menuColor","lightSeaGreen")
            document.documentElement.style.setProperty("--listColor","mediumAquamarine")
            document.documentElement.style.setProperty("--showColor","aquamarine")
            document.documentElement.style.setProperty("--controlColor","lightSeaGreen")
        } else if (getComputedStyle(document.documentElement).getPropertyValue("--colorState")==="white") {
            document.documentElement.style.setProperty("--colorState","black")
            document.documentElement.style.setProperty("--backgroundColor","black")
            document.documentElement.style.setProperty("--menuColor","dimGray")
            document.documentElement.style.setProperty("--listColor","gray")
            document.documentElement.style.setProperty("--showColor","darkGray")
            document.documentElement.style.setProperty("--controlColor","dimGray")
        }
    })

    let buttons = document.getElementsByTagName("button");
    for (let i = 0; i < buttons.length; i++) {
        buttons[i].onmouseenter = function btnEnter() {
            this.style.border = "2px solid black";
            this.style.borderRadius = "5px";
        }
        buttons[i].onmouseleave = function btnLeave() {
            this.style.border = "none";
            this.style.borderRadius = "0";
        }
        buttons[i].onclick = function btnClick() {
            this.style.borderRadius = "5px";
            for (let j = 0; j < 100; j++) {
                setTimeout(() => {
                    this.style.border = j/10+"px solid black";
                    if (j === 99) {
                        this.style.border = "2px solid black";
                        this.style.borderRadius = "5px";
                    }
                },j/4);
            }
        }
    }

    let inputs = document.getElementsByTagName("input");
    for (let i = 0; i < inputs.length; i++) {
        inputs[i].onmouseenter = function btnEnter() {
            this.style.border = "2px solid black";
            this.style.borderRadius = "5px";
        }
        inputs[i].onmouseleave = function btnLeave() {
            this.style.border = "none";
            this.style.borderRadius = "0";
        }
        inputs[i].onclick = function btnClick() {
            this.style.borderRadius = "5px";
            for (let j = 0; j < 100; j++) {
                setTimeout(() => {
                    this.style.border = j/10+"px solid black";
                    if (j === 99) {
                        this.style.border = "2px solid black";
                        this.style.borderRadius = "5px";
                    }
                },j/4);
            }
        }
    }

})