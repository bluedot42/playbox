var five = require("johnny-five")
var board = five.Board({
    port:"COM3"
})

board.on("ready", ()=>{
    var led = five.Led.RGB({
        pins:{
            red: 9,
        green:10,
        blue:11
        }
    });

    var index = 0;

    var rainbow = ["FF0000", "FF7F00", "FFFF00", "00FF00", "0000FF", "4B0082", "8F00FF"];

    board.loop(1000, ()=>{
        if(index===rainbow.length){
            index = 0;
        }
        led.color(rainbow[index]);
        index++;
    })
})
