var five = require("johnny-five")
var board = new five.Board({
    port: "COM3"
    }
)

board.on("ready", () => {
    var led = new five.Led(11);

    led.pulse();

    // this.wait(10000, () => {
    //     led.stop().off();
    // })
})