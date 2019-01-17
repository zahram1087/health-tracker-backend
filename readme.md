### Lab 31: Threading, AsyncTask, and Web Requests
#### Feature Tasks
Backend
* Add a replica of your Exercise model to the backend Spring app.
* Create a POST route that allows creating a new Exercise, and a GET route that responds with all Exercises currently in the database.
* Test these routes with Postman, deploy, and ensure there’s at least one Exercise in your deployed db. (This is all easy now… right?)

Android: Display Exercises from the server
* When a user opens the Exercise Diary page, the app should make a request to the server to retrieve all the Exercises in the server’s database.
* It should display both those Exercises and the ones that are local to the device within the Diary page.

Android: Post Exercises to the server
* When a user creates a new Exercise locally on their device, in addition to saving it to the local database, the app should POST it to the server.