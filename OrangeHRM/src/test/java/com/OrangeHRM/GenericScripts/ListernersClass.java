package com.OrangeHRM.GenericScripts;

import java.util.Date;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ListernersClass implements ITestListener {
	ExtentSparkReporter s;
	ExtentReports r;
	ExtentTest t;

	public void onStart(ITestContext context) {

		Date d = new Date();
		String d1 = d.toString().replace(":", "-");
		
		s = new ExtentSparkReporter("./Reports/Extentreport"+d1+".html");
		s.config().setDocumentTitle("BUILD_001");
		s.config().setReportName("TestCase");
		s.config().setTheme(Theme.DARK);
		r = new ExtentReports();
		r.attachReporter(s);
		r.setSystemInfo("OperatingSystem", "Windows");
		r.setSystemInfo("Browser", "GoogleChrome");
		System.out.println("Testcases execution is started");
	}

	public void onTestSuccess(ITestResult result) {
		t = r.createTest(result.getName());
		t.log(Status.PASS, result.getName() + " Success");
		System.out.println("Testmethods execution is success " + result.getName());
	}

	public void onTestFailure(ITestResult result) {
		t = r.createTest(result.getName());
		t.log(Status.FAIL, result.getName() + " Fail");
		t.log(Status.FAIL, result.getThrowable() + " Fail");
		System.out.println("Testmethods execution is failed" + result.getName());
	}

	public void onTestSkipped(ITestResult result) {
		t = r.createTest(result.getName());
		t.log(Status.SKIP, result.getName() + " Skipped");
		t.log(Status.SKIP, result.getThrowable() + " Skipped");
		System.out.println("Testmethods execution is skip" + result.getName());
	}

	public void onFinish(ITestContext context) {
		System.out.println("Testcases execution is completed");
		r.flush();
	}
}