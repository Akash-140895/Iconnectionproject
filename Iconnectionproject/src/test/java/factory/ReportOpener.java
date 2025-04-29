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
			String reportPath = System.getProperty("user.dir")+"/Test-Output/SparkReport" + timeStamp + "/Report/CucumberExtentReport.html";
			File htmlFile = new File(reportPath);// <-- path to your report
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
		/* try {
	            // Path to your SparkReports
	            File testOutputDir = new File(System.getProperty("user.dir") + "/Test-Output");
	            
	            // Filter folders that start with "SparkReport"
	            File[] reportFolders = testOutputDir.listFiles(file -> 
	                file.isDirectory() && file.getName().startsWith("SparkReport"));

	            if (reportFolders == null || reportFolders.length == 0) {
	                System.out.println("No SparkReport folders found.");
	                return;
	            }

	            // Sort folders by last modified time (most recent first)
	            Arrays.sort(reportFolders, Comparator.comparingLong(File::lastModified).reversed());

	            // Get the most recent folder
	            File latestReportFolder = reportFolders[0];
	            File reportFile = new File(latestReportFolder, "Report/CucumberExtentReport.html");

	            if (reportFile.exists()) {
	                Desktop.getDesktop().browse(reportFile.toURI());
	                System.out.println("Opening report: " + reportFile.getAbsolutePath());
	            } else {
	                System.out.println("Report file not found in: " + reportFile.getAbsolutePath());
	            }

	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	}
	public static void main(String[] args) {
        openReport(); // Call this to test
    }
	}*/
