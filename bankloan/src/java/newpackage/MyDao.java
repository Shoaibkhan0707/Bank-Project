/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newpackage;
import java.sql.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.*;
/**
 *
 * @author shoaib
 */
public class MyDao implements Serializable{
    ServletContext context;
    Statement stmt;
    MyDao(ServletContext ctx){
        context=ctx;
    }
    public Statement getStatement()throws ClassNotFoundException,SQLException{
        String url="jdbc:mysql://localhost:3306/bank_loan?useSSL=false&allowPublicKeyRetrieval=true";//context.getInitParameter("url");
        String user="shoaib";//context.getInitParameter("username");
        String pass="admin@123";//context.getInitParameter("password");
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con=DriverManager.getConnection(url,user,pass);
        stmt=con.createStatement();
        return stmt;
    }
    public boolean Storedata(Statement st,String query)throws SQLException{
        return st.execute(query);
    }
   public ResultSet fetchData(Statement st,String query)throws SQLException{
        return st.executeQuery(query);
    } 
}
