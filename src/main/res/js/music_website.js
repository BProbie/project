$(function main() {

    let player = new Audio();
    let river_flows_in_you = "https://raw.githubusercontent.com/BProbie/project/CNMusic/src/main/res/mp3/river_flows_in_you.mp3"
    let xiao_hu_tong = "https://raw.githubusercontent.com/BProbie/project/CNMusic/src/main/res/mp3/小胡同.mp3"

    $("#river_flows_in_you").click(function playMusic() {
        play(river_flows_in_you);
    })
    $("#xiao_hu_tong").click(function playMusic() {
        play(xiao_hu_tong);
    })

    $("#stateControlBtn").click(function stateChange() {
        if (document.getElementById("stateControlBtn").value === "⏸") {
            player.pause();
            document.getElementById("stateControlBtn").value = "▶";
        } else if (document.getElementById("stateControlBtn").value === "▶") {
            player.play();
            document.getElementById("stateControlBtn").value = "⏸";
        }
    })

    function play(url) {
        player.pause();
        player.load();
        player = new Audio(url);
        player.play();
        document.getElementById("stateControlBtn").value = "⏸";
    }
})