$(function main() {

    let player = null;
    let river_flows_in_you = "https://raw.githubusercontent.com/BProbie/project/CNMusic/src/main/res/mp3/river_flows_in_you.mp3";
    let baby_you = "https://raw.githubusercontent.com/BProbie/project/CNMusic/src/main/res/mp3/baby_you.mp3";
    let yu_jian = "https://raw.githubusercontent.com/BProbie/project/CNMusic/src/main/res/mp3/yu_jian.mp3";

    $("#yu_jian").click(function playerMusic() {
        play(yu_jian);
    })
    $("#baby_you").click(function playMusic() {
        play(baby_you);
    })
    $("#river_flows_in_you").click(function playMusic() {
        play(river_flows_in_you);
    })

    $("#stateControl").click(function stateChange() {
        if (document.getElementById("stateControl").value === "⏸") {
            player.pause();
            document.getElementById("stateControl").value = "▶";
        } else if (document.getElementById("stateControl").value === "▶") {
            player.play();
            document.getElementById("stateControl").value = "⏸";
        }
    })

    function play(url) {
        if (player !== null) {
            player.pause();
            player.load();
        }
        player = new Audio(url);
        player.play();
        document.getElementById("stateControl").value = "⏸";
    }
})