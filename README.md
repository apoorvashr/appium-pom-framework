📱 SIP Calculator App – Mobile Automation Framework

(Appium + Java + TestNG + POM)

This repository contains a complete end-to-end mobile automation testing framework for the SIP Calculator Android application, built using Appium, Java, TestNG, Maven, and Page Object Model (POM).

It demonstrates real-world mobile automation practices including clean framework design, reusable page classes, and scalable test structure.

🔗 Application Under Test (AUT)

SIP Calculator – Android App
👉 https://play.google.com/store/apps/details?id=com.continuum.sip.calculator

🧪 Application Overview

The SIP Calculator app helps users calculate financial investments such as:

📊 Systematic Investment Plan (SIP)

💰 Lumpsum Investments

📈 Financial Planning Estimates

Key UI Components Automated

Radio Buttons (SIP / Lumpsum / Plan)

EditText input fields

Calculate & Reset buttons

Result validations

🛠️ Tech Stack
Tool / Framework	Usage
Java (25)	Programming language
Appium	Mobile automation
TestNG	Test execution & reporting
Selenium WebDriver	Element interactions
Maven	Build & dependency management
Page Object Model (POM)	Framework design
Android Emulator / Real Device	Test execution
Git & GitHub	Version control
📦 Dependencies
Library	Version	Purpose
Appium Java Client	10.0.0	Mobile automation
TestNG	7.10.2	Test framework
SLF4J Simple	2.0.13	Logging
📂 Project Structure
Calculator-Application-Appium-Android
│
├── src/main/java
│   ├── base        → Driver & Appium setup
│   ├── pages       → Page Object classes
│   └── utils       → Reusable utilities
│
├── src/test/java
│   └── tests       → TestNG test cases
│
├── testng.xml      → Test execution suite
├── pom.xml         → Maven dependencies
└── README.md

▶️ How to Run the Tests
1️⃣ Clone the Repository
git clone https://github.com/apoorvashr/Calculator-Application-Appium-Android.git

2️⃣ Start Appium Server
appium

3️⃣ Start Emulator or Connect Device
adb devices

4️⃣ Run Tests
mvn test


Or
Right-click testng.xml → Run

⭐ Framework Highlights

✔ Page Object Model (POM)

✔ Clean and reusable code

✔ Switch-case based RadioButton handling

✔ Easily scalable for new screens

✔ Industry-standard automation framework design

📈 Future Enhancements

⏳ Add Extent Reports

⏳ Capture screenshots on failure

⏳ Integrate with CI/CD (Jenkins / GitHub Actions)

📦 Best Practices Followed

Meaningful test and method names

Page locators maintained only in Page classes

No hard waits (uses explicit waits)

Modular, maintainable code structure

🤝 Contributions

Contributions are welcome!
Feel free to open Issues or submit Pull Requests to improve this framework.

📞 Contact

For questions, improvements, or support:

📧 Email: apoorva.shr@gmail.com

🔗 GitHub: https://github.com/apoorvashr
