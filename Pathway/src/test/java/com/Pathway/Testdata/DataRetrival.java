	package com.Pathway.Testdata;

	 

	import java.io.File;
	import java.io.FileInputStream;
	import java.util.ArrayList;
	import java.util.List;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Sheet;
	import org.apache.poi.ss.usermodel.Workbook;
	import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataRetrival
{

	
   
       
       
    


	    String UserNameSheet = "E:\\repositeryforgit\\Pathway_Automation\\Pathway\\Pathwayusercredtinals.xlsx";
	    String OldSiteSheet = "E:\\repositeryforgit\\Pathway_Automation\\Pathway\\Old Sites Data.xlsx";
	    List<String> Usernames = new ArrayList<String>();
	    List<String> passwords = new ArrayList<String>();
	    int usernamePos = 1;
	    int passwordPos = 2;
	     
	    // Old site data
	    List<String> column_1 = new ArrayList<String>();
	    List<String> column_2 = new ArrayList<String>();
	    int column_1_Pos = 2;
	    int column_2_Pos = 4;
	     
	     
	    public void loadData_Userdata() {
	    try {
	    FileInputStream excelFile = new FileInputStream(new File(UserNameSheet));
	                Workbook workbook = new XSSFWorkbook(excelFile);
	                Sheet datatypeSheet = workbook.getSheetAt(0);
	              
	                // Username and passwords
	                for(int i = 0;i<=datatypeSheet.getLastRowNum();i++  ) {
	                Usernames.add(datatypeSheet.getRow(i).getCell(usernamePos).toString());
	                passwords.add(datatypeSheet.getRow(i).getCell(passwordPos).toString());
	                /*
	                 * System.out.println(Usernames); System.out.println(passwords);
	                 */
	                }          
	    } catch (Exception e) {

	 

	e.printStackTrace();
	    }
	    }
	     
	    public void loadData_oldData() {
	    try {
	    FileInputStream excelFile = new FileInputStream(new File(OldSiteSheet));
	                Workbook workbook = new XSSFWorkbook(excelFile);
	                Sheet datatypeSheet = workbook.getSheetAt(0);
	              
	                // Username and passwords
	                for(int i = 0;i<datatypeSheet.getLastRowNum();i++  ) {
	                column_1.add(datatypeSheet.getRow(i).getCell(column_1_Pos).toString());
	                column_2.add(datatypeSheet.getRow(i).getCell(column_2_Pos).toString());
	                /*
	                 * System.out.println(column_1); System.out.println(column_2);
	                 */
	                }          
	    } catch (Exception e) {

	 

	e.printStackTrace();
	    }
	    }
	     
	    public String getUsername(int i) {
	    return Usernames.get(i);
	    }
	     
	    public String getPassword(int i) {
	    return passwords.get(i);
	    }
	     
	    public String getColumn_1(int i) {
	    return column_1.get(i);
	    }
	    
	    
	     
	    public String getColumn_2(int i) {
	    return column_2.get(i);
	    
	    }
	     
	    public DataRetrival() {
	    super();
	    loadData_Userdata();
	    loadData_oldData();
	    }

	 

	}


