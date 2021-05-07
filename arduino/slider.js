five = require("johnny-five")
board = five.Board({
    port: "COM3"
})

board.on("ready", () => {
    var slider = new five.Sensor({
        pin: "A0",
        freq: 100
    });
    var led = new five.Led(10);

    slider.scale([0,255]).on("data", ()=>{
        console.log(slider.value);
        led.brightness(slider.value);
    })
})