package com.dbt.webservice.siebel;

import java.util.Map;

import javax.xml.ws.BindingProvider;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;


import com.sun.xml.internal.ws.client.BindingProviderProperties;



public class SiebelClient {
	 /****正式	****/
     //private static String serviceAddress="http://172.16.2.157:8001/TSINGTAO/SIEBEL/G3_ORG_CREATE_RETAILER/PS/PS_WS_CREATE_RETAILER?WSDL";
	 private static String serviceAddress="http://172.16.1.77:8001/TSINGTAO/SIEBEL/G3_ORG_CREATE_RETAILER/PS/PS_WS_CREATE_RETAILER";
	 private static String wsUsername="G3_SIEBEL_USER";
	 private static String wsPwd="G3_SIEBEL_USER";

	/***c测试
	 private static String serviceAddress="http://172.16.2.172:7780/eai_chs/start.swe?SWEExtSource=WebService&amp;SWEExtCmd=Execute&amp;UserName=SADMIN2&amp;Password=SADMIN2TEST";
	 private static String wsUsername="";
	 private static String wsPwd="";****/
	 private final static Log log=LogFactory.getLog(SiebelClient.class);
     static {		
		    // 取得配置文件中终端编码开关是否开启
		    try{
				serviceAddress = serviceAddress;		
				wsUsername=wsUsername;	
				wsPwd=wsPwd;	
		    }catch(Exception e){
		    	
		    }		       
	 }
	
	 private TBSpcSyncSpcEndSpcForSpcCMSSpcService_Service service=new TBSpcSyncSpcEndSpcForSpcCMSSpcService_Service();
	 public static void main(String []args){
		  
		 test();
	 }
	 
	 public static void test(){
		 SiebelClient client=new SiebelClient();
		 String address="";
	
		 NewRouteForCMSInput routeInput=new NewRouteForCMSInput();
         routeInput.setGRIDKEY("1-ECND3Q");
         routeInput.setROUTEDESC("7号路线");
         routeInput.setROUTENAME("7号路线");
         routeInput.setROUTESTATUS("0");
         //routeInput.setROUTESTATUS("Active");
         NewRouteForCMSOutput newRouteForCMS = client.newRouteForCMS(routeInput);		
		 log.warn(newRouteForCMS);
	 }
	 
	 	 
	 public TBSpcSyncSpcEndSpcForSpcCMSSpcService initRemoteService(String serviceAddress){
	 	 //String serviceAddress="http://"+ip+":"+port;	 	 
	 	 TBSpcSyncSpcEndSpcForSpcCMSSpcService client=service.getTBSpcSyncSpcEndSpcForSpcCMSSpcService();
		 Map<String, Object> contextRequestConfig=((BindingProvider) client).getRequestContext();		
		 //tcp:连接超时
		 contextRequestConfig.put("com.sun.xml.internal.ws.connect.timeout", 1000*120);
		//read timeOut :读写超时
		 
		 contextRequestConfig.put(BindingProviderProperties.REQUEST_TIMEOUT, 1000*120); //设置超时
		 contextRequestConfig.put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, serviceAddress);	//设置服务地址
		 contextRequestConfig.put(BindingProvider.USERNAME_PROPERTY, wsUsername);
		 contextRequestConfig.put(BindingProvider.PASSWORD_PROPERTY, wsPwd);
		 return client;
	}
	
	/**
	 * 向siebel添加路线
	 * @param routeInput
	 * @return
	 */
    public NewRouteForCMSOutput newRouteForCMS(NewRouteForCMSInput routeInput){
    	 NewRouteForCMSOutput newRouteForCMS=new NewRouteForCMSOutput();
    	 newRouteForCMS.setACTIONFLAG("FAIL");
		 try {
			TBSpcSyncSpcEndSpcForSpcCMSSpcService invokeServiceClient = this.initRemoteService(serviceAddress);
			 newRouteForCMS = invokeServiceClient.newRouteForCMS(routeInput);
		} catch (Exception e) {			
			e.printStackTrace();
		}
		 return newRouteForCMS;
	 }
	
    /**
     * 向siebel添加终端
     * @param endInput
     * @return
     */
    public NewEndForCMSOutput newEndForCMS(NewEndForCMSInput endInput){
    	NewEndForCMSOutput output=new NewEndForCMSOutput();
    	output.setACTIONFLAG("FAIL");
    	try {
			TBSpcSyncSpcEndSpcForSpcCMSSpcService initRemoteService = this.initRemoteService(serviceAddress);
			output=initRemoteService.newEndForCMS(endInput);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	return output;
    }
    
    /**
     * 向siebel添加定格
     * @param gridInput
     * @return
     */
    public NewGridForCMSOutput newGridForCMS(NewGridForCMSInput gridInput){
    	NewGridForCMSOutput output=new NewGridForCMSOutput();
    	output.setACTIONFLAG("FAIL");
    	try {
			TBSpcSyncSpcEndSpcForSpcCMSSpcService initRemoteService = this.initRemoteService(serviceAddress);
			output=initRemoteService.newGridForCMS(gridInput);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	return output;
    }
	 
}
