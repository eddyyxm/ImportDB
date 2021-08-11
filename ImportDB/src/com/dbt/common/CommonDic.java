package com.dbt.common;

import java.util.HashMap;
import java.util.Map;

public class CommonDic {
	    public static Map<String,String> map = new HashMap<String,String>();
	    public static Map<String,String> engmap = new HashMap<String,String>();
	    public static Map<String,String> maplevel = new HashMap<String,String>();
	    public static Map<String,String> maplevel2 = new HashMap<String,String>();
	    public static Map<String,String> mapArea = new HashMap<String,String>();
	    public static Map<String,String> mapArea1 = new HashMap<String,String>();
	    public static Map<String,String> mapArea2 = new HashMap<String,String>();
	    public static Map<String,String> mapRoute = new HashMap<String,String>();
	    public CommonDic(){
	    }
	    /**
	    * 通过中文获取key
	    * @param value
	    * @return
	    */
	    public static String getChannel(String value){
	    	String val = "";
	    	if(map.isEmpty()){
	    		//销售渠道
	    		map.put("OP-餐饮渠道1","39DD41A399368C68E05010ACE0016FCD");
	    		map.put("SC-特殊渠道1","39DD41A399378C68E05010ACE0016FCD");
	    		map.put("KA-现代零售渠道1","39DD41A399388C68E05010ACE0016FCD");
	    		map.put("S-传统零售渠道1","39DD41A399398C68E05010ACE0016FCD");
	    		map.put("NL-夜场渠道1","39DD41A3993A8C68E05010ACE0016FCD");
	    		
	    		//主渠道
	    		map.put("KA-现代零售渠道","39DD41A399318C68E05010ACE0016FCD");
	    		map.put("NL-夜场渠道","39DD41A399328C68E05010ACE0016FCD");
	    		map.put("S-传统零售渠道","39DD41A399338C68E05010ACE0016FCD");
	    		map.put("OP-餐饮渠道","39DD41A399348C68E05010ACE0016FCD");
	    		map.put("SC-特殊渠道","39DD41A399358C68E05010ACE0016FCD");
	    		
	    		//次渠道
	    		map.put("S3-综合食杂店","39DD41A3991D8C68E05010ACE0016FCD");
	    		map.put("S2-类便利店","39DD41A3991E8C68E05010ACE0016FCD");
	    		map.put("SC1-外向型","39DD41A399208C68E05010ACE0016FCD");
	    		map.put("NKA-仓储式卖场/大卖场","39DD41A399228C68E05010ACE0016FCD");
	    		map.put("LKA-大型超市/中小型超市","39DD41A399238C68E05010ACE0016FCD");
	    		map.put("CVS-便利店","39DD41A399248C68E05010ACE0016FCD");
	    		map.put("YS-户外餐饮","39DD41A399258C68E05010ACE0016FCD");
	    		map.put("D-速食餐馆","39DD41A399268C68E05010ACE0016FCD");
	    		map.put("C4-无纸箱C类终端","39DD41A399278C68E05010ACE0016FCD");
	    		map.put("C3-一般C类终端","39DD41A399288C68E05010ACE0016FCD");
	    		map.put("C2-优质C类终端","39DD41A399298C68E05010ACE0016FCD");
	    		map.put("C1-核心C类终端","39DD41A3992A8C68E05010ACE0016FCD");
	    		map.put("C-小型餐馆","39DD41A3992B8C68E05010ACE0016FCD");
	    		map.put("B-中型餐馆","39DD41A3992C8C68E05010ACE0016FCD");
	    		map.put("A-大型餐馆","39DD41A3992D8C68E05010ACE0016FCD");
	    		map.put("NC-夜总会及会所/商务KTV/歌厅","39DD41A3992E8C68E05010ACE0016FCD");
	    		map.put("MOT-演艺吧/慢摇吧/迪厅/静吧/西式餐吧","39DD41A3992F8C68E05010ACE0016FCD");
	    		map.put("KTV-连锁量贩式KTV/独立量贩式KTV","39DD41A399308C68E05010ACE0016FCD");
	    		map.put("SC2-专向型","4CCEA64B239F6F05E05010ACE0010B86");
	    		map.put("S1-名烟名酒店","39DD41A3991D8C68E05010ACE0016FCM");
	    		
	    	}
	    	for(Map.Entry<String, String> entry: map.entrySet()) {
	    		 if(entry.getKey().equals(value)){
	    			 val = entry.getValue();
	    			 break;
	    		 }
	    		}
	    	return val;
	    }
	    
