const SerialPort = require('serialport')
const port = new SerialPort('/com4',{baudRate:9600})

port.write('main screen turn on', function(err) {
    if (err) {
      return console.log('Error on write: ', err.message);
    }
    console.log('message written');
  });
  
  // Open errors will be emitted as an error event
  port.on('error', function(err) {
    console.log('Error: ', err.message);
  })

  port.on('data', function (data) {
    console.log('Data:', data);
  });
  
  // Read data that is available but keep the stream from entering "flowing mode"
  port.on('readable', function () {
    console.log('Data:', port.read());
  });