var five = require("johnny-five")
var board = five.Board({
    port:"COM3"
})

board.on("ready", ()=>{
    var servo = five.Servo(10);

    servo.sweep();
})