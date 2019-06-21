---
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
    - I chose the **Community or Public Figure** option and filled it out as seen in the following image. ![Creating New Page](readme-images/new-page)
    - When I pressed **Continue**, however, there was a prompt that an error occurred. ![New Page Error](readme-images/new-page-error)
    - When I tried to do it again, there was a prompt that I already had a page with the same name. ![Change Page Name](readme-images/new-page-change-name)
    - I figured that the page was already created, so I went to [view my pages](https://www.facebook.com/bookmarks/pages) and, true enough, it was already there. When I clicked on the page, however, it brought me to a page saying that there was an error. So instead of clicking on the page name itself, I clicked on the gear (settings) button beside it. It opened up a pop-up and I scrolled down the **General** tab and clicked **See All Information**. ![Edit Details](readme-images/new-page-edit-details)
    - This successfully brought me to the page I just created. Not knowing if it was necessary or not, I also edited the page's username. ![Edit Username](readme-images/new-page-edit-username)
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