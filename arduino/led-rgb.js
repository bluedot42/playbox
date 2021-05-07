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

    led.on();
    led.color("#FF0000");

    setInterval(()=>{
        var color = '#'+Math.floor(Math.random()*16777215).toString(16);
        led.color(color);
        led.intensity(50);
    },1000);
    
    // led.blink(1000);
})