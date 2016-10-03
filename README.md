# WikipediaLogin

This is a simple test demonstrating the capability of SerenityBDD

##Installation

In order to run this project, you must be running windows, and also have the following installed:

1. <a href="http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html">JDK 8</a>
2. <a href="https://gradle.org/gradle-download/">Gradle 3.1</a>
3. <a href="http://chromedriver.storage.googleapis.com/index.html?path=2.24/">ChromeDriver</a>

### Installing JDK 8

Accept the License Agreement then download the installer for the Java SE Development Kit.
Run the installer once it is downloaded and follow the prompts.

### Installing Gradle

Download either the complete distribution or the binaries only. Inside the zipped folder will be an html document titled "Installing Gradle".
Follow the instructions to change your environment variables to add <code>GRADLE_HOME</code> for the gradle directory. 
Add GRADLE_HOME/bin to your <code>PATH</code> variable, then test gradle with <code>gradle -v</code>

### Installing ChromeDriver

Download the windows crome driver zip, extract the executable, and simply place it in the project root directory (where build.gradle is)

## Running the Project

The command for running the project is <code>gradle clean test aggregate</code> while in the project root directory
