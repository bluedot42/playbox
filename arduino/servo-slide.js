var five = require("johnny-five");
var board = new five.Board({
    port:"COM3"
});

board.on("ready", function() {

  var slider = new five.Sensor("A0");
  var led = new five.Led(11);
  var servo = new five.Servo({
      pin: 10,
      center:true
  });

  // Scale the sensor's value to the LED's brightness range
  slider.scale([0, 180]).on("data", function() {
    console.log(slider.value);
    led.brightness(slider.value);
    servo.to(slider.value);
  });
});
