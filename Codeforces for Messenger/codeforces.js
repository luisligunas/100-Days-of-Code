const request = require('request');

const contestListUrl = "https://codeforces.com/api/contest.list";

request.get(contestListUrl, {json: true}, (err, res, body) => {
	const success = body.status === "OK";
	if(!success) {
		//say it failed
		console.log("Getting contest list from Codeforces failed");
		return;
	}
	let contests = body.result
					.filter((contest) => contest.phase === "BEFORE")
					.sort((a, b) => {
						if(a.startTimeSeconds === b.startTimeSeconds)
							return a.name.localeCompare(b.name);
						return a.startTimeSeconds - b.startTimeSeconds;
					});
	console.log(contests);
});