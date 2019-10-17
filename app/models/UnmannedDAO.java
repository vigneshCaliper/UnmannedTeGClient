package models;


import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.inject.Inject;

import org.json.JSONObject;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

import models.Unmanned;
import play.db.Database;

import play.libs.Json;
import utils.AveryDbConnection;

public class UnmannedDAO implements Unmanned {
	 private AveryDbConnection AveryDb;
	 public Connection connection;
	 @Inject
	  public UnmannedDAO(AveryDbConnection AveryDb) {
	    this.AveryDb= AveryDb;
	  }
	public JsonNode UnmannedAccess() {
		System.out.println("in DAO....");
		ObjectNode resultNode = Json.newObject();
		resultNode.put("success", 1);
		try {
			System.out.println("in here....");
                // do whatever you need with the db connection
				 System.out.println("in here cm....");
				 Statement stmt = connection.createStatement();
				 ResultSet rs;
		            rs = stmt.executeQuery("SELECT * FROM AVERYTEST.dbo.Gross_weight");
		          System.out.println(rs);
		            while ( rs.next() ) {
		                String SEQNO = rs.getString("SEQNO");
		                System.out.println(SEQNO);
		            }
		            connection.close();
             
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return resultNode;
		
	}
	
	public JsonNode GetTare(String bound) {
		ObjectNode resultNode = Json.newObject();
		try {
			     connection= AveryDb.getSqlConnectionDB();
				 Statement stmt = connection.createStatement();
				 String Query = "SELECT * FROM dbo.TareWeight WHERE SRNO='"+bound+"'";
				System.out.println("Query..."+Query);
				 ResultSet rs;
					rs = stmt.executeQuery(Query);
		            while (rs.next() ) {
		            	resultNode.put("SRNO", rs.getString("SRNO"));
		            	resultNode.put("SEQNO", rs.getString("SEQNO"));
		            	resultNode.put("TAREON", rs.getString("TAREON"));
		            	resultNode.put("TAREAT", rs.getString("TAREAT"));
						resultNode.put("WNO", rs.getString("WNO"));
						resultNode.put("TAREWT", rs.getString("TAREWT"));
						resultNode.put("RCKST", rs.getString("RCKST"));
						resultNode.put("RCKEN", rs.getString("RCKEN"));
						resultNode.put("TRIPNO", rs.getString("TRIPNO"));
						resultNode.put("SAP_READ_FLAG", rs.getString("SAP_READ_FLAG"));
		            }
		     //       connection.close();
             
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return resultNode;
	}
	public JsonNode getGross(String bound) {
		ObjectNode resultNode = Json.newObject();
		try {
			connection= AveryDb.getSqlConnectionDB();
			System.out.println("bound......"+bound);
			System.out.println("connection......"+connection);
				 Statement stmt = connection.createStatement();
				 String Query = "SELECT * FROM dbo.GrossWeight WHERE SRNO='"+bound+"'";
				System.out.println("Query..."+Query);
				 ResultSet rs;
					rs = stmt.executeQuery(Query);
		            while (rs.next() ) {
		            	resultNode.put("SRNO", rs.getString("SRNO"));
		            	resultNode.put("SEQNO", rs.getString("SEQNO"));
		            	resultNode.put("GROSSON", rs.getString("GROSSON"));
						resultNode.put("GROSSAT", rs.getString("GROSSAT"));
						resultNode.put("WNO", rs.getString("WNO"));
						resultNode.put("GROSSWT", rs.getString("GROSSWT"));
						resultNode.put("RCKST", rs.getString("RCKST"));
						resultNode.put("RCKEN", rs.getString("RCKEN"));
						resultNode.put("TRIPNO", rs.getString("TRIPNO"));
						resultNode.put("SAP_READ_FLAG", rs.getString("SAP_READ_FLAG"));
		            }
		           // connection.close();
             
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return resultNode;
	}
	@Override
	public JsonNode getToken(String bound) {
		ObjectNode resultNode = Json.newObject();
		try {
			connection= AveryDb.getSqlConnectionDB();
				 Statement stmt = connection.createStatement();
				 String Query = "SELECT * FROM dbo.TokenCreation where SRNO='"+bound+"'";
				System.out.println("Query..."+Query);
				 ResultSet rs;
					rs = stmt.executeQuery(Query);
		            while (rs.next() ) {
		            	resultNode.put("SRNO", rs.getString("SRNO"));
		            	resultNode.put("TRUCKNO", rs.getString("TRUCKNO"));
		            	resultNode.put("DISPATCH_TYPE", rs.getString("DISPATCH_TYPE"));
						resultNode.put("TRANSP_NAME", rs.getString("TRANSP_NAME"));
						resultNode.put("WERKS", rs.getString("WERKS"));
						resultNode.put("CHKINSTAT", rs.getString("CHKINSTAT"));
						resultNode.put("CHKINDT", rs.getString("CHKINDT"));
						resultNode.put("CHKINTM", rs.getString("CHKINTM"));
						resultNode.put("DELFLAG", rs.getString("DELFLAG"));
						resultNode.put("INTIME", rs.getString("INTIME"));
						resultNode.put("INDATE", rs.getString("INDATE"));
						resultNode.put("CREABY", rs.getString("CREABY"));
						resultNode.put("VSART", rs.getString("VSART"));
						resultNode.put("IN_OUT", rs.getString("IN_OUT"));
						resultNode.put("BRGEW", rs.getString("BRGEW"));
						resultNode.put("EXITFON", rs.getString("EXITFON"));
						resultNode.put("EXITFAT", rs.getString("EXITFAT"));
						resultNode.put("EXITFFLAG", rs.getString("EXITFFLAG"));
						resultNode.put("DOCTYP", rs.getString("DOCTYP"));
						resultNode.put("LDSTART", rs.getString("LDSTART"));
						resultNode.put("MAT_DISC", rs.getString("MAT_DISC"));
						resultNode.put("DOC_REMARK", rs.getString("DOC_REMARK"));
		            }
		           // connection.close();
             
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return resultNode;
	}

	public JsonNode CreateToken(JsonNode json) {
		ObjectNode resultNode = Json.newObject();
		try {
			connection= AveryDb.getSqlConnectionDB();
				 System.out.println("cmg here");
				 JSONObject obj = new JSONObject(json.toString());
				 System.out.println("obj..."+obj);
				 Calendar calendar = Calendar.getInstance();
			      java.sql.Date startDate = new java.sql.Date(calendar.getTime().getTime());
				String Quer2 = "INSERT INTO dbo.TokenCreation (SRNO,TRUCKNO,DISPATCH_TYPE,TRANSP_NAME ,WERKS,CHKINSTAT ,CHKINDT ,CHKINTM ,DELFLAG,INTIME,INDATE,CREABY,VSART,IN_OUT,BRGEW,EXITFON,EXITFAT,EXITFFLAG,DOCTYP,LDSTART,MAT_DISC,DOC_REMARK) VALUES"
				 		+ "('" + obj.getString("SRNO") +"','" + obj.getString("TRUCKNO") +"','" + obj.getString("DISPATCH_TYPE") +"','" + obj.getString("TRANSP_NAME") +"','" + obj.getString("WERKS") +"','" + obj.getString("CHKINSTAT") +"','" + startDate +"',"
				 		+ "'" + startDate +"'," + obj.get("DELFLAG") +",'" + startDate +"','" +startDate +"',"
				 		+ "" +  obj.get("CREABY") +"," + obj.get("VSART") +",'" + obj.getString("IN_OUT") +"',"+obj.get("BRGEW")+",'" + startDate +"','" + startDate +"','" + obj.getString("EXITFFLAG") +"','" + obj.getString("DOCTYP") +"','" +  obj.getString("LDSTART") +"','" + obj.getString("MAT_DISC") +"'," + obj.get("DOC_REMARK") +")";
			 	System.out.println("Quer2..."+Quer2);
				 if (connection != null) {
		                System.out.println("Connected to the database!");
		            } else {
		                System.out.println("Failed to make connection!");
		            }
				 Statement statement = connection.createStatement();
				 int row = statement.executeUpdate(Quer2);
		            if(row>0) {
		            	resultNode.put("Status","Token added Successfully" );
		            }else {
		            	resultNode.put("Status","Failed to add Token!!" );
		            }
		        //    connection.close();
              
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return resultNode;
	}
	
	public JsonNode updateToken(JsonNode json) {
		ObjectNode resultNode = Json.newObject();
		try {
			connection= AveryDb.getSqlConnectionDB();
				 Calendar calendar = Calendar.getInstance();
			      java.sql.Date startDate = new java.sql.Date(calendar.getTime().getTime());
			      JSONObject obj = new JSONObject(json.toString());
				  System.out.println("obj..."+obj);
			      String query = "UPDATE dbo.TokenCreation  SET TRUCKNO='"+obj.getString("TRUCKNO")+"' ,DISPATCH_TYPE='"+obj.getString("DISPATCH_TYPE")+"',TRANSP_NAME='"+obj.getString("TRANSP_NAME")+"' ,WERKS='"+obj.getString("WERKS")+"',CHKINSTAT='"+obj.getString("CHKINSTAT")+"',CHKINDT='"+startDate+"' ,CHKINTM='"+startDate+"',DELFLAG="+obj.get("DELFLAG") +",INTIME='"+startDate+"' ,INDATE='"+startDate+"',CREABY="+obj.get("CREABY") +",VSART="+obj.get("VSART")+",IN_OUT='"+obj.getString("IN_OUT")+"',BRGEW="+obj.get("BRGEW")+",EXITFON='"+startDate+"' ,EXITFAT='"+startDate+"',EXITFFLAG='"+obj.getString("EXITFFLAG")+"',DOCTYP='"+ obj.getString("DOCTYP")+"',LDSTART='"+obj.getString("LDSTART")+"',MAT_DISC='"+obj.getString("MAT_DISC")+"',DOC_REMARK="+obj.get("DOC_REMARK")+" WHERE SRNO="+ obj.getString("SRNO")+"";
					System.out.println("Update query..."+query);
				 if (connection != null) {
		                System.out.println("Connected to the database!");
		            } else {
		                System.out.println("Failed to make connection!");
		            }
				 Statement statement = connection.createStatement();
				 int row = statement.executeUpdate(query);
		            if(row>0) {
		            	resultNode.put("Status","Token updated Successfully" );
		            }else {
		            	resultNode.put("Status","Failed to update Token!!" );
		            }
		          //  connection.close();
             
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return resultNode;
	}
}
