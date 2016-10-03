# WikipediaLogin

This is a simple test demonstrating the capability of SerenityBDD

##Installation

In order to run this project, you must be running windows, and also have the following installed (links to the download site):

1. <a href="http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html" target="_blank">JDK 8</a>
2. <a href="https://gradle.org/gradle-download/" target="_blank">Gradle 3.1</a>
3. <a href="https://www.google.com/chrome/browser/desktop/index.html" target="_blank">Google Chrome</a>
4. <a href="http://chromedriver.storage.googleapis.com/index.html?path=2.24/" target="_blank">ChromeDriver</a>

### Installing JDK 8

Accept the License Agreement then download the installer for the Java SE Development Kit.
Run the installer once it is downloaded and follow the prompts.

### Installing Gradle

Download either the complete distribution or the binaries only. Extract the zip to a directory for installation. Inside the zipped folder will be an html document titled "Installing Gradle".
Follow the instructions to change your environment variables. They will have you add a variable <code>GRADLE_HOME</code> set to the extracted gradle directory and 
add <code>GRADLE_HOME/bin</code> to your <code>PATH</code> variable. Finally, test that gradle is installed by running <code>gradle -v</code>.

### Installing Chrome

Accept the Terms of Service and download the installer for Google Chrome. Run the installer and follow the instructions.

### Installing ChromeDriver

Download the windows crome driver zip, extract the executable, and simply place it in the project root directory (where build.gradle is)

## Running the Project

The command for running the project is <code>> gradle clean test aggregate</code> while in the project root directory.
Gradle will download dependencies on the first run, so it may take some time. Once all dependencies are satisfied, the tests will execute.

## Viewing the Results

Once all tests are done, Serenity generates html reports of the results. These accessible in the file <code>.\target\site\serenity\index.html</code>
The report will show which tests passed and which tests have failed.