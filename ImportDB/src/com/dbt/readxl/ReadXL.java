package com.dbt.readxl;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import com.dbt.common.CommonDic;
import com.dbt.common.WriteLogs;
import com.dbt.entity.TerminalEntity;
import com.dbt.webservice.siebel.NewEndForCMSInput;
import com.dbt.webservice.siebel.NewEndForCMSOutput;
import com.dbt.webservice.siebel.SiebelClient;
public class ReadXL {
    /** Excel文件的存放位置*/
	public static String fileToBeRead =  "/Users/eddy/Dev/sh03.xls";
    
    
    /** 终端路线Log文件的存放位置*/
    public static String temrKeyLogFilePath = "/Users/eddy/Dev/Log/pds01.log";
    /** 渠道Log文件的存放位置*/
    public static String qdLogFilePath = "/Users/eddy/Dev/Log/pds02.log";
    /** CMSLog文件的存放位置*/
    public static String cmsLogFilePath = "/Users/eddy/Dev/Log/pds03-1.log";
    /** Siebel Log文件的存放位置*/
    public static String siebelLogFilePath = "/Users/eddy/Dev/Log/pds04.log";
    
    /** 成功Log文件的存放位置*/
    public static String LogFilePath = "/Users/eddy/Dev/Log/pds05.log";
    /** 行数 */
    private static Integer totalCellNum = 19;
    
    /**列数从0开始*/
    private static int  lastColNum = 19; 
    
    
    
