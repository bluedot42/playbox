var five = require("johnny-five")
var board = five.Board({
    port:"COM3"
})

board.on("ready",()=>{
    var heart = ["01100110",
    "10011001",
    "10000001",
    "10000001",
    "01000010",
    "00100100",
    "00011000",
    "00000000"];

    var matrix = five.Led.Matrix({
        pins:{
            data:2,
            clock:3,
            cs:4
        }
    });

    matrix.on();

    var msg  = "hell".split("");
    function next(){
        var c;
        if(c=msg.shift()){
            matrix.draw(c);
            setTimeout(next,1000);
        }
    }

    next();

    board.repl.inject({
        matrix: matrix,

        heart: function(){
            matrix.draw(heart);
        }
    })
})