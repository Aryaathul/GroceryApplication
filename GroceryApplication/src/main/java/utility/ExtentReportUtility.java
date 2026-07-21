package utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportUtility {

	public static final ExtentReports extentReports = new ExtentReports();// static instance of extent reports that can
	// be shared accross the application

	public synchronized static ExtentReports createExtentReports() {

	ExtentSparkReporter reporter = new ExtentSparkReporter("./extent-reports/extent-report.html");// ./ is used for local path of project
	reporter.config().setReportName("7RMartSupermarketProject"); // setting report name
	extentReports.attachReporter(reporter); 

	extentReports.setSystemInfo("Organization", "Obsqura");
	extentReports.setSystemInfo("Name", " Arya"); // provides context of the report
	return extentReports;
	}
}
