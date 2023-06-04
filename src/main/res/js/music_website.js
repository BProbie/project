$(function main() {
    let nowUrl = "";

    $("#river_flows_in_you-music_btn").click(function playMusic() {
        play("https://raw.githubusercontent.com/BProbie/project/CNMusic/src/main/res/mp3/river_flows_in_you.mp3")
    })

    function play(url) {
        nowUrl = url;
        new Audio(nowUrl).play();
    }

    function pause() {
        new Audio(nowUrl).pause();
    }
})