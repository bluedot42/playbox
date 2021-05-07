// var getDB = require('../db/db').getDB;
var Author = require('../models/author');

// Obtain database connection
// getDB();

const getAuthors = async () => {
    try{
        return await Author.find({});
    }catch(e){
        throw e;
    }
};

const getAuthorByName = async (name) => {
    return await Author.find({first_name: name});
}

const createAuthor = async (newAuthor) => {
    let author = new Author({
        "first_name":newAuthor.first_name,
        "family_name": newAuthor.last_name,
        "date_of_birth":Date(newAuthor.date_of_birth)
    });

    let result = await author.save();
    return result;
}

const deleteAuthor = async (id) => {
    let result = await Author.findOneAndDelete({"_id": id});
    return result;
}

const updateAuthor = async (authorId, authorContent) => {

    // let authorToBeUpdated = await Author.findById({"_id": authorId});
    // console.log(authorToBeUpdated);
    
    let result = await Author.findOneAndUpdate(
        {
            _id: authorId
        },
        authorContent,
        {new: true}
    );

    // console.log(result);
    return result;
    
}

module.exports = {
    getAuthors,
    getAuthorByName,
    createAuthor,
    deleteAuthor,
    updateAuthor
}