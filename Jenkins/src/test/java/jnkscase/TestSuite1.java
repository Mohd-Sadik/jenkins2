/**
 * 
 */
package jnkscase;

import org.junit.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class TestSuite1 {
	@Test
	public void test1() {
		String path = "C:\\Users\\Asus\\eclipse-workspace_java1\\Jenkins\\target\\jenkinsreport.html";
		ExtentReports report = new ExtentReports(path);
		ExtentTest test = report.startTest("test case01");
		test.log(LogStatus.PASS, "test started");
		test.log(LogStatus.INFO, "test execution in in progress");
		test.log(LogStatus.PASS, "test closed");
		report.flush();
		report.close();

		System.out.println("test1");
	}

	@Test
	public void test2() {
		System.out.println("test2");
	}
}
