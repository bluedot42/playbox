var five = require("johnny-five");
var temporal = require("temporal");
var board = new five.Board({
    port: "COM3"
    }
);

board.on("ready", () => {
      var events = [];
      var strobe = new five.Pin(13);
      
      temporal.loop(500, (loop) => {
        strobe[loop.called %2 ==  0 ?"high":"low"]();
      })

      ["high","low"].forEach(state => {
          strobe.on(state, () => {
              if(events.indexOf(state)===-1){
                  console.log("Event emitted for:", state, "on", this.addr);
                  events.push(state);
              }
          })
      });

      var analog = new five.Pin("A0"); 

      analog.query(state => {
        console.log(state);
      })
    }
)