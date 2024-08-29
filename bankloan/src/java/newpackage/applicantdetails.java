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
public class applicantdetails extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try ( PrintWriter out = response.getWriter()) {
           MyDao mm=new MyDao(getServletContext());
           Statement st=mm.getStatement();
            int x=Integer.parseInt(request.getParameter("sno"));
           // int acc=1;
           // int rej=2;
            String query="select name,panNo,aadharNo,amount from user_info where(sno="+x+")";
            ResultSet rs=mm.fetchData(st,query);
            if(rs.next()){
                   out.println("<center>");
                        out.println("<center><mark><u>APPLICANT DETAILS</u></mark></center>");
                        out.println("NAME  :"+rs.getString("name")+"<br>");
                        out.println("PAN NO :"+rs.getString("panNo")+"<br>");
                        out.println("AADHAR  :"+rs.getString("aadharNo")+"<br>");
                        out.println("AMOUNT :"+rs.getInt("amount")+"<br>");
                      //  out.println("LoanType :"+rs.getInt("LoanType")+"<br>");
                    //    out.println("<a href='updatedb?sno="+x+""value=1"'><button>ACCEPT</button></a>");
                    //    out.println("<a href='updatedb?sno="+x+""value=2"'><button>REJECT</button></a>");
                        out.println("<a href='updatedb?sno="+x+"&value=1'><button>Accept</button></a>");
                        out.println("<a href='updatedb?sno="+x+"&value=2'><button>Reject</button></a>");
                  out.println("</center>");
            }
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
           // out.println("<title>Servlet applicantdetails</title>");            
            out.println("</head>");
            out.println("<body>");
        //    out.println("<h1>Servlet applicantdetails at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }catch(ClassNotFoundException cnf){
            cnf.printStackTrace();
        }catch(SQLException ex){
            ex.printStackTrace();
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
