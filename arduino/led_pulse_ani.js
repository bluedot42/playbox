var five = require("johnny-five")
var board = five.Board({
    port:"COM3"
})

board.on("ready", ()=>{
    var led = five.Led(11);

    led.pulse({
        easing: "linear",
        duration: 3000,
        cuePoints: [0,0.2,0.4,0.6,0.8,1],
        keyFrames: [0,10,0,50,0,255],
        onStop: () => {
            console.log("Animation stopped.");
        }
    })
})