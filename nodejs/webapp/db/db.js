require('dotenv').config();

var mongoose = require('mongoose');

let _db;

var mongodbStr = 'mongodb://'+process.env.DB_HOST+'/'+process.env.DB_NAME;

function getDBConnection(){

    if(_db){
        console.log('DB connction exists already...');
        return _db;
    }

    _initDBConnection();

    return _db;
}

function _initDBConnection(){
    console.log('Initializing database connection ...');

    mongoose.connect(mongodbStr, {useNewUrlParser:true, useUnifiedTopology:true, useFindAndModify:false})
    .catch(error => {console.log(error);});

    _db = mongoose.connection;

    console.log('DB connected');
}

// function initDBConnection(callback){

//     if(_db){
//         console.warn("Trying to initialize db again ...");
//         return callback(null, _db);
//     }

//     var mongodb = 'mongodb://'+process.env.DB_HOST+'/'+process.env.DB_NAME;
//     mongoose.connect(mongodb, {useNewUrlParser:true, useUnifiedTopology:true})
//     .catch(error => {return callback(error);});

//     _db = mongoose.connection;

//     return callback(null,_db);
// }

exports.getDB = getDBConnection;