var mongoose = require('mongoose');

var Schema = mongoose.Schema;

var UserSchema = new Schema(
  {
    username: { type: String, required: true},
    email: {type:String, required: true},
    registration_date: {type:Date, required: true, default: Date.now},
    last_login_date: {type:Date, required: true},
  }
);

// Virtual for users's URL
UserSchema
.virtual('url')
.get(function () {
  return '/catalog/user/' + this._id;
});

//Export model
module.exports = mongoose.model('User', UserSchema);