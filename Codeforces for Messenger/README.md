## Day 2
*12 June 2019, 9:50 AM - 11:59 PM*

*(The timestamp implies that I worked for 14 hours straight, but in reality, around a third of the time was me doing other things in the middle of coding.)*

For this day, I decided to start creating a Messenger chatbot for Codeforces. I haven't ironed out the details such as what features I want it to have, but I decided to just get into it to try to figure out how to make a basic chatbot on Messenger first.

Facebook for Developers already had an existing sample Messenger app so I followed the [instructions](https://developers.facebook.com/docs/messenger-platform/getting-started/sample-apps/original-coast-clothing) for deploying this app. These instructions were mostly straightforward; although, I will be noting here my process in case someone encounters similar difficulties while following Facebook for Developers' documentation.

Note that the steps which I indicate that do not have any additional details to them are simply subsections in the Facebook for Developers documentation which I directly followed.

### Steps
- Reset everything
    - I have tried to make this chatbot in the past, but I never really got through to continuing it. Given this, I already had a few things set up. So before doing anything else, I deleted the (1) Facebook page and the (2) Facebook app on Facebook for Developers that I previously created, just so I could start from a clean slate.
- [Create Page](https://www.facebook.com/pages/create)
    - I chose the **Community or Public Figure** option and filled it out as seen in the following image. ![Creating New Page](readme-images/new-page.png)
    - When I pressed **Continue**, however, there was a prompt that an error occurred. ![New Page Error](readme-images/new-page-error.png)
    - When I tried to do it again, there was a prompt that I already had a page with the same name. ![Change Page Name](readme-images/new-page-change-name.png)
    - I figured that the page was already created, so I went to [view my pages](https://www.facebook.com/bookmarks/pages) and, true enough, it was already there. When I clicked on the page, however, it brought me to a page saying that there was an error. So instead of clicking on the page name itself, I clicked on the gear (settings) button beside it. It opened up a pop-up and I scrolled down the **General** tab and clicked **See All Information**. ![Edit Details](readme-images/new-page-edit-details.png)
    - This successfully brought me to the page I just created. Not knowing if it was necessary or not, I also edited the page's username. ![Edit Username](readme-images/new-page-edit-username.png)
- Create Facebook App
    - Since I already had a Facebook Developer Account, I went straight to creating a Facebook App and it was very straightforward.
    - I also collected the PAGE_ID, APP_ID, PAGE_ACCESS_TOKEN, and APP_SECRET as indicated in the documentation.
- Install [Node.js](https://nodejs.org/en/)
    - I downloaded the v. 10.16.0 LTS for Windows (x64), which was the recommended version at the time of writing this.
- Install [Yarn](https://yarnpkg.com/lang/en/docs/install/#windows-stable)
    - I downloaded version 1.16.0 for Windows, which was the stable version at the time of writing this.
- Clone sample Messenger app repository and install dependencies
    - There was no problem cloning the repository, but Yarn wasn't available from any directory yet, despite it already being in my PATH. To fix this, I just restarted my machine.
- Using ngrok instead of LocalTunnel
    - I encountered an issue when running `lt --port 3000` using LocalTunnel. I found out that a lot of people were having the same [issue](https://github.com/localtunnel/localtunnel/issues/258), which turns out to be a server-side problem.
    - Looking for alternatives to LocalTunnel, I found **ngrok** which was easy to use, but did not have the *free* capability of setting a constant subdomain. It was, however, a bearable problem. I simply followed the [instructions](https://dashboard.ngrok.com/get-started) for set-up and installation and it worked perfectly.
    - So instead of running `lt --port 3000`, I ran `ngrok http 3000`. Note that ngrok has to either be added to the PATH or added in the project directory.
- Setting up the .env file
- Testing that the app works
- Download [Heroku CLI](https://devcenter.heroku.com/articles/heroku-cli#download-and-install)
    - I downloaded the Heroku 64-bit installer for Windows.
    - I don't know why, but the link I provided would sometimes be unreachable through my WiFi connection. It worked, however, when I connected to my mobile data.
- Deploying the app on Heroku
- Testing (again) that the app works
    - If it wasn't obvious, if your app is already running on Heroku there is no need to keep the terminals, in which you typed in the commands `ngrok http 3000` and `node app.js`, running.

Learning how to set up all of these was great, but it's simply a step towards my goal. I plan to start learning how to use the Node.js framework in the coming days. Basically, I want to know how to connect to Messenger with a Node.js project that I code from scratch.

---
## Day 3, 4, and 5
*22 June 2019, 6:00 PM - 11:59 PM*
*23 June 2019, 6:00 PM - 11:59 PM*
*24 June 2019, 6:00 PM - 10:00 PM*

After setting up the sample Messenger app in day 2, I wanted to create my own webhook from scratch. Not knowing how to do that, I first checked out Facebook for Developers' [tutorial](https://developers.facebook.com/docs/messenger-platform/getting-started/webhook-setup) on how to set up webhooks, which had step-by-step instructions. The problem for me, however, was that I didn't understand any of the code at all. So I looked online for a beginner course on Node.js and I found [this video](https://www.youtube.com/watch?v=TlB_eWDSMt4) on YouTube. It had a lot of concepts that were standard programming or web development ideas, but I listed down some notes on topics that were new to me. I also watched [this video](https://www.youtube.com/watch?v=pKd0Rpw7O48), which was a sequel to the previous video and mainly tackled how to use Express, among other important topics in using Node.js.

#### Notes
Node.js
-  a **runtime environment** for executing Javascript code
    - **!!!** *neither a programming language nor a framework*
- open-source
- great for prototyping
- scalable, because of its speed
- asynchronous (non-blocking)
- ideal for I/O-intensive applications
- NOT ideal for CPU-intensive applications
- In Javascript, all functions and variables defined globally can be accessed through `window`. The Node alternative of `window` is the keyword `global`. Functions and variables declared globally, however, cannot be accessed through the `global` keyword; only built-in functions (and variables?) may be accessed.
- Every file in a Node.js app is considered a module.
    - The following is the module wrapper function: `function(exports, require, module, __filename, __dirname)`
    - The expressions `module.exports` and `exports` only differ in the sense that you can change the value of the former, but not the latter; doing so with the latter only changes its value locally in the module.
    - It is ideal to declare modules as constants.

Some Useful Tools
- [JSHint](https://jshint.com/): detects errors and potential problems in Javascript code
- [Express](https://expressjs.com/): framework for creating web apps and APIs using Node.js
- [Nodemon](https://nodemon.io/): allows automatic restarting of Node.js application when a file has been edited
- [Joi](https://www.npmjs.com/package/@hapi/joi): validates Javascript objects

Some Useful Commands
- `npm init --yes`: makes a package.json file
- `npm install -g <package_name>`: installs a package globally
- `set <key>=<value>` (Windows) or `export <key>=<value>` (Mac): defines `process.env` key-value pairs

Some Code Snippets
- Setting server ports and accessing environment variables
```Javascript
const port = process.env.PORT || 3000;
const express = require('express');
const app = express();
app.listen(port, () => {
    console.log(`Listening on port ${port}...`);
});
```
- Allowing direct reading of response bodies as JSON (I think)
```Javascript
app.use(express.json());
```
- Using Joi for object validation
```Javascript
const Joi = require('joi'); //Note: outdated version
function validateObj(obj) {
    const schema = {
        name: Joi.string().min(3).required()
    };
    const { error } = Joi.validate(obj, schema);
    if(error) return res.status(400).send(error.details[0].message);
    else { //validated }
}
```
- Responding to a GET request and how to access values in the request
```Javascript
app.get('/api/courses/:course_id', (req, res) => {
    res.send(`Course ID is: ${req.params.course_id}.`);
    //Access request body through: req.body
    //Access query parameters through: req.query
});
```
- Using EventEmitter
```Javascript
const EventEmitter = require('events');
const emitter = new EventEmitter();
emitter.on('trigger', (arg) => {
    //Action when emitter.emit('trigger', ...) is called
});
emitter.emit('trigger', <some arguments>);
```
- Exporting values in modules
```Javascript
//require-ing this module would return a list of key-value pairs
module.exports.key = value;
//require-ing this module would return the value itself
module.exports = value;
```
Looking back at the sample code that Facebook for Developers provided for setting up webhooks, I believe that the two videos I watched and studied were able to equip me with all the concepts, regarding Node.js, its libraries/frameworks, Javascript, and ES6, that I need to understand to modify the sample code for my own purposes.
