🚀 Dribbble Automation Project — Powered by Java + Selenium + TestNG
Welcome to one of my favorite personal automation projects! 🎨 This project is built to test the functionality of the Dribbble website using real browser interactions. Whether you're exploring popular designs, searching for jobs, or trying to log in — this test suite has got it covered!

💡 What’s this project about?
This project is a full website automation test for dribbble.com, created using:

Java

Selenium WebDriver

TestNG

ChromeDriver

and a little touch of random magic ✨

It simulates real user behavior, including signing up with random data, clicking buttons, scrolling, hovering over menus, switching tabs, and even testing how the site behaves on different screen sizes (mobile/tablet)!

🔍 What does the code actually do?
Let me take you on a quick tour:

Setup & Initialization
The test opens Chrome, navigates to Dribbble, maximizes the window, and refreshes the page to make sure everything loads clean.

Sign Up Test
A randomly generated first name + last name + number creates a fake email, then fills out the sign-up form. It clicks buttons, agrees to terms, and tries to create a new account.

Login Test
Enters login credentials and prepares the session to test features that need a signed-in user.

Explore Popular Designs
Clicks on the "Explore" section, grabs a random design from the list, and clicks "Like" — just like a real user appreciating some creativity 💖

Hire a Designer Section
Hovers over the "Hire a Designer" menu, chooses “Browse Freelancers”, randomly opens a profile, switches to a new tab, scrolls down, and follows the designer. This test shows how powerful UI interactions can be automated.

Find Jobs
Searches for jobs by selecting filters (location: Amman, full-time), scrolls to the job list, and clicks the search button. It confirms whether the page loads correctly with job results.

Support / Contact Us
Scrolls down to the “Support” section, clicks on it, then picks a random FAQ/help topic to test site navigation.

Responsive Testing
Changes browser size to simulate mobile and tablet views to ensure the site still looks great on different screens. Handy for frontend developers too!

Logout
Simulates the full logout flow by clicking the profile picture, hovering to reveal the menu, and logging out. Then it checks that the login button is visible again — mission complete.

⚙️ Tech & Tools You Need
To run this project, you should have:

Java JDK installed

Google Chrome

ChromeDriver (match it with your Chrome version)

An IDE like IntelliJ or Eclipse

(Optional) Maven for dependency management

You can run the tests by:

Right-clicking the class in your IDE > Run as > TestNG Test

Or by using Maven with a proper pom.xml if you'd like to automate the build

✨ Why I built this
I built this project as part of my quality assurance learning journey. It helped me understand browser behaviors, automation logic, and the power of writing flexible, reusable tests. If you're passionate about frontend, QA, or just love automation — you’ll definitely enjoy exploring this code!

📌 Important Notes
Some test cases are disabled (enabled = false) so you can activate the ones you want.

Please be respectful when testing against real websites — avoid spamming or creating too many accounts.

This project is for educational and portfolio purposes.



