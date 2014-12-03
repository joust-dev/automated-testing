Automated-Testing
=================

<h2>Selenium Automation Framework</h2>
It extends the basic tutorial found on the Selenium Wiki
(http://code.google.com/p/selenium/wiki/GettingStarted)
http://code.google.com/p/selenium/wiki/PageObjects

<h3>Environment Specifications:</h3>
<ul>
<li><b>Selenium WebDriver</b></li>
<li><b>IntelliJ</b></li>
<li><b>Maven</b></li>
<li><b>Java JDK</b></li>
<li><b>Firefox</b></li>
<li><b>JUnit</b></li>
</ul>
<h4>This Framework has the following tools:</h4>

1. <b>Selenium</b>- is a toolset for web browser automation that uses the best techniques available to remotely control browser instances and emulate user interaction with the browser.
2. <b>IntelliJ IDEA</b> - is  very popular IDE available for Java development from JetBrains. IntelliJ IDEA is a commercial tool. However, JetBrains offers a community edition with limited features for free use.
3. <b>Maven</b> -  Apache Maven provides support for managing the entire lifecycle of a test project. Maven is used to define project structure, dependencies, build, and test management.
4. <b>Java JDK</b> because we are writing and compiling Java code.
5. <b>Firefox</b> because Selenium WebDriver comes bundled with all the necessary drivers for Firefox so that becomes our default first browser to automate because Selenium WebDriver makes it easy to get started with Firefox out of the box.
6. <b>JUnit</b> because we use that as our default Test Runner and without it we can’t run any tests.

<h3>Best practice</h3>

Page Object Models

Page Object is a Design Pattern which has become popular in test automation for enhancing test maintenance and reducing code duplication.<br> A page object is an object-oriented class that serves as an interface to a page of your AUT. <br>The tests then use the methods of this page object class whenever they need to interact with that page of the UI. The benefit is that if the UI changes for the page, the tests themselves don’t need to change, only the code within the page object needs to change.Subsequently all changes to support that new UI are located in one place.

