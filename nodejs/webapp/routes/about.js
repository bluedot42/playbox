var express = require('express');
var router = express.Router();

router.get('/', (req, res ,next) =>{
    res.send('About me');
})

module.exports = router;