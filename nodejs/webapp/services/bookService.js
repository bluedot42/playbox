var Book = require('../models/book');
var Author = require('../models/author');
var Genre = require('../models/genre');
var BookInstance = require('../models/bookinstance');

exports.getBooks = async () => {
    let result = await Book.find({}).populate('author');
    return result;
}