/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package newpackage;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.sql.*;

/**
 *
 * @author shoaib
 */
public class formsubmitter1 extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.s
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()){
            /* TODO output your page here. You may use following sample code. */ 
           MyDao m=new MyDao(getServletContext());
           Statement st=m.getStatement();
           String query="select max(sno) from user_info";
           ResultSet rs=m.fetchData(st,query);
            String name=request.getParameter("Name");
            int amount=Integer.parseInt(request.getParameter("Amount"));
            String aadhar=request.getParameter("Aadhar");
            String pan=request.getParameter("PanNo");
            String loan=request.getParameter("LoanType");
            out.println(name);
            out.println(amount);
            out.println(pan);
            out.println(aadhar);
            out.println(loan);
            String userdata;
            if(!rs.next()){
                userdata="insert into user_info(sno,name,amount,panNo,aadharNo,doa,status)VALUES(1,'"+name+"','"+amount+"','"+pan+"','"+aadhar+"',NOW(),0)";
            }else{
                int sn=rs.getInt("max(sno)");
                sn=sn+1;
                userdata="insert into user_info(sno,name,amount,panNo,aadharNo,doa,status)VALUES('"+sn+"','"+name+"','"+amount+"','"+pan+"','"+aadhar+"',NOW(),0)";
            }
             m.Storedata(st,userdata);
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet formsubmitter1</title>");  
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet formsubmitter1 at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }catch(ClassNotFoundException cnf){
            cnf.printStackTrace();
        }catch(SQLException se){
            se.printStackTrace();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
