$(function main() {

    let player = "";
    let river_flows_in_you = "https://raw.githubusercontent.com/BProbie/project/CNMusic/src/main/res/mp3/river_flows_in_you.mp3"

    $("#river_flows_in_you-music_btn").click(function playMusic() {
        play(river_flows_in_you);
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