package factory;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ReportOpener {

	public static void openReport() {
		try {
			String timeStamp = new SimpleDateFormat("d-MM-YY HH-mm-ss").format(new Date());
			//String reportPath = System.getProperty(
					//"/Iconnectionproject/Test-Output/SparkReport " + timeStamp + "/Report/CucumberExtentReport.html");
			File htmlFile = new File("/Iconnectionproject/Test-Output/SparkReport " + timeStamp + "/Report/CucumberExtentReport.html");// <-- path to your report
			if (htmlFile.exists()) {
				Desktop.getDesktop().browse(htmlFile.toURI());
			} else {
				System.out.println("Report file not found!");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
