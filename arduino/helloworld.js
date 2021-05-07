var five = require("johnny-five");
var board = new five.Board({
  port: "COM3"
});

board.on("ready", function() {

  // Create a standard `led` component instance
  var led = new five.Led(13);

  // "blink" the led in 500ms
  // on-off phase periods
  // led.blink(500);

  this.repl.inject({
    on: function(){
      led.on();
    },
    off: function(){
      led.off();
    }
  });
});