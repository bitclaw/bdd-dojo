Install Java

```
cho "deb http://ppa.launchpad.net/webupd8team/java/ubuntu trusty main" | tee /etc/apt/sources.list.d/webupd8team-java.list
echo "deb-src http://ppa.launchpad.net/webupd8team/java/ubuntu trusty main" | tee -a /etc/apt/sources.list.d/webupd8team-java.list
apt-key adv --keyserver hkp://keyserver.ubuntu.com:80 --recv-keys EEA14886
apt-get update
apt-get install oracle-java8-installer
sudo apt-get install oracle-java8-set-default
echo oracle-java8-installer shared/accepted-oracle-license-v1-1 select true | sudo /usr/bin/debconf-set-selections
apt-get install oracle-java7-installer
# update-java-alternatives -s java-7-oracle
# update-java-alternatives -s java-8-oracle
update-java-alternatives
apt-get install -y oracle-java7-set-default
```
Install Gradle
`sudo apt-get install gradle`

Gradle useful commands:

`gradle build --info` Gets dependencies
`gradle -version`

Ubuntu based distros JAVA path fix:
Add the following to your .bashrc `vi ~/.bashrc`

```
# Fix for gradle , more info here: http://ubuntuforums.org/showthread.php?t=2241886
export JAVA_HOME=/usr/lib/jvm/java-8-oracle
```


Project Base for TDD and ATDD with java

It use Spark microframework, Cucumber, Junit and Selenide.

First you need to config the Chrome Driver

    download it from: https://sites.google.com/a/chromium.org/chromedriver/downloads

and set the path with:

    System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");


config with Junit and Cucumber-JVM

to run the test:

    gradle clean test --info

to generate coverage report:

    gradle clean test jacocoTestReport --info

