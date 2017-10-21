package com.kabo.core.report;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import java.io.File;
import java.io.IOException;

public class Report{

        private static ExtentReports reports;
        private static ExtentHtmlReporter reporter;

        public static void setReport (String htmlReport){
                reports=new ExtentReports();
                File file=new File(htmlReport);
                if(file.exists() && file.isFile()){
                    file.delete();
                    try {
                        file.createNewFile();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                reporter= new ExtentHtmlReporter(htmlReport);
                reports.attachReporter(reporter);

        }

        public static void write( String testName, String des, boolean isStatus, boolean isNegative){

            if(testName.isEmpty() || des.isEmpty()){
                return;
            }
            if(isStatus && !isNegative){
                reports.createTest(testName).pass(des);
                reports.flush();
            }else if(isStatus && isNegative){
                reports.createTest(testName).pass("Negative Test Case--"+des);
                reports.flush();
            }else if(!isStatus && isNegative){
                reports.createTest(testName).pass("Negative Test Case--"+des);
                reports.flush();
            }else if(!isStatus && !isNegative){
                reports.createTest(testName).fail(des);
                reports.flush();
            }
        }

        public static void writeLog(String logName, Exception e){
            if(e==null){
                reports.createTest(logName).pass(logName);
                reports.flush();
                return;
            }
            reports.createTest(logName).fail(e.getMessage());
            reports.flush();
        }
    }
