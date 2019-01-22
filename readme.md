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

### Lab 33: Security
#### Overview
This lab will ensure that your app has appropriate security implemented.

#### Feature Tasks
Use secrets appropriately
Ensure you have no secret information in any place that could be seen by taking apart your apk.

#### Auth on the backend
Add auth to your Spring backend, so that users can log in. Require users to be logged in to post an Exercise, and associate users and exercises.

#### SharedPrefs for login
Allow the user to log in to your app, using the login functionality for the backend. Store their token in SharedPrefs, and ensure it’s secret.