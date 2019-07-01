const dotenv = require('dotenv');
dotenv.config();

module.exports = {
	pageAccessToken: process.env.PAGE_ACCESS_TOKEN,
	config: process.env.PORT,
	verifyToken: process.env.VERIFY_TOKEN
};