    public static void main(String argv[]) {
        try { 
        	// 创建对Excel工作簿文件的引用
            HSSFWorkbook workbook = new HSSFWorkbook(new FileInputStream(fileToBeRead));
            // 获取sheet1
            HSSFSheet sheet = workbook.getSheet("Sheet1");
            // 循环行
            
            for (int rowNum = 0; rowNum <= sheet.getLastRowNum(); rowNum++) {
            	Date date = new Date();  
    			SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    			String newdate = formatter.format(date);
                HSSFRow hssfRow = sheet.getRow(rowNum);
                if (hssfRow == null) {
                    continue;
                }
                TerminalEntity terminalEntity = new TerminalEntity();
                //终端编码
                HSSFCell tcode = hssfRow.getCell(0);
            	if (null != tcode && !tcode.toString().trim().equals("")) {
                    continue;
                   
                }
            	 //terminalEntity.setTerminalcode(getValue(tcode));
                
                
            	//终端名称
                HSSFCell tname = hssfRow.getCell(1);
            	if (tname == null) {
                    continue;
                }
            	terminalEntity.setTerminalname(getValue(tname));
            	
            
            	/***
            	 * 路线key routekey
            	 * 注意顺序
            	 * 通过线路code获取线路key和定格key
            	 * 通过定格key查询定格名称和excel对比。路线key存入终端表
            	 */
            	//定格名称(暂无用)

             	//路线编码
             	HSSFCell routecode = hssfRow.getCell(3);
             	if (routecode == null) {
                     continue;
                 }
             	String _routecode = getValue(routecode);
             	
             	String routeKey = CommonDic.getKeyByCode(_routecode);
             	if("".equals(routeKey)){
             		StringBuilder sb = new StringBuilder();
             		Integer line = 0 ;
             		line = rowNum+1;
             		sb.append("----------------------------------------"+"/n");
             		sb.append(newdate+":Excel文件第"+line+"行的【"+terminalEntity.getTerminalname()+"】终端的【没有找到此线路】，并终止。"+"/n");
             		sb.append("----------------------------------------"+"/n");
             		WriteLogs.write(temrKeyLogFilePath,sb.toString());
             		continue;
             	}
             	
             	terminalEntity.setRoutekey(routeKey);
             	//线路key完毕
             	
            	//省y
             	//市
             	HSSFCell pronvicen = hssfRow.getCell(4);
             	if (pronvicen == null) {
                     continue;
                 }
             	String pronvicen1 = CommonDic.getAreaProvince(getValue(pronvicen));
             	terminalEntity.setProvince(pronvicen1);
             	//市
             	HSSFCell city = hssfRow.getCell(5);
             	if (city == null) {
                     continue;
                 }
             	String city1 = CommonDic.getAreaCity(getValue(city));
             	terminalEntity.setCity(city1);
             	//县
             	HSSFCell county = hssfRow.getCell(6);
             	if (county == null) {
                     continue;
                 }
             	String county1 = CommonDic.getAreaCounty(getValue(county));
             	
                terminalEntity.setCounty(county1);
             	//地址
             	HSSFCell address = hssfRow.getCell(7);
             	if (address == null) {
                     continue;
                 }
             	terminalEntity.setAddress(getValue(address));
             	//销售渠道
             	HSSFCell xsqd = hssfRow.getCell(8);
             	if (xsqd == null) {
                     continue;
                 }
             	String quVal = CommonDic.getChannel(getValue(xsqd));
             	terminalEntity.setSellchannel(quVal);
             	//销售主渠道
             	HSSFCell xszqd = hssfRow.getCell(9);
             	if (xszqd == null) {
                     continue;
                 }
             	String xszqdVal = CommonDic.getChannel(getValue(xszqd));
             	terminalEntity.setMainchannel(xszqdVal);
             	//销售次渠道
             	HSSFCell xscqd = hssfRow.getCell(10);
             	if (xscqd == null) {
                     continue;
                 }
             	String xscqdVal = CommonDic.getChannel(getValue(xscqd));
             	terminalEntity.setMinorchannel(xscqdVal);
             	//等级
             	HSSFCell level = hssfRow.getCell(11);
             	if (level == null) {
                     continue;
                 }
             	terminalEntity.setTlevel(CommonDic.getLevel(getValue(level)));
             	//联系人
             	HSSFCell contact = hssfRow.getCell(12);
             	if (contact == null) {
                     continue;
                 }
             	terminalEntity.setContact(getValue(contact));
             	//联系电话
             	HSSFCell mobile = hssfRow.getCell(13);
             	if (mobile == null) {
                     continue;
                 }
             	terminalEntity.setMobile(getValue(mobile));
             	terminalEntity.setStatus("1");
             	//拜访顺序
             	HSSFCell sequence = hssfRow.getCell(14);
             	if (sequence == null) {
                     continue;
                 }
             	terminalEntity.setSequence(getValue(sequence));
             	//拜访周期
             	HSSFCell cycle = hssfRow.getCell(15);
             	if (cycle == null) {
                     continue;
                 }
             	terminalEntity.setCycle(getValue(cycle));
             	terminalEntity.setComid("DBT20150911");
             	
            	//区划
            	HSSFCell areaType = hssfRow.getCell(16);
            	if (areaType == null) {
                    continue;
                }
            	terminalEntity.setAreatype(getValueareaType(areaType));
            	
             	
             	/**
             	 * 开始调用sibel webservice
             	 */
             	 SiebelClient client=new SiebelClient();
             	 NewEndForCMSInput endInput =new NewEndForCMSInput();
             	 
             	 
             	//地址
             	endInput.setADDRESS(terminalEntity.getAddress());
                //区域类型 
             	/**
             	 * 区域类型必须转为sibel可识别的 如：City
             	 * 85C3678B44FA42B794F8BABD2846E6D1  城区  City
             	 * 4C37979BC4424890BEA016EE7DED02CE 乡镇 Town
             	 * 5FA07909011F447AB3C142C52CD54DD4  村级  Village
             	 */
             	//区域类型
                endInput.setAREA(terminalEntity.getAreatype());
                //城市
                endInput.setCITYID(terminalEntity.getCity());//需转成SIEBEL可识别
                //联系人
                endInput.setCONTACT(terminalEntity.getContact());
                //区县
                endInput.setCOUNTRYID(terminalEntity.getCounty());
                //拜访周期
                endInput.setCYCLE(terminalEntity.getCycle());
                endInput.setHVOLUME("");
                endInput.setLVOLUME("");
                //线路key
                endInput.setLINEID(terminalEntity.getRoutekey());
                endInput.setMVOLUME("");
                //联系电话
                endInput.setMOBILEPHONE(terminalEntity.getMobile());
                //终端名称
                endInput.setNAME(terminalEntity.getTerminalname());
                //省份
                endInput.setPROVID(terminalEntity.getProvince());
                // 拜访顺序
                endInput.setSEQUENCE(terminalEntity.getSequence());
               //状态
                //if(!"1".equalsIgnoreCase(terminalEntity.getStatus())){
                	 endInput.setSTATUS("Active");//需转成SIEBEL可识别
               // }else{
                	// endInput.setSTATUS("Inactive");//需转成SIEBEL可识别
               // }
                
               
                //判断渠道是否正常
//                String reo = OracleJdbc.checkChannel(terminalEntity.getSellchannel(),terminalEntity.getMainchannel(),terminalEntity.getMinorchannel());
//                if(reo.equals("0")){
//                	StringBuilder sb1 = new StringBuilder();
//                	Integer line = 0 ;
//             		line = rowNum+1;
//             		sb1.append(newdate+":Excel文件第"+line+"行的【"+terminalEntity.getTerminalname()+"】终端的【渠道信息】出错，并终止。");
//             		WriteLogs.write(qdLogFilePath,sb1.toString());
//             		continue;
//                	
//                }
                //销售渠道
                endInput.setSELLCHANNELS(CommonDic.getEngChannel(terminalEntity.getSellchannel()));//需转成SIEBEL可识别
              //主渠道
                endInput.setMAINCHANNELS(CommonDic.getEngChannel(terminalEntity.getMainchannel()));//需转成SIEBEL可识别
              //次渠道
                endInput.setMINORCHANNELS(CommonDic.getEngChannel(terminalEntity.getMinorchannel()));//需转成SIEBEL可识别
                //等级
                endInput.setTERMTYPE(CommonDic.getLevel2(terminalEntity.getTlevel()));//需转成SIEBEL可识别
                NewEndForCMSOutput endOutput = client.newEndForCMS(endInput);
                if("SUCCESS".equalsIgnoreCase(endOutput.getACTIONFLAG())||"SEUCCESS".equalsIgnoreCase(endOutput.getACTIONFLAG())){
                	terminalEntity.setTerminalkey(endOutput.getSIEBELID());
                	terminalEntity.setTerminalcode(endOutput.getENDCODE());
                	
                	//向excel插入一列
                	insertCol(workbook,sheet,fileToBeRead,rowNum,lastColNum,endOutput.getENDCODE());
                	//siebel保存成功后，cms2.3进行数据库数据添加
                	if(true){
                		StringBuilder sb2 = new StringBuilder();
                		Integer line = 0 ;
                 		line = rowNum+1;
                 		sb2.append(newdate+":CMS数据库出错但Siebel保存成功，Excel文件第"+line+"行的【"+terminalEntity.getTerminalname()+"】终端出错，并终止。");
                 		WriteLogs.write(cmsLogFilePath,sb2.toString());
                 		
                 		continue;
                	}
                  }else{
                	StringBuilder sb3 = new StringBuilder();
                	Integer line = 0 ;
             		line = rowNum+1;
               		sb3.append(newdate+":调用siebel出错！Excel文件第"+line+"行的【"+terminalEntity.getTerminalname()+"】终端出错，并终止。"+ "\r\n");
               		sb3.append("出错信息为："+endOutput.getMESSAGE());
               		System.out.println("出错信息为："+endOutput.getMESSAGE());
               		WriteLogs.write(siebelLogFilePath,sb3.toString());
               		continue;
                  }
                StringBuilder sb4 = new StringBuilder();
            	Integer line = 0 ;
         		line = rowNum+1;
         		sb4.append(newdate+":成功导入Excel文件第"+line+"行的【"+terminalEntity.getTerminalname()+"】");
         		WriteLogs.write(LogFilePath,sb4.toString());
                System.out.println(newdate+":成功导入Excel文件第"+line+"行的【"+terminalEntity.getTerminalname()+"】");
                
            }
        } catch(Exception e) {
            System.out.println("excel文件出错， " + e);
        }
    }
  
