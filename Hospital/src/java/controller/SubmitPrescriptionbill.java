/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.DBConnection;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

/**
 *
 * @author PC
 */
public class SubmitPrescriptionbill extends HttpServlet {
    
    public static final String ACCOUNT_SID = "AC30903a9112a151014af6052c82523ef5";
    public static final String AUTH_TOKEN = "b37b147b45b9372b18cb743cc8880781";


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
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
         
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
        response.setContentType("text/html;charset=UTF-8");
      PrintWriter out = response.getWriter();
      
      int prscid = Integer.parseInt(request.getParameter("prscid"));
      String status=request.getParameter("status");
      String billnotes=request.getParameter("billnotes");
      String price=request.getParameter("price");
      String phoneno=request.getParameter("phoneno");
      String courtycode= "+94";
      String newmob=courtycode+phoneno;
      
        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
        
      
      
//      out.println(prscid);
//      out.println(status);
//      out.println(billnotes);
//      out.println(price);
    String statu;
      try{
          DBConnection con = new DBConnection();
          boolean rslt=con.addPrescriptionBill(prscid,status,billnotes,price);
          if(rslt==true)
          {
              
                if("Available".equals(status)){
            Message message = Message.creator(
            new PhoneNumber("+94714171632"),
            new PhoneNumber("+14154187518"), 
            "Your medicines are ready! \nOrder ID:" + prscid + "\n\nCentral Hospitals Pharmacy").create();
            System.out.println(message.getSid());
            
              out.println("Added Successfully");
              statu="Added Successfully!";
             
        }
        else{
            Message message = Message.creator(
            new PhoneNumber("+94714171632"),
            new PhoneNumber("+14154187518"), 
            "We are sorry!, Your medicines are currently not available in our pharmacy \n\nCentral Hospitals").create();
            System.out.println(message.getSid());
            
              out.println("Added Successfully");
              statu="Added Successfully!";
              
            
        }
              HttpSession session = request.getSession();
              session.setAttribute("statu",statu);
              response.sendRedirect("hospital/pharmacist/status.jsp");
            
//              RequestDispatcher rs= request.getRequestDispatcher("hospital/doctor/appointments_list.jsp");
//              rs.forward(request, response);
              
          }
          else
          {
              out.println("Error");
               statu="Something Went Wrong!";
              
              HttpSession session = request.getSession();
              session.setAttribute("statu",statu);
              response.sendRedirect("hospital/pharmacist/status.jsp");
          }
      }
      catch(Exception e){
          e.printStackTrace();
      }
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
