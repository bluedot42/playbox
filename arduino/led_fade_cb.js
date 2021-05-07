var five = require("johnny-five")
var board = five.Board({
    port: "COM3"
})

board.on("ready", ()=>{
    var leds = new five.Leds([11,10,9,5,3]);
    var timing = 250;
    var randomFade = true;
    var fadeIndex = 0;
    var ledCount = leds.length;
    var i;

    function fadeNext() {
        var candidateIndex = fadeIndex;
        leds[fadeIndex].fadeIn(timing);
    
        // Determine the next LED to fade
        if (randomFade) {
          while (candidateIndex === fadeIndex) {
            candidateIndex = Math.round(Math.random() * (ledCount - 1));
          }
        } else {
          candidateIndex = (fadeIndex < ledCount - 1) ? fadeIndex + 1 : 0;
        }
        fadeIndex = candidateIndex;
    
        leds[fadeIndex].fadeOut(timing, fadeNext);
      }
    
      leds.on();
      leds[fadeIndex].fadeOut(timing, fadeNext);
})