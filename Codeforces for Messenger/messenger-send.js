const request = require('request');
const config = require('./config');
const Joi = require('@hapi/joi');

const url = `https://graph.facebook.com/v3.3/me/messages?access_token=${config.pageAccessToken || ''}`;


function sendMessage(recipientID, message) {
	const body = {
		"form": {
			"recipient": {
				"id": recipientID
			},
			"message": {
				"text": message
			}
		}
	};
	request.post(url, body, (err, res, body) => {
		console.log("-------------------");
		console.log(res.body);
		console.log("-------------------");
	});
}

function sendMessageWithQuickReplies(recipientID, message, quickReplies) {
	const schema = Joi.object().keys({
        recipientID: Joi.alternatives().try(Joi.number().integer(), Joi.string().min(1)).required(),
		message: Joi.string().min(1).required(),
		quickReplies: Joi.array().min(1).items(Joi.object({
			content_type: Joi.valid("text", "user_phone_number", "user_email").required(),
			title: Joi.string().min(1).max(20).required(),
			payload: Joi.string().required().allow(''),
			image_url: Joi.string().uri().optional()
		})).required()
    });
	
	const obj = {
		recipientID: recipientID,
		message: message,
		quickReplies: quickReplies
	};
    const { error } = Joi.validate(obj, schema);
	if(error) {
		console.log(error);
		return; //idk what to do here
	}
	
	const body = {
		"form": {
			"recipient": {
				"id": recipientID
			},
			"message": {
				"text": message,
				"quick_replies": quickReplies
			}
		}
	};
	request.post(url, body, (err, res, body) => {
		console.log("-------------------");
		console.log(res.body);
		console.log("-------------------");
	});
}

module.exports.sendMessage = sendMessage;
module.exports.sendMessageWithQuickReplies = sendMessageWithQuickReplies;
