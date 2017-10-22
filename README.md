# kabo

A generic test UI automation framework build in java which uses raw selenium API to make life a bit easier for the QA people. What is kabo?

# Installation

```
The maven dependency is given below

 <dependency>
 <groupId>com.kabo</groupId>
 <artifactId>com.kabo</artifactId>
 <version>0.1</version>
 </dependency>
 ```
Please note that this dependency will not work since the project is yet to be officially relased .

To Create any driver instance, just create a file kabo.properties in your project root folder and copy past the follwing:

```
#kabo automation framework
#Do Not Change the below Keys. Change the value as per your choice

BROWSER=chrome

PLATFORM=Mac OS

PROCESSOR=64

PATH_TO_DRIVER=some path
# ------------------------
```