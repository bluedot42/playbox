var five = require("johnny-five")
var board = five.Board({
    port:"COM3"
})

board.on("ready",()=>{
    var button = five.Button(10)
    var led = five.Led(11)

    button.on("hold", ()=>{
        console.log("Button held")
        
    })

    button.on("press", ()=>{
        console.log("Button pressed")
        led.on()
    })

    button.on("release", ()=>{
        console.log("Button released")
        led.off()
    })
})