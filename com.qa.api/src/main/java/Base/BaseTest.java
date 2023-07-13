package Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

public class BaseTest {
	public Properties prop;
	public int successful_statuscode=200;

	public BaseTest() {
		try {
			prop=new Properties();
			FileInputStream file=new FileInputStream("D:\\elipse java\\com.qa.api\\src\\main\\java\\config\\property\\property");
			prop.load(file);
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
		

	}

}
