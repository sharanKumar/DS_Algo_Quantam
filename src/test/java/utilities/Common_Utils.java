package utilities;

import java.io.FileInputStream;
import java.util.Properties;

import constants.Constants;



public class Common_Utils {


	private static Common_Utils Common_UtilsInstance= null;





	//Config file loader
	public void loadProperties() {

		Properties properties=null;
		try {
			System.out.println("Inside try");
			if(properties==null) {
				properties = new Properties();
				System.out.println("properties object created");
				String dir = System.getProperty("user.dir");
				System.out.println("User Directory" + dir);
		        FileInputStream in = new FileInputStream(dir + "/src/test/resources/config/config.properties");
				properties.load(in);
				System.out.println("after load");
				Constants.URL=properties.getProperty("GET_STARTED_URL");
				Constants.BROWSER=	properties.getProperty("BROWSER");
				Constants.HOMEPAGE=	properties.getProperty("HOMEPAGE_URL");
				Constants.LOGINPAGE= properties.getProperty("LOGINPAGE_URL");
				Constants.USERNAME= properties.getProperty("USERNAME");
				Constants.PASSWORD= properties.getProperty("PASSWORD");
				//Constants.ARRAYPAGE= properties.getProperty("ARRAYPAGE_URL");
				//Constants.ARRAYSINPYTHON= properties.getProperty("ARRAYSINPYTHON_URL");
				Constants.EDITORBOX= properties.getProperty("EDITOR_URL");
				//Constants.ARRAYSUSINGLIST= properties.getProperty("ARRAYSUSINGLIST_URL");
				//Constants.APPLICATIONSOFARRAY= properties.getProperty("APPLICATIONSOFARRAY_URL");
				Constants.PRACTICEQUESTIONS= properties.getProperty("PRACTICEQUESTION_URL");






			}

		} catch (Exception e) {
			e.printStackTrace();
		}







	}
}