    /**
     * 得到Excel表中的值
     * 
     * @param hssfCell
     *            Excel中的每一个格子
     * @return Excel中每一个格子中的值
     */
    @SuppressWarnings("static-access")
    private static String getValue(HSSFCell hssfCell) {
        if (hssfCell.getCellType() == hssfCell.CELL_TYPE_BOOLEAN) {
            // 返回布尔类型的值
            return String.valueOf(hssfCell.getBooleanCellValue());
        } else if (hssfCell.getCellType() == hssfCell.CELL_TYPE_NUMERIC) {
            // 返回数值类型的值
        	DecimalFormat df = new DecimalFormat("#");
            return df.format(hssfCell.getNumericCellValue());
        	//return String.valueOf(hssfCell.getRichStringCellValue().getString());
        } else {
            // 返回字符串类型的值
            return String.valueOf(hssfCell.getStringCellValue().trim());
        }
    }
    
    /**
     * 得到Excel表中的值
     * 
     * @param hssfCell
     *            Excel中的每一个格子
     * @return Excel中每一个格子中的值
     */
    @SuppressWarnings("static-access")
    private static String getValueareaType(HSSFCell hssfCell) {
    	String areaType =  String.valueOf(hssfCell.getStringCellValue().trim());
    	if(areaType.equals("城区")){
    		areaType = "City";
    	}else if(areaType.equals("村级")){
    		areaType = "Village";
    	}else if(areaType.equals("乡镇")){
    		areaType = "Town";
    	}else if(areaType.equals("大店部")){
    		areaType = "Stores";
    	}
      
            // 返回字符串类型的值
           return areaType;
        
    }
    /**
     * 向EXCEL文件最后一列后面再插入一列
     * 
     * @param workbook，sheet，fileToBeRead，rowIndex，lastColNum，terminalcode
     *   @return Excel文件
     */
    public static void insertCol(HSSFWorkbook workbook,HSSFSheet sheet,String fileToBeRead,int rowNum,int lastColNum,String terminalcode ) {
    	//获得excel的行号
  	    HSSFRow row = sheet.getRow(rowNum);
  	    
  	    //excel插入列
  	    HSSFCell Cell = row.createCell(lastColNum+1);
        Cell.setCellValue(terminalcode);
        
        //写入excel
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream(new File(fileToBeRead));
            workbook.write(fos);
            fos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
}
