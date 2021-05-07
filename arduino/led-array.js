var five = require("johnny-five")
var board = five.Board({
    port:"COM3"
})

board.on("ready", () =>{
    var array = five.Leds([5,6,9,10,11]);
    var pot = five.Sensor({
        pin: "A1",
        freq:100
    })

    array.pulse();

    // pot.scale([-1,5]).on("change", ()=>{
    //     var lastIndex = Math.round(pot.value);

    //     if(lastIndex===-1){
    //         array.off();
    //     }
    //     else{
    //         array.each((led, index)=>{
    //             if(index<=lastIndex){
    //                 led.on();
    //             }
    //             else{
    //                 led.off();
    //             }
    //         })
    //     }
    // })
})