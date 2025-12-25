# 📱 SIP Calculator App – Mobile Automation Framework (Appium + Java)

This repository contains an **end-to-end mobile automation testing framework** for the **SIP Calculator Android application**, built using **Appium, Java, TestNG, and Page Object Model (POM)**.

🔗 **App Under Test (AUT):**  
https://play.google.com/store/apps/details?id=com.continuum.sip.calculator

---

## 🧪 Application Overview

The **SIP Calculator** app helps users calculate:
- Systematic Investment Plan (SIP)
- Lumpsum investment returns
- Financial planning estimates

Key UI components automated:
- Radio buttons (SIP / Lumpsum / Plan)
- EditText input fields
- Buttons (Calculate, Reset)
- Result validations

---

## 🛠️ Tech Stack

| Tool / Framework | Usage |
|------------------|-------|
| **Java** | Programming language |
| **Appium** | Mobile automation |
| **TestNG** | Test execution & reporting |
| **Selenium WebDriver** | Element interactions |
| **Page Object Model (POM)** | Framework design |
| **Maven** | Dependency management |
| **Android Emulator / Real Device** | Test execution |
| **Git & GitHub** | Version control |

---

.

📦 Dependencies & Versions

This project uses the following libraries and tools:
🔹 Build & Language
Java: 25 (Preview features enabled)

Maven: Project build & dependency management
🔹 Automation Libraries
Library	Version	Purpose
Appium Java Client	10.0.0	Mobile automation for Android
TestNG	7.10.2	Test execution & test suite management
SLF4J Simple	2.0.13	Logging framework


▶️ How to Run Tests

1️⃣ Clone the Repository
git clone https://github.com/apoorvashr/appium-pom-framework.git
2️⃣ Start Appium Server
appium
3️⃣ Start Emulator / Connect Device
adb devices
4️⃣ Execute Tests
mvn test

or
Right click → testng.xml → Run


Framework Highlights

✔ Page Object Model (POM)
✔ Clean and reusable code
✔ Switch-case based RadioGroup handling
✔ Easily scalable for new screens
✔ Industry-standard automation practices


📈 Future Enhancements

⏳ Add Extent Reports
⏳ Screenshot capture on failure



📦 Best Practices
✔ Use meaningful test names
✔ Keep page locators in Page classes
✔ Avoid hard waits — use explicit waits
✔ Add tests under src/test/java

🤝 Contributions

Contributions are welcome!
Feel free to open issues and submit pull requests. 😊


📞 Contact

For questions, improvements, or help:
📧 Email: apoorva.shr@gmail.com
