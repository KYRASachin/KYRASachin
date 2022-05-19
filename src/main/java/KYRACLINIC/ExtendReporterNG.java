package KYRACLINIC;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtendReporterNG {
	static ExtentReports extend;
	
	public static ExtentReports getReportObject() {
		
		String path=System.getProperty("user.dir")+"\\reports\\index.html";
		ExtentSparkReporter reporter=new ExtentSparkReporter(path);
		reporter.config().setReportName("Web Automation Report");
		reporter.config().setDocumentTitle("Test KYRA CLINICAL Result");
		
		extend=new ExtentReports();
		extend.attachReporter(reporter);
		extend.setSystemInfo("Tester", "Sachin Ahlawat");
		return extend;
		
	}

}
