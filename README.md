# kabo
A generic test UI automation framework build in java which uses raw selenium API to make life a  bit easier for the QA people.
What is kabo?

A Weird name right.Not really . It was once a part of India. A exotic valley which was once a part of the kingdom of Manipur. Obviously it is not the only reason I named this framework as kabo. While naming I am following Anjuta's path, the famous Gnome IDE(https://developer.gnome.org/anjuta-faqs/stable/general-name.html.en) My motive is to make people's life a bit easier.

What kabo will do?

It will be a pain killer while automating a UI project. Hey folks , you do not have to worry about maintaining bulk excel files for hybrid automation framework. kabo will do it for you using Behavior-driven development approach. Automation does not mean writing ugly driver.findElement code everywhere in the test scripts. It should be well organized so that maintenance become easy.

From now on forget about creating webDriver instances , forget about the pain you have endured to handles windows. Your only concentration should be on business logic or we call the core functionality.

# Installation
The maven dependency is given below

```
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