package configProperties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

public class PropertiesFile {
	/**
	 * This is hardCoded ProjectPath so different matchine will not execute if
	 * transfer. so we have to use dynamic path
	 * Users/mdislam/Documents/Eclipsess/coreJavaProject/src/main/resources/config.properties
	 * 
	 * Dynamic projectPath: System.getProperties("user.dir")+localPath
	 * 
	 * projectPath + "/src/main/resources/config.properties"
	 * 
	 * @param args
	 * @throws IOException
	 */

	static Properties prop = null;
	static String projectPath = null;

	public static void main(String[] args) throws IOException {

		getPropertiesReding();
		setPropertiesReding();

	}

	public static void getPropertiesReding() throws IOException {

		try {
			prop = new Properties();
			projectPath = System.getProperty("user.dir");
			InputStream input = new FileInputStream(projectPath + "/src/main/resources/config.properties");

			prop.load(input);
			String browser_Name = prop.getProperty("browserName");
			System.out.println("We are Reading Properties file : " + browser_Name);
			
			PropertiesFileTest.browserName=browser_Name;

		} catch (FileNotFoundException exp) {
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}

	}

	public static void setPropertiesReding() throws IOException {
		try {
			OutputStream output = new FileOutputStream(projectPath + "/src/main/resources/config.properties");
			prop.setProperty("Name", "Ashraful");
			prop.store(output, "We are Writing properties file: ");

		} catch (FileNotFoundException exp) {
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}

	}

}
