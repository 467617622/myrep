




import org.apache.axis.wsdl.WSDL2Java;
/**
 * 
 * @Title: WebServiceUtil.java
 * @Description: 生成webservice服务
 * @date 2014-7-6 下午1:52:06 
 * @author xuefeng.hu
 */
public class WebServiceUtil {
	public static void main(String[] args) {
		 try {
		 System.setProperty("java.ext.dirs",
		 "D://shrbank_topscf//TestWebService//WebContent//WEB-INF//lib");
		 //D:\workspace\workspaceHaierScf\WebSerivceDemo\WebContent\WEB-INF\lib
		 
		 String[] arg = {
		 "http://localhost:9181/WebServer/services/CLPM2SCFService?wsdl",
		 "-osrc",
		 "-pcom.huateng.scf.test.webservice"};
		 WSDL2Java.main(arg);

		 } catch (Exception e) {
		 e.printStackTrace();
		 }
	}
}
