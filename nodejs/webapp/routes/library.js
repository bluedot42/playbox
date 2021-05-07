// router module for book catalog

var express = require('express');
var router = express.Router();

var book_controller = require('../controllers/bookController');
var book_instance_controller = require('../controllers/bookinstanceController');
var author_controller = require('../controllers/authorController');
var genre_controller = require('../controllers/genreController');

// POST request for creating Book.
router.post('/book/create', book_controller.book_create_post);

// POST request to delete Book.
router.post('/book/:id/delete', book_controller.book_delete_post);

// POST request to update Book.
router.post('/book/:id/update', book_controller.book_update_post);

// GET request for one Book.
router.get('/book/:id', book_controller.book_detail);

// GET request for list of all Book items.
router.get('/books', book_controller.book_list);

/// AUTHOR ROUTES ///

// GET request for list of all Authors.
router.get('/authors', author_controller.author_list);

// GET request for one Author.
router.get('/author/:id', author_controller.author_detail);

// POST request for creating Author.
router.post('/author/create', author_controller.createAuthor);

// POST request to delete Author.
router.post('/author/:id/delete', author_controller.deleteAuthor);

// POST request to update Author.
router.post('/author/:id/update', author_controller.updateAuthor);


/// GENRE ROUTES ///

//POST request for creating Genre.
router.post('/genre/create', genre_controller.genre_create_post);

// POST request to delete Genre.
router.post('/genre/:id/delete', genre_controller.genre_delete_post);

// POST request to update Genre.
router.post('/genre/:id/update', genre_controller.genre_update_post);

// GET request for one Genre.
router.get('/genre/:id', genre_controller.genre_detail);

// GET request for list of all Genre.
router.get('/genres', genre_controller.genre_list);

module.exports = router;