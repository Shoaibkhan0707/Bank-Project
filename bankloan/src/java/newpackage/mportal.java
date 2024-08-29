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
import jakarta.servlet.http.HttpSession;
import java.sql.*;
/**
 *
 * @author shoaib
 */
public class mportal extends HttpServlet {

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
            MyDao md =new MyDao(getServletContext());
            Statement st=md.getStatement();
            String query="select sno,name from user_info where(status=0)";
            ResultSet rs=md.fetchData(st,query);
         //   HttpSession hs=request.getSession(false);
          //  if(hs==null){
          //      response.sendRedirect("index.html");
          //  }
            if(rs.next()){
                do{
                    out.println("<center>");
                    out.println("<a href='applicantdetails?sno="+rs.getInt("sno")+"'>"+rs.getString("name")+"</a>");
                    out.println("</center>");
                }while(rs.next());
            }else{
                out.println("no application details");
            }
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
          //  out.println("<title>APPLICANTS DATA</title>");            
            out.println("</head>");
            out.println("<body>");
            //out.println("<h1>Servlet mportal at " + request.getContextPath() + "</h1>");
            out.println("<h1><center>APPLICANTS DATA</center></h1>");
            out.println("<h1><center>WAIT FOR APPROVAL LOAN </center></h1>");
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
