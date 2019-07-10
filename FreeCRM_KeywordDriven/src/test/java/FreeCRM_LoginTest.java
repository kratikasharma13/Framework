//		tbBase = new TestBase();
//		prop =	tbBase.readProperty();
//		String username = prop.getProperty("username");
//		String password = prop.getProperty("password");
//		System.out.println(username+" |  " +password);
		
		//tbBase.init_driver("chrome");



import java.util.Properties;

import com.qa.freeCRM.base.TestBase;
import com.qa.freeCRM.engine.KeywordEngine;

public class FreeCRM_LoginTest 
{
	
//All these are global static references	
	static TestBase tbBase;
	static Properties prop;
		
	
	public static void main(String[] args) {
		KeywordEngine obj = new KeywordEngine();
		obj.startExecution("FreeCRM_AddContact");
		
		
	}
}
