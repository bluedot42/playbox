var utils = require('../utils/utils');

var Author = require('../models/author');
var authorService = require('../services/authorService');
const author = require('../models/author');

const awaitHandlerFactory = utils.awaitHandlerFactory;

exports.author_list = awaitHandlerFactory(async (req, res) => {
    const result = await authorService.getAuthors();
    res.send(result);
})

exports.author_detail = awaitHandlerFactory(async (req, res) => {
    const result = await authorService.getAuthorByName(req.params.id);
    res.send(result);
})

// Handle Author create on POST.
exports.createAuthor = awaitHandlerFactory(async(req, res) => {
    let author = req.body;
    const result = await authorService.createAuthor(author);
    res.send(result);
});


// Handle Author delete on POST.
exports.deleteAuthor = awaitHandlerFactory(async(req, res) => {
    let id = req.params.id;
    try {
        const result = await authorService.deleteAuthor(id);   
        res.send(result);
    } catch (error) {
        console.log(error);
    }
})

// Handle Author update on POST.
exports.updateAuthor = awaitHandlerFactory(async(req, res) => {
    let doc = req.body;
    let id = req.params.id;

    let result = await authorService.updateAuthor(id,doc);
    res.send(result);
})