    public static String getEngChannel(String value){
    	String val = "";
    	if(engmap.isEmpty()){
    		engmap.put("39DD41A3991D8C68E05010ACE0016FCD","Sales2");
    		engmap.put("39DD41A3991E8C68E05010ACE0016FCD","Sales1");
    		engmap.put("39DD41A3991F8C68E05010ACE0016FCD","SP2");
    		engmap.put("39DD41A399208C68E05010ACE0016FCD","SP1");
    		engmap.put("39DD41A399218C68E05010ACE0016FCD","KA RKA");
    		engmap.put("39DD41A399228C68E05010ACE0016FCD","KA NKA");
    		engmap.put("39DD41A399238C68E05010ACE0016FCD","KA LKA");
    		engmap.put("39DD41A399248C68E05010ACE0016FCD","KA CSV");
    		engmap.put("39DD41A399258C68E05010ACE0016FCD","Food YS");
    		engmap.put("39DD41A399268C68E05010ACE0016FCD","Food D");
    		engmap.put("39DD41A399278C68E05010ACE0016FCD","Food C4");
    		engmap.put("39DD41A399288C68E05010ACE0016FCD","Food C3");
    		engmap.put("39DD41A399298C68E05010ACE0016FCD","Food C2");
    		engmap.put("39DD41A3992A8C68E05010ACE0016FCD","Food C1");
    		engmap.put("39DD41A3992B8C68E05010ACE0016FCD","Food C");
    		engmap.put("39DD41A3992C8C68E05010ACE0016FCD","Food B");
    		engmap.put("39DD41A3992D8C68E05010ACE0016FCD","Food A");
    		engmap.put("39DD41A3992E8C68E05010ACE0016FCD","Club NC");
    		engmap.put("39DD41A3992F8C68E05010ACE0016FCD","Club MOT");
    		engmap.put("39DD41A399308C68E05010ACE0016FCD","Club KTV");
    		engmap.put("39DD41A399318C68E05010ACE0016FCD","KA Only");
    		engmap.put("39DD41A399328C68E05010ACE0016FCD","Club Only");
    		engmap.put("39DD41A399338C68E05010ACE0016FCD","Sales Only");
    		engmap.put("39DD41A399348C68E05010ACE0016FCD","Food Only");
    		engmap.put("39DD41A399358C68E05010ACE0016FCD","SP Only");
    		engmap.put("39DD41A399368C68E05010ACE0016FCD","Food");
    		engmap.put("39DD41A399378C68E05010ACE0016FCD","Special");
    		engmap.put("39DD41A399388C68E05010ACE0016FCD","KA");
    		engmap.put("39DD41A399398C68E05010ACE0016FCD","Sales");
    		engmap.put("39DD41A3993A8C68E05010ACE0016FCD","Club");
    		engmap.put("89F32F77BDAD414E849966B95E5D3055","Suspended");
    		engmap.put("39DD41A3991D8C68E05010ACE0016FCM","Sales3");
    	}
    	for(Map.Entry<String, String> entry: engmap.entrySet()) {
    		 if(entry.getKey().equals(value)){
    			 val = entry.getValue();
    			 break;
    		 }
    		}
    	return val;
    }
    
    public static String getLevel(String excel_level){
    	String val = "";
    	if(maplevel.isEmpty()){
    		maplevel.put("A", "81B1A7272795498FBBE8EBDFB065F9FE");
	    	maplevel.put("B", "20E51C0398E34AC8A09375470B5D9DFE");
	    	maplevel.put("C", "3B86CC33732C454291509E1745FF315E");
	    	maplevel.put("D", "4D49F29894CA4C71B4DA56629CEED17F");
    	}
    	for(Map.Entry<String, String> entry: maplevel.entrySet()) {
    		 if(entry.getKey().equals(excel_level)){
    			 val = entry.getValue();
    			 break;
    		 }
    		}
    	return val;
    }
    
