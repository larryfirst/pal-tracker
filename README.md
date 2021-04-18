# pal-tracker

#as I had to use VDI to access VMWare's central server my SSH authentication is not working in this case, I had to trun on this repo authenticated by HTTPS.
1. ubuntu@ip-172-31-88-170:~/workspace/pal-tracker$ git status
2. ubuntu@ip-172-31-88-170:~/workspace/pal-tracker$ git add
3. ubuntu@ip-172-31-88-170:~/workspace/pal-tracker$ git status // this gives the differences
4. ubuntu@ip-172-31-88-170:~/workspace/pal-tracker$ git commit -m "some comments"
5. ubuntu@ip-172-31-88-170:~/workspace/pal-tracker$ git push https://github.com/larryfirst/pal-tracker.git
Username for 'https://github.com/larryfirst/pal-tracker.git': larryfirst@yahoo.com
Password for 'https://larryfirst@yahoo.com@github.com/larryfirst/pal-tracker.git': <type in the password)
.... (the infor pusing to the github)

$git cherry-pick configuration-start // what this is?
*1. I encounterred this issue $ git push enter --> fatal: unable to find remote helper for 'ttps' ( was because VDI was not connecting to GitHub)
WELCOME_MESSAGE=howdy ./gradlew bootRun( where is the WELCOME_MESSAGE BINDING TO welcome.message?

/home/ubuntu/workspace/pal-tracker/src/test/java/test/pivotal/pal/tracker/WelcomeControllerTest.java:12: error: constructor WelcomeController in class WelcomeController cannot be applied to given types;
WelcomeController controller = new WelcomeController("A Welcome msg");
^
required: no arguments
found: String
