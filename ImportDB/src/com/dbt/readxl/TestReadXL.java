package com.dbt.readxl;
import java.io.FileInputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import com.dbt.entity.TerminalEntity;
import com.dbt.jdbc.OracleJdbc;

/***
 * 执行main方法判断excel中是否路线编码是否在cms数据库中
 * @author lenovo
 *
 */
public class  TestReadXL{
    /** Excel文件的存放位置*/
    public static String fileToBeRead = "F:/Data/term22.xls";
    /** 行数 */
    private static Integer totalCellNum = 19;
    
    public static void main(String argv[]) {
        try { 
        	// 创建对Excel工作簿文件的引用
            HSSFWorkbook workbook = new HSSFWorkbook(new FileInputStream(fileToBeRead));
            // 获取sheet1
            HSSFSheet sheet = workbook.getSheet("Sheet1");
            // 循环行
            Date date = new Date();  
			SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			String newdate = formatter.format(date);
            for (int rowNum = 0; rowNum <= sheet.getLastRowNum(); rowNum++) {
                HSSFRow hssfRow = sheet.getRow(rowNum);
                if (hssfRow == null) {
                    continue;
                }
                TerminalEntity terminalEntity = new TerminalEntity();
            	//终端名称
                HSSFCell tname = hssfRow.getCell(0);
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
             	HSSFCell routecode = hssfRow.getCell(2);
             	if (routecode == null) {
                     continue;
                 }
             	String _routecode = getValue(routecode);
             	String routeKey = OracleJdbc.selectRouteKey(_routecode);
             	if("".equals(routeKey)){
             		rowNum = rowNum+1;
                 	System.out.println("----------------------------------------");
             		System.out.println(newdate+":Excel文件第"+rowNum+"行的【"+terminalEntity.getTerminalname()+"】终端的【没有找到此线路】，并终止。");
             		System.out.println("----------------------------------------");
                 	//break;
             	}else{
             		System.out.println("成功。");
             	}
             	
            	
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
        	Integer s = (int)hssfCell.getNumericCellValue();
            return s.toString();
        	//return String.valueOf(hssfCell.getRichStringCellValue().getString());
        } else {
            // 返回字符串类型的值
            return String.valueOf(hssfCell.getStringCellValue().trim());
        }
    }
    
    
}
