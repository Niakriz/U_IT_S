package com.so.jdbcexample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;



public class SimpleConnection {
    Connection conn;
    
    public SimpleConnection(){
        
    }
    
    public void createConnection(String connectionUrl, String userName, String password)throws Exception{
//        try{
//            loadDriver("com.mysql.jdbc.Driver");
//        }catch(ClassNotFoundException ex){
//            throw new Exception("Cannot load MySQL driver");
//        }
        conn = ConnectionManager.getConnection();
    }
    
    private void loadDriver(String driver)throws ClassNotFoundException{

            Class.forName(driver);
    }
    
    public void disconnect()throws SQLException{
        conn.close();
    }
    
    public void getRecord()throws SQLException{
        Statement stmt  = conn.createStatement();
        ResultSet rs = stmt.executeQuery("select * from users;");
        
        System.out.println("Table Summary:");
        getResultInfo(rs);
        System.out.println("Data Summary:");
        while(rs.next()){
            System.out.println("record summary: "+
            " id - " + rs.getInt("id")+
            ", username - " + rs.getString("username")+
            ", password - " + rs.getString("password")+
            ", active - " + rs.getBoolean("active"));
        }
        
    }
    
    public int createRecord()throws SQLException{
        Statement stmt  = conn.createStatement();
        int res = stmt.executeUpdate("insert into users(username, password, active) values ('vasja', 'pupkin',0);");
        return res;
    }
    public void updateRecord()throws SQLException{
        Statement stmt  = conn.createStatement();
        int res = stmt.executeUpdate("update users set active=1");
    }
    public void removeRecord()throws SQLException{
        Statement stmt  = conn.createStatement();
        int res = stmt.executeUpdate("delete from users where 1");   
    }
    
    public void getResultInfo(ResultSet rs)throws SQLException{
        ResultSetMetaData rsmd = rs.getMetaData();
        int columnCount = rsmd.getColumnCount();
        System.out.println("COLUMN COUNT " +columnCount);
        for(int i = 1; i <= columnCount; i++){
            System.out.println("colName - " + rsmd.getColumnName(i)+
                    ", colType - " + rsmd.getColumnType(i)+
                    ", colTypeName - " + rsmd.getColumnTypeName(i)
                    
            );
        }
    }
    
    public void createTesTable()throws SQLException{
        Statement stmt = conn.createStatement();
        
      String r = "create table users(id int(11) not null auto_increment,username vc(32) not null, password vc(32), active bit(1), primari key (id));";
      
      stmt.executeUpdate(r);
      
    }
    
}