    public static String getLevel2(String excel_level){
    	String val = "";
    	if(maplevel2.isEmpty()){
    		maplevel2.put("81B1A7272795498FBBE8EBDFB065F9FE","A");
	    	maplevel2.put("20E51C0398E34AC8A09375470B5D9DFE","B");
	    	maplevel2.put("3B86CC33732C454291509E1745FF315E","C");
	    	maplevel2.put("4D49F29894CA4C71B4DA56629CEED17F","D");
    	}
    	for(Map.Entry<String, String> entry: maplevel2.entrySet()) {
    		 if(entry.getKey().equals(excel_level)){
    			 val = entry.getValue();
    			 break;
    		 }
    		}
    	return val;
    }
    public static String getKeyByCode(String routecode){
    	String val = "";
    	if(mapRoute.isEmpty()){
    		mapRoute.put("1-1292983069","1-LDT44D");
    		mapRoute.put("1-1292983070","1-LDT44E");
    		mapRoute.put("1-1292983071","1-LDT44F");
    		mapRoute.put("1-1292983072","1-LDT44G");
    		mapRoute.put("1-1292983073","1-LDT44H");
    		mapRoute.put("1-1292983074","1-LDT44I");
    		mapRoute.put("1-1292983075","1-LDT44J");
    		mapRoute.put("1-1292983076","1-LDT44K");
    		mapRoute.put("1-1292983077","1-LDT44L");
    		mapRoute.put("1-1292983750","1-LDT4NA");
    		mapRoute.put("1-1292983751","1-LDT4NB");
    		mapRoute.put("1-1292983752","1-LDT4NC");
    		mapRoute.put("1-1292983753","1-LDT4ND");
    		mapRoute.put("1-1292983754","1-LDT4NE");
    		mapRoute.put("1-1292983755","1-LDT4NF");
    		mapRoute.put("1-1292983756","1-LDT4NG");
    		mapRoute.put("1-1292983757","1-LDT4NH");
    		mapRoute.put("1-1292983759","1-LDT4NJ");
    		mapRoute.put("1-1292983760","1-LDT4NK");
    		mapRoute.put("1-1292983761","1-LDT4NL");
    		mapRoute.put("1-1292983809","1-LDT4OX");
    		mapRoute.put("1-1292983810","1-LDT4OY");
    		mapRoute.put("1-1292983812","1-LDT4P0");
    		mapRoute.put("1-1292983813","1-LDT4P1");
    		mapRoute.put("1-1292982648","1-LDT3SO");
    		mapRoute.put("1-1292982719","1-LDT3UN");
    		mapRoute.put("1-1292983444","1-LDT4ES");
    		mapRoute.put("1-1292983609","1-LDT4JD");
    		mapRoute.put("1-1292983247","1-LDT49B");
    		mapRoute.put("1-1292983252","1-LDT49G");
    		mapRoute.put("1-1292983259","1-LDT49N");
    		mapRoute.put("1-1292983728","1-LDT4MO");
    		mapRoute.put("1-1292983137","1-LDT469");
    		mapRoute.put("1-1292983147","1-LDT46J");
    		mapRoute.put("1-1292983733","1-LDT4MT");
    		mapRoute.put("1-1292983189","1-LDT47P");
    		mapRoute.put("1-1292983194","1-LDT47U");
    		mapRoute.put("1-1292983199","1-LDT47Z");
    		mapRoute.put("1-1292983206","1-LDT486");
    		mapRoute.put("1-1292983211","1-LDT48B");
    		mapRoute.put("1-1292982653","1-LDT3ST");
    		mapRoute.put("1-1292982658","1-LDT3SY");
    		mapRoute.put("1-1292982663","1-LDT3T3");
    		mapRoute.put("1-1292982675","1-LDT3TF");
    		mapRoute.put("1-1292982681","1-LDT3TL");
    		mapRoute.put("1-1292983716","1-LDT4MC");
    		mapRoute.put("1-1292983737","1-LDT4MX");
    		mapRoute.put("1-1292983738","1-LDT4MY");
    		mapRoute.put("1-1292983739","1-LDT4MZ");
    		mapRoute.put("1-1292983740","1-LDT4N0");
    		mapRoute.put("1-1292983741","1-LDT4N1");
    		mapRoute.put("1-1292983742","1-LDT4N2");
    		mapRoute.put("1-1292983743","1-LDT4N3");
    		mapRoute.put("1-1292983744","1-LDT4N4");
    		mapRoute.put("1-1292983745","1-LDT4N5");
    		mapRoute.put("1-1292983748","1-LDT4N8");
    		mapRoute.put("1-1292983749","1-LDT4N9");
    		mapRoute.put("1-1292982608","1-LDT3RK");
    		mapRoute.put("1-1292982609","1-LDT3RL");
    		mapRoute.put("1-1292982610","1-LDT3RM");
    		mapRoute.put("1-1292982611","1-LDT3RN");
    		mapRoute.put("1-1292982612","1-LDT3RO");
    		mapRoute.put("1-1292982613","1-LDT3RP");
    		mapRoute.put("1-1292983098","1-LDT456");
    		mapRoute.put("1-1292983099","1-LDT457");
    		mapRoute.put("1-1292983100","1-LDT458");
    		mapRoute.put("1-1292983101","1-LDT459");
    		mapRoute.put("1-1292983102","1-LDT45A");
    		mapRoute.put("1-1292983103","1-LDT45B");
    		mapRoute.put("1-1292983104","1-LDT45C");
    		mapRoute.put("1-1292983105","1-LDT45D");
    		mapRoute.put("1-1292983520","1-LDT4GW");
    		mapRoute.put("1-1292983521","1-LDT4GX");
    		mapRoute.put("1-1292983522","1-LDT4GY");
    		mapRoute.put("1-1292983523","1-LDT4GZ");
    		mapRoute.put("1-1292983524","1-LDT4H0");
    		mapRoute.put("1-1292983525","1-LDT4H1");
    		mapRoute.put("1-1292983526","1-LDT4H2");
    		mapRoute.put("1-1292983527","1-LDT4H3");
    		mapRoute.put("1-1292982645","1-LDT3SL");
    		mapRoute.put("1-1292982646","1-LDT3SM");
    		mapRoute.put("1-1292982647","1-LDT3SN");
    		mapRoute.put("1-1292982649","1-LDT3SP");
    		mapRoute.put("1-1292982650","1-LDT3SQ");
    		mapRoute.put("1-1292982651","1-LDT3SR");
    		mapRoute.put("1-1292982652","1-LDT3SS");
    		mapRoute.put("1-1292982654","1-LDT3SU");
    		mapRoute.put("1-1292982655","1-LDT3SV");
    		mapRoute.put("1-1292982656","1-LDT3SW");
    		mapRoute.put("1-1292982657","1-LDT3SX");
    		mapRoute.put("1-1292982659","1-LDT3SZ");
    		mapRoute.put("1-1292982660","1-LDT3T0");
    		mapRoute.put("1-1292982661","1-LDT3T1");
    		mapRoute.put("1-1292982662","1-LDT3T2");
    		mapRoute.put("1-1292982664","1-LDT3T4");
    		mapRoute.put("1-1292982665","1-LDT3T5");
    		mapRoute.put("1-1292982666","1-LDT3T6");
    		mapRoute.put("1-1292982667","1-LDT3T7");
    		mapRoute.put("1-1292983150","1-LDT46M");
    		mapRoute.put("1-1292983152","1-LDT46O");
    		mapRoute.put("1-1292983153","1-LDT46P");
    		mapRoute.put("1-1292983154","1-LDT46Q");
    		mapRoute.put("1-1292983156","1-LDT46S");
    		mapRoute.put("1-1292983157","1-LDT46T");
    		mapRoute.put("1-1292983158","1-LDT46U");
    		mapRoute.put("1-1292983161","1-LDT46X");
    		mapRoute.put("1-1292983162","1-LDT46Y");
    		mapRoute.put("1-1292983163","1-LDT46Z");
    		mapRoute.put("1-1292983164","1-LDT470");
    		mapRoute.put("1-1292983165","1-LDT471");
    		mapRoute.put("1-1292983608","1-LDT4JC");
    		mapRoute.put("1-1292983226","1-LDT48Q");
    		mapRoute.put("1-1292983227","1-LDT48R");
    		mapRoute.put("1-1292983228","1-LDT48S");
    		mapRoute.put("1-1292983229","1-LDT48T");
    		mapRoute.put("1-1292983230","1-LDT48U");
    		mapRoute.put("1-1292983231","1-LDT48V");
    		mapRoute.put("1-1292983232","1-LDT48W");
    		mapRoute.put("1-1292983233","1-LDT48X");
    		mapRoute.put("1-1292983234","1-LDT48Y");
    		mapRoute.put("1-1292983235","1-LDT48Z");
    		mapRoute.put("1-1292983237","1-LDT491");
    		mapRoute.put("1-1292983238","1-LDT492");
    		mapRoute.put("1-1292983239","1-LDT493");
    		mapRoute.put("1-1292983240","1-LDT494");
    		mapRoute.put("1-1292983242","1-LDT496");
    		mapRoute.put("1-1292983243","1-LDT497");
    		mapRoute.put("1-1292983244","1-LDT498");
    		mapRoute.put("1-1292983245","1-LDT499");
    		mapRoute.put("1-1292983246","1-LDT49A");
    		mapRoute.put("1-1292983248","1-LDT49C");
    		mapRoute.put("1-1292983249","1-LDT49D");
    		mapRoute.put("1-1292983250","1-LDT49E");
    		mapRoute.put("1-1292983251","1-LDT49F");
    		mapRoute.put("1-1292983253","1-LDT49H");
    		mapRoute.put("1-1292982722","1-LDT3UQ");
    		mapRoute.put("1-1292982723","1-LDT3UR");
    		mapRoute.put("1-1292982724","1-LDT3US");
    		mapRoute.put("1-1292982725","1-LDT3UT");
    		mapRoute.put("1-1292982726","1-LDT3UU");
    		mapRoute.put("1-1292982727","1-LDT3UV");
    		mapRoute.put("1-1292982728","1-LDT3UW");
    		mapRoute.put("1-1292982729","1-LDT3UX");
    		mapRoute.put("1-1292982730","1-LDT3UY");
    		mapRoute.put("1-1292982731","1-LDT3UZ");
    		mapRoute.put("1-1292982732","1-LDT3V0");
    		mapRoute.put("1-1292982733","1-LDT3V1");
    		mapRoute.put("1-1292982734","1-LDT3V2");
    		mapRoute.put("1-1292982735","1-LDT3V3");
    		mapRoute.put("1-1292982736","1-LDT3V4");
    		mapRoute.put("1-1292982737","1-LDT3V5");
    		mapRoute.put("1-1292982738","1-LDT3V6");
    		mapRoute.put("1-1292982739","1-LDT3V7");
    		mapRoute.put("1-1292983255","1-LDT49J");
    		mapRoute.put("1-1292983256","1-LDT49K");
    		mapRoute.put("1-1292983257","1-LDT49L");
    		mapRoute.put("1-1292983258","1-LDT49M");
    		mapRoute.put("1-1292983447","1-LDT4EV");
    		mapRoute.put("1-1292983448","1-LDT4EW");
    		mapRoute.put("1-1292983449","1-LDT4EX");
    		mapRoute.put("1-1292983450","1-LDT4EY");
    		mapRoute.put("1-1292983451","1-LDT4EZ");
    		mapRoute.put("1-1292983452","1-LDT4F0");
    		mapRoute.put("1-1292983453","1-LDT4F1");
    		mapRoute.put("1-1292983454","1-LDT4F2");
    		mapRoute.put("1-1292983455","1-LDT4F3");
    		mapRoute.put("1-1292983456","1-LDT4F4");
    		mapRoute.put("1-1292983457","1-LDT4F5");
    		mapRoute.put("1-1292983458","1-LDT4F6");
    		mapRoute.put("1-1292983459","1-LDT4F7");
    		mapRoute.put("1-1292983442","1-LDT4EQ");
    		mapRoute.put("1-1292983443","1-LDT4ER");
    		mapRoute.put("1-1292983445","1-LDT4ET");
    		mapRoute.put("1-1292983446","1-LDT4EU");
    		mapRoute.put("1-1292983539","1-LDT4HF");
    		mapRoute.put("1-1292983540","1-LDT4HG");
    		mapRoute.put("1-1292983541","1-LDT4HH");
    		mapRoute.put("1-1292983542","1-LDT4HI");
    		mapRoute.put("1-1292983692","1-LDT4LO");
    		mapRoute.put("1-1292983693","1-LDT4LP");
    		mapRoute.put("1-1292983694","1-LDT4LQ");
    		mapRoute.put("1-1292983695","1-LDT4LR");
    		mapRoute.put("1-1292983696","1-LDT4LS");
    		mapRoute.put("1-1292983701","1-LDT4LX");
    		mapRoute.put("1-1292983702","1-LDT4LY");
    		mapRoute.put("1-1292983703","1-LDT4LZ");
    		mapRoute.put("1-1292983704","1-LDT4M0");
    		mapRoute.put("1-1292983707","1-LDT4M3");
    		mapRoute.put("1-1292983708","1-LDT4M4");
    		mapRoute.put("1-1292983709","1-LDT4M5");
    		mapRoute.put("1-1292983710","1-LDT4M6");
    		mapRoute.put("1-1292983713","1-LDT4M9");
    		mapRoute.put("1-1292983714","1-LDT4MA");
    		mapRoute.put("1-1292983715","1-LDT4MB");
    		mapRoute.put("1-1292983717","1-LDT4MD");
    		mapRoute.put("1-1292983718","1-LDT4ME");
    		mapRoute.put("1-1292983719","1-LDT4MF");
    		mapRoute.put("1-1292983720","1-LDT4MG");
    		mapRoute.put("1-1292983721","1-LDT4MH");
    		mapRoute.put("1-1292983722","1-LDT4MI");
    		mapRoute.put("1-1292983723","1-LDT4MJ");
    		mapRoute.put("1-1292983724","1-LDT4MK");
    		mapRoute.put("1-1292983725","1-LDT4ML");
    		mapRoute.put("1-1292983726","1-LDT4MM");
    		mapRoute.put("1-1292983727","1-LDT4MN");
    		mapRoute.put("1-1292983729","1-LDT4MP");
    		mapRoute.put("1-1292983730","1-LDT4MQ");
    		mapRoute.put("1-1292983731","1-LDT4MR");
    		mapRoute.put("1-1292983732","1-LDT4MS");
    		mapRoute.put("1-1292983734","1-LDT4MU");
    		mapRoute.put("1-1292983735","1-LDT4MV");
    		mapRoute.put("1-1292983736","1-LDT4MW");
    		mapRoute.put("1-1292983106","1-LDT45E");
    		mapRoute.put("1-1292983107","1-LDT45F");
    		mapRoute.put("1-1292983108","1-LDT45G");
    		mapRoute.put("1-1292983109","1-LDT45H");
    		mapRoute.put("1-1292983110","1-LDT45I");
    		mapRoute.put("1-1292983111","1-LDT45J");
    		mapRoute.put("1-1292983112","1-LDT45K");
    		mapRoute.put("1-1292983113","1-LDT45L");
    		mapRoute.put("1-1292983114","1-LDT45M");
    		mapRoute.put("1-1292983115","1-LDT45N");
    		mapRoute.put("1-1292983116","1-LDT45O");
    		mapRoute.put("1-1292983117","1-LDT45P");
    		mapRoute.put("1-1292983118","1-LDT45Q");
    		mapRoute.put("1-1292983119","1-LDT45R");
    		mapRoute.put("1-1292983120","1-LDT45S");
    		mapRoute.put("1-1292983122","1-LDT45U");
    		mapRoute.put("1-1292983123","1-LDT45V");
    		mapRoute.put("1-1292983124","1-LDT45W");
    		mapRoute.put("1-1292983125","1-LDT45X");
    		mapRoute.put("1-1292983126","1-LDT45Y");
    		mapRoute.put("1-1292983127","1-LDT45Z");
    		mapRoute.put("1-1292983128","1-LDT460");
    		mapRoute.put("1-1292983129","1-LDT461");
    		mapRoute.put("1-1292983130","1-LDT462");
    		mapRoute.put("1-1292983131","1-LDT463");
    		mapRoute.put("1-1292983132","1-LDT464");
    		mapRoute.put("1-1292983133","1-LDT465");
    		mapRoute.put("1-1292983134","1-LDT466");
    		mapRoute.put("1-1292983135","1-LDT467");
    		mapRoute.put("1-1292983136","1-LDT468");
    		mapRoute.put("1-1292983139","1-LDT46B");
    		mapRoute.put("1-1292983140","1-LDT46C");
    		mapRoute.put("1-1292983141","1-LDT46D");
    		mapRoute.put("1-1292983143","1-LDT46F");
    		mapRoute.put("1-1292983144","1-LDT46G");
    		mapRoute.put("1-1292983145","1-LDT46H");
    		mapRoute.put("1-1292983146","1-LDT46I");
    		mapRoute.put("1-1292983148","1-LDT46K");
    		mapRoute.put("1-1292983149","1-LDT46L");
    		mapRoute.put("1-1292982614","1-LDT3RQ");
    		mapRoute.put("1-1292982615","1-LDT3RR");
    		mapRoute.put("1-1292982616","1-LDT3RS");
    		mapRoute.put("1-1292982617","1-LDT3RT");
    		mapRoute.put("1-1292982618","1-LDT3RU");
    		mapRoute.put("1-1292982619","1-LDT3RV");
    		mapRoute.put("1-1292982620","1-LDT3RW");
    		mapRoute.put("1-1292982630","1-LDT3S6");
    		mapRoute.put("1-1292982631","1-LDT3S7");
    		mapRoute.put("1-1292982632","1-LDT3S8");
    		mapRoute.put("1-1292982633","1-LDT3S9");
    		mapRoute.put("1-1292982634","1-LDT3SA");
    		mapRoute.put("1-1292982635","1-LDT3SB");
    		mapRoute.put("1-1292982641","1-LDT3SH");
    		mapRoute.put("1-1292982642","1-LDT3SI");
    		mapRoute.put("1-1292982643","1-LDT3SJ");
    		mapRoute.put("1-1292982644","1-LDT3SK");
    		mapRoute.put("1-1292983078","1-LDT44M");
    		mapRoute.put("1-1292983079","1-LDT44N");
    		mapRoute.put("1-1292983080","1-LDT44O");
    		mapRoute.put("1-1292983081","1-LDT44P");
    		mapRoute.put("1-1292983082","1-LDT44Q");
    		mapRoute.put("1-1292983083","1-LDT44R");
    		mapRoute.put("1-1292983084","1-LDT44S");
    		mapRoute.put("1-1292983085","1-LDT44T");
    		mapRoute.put("1-1292983086","1-LDT44U");
    		mapRoute.put("1-1292983087","1-LDT44V");
    		mapRoute.put("1-1292983088","1-LDT44W");
    		mapRoute.put("1-1292983089","1-LDT44X");
    		mapRoute.put("1-1292983090","1-LDT44Y");
    		mapRoute.put("1-1292983091","1-LDT44Z");
    		mapRoute.put("1-1292983092","1-LDT450");
    		mapRoute.put("1-1292983093","1-LDT451");
    		mapRoute.put("1-1292983094","1-LDT452");
    		mapRoute.put("1-1292983095","1-LDT453");
    		mapRoute.put("1-1292983096","1-LDT454");
    		mapRoute.put("1-1292983097","1-LDT455");
    		mapRoute.put("1-1292982589","1-LDT3R1");
    		mapRoute.put("1-1292982590","1-LDT3R2");
    		mapRoute.put("1-1292982591","1-LDT3R3");
    		mapRoute.put("1-1292982592","1-LDT3R4");
    		mapRoute.put("1-1292982593","1-LDT3R5");
    		mapRoute.put("1-1292982594","1-LDT3R6");
    		mapRoute.put("1-1292982595","1-LDT3R7");
    		mapRoute.put("1-1292982596","1-LDT3R8");
    		mapRoute.put("1-1292982597","1-LDT3R9");
    		mapRoute.put("1-1292982598","1-LDT3RA");
    		mapRoute.put("1-1292983172","1-LDT478");
    		mapRoute.put("1-1292983173","1-LDT479");
    		mapRoute.put("1-1292983174","1-LDT47A");
    		mapRoute.put("1-1292983175","1-LDT47B");
    		mapRoute.put("1-1292983176","1-LDT47C");
    		mapRoute.put("1-1292983177","1-LDT47D");
    		mapRoute.put("1-1292983184","1-LDT47K");
    		mapRoute.put("1-1292983185","1-LDT47L");
    		mapRoute.put("1-1292983186","1-LDT47M");
    		mapRoute.put("1-1292983187","1-LDT47N");
    		mapRoute.put("1-1292983188","1-LDT47O");
    		mapRoute.put("1-1292983190","1-LDT47Q");
    		mapRoute.put("1-1292983191","1-LDT47R");
    		mapRoute.put("1-1292983192","1-LDT47S");
    		mapRoute.put("1-1292983193","1-LDT47T");
    		mapRoute.put("1-1292983195","1-LDT47V");
    		mapRoute.put("1-1292983196","1-LDT47W");
    		mapRoute.put("1-1292983197","1-LDT47X");
    		mapRoute.put("1-1292983198","1-LDT47Y");
    		mapRoute.put("1-1292983200","1-LDT480");
    		mapRoute.put("1-1292982668","1-LDT3T8");
    		mapRoute.put("1-1292982669","1-LDT3T9");
    		mapRoute.put("1-1292982673","1-LDT3TD");
    		mapRoute.put("1-1292982674","1-LDT3TE");
    		mapRoute.put("1-1292982676","1-LDT3TG");
    		mapRoute.put("1-1292982677","1-LDT3TH");
    		mapRoute.put("1-1292982678","1-LDT3TI");
    		mapRoute.put("1-1292982679","1-LDT3TJ");
    		mapRoute.put("1-1292982680","1-LDT3TK");
    		mapRoute.put("1-1292982682","1-LDT3TM");
    		mapRoute.put("1-1292982683","1-LDT3TN");
    		mapRoute.put("1-1292982684","1-LDT3TO");
    		mapRoute.put("1-1292982685","1-LDT3TP");
    		mapRoute.put("1-1292982686","1-LDT3TQ");
    		mapRoute.put("1-1292982687","1-LDT3TR");
    		mapRoute.put("1-1292982688","1-LDT3TS");
    		mapRoute.put("1-1292982689","1-LDT3TT");
    		mapRoute.put("1-1292982690","1-LDT3TU");
    		mapRoute.put("1-1292982691","1-LDT3TV");
    		mapRoute.put("1-1292982692","1-LDT3TW");
    		mapRoute.put("1-1292982693","1-LDT3TX");
    		mapRoute.put("1-1292982694","1-LDT3TY");
    		mapRoute.put("1-1292982695","1-LDT3TZ");
    		mapRoute.put("1-1292982696","1-LDT3U0");
    		mapRoute.put("1-1292982697","1-LDT3U1");
    		mapRoute.put("1-1292982698","1-LDT3U2");
    		mapRoute.put("1-1292982699","1-LDT3U3");
    		mapRoute.put("1-1292982700","1-LDT3U4");
    		mapRoute.put("1-1292982701","1-LDT3U5");
    		mapRoute.put("1-1292982702","1-LDT3U6");
    		mapRoute.put("1-1292982703","1-LDT3U7");
    		mapRoute.put("1-1292982704","1-LDT3U8");
    		mapRoute.put("1-1292982705","1-LDT3U9");
    		mapRoute.put("1-1292982706","1-LDT3UA");
    		mapRoute.put("1-1292982707","1-LDT3UB");
    		mapRoute.put("1-1292982708","1-LDT3UC");
    		mapRoute.put("1-1292982709","1-LDT3UD");
    		mapRoute.put("1-1292982710","1-LDT3UE");
    		mapRoute.put("1-1292982711","1-LDT3UF");
    		mapRoute.put("1-1292982712","1-LDT3UG");
    		mapRoute.put("1-1292982713","1-LDT3UH");
    		mapRoute.put("1-1292982714","1-LDT3UI");
    		mapRoute.put("1-1292982715","1-LDT3UJ");
    		mapRoute.put("1-1292982716","1-LDT3UK");
    		mapRoute.put("1-1292982717","1-LDT3UL");
    		mapRoute.put("1-1292982718","1-LDT3UM");
    		mapRoute.put("1-1292982720","1-LDT3UO");
    		mapRoute.put("1-1292982721","1-LDT3UP");
    		mapRoute.put("1-1292983205","1-LDT485");
    		mapRoute.put("1-1292983207","1-LDT487");
    		mapRoute.put("1-1292983208","1-LDT488");
    		mapRoute.put("1-1292983209","1-LDT489");
    		mapRoute.put("1-1292983210","1-LDT48A");
    		mapRoute.put("1-1292983212","1-LDT48C");
    		mapRoute.put("1-1292983213","1-LDT48D");
    		mapRoute.put("1-1292983214","1-LDT48E");
    		mapRoute.put("1-1292983215","1-LDT48F");
    		mapRoute.put("1-1292983216","1-LDT48G");
    		mapRoute.put("1-1292983217","1-LDT48H");
    		mapRoute.put("1-1292983218","1-LDT48I");
    		mapRoute.put("1-1292983219","1-LDT48J");
    		mapRoute.put("1-1292983220","1-LDT48K");
    		mapRoute.put("1-1292983221","1-LDT48L");
    		mapRoute.put("1-1292983222","1-LDT48M");
    		mapRoute.put("1-1292983223","1-LDT48N");
    		mapRoute.put("1-1292983224","1-LDT48O");
    		mapRoute.put("1-1292983225","1-LDT48P");
    		mapRoute.put("1-1295030084","1-LF0ZLW");
    		mapRoute.put("1-1295030085","1-LF0ZLX");
    		mapRoute.put("1-1295030086","1-LF0ZLY");
    		mapRoute.put("1-1295030087","1-LF0ZLZ");
    		mapRoute.put("1-1295030088","1-LF0ZM0");
    		mapRoute.put("1-1295031534","1-LF10Q6");
    		mapRoute.put("1-1295031535","1-LF10Q7");
    		mapRoute.put("1-1295031536","1-LF10Q8");
    		mapRoute.put("1-1295031537","1-LF10Q9");
    		mapRoute.put("1-1295031538","1-LF10QA");
    		mapRoute.put("1-1295031539","1-LF10QB");
    		mapRoute.put("1-1295031540","1-LF10QC");
    		mapRoute.put("1-1295031541","1-LF10QD");
    		mapRoute.put("1-1295031542","1-LF10QE");
    		mapRoute.put("1-1295031543","1-LF10QF");
    		mapRoute.put("1-1295031544","1-LF10QG");
    		mapRoute.put("1-1295031545","1-LF10QH");
    		mapRoute.put("1-1295031546","1-LF10QI");
    		mapRoute.put("1-1295031547","1-LF10QJ");
    		mapRoute.put("1-1295031548","1-LF10QK");
    		mapRoute.put("1-1295031549","1-LF10QL");
    		mapRoute.put("1-1295031550","1-LF10QM");
    		mapRoute.put("1-1295031551","1-LF10QN");
    		mapRoute.put("1-1295031552","1-LF10QO");
    		mapRoute.put("1-1295031553","1-LF10QP");
    		mapRoute.put("1-1295031554","1-LF10QQ");
    		mapRoute.put("1-1295031555","1-LF10QR");
    		mapRoute.put("1-1295031556","1-LF10QS");
    		mapRoute.put("1-1525896092","1-P8H8YK");
    		mapRoute.put("1-1525896093","1-P8H8YL");
    		mapRoute.put("1-1525896094","1-P8H8YM");
    		mapRoute.put("1-1525896095","1-P8H8YN");
    		mapRoute.put("1-1525896096","1-P8H8YO");
    		mapRoute.put("1-1525896097","1-P8H8YP");
    		mapRoute.put("1-1525896098","1-P8H8YQ");
    		mapRoute.put("1-1525896099","1-P8H8YR");
    		mapRoute.put("1-1525896100","1-P8H8YS");
    		mapRoute.put("1-1525896111","1-P8H8Z3");
    		mapRoute.put("1-1525896112","1-P8H8Z4");
    		mapRoute.put("1-1525896113","1-P8H8Z5");
    		mapRoute.put("1-1525481158","1-P88CSM");
    		mapRoute.put("1-1525481159","1-P88CSN");
    		mapRoute.put("1-1525481160","1-P88CSO");
    		mapRoute.put("1-1525835891","1-P8FYIB");
    		mapRoute.put("1-1525835892","1-P8FYIC");
    		mapRoute.put("1-1525835893","1-P8FYID");
    		mapRoute.put("1-1525835894","1-P8FYIE");
    		mapRoute.put("1-1525835895","1-P8FYIF");
    		mapRoute.put("1-1525835896","1-P8FYIG");
    		mapRoute.put("1-1525835897","1-P8FYIH");
    		mapRoute.put("1-1525835898","1-P8FYII");
    		mapRoute.put("1-1525835899","1-P8FYIJ");
    		mapRoute.put("1-1525835900","1-P8FYIK");
    		mapRoute.put("1-1525896051","1-P8H8XF");
    		mapRoute.put("1-1525896052","1-P8H8XG");
    		mapRoute.put("1-1525661311","1-P8C7SV");
    		mapRoute.put("1-1525661312","1-P8C7SW");
    		mapRoute.put("1-1525661313","1-P8C7SX");
    		mapRoute.put("1-1525661314","1-P8C7SY");
    		mapRoute.put("1-1525661315","1-P8C7SZ");
    		mapRoute.put("1-1525661316","1-P8C7T0");
    		mapRoute.put("1-1525661318","1-P8C7T2");
    		mapRoute.put("1-1525485936","1-P88GHC");
    		mapRoute.put("1-1527682421","1-P9JJAT");
    		mapRoute.put("1-1527682422","1-P9JJAU");
    		mapRoute.put("1-1527682423","1-P9JJAV");
    		mapRoute.put("1-1527682424","1-P9JJAW");
    		mapRoute.put("1-1527682425","1-P9JJAX");
    		mapRoute.put("1-1527682426","1-P9JJAY");
    		mapRoute.put("1-1527682427","1-P9JJAZ");
    		mapRoute.put("1-1527682428","1-P9JJB0");
    		mapRoute.put("1-1527682429","1-P9JJB1");
    		mapRoute.put("1-1527682430","1-P9JJB2");
    		mapRoute.put("1-1529248498","1-PAH3OY");
    		mapRoute.put("1-1529248499","1-PAH3OZ");
    		mapRoute.put("1-1529248500","1-PAH3P0");
    		mapRoute.put("1-1529248606","1-PAH3RY");
    		mapRoute.put("1-1529248608","1-PAH3S0");
    		mapRoute.put("1-1529248609","1-PAH3S1");
    		mapRoute.put("1-1529248610","1-PAH3S2");
    		mapRoute.put("1-1529248671","1-PAH3TR");
    		mapRoute.put("1-1529248672","1-PAH3TS");
    		mapRoute.put("1-1529248673","1-PAH3TT");
    		mapRoute.put("1-1529248674","1-PAH3TU");
    		mapRoute.put("1-1529248675","1-PAH3TV");
    		mapRoute.put("1-1529248676","1-PAH3TW");
    		mapRoute.put("1-1529248677","1-PAH3TX");
    		mapRoute.put("1-1529248678","1-PAH3TY");
    		mapRoute.put("1-1530923471","1-PBH03Z");
    		mapRoute.put("1-1530923472","1-PBH040");
    		mapRoute.put("1-1530923473","1-PBH041");
    		mapRoute.put("1-1530923474","1-PBH042");
    		mapRoute.put("1-1530923475","1-PBH043");
    		mapRoute.put("1-1530923476","1-PBH044");
    		mapRoute.put("1-1530923477","1-PBH045");
    		mapRoute.put("1-1530923478","1-PBH046");
    		mapRoute.put("1-1530923479","1-PBH047");
    		mapRoute.put("1-1530923480","1-PBH048");
    		mapRoute.put("1-1530924041","1-PBH0JT");
    		mapRoute.put("1-1530924042","1-PBH0JU");
    		mapRoute.put("1-1530924043","1-PBH0JV");
    		mapRoute.put("1-1530924044","1-PBH0JW");
    		mapRoute.put("1-1530924045","1-PBH0JX");
    		mapRoute.put("1-1530924046","1-PBH0JY");
    		mapRoute.put("1-1530924047","1-PBH0JZ");
    		mapRoute.put("1-1530924048","1-PBH0K0");
    		mapRoute.put("1-1530924049","1-PBH0K1");
    		mapRoute.put("1-1530924050","1-PBH0K2");
    		mapRoute.put("1-1530924091","1-PBH0L7");
    		mapRoute.put("1-1530924092","1-PBH0L8");
    		mapRoute.put("1-1530924093","1-PBH0L9");
    		mapRoute.put("1-1530924094","1-PBH0LA");
    		mapRoute.put("1-1530924095","1-PBH0LB");
    		mapRoute.put("1-1530924096","1-PBH0LC");
    		mapRoute.put("1-1530924097","1-PBH0LD");
    		mapRoute.put("1-1530924098","1-PBH0LE");
    		mapRoute.put("1-1530924099","1-PBH0LF");
    		mapRoute.put("1-1530924100","1-PBH0LG");
    	
    	}
    	for(Map.Entry<String, String> entry: mapRoute.entrySet()) {
   		 if(entry.getKey().equals(routecode)){
   			 val = entry.getValue();
   			 break;
   		 }
   		}
   	return val;
    }
    public static String getAreaCounty(String excel_level){
    	String val = "";
    	if(mapArea.isEmpty()){
    		mapArea.put("黄浦区","289529");
    		mapArea.put("卢湾区","289530");
    		mapArea.put("徐汇区","289531");
    		mapArea.put("长宁区","289532");
    		mapArea.put("静安区","289533");
    		mapArea.put("普陀区","289534");
    		mapArea.put("闸北区","289535");
    		mapArea.put("虹口区","289536");
    		mapArea.put("杨浦区","289537");
    		mapArea.put("闵行区","289538");
    		mapArea.put("宝山区","289539");
    		mapArea.put("嘉定区","289540");
    		mapArea.put("浦东新区","289541");
    		mapArea.put("金山区","289542");
    		mapArea.put("松江区","289543");
    		mapArea.put("青浦区","289544");
    		mapArea.put("南汇区","289545");
    		mapArea.put("奉贤区","289546");
    		mapArea.put("崇明区","4897744");
    		mapArea.put("太仓市","289609");
    	}
    	for(Map.Entry<String, String> entry: mapArea.entrySet()) {
    		 if(entry.getKey().equals(excel_level)){
    			 val = entry.getValue();
    			 break;
    		 }
    		}
    	return val;
    }
    
    public static String getAreaCity(String excel_level){
    	String val = "";
    	if(mapArea1.isEmpty()){
    		//mapArea1.put("兰州市","291868");
    		mapArea1.put("市辖区","289528");
    		mapArea1.put("苏州市","289597");
    		
    	}
    	for(Map.Entry<String, String> entry: mapArea1.entrySet()) {
    		 if(entry.getKey().equals(excel_level)){
    			 val = entry.getValue();
    			 break;
    		 }
    		}
    	return val;
    }
    public static String getAreaProvince(String excel_level){
    	String val = "";
    	if(mapArea2.isEmpty()){
    		mapArea2.put("甘肃省","291867");
    		mapArea2.put("上海市","289527");
    		mapArea2.put("江苏省","289549");
    	}
    	for(Map.Entry<String, String> entry: mapArea2.entrySet()) {
    		 if(entry.getKey().equals(excel_level)){
    			 val = entry.getValue();
    			 break;
    		 }
    		}
    	return val;
    }
}
