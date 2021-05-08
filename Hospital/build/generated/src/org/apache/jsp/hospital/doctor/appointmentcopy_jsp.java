package org.apache.jsp.hospital.doctor;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import model.Prescription;
import model.DBConnection;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import model.Patient;
import model.Appointments;

public final class appointmentcopy_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0, shrink-to-fit=no\">\r\n");
      out.write("    <title>hospital</title>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"../assets/bootstrap/css/bootstrap.min.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css?family=Montserrat:400,600,700\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"../assets/fonts/font-awesome.min.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"../assets/fonts/ionicons.min.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"../assets/css/Contact-Form-Clean.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"../assets/css/Footer-Basic.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"../assets/css/Footer-Clean.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"../assets/css/Navigation-with-Button.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"../assets/css/styles.css\">\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body style=\"background: #dddddd;font-family: Montserrat, sans-serif;\">\r\n");
      out.write("    ");
 
     
      int pid = Integer.parseInt(request.getParameter("patientid"));
      int appid = Integer.parseInt(request.getParameter("appid"));
      int docid = Integer.parseInt(request.getParameter("docid"));
      String appdate=request.getParameter("appdate");
      String pharmacy=request.getParameter("pharmacy");
      
      
      String fname=request.getParameter("fname");
      String lname=request.getParameter("lname");
      String dob=request.getParameter("dob");
      int phoneno = Integer.parseInt(request.getParameter("phoneno"));
      String email=request.getParameter("email");
      String address=request.getParameter("address");
      String gender=request.getParameter("gender");
      String bloodtype=request.getParameter("bloodtype");
      String pec=request.getParameter("pec");
      
      
        
      Appointments apt = new Appointments();
      apt.setPid(pid);
      apt.setAptid(appid);
      apt.setDocid(docid);
      apt.setDate(appdate);
      apt.setPharmacy(pharmacy);
      
      
      Patient pat = new Patient();
      pat.setFname(fname);
      pat.setLname(lname);
      pat.setDob(dob);
      pat.setMobileNo(phoneno);
      pat.setEmail(email);
      pat.setAddress(address);
      pat.setGender(gender);
      pat.setBloodGroup(bloodtype);
      pat.setPec(pec);
    
    
      out.write("\r\n");
      out.write("    \r\n");
      out.write("        ");
DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
   LocalDateTime now = LocalDateTime.now();
   System.out.println(dtf.format(now));
      out.write("\r\n");
      out.write("         \r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    <nav class=\"navbar navbar-light navbar-expand-md navigation-clean-button\">\r\n");
      out.write("        <div class=\"container\"><a class=\"navbar-brand\" href=\"#\">Appointments</a><button data-toggle=\"collapse\" class=\"navbar-toggler\" data-target=\"#navcol-1\"><span class=\"sr-only\">Toggle navigation</span><span class=\"navbar-toggler-icon\"></span></button>\r\n");
      out.write("            <div class=\"collapse navbar-collapse\" id=\"navcol-1\">\r\n");
      out.write("                <ul class=\"navbar-nav mx-auto\">\r\n");
      out.write("                    <li class=\"nav-item\"></li>\r\n");
      out.write("                </ul><span class=\"navbar-text actions\"> <a class=\"login\" href=\"#\" style=\"font-size: 18px;\">Home</a></span>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </nav>\r\n");
      out.write("    <div class=\"container-sm\">\r\n");
      out.write("        <div class=\"row\">\r\n");
      out.write("            <div class=\"col\">\r\n");
      out.write("                <div style=\"margin: 16px;\">\r\n");
      out.write("                    <div class=\"row\">\r\n");
      out.write("                        <div class=\"col text-left align-self-center\"><button class=\"btn btn-dark text-center\" type=\"button\" style=\"margin: 3px;width: 100;\"><i class=\"fa fa-chevron-left\"></i>&nbsp; PREVIOUS</button></div>\r\n");
      out.write("                        <div class=\"col text-left align-self-center\">\r\n");
      out.write("                            <h6 class=\"text-uppercase text-center text-dark\" style=\"font-family: Montserrat, sans-serif;text-align: center;\">No : ");
      out.print(apt.getAptid());
      out.write("</h6>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"col text-right align-self-center\"><button class=\"btn btn-dark text-center\" type=\"button\" style=\"margin: 3px;width: 100px;\">NEXT&nbsp;&nbsp;<i class=\"fa fa-chevron-right\"></i></button></div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("                        \r\n");
      out.write("                        \r\n");
      out.write("        <div class=\"row\">\r\n");
      out.write("            <div class=\"col-xl-5 offset-xl-0 ml-auto\" style=\"padding-left: 0;padding-right: 0;padding-bottom: 0;margin-bottom: 10px;\">\r\n");
      out.write("                <div class=\"mx-auto\">\r\n");
      out.write("                    <div class=\"card\" style=\"padding-bottom: 0;margin-bottom: 10px;\">\r\n");
      out.write("                        <div class=\"card-header\">\r\n");
      out.write("                            <h5 class=\"mb-0\">Patient Details<br></h5>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"card-body\" style=\"margin-bottom: 0;background: #ffffff;\">\r\n");
      out.write("                            <h4 class=\"card-title\" style=\"color: rgb(0,0,0);font-size: 20px;\"> ");
      out.print(pat.getFname()+" "+pat.getLname());
      out.write("</h4>\r\n");
      out.write("                            <h4 class=\"card-title\" style=\"color: rgb(0,0,0);font-size: 20px;\">");
      out.print(pat.getDob());
      out.write("</h4>\r\n");
      out.write("                            <h4 class=\"card-title\" style=\"color: rgb(0,0,0);font-size: 20px;\">");
      out.print(pat.getGender());
      out.write("</h4>\r\n");
      out.write("                            <h4 class=\"card-title\" style=\"color: rgb(0,0,0);font-size: 20px;\">Blood Group : ");
      out.print(pat.getBloodGroup());
      out.write("</h4>\r\n");
      out.write("                            <h4 class=\"card-title\" style=\"color: rgb(0,0,0);font-size: 20px;\">Pharmacy : ");
      out.print(apt.getPharmacy());
      out.write("</h4>\r\n");
      out.write("                            <hr>\r\n");
      out.write("                            <h1 class=\"text-left card-title\" style=\"color: var(--red);font-size: 17px;font-family: Montserrat, sans-serif;\">Pre Existing Conditions</h1>\r\n");
      out.write("                            <h1 class=\"text-left text-dark card-title\" style=\"color: var(--red);font-size: 17px;font-family: Montserrat, sans-serif;\"> ");
      out.print(pat.getPec());
      out.write("</h1>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                        \r\n");
      out.write("                    <div class=\"card\">\r\n");
      out.write("                        <div class=\"card-header\">\r\n");
      out.write("                            <h5 class=\"mb-0\">New Diagnosis<br></h5>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"card-body\">\r\n");
      out.write("                            <div class=\"col\" style=\"padding-left: 0;padding-right: 0;\">\r\n");
      out.write("                                <form method=\"post\" action=\"../SubmitDiagnosisPrescription\">\r\n");
      out.write("                                    <input type=\"hidden\" name=\"patientid\" value=\"");
      out.print(apt.getAptid());
      out.write("\">\r\n");
      out.write("                                    <input type=\"hidden\" name=\"doctorid\" value=\"");
      out.print(apt.getDocid());
      out.write("\">\r\n");
      out.write("                                    <input type=\"hidden\" name=\"date\" value=\"");
      out.print(dtf.format(now));
      out.write("\">\r\n");
      out.write("                                    <div class=\"form-group\"><textarea class=\"form-control\" name=\"diagnosis\" placeholder=\"Diagnosis\" rows=\"14\" style=\"height: 152px;\" required></textarea></div>\r\n");
      out.write("                                    <div class=\"form-group\"><textarea class=\"form-control\" name=\"prescription\" placeholder=\"Prescription\" rows=\"14\" style=\"height: 171px;\" required></textarea></div>\r\n");
      out.write("                                    <div class=\"form-group text-center\"><button class=\"btn btn-primary\" type=\"submit\">SUBMIT</button></div>\r\n");
      out.write("                                </form>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                        \r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("      <div class=\"col-md-6 col-xl-7 mr-auto\"> \r\n");
      out.write("                <div>\r\n");
      out.write("                    <div class=\"card\">\r\n");
      out.write("                        <div class=\"card-header\">  \r\n");
      out.write("                            <h5 class=\"mb-0\">History<br></h5>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        ");
List<Prescription> list2 = DBConnection.getPrescription(apt.getPid()); 
      out.write("\r\n");
      out.write("            ");
for(Prescription p:list2){ 
      out.write("\r\n");
      out.write("                        <div class=\"card-body\" style=\"background: #ffffff;padding: 15px;\">\r\n");
      out.write("                            <div class=\"col align-self-center mx-auto\" style=\"padding-right: 0;padding-left: 0;\">\r\n");
      out.write("                                <div class=\"card\" style=\"margin-bottom: 10px;\"> \r\n");
      out.write("                                    <div class=\"card-header\" style=\"background: rgba(0,0,0,0);\">\r\n");
      out.write("                                        <h5 class=\"d-inline mb-0\">  ");
      out.print(p.getDate());
      out.write(" </h5><button class=\"btn btn-light float-right\" type=\"button\">Print</button>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"card-body text-left\" style=\"padding: 0px;\">\r\n");
      out.write("                                        <div class=\"row\">  \r\n");
      out.write("                                            <div class=\"col\" style=\"padding-right: 0;\">\r\n");
      out.write("                                                <div class=\"card\" style=\"border-style: none;\"> \r\n");
      out.write("                                                    <div class=\"card-body\" style=\"border-style: none;\"> \r\n");
      out.write("            \r\n");
      out.write("                                                        <h4 class=\"card-title\">Diagnosis</h4> \r\n");
      out.write("                                                        <p class=\"card-text\"> ");
      out.print(p.getNotes());
      out.write("    </p>\r\n");
      out.write("                                                    </div>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                            <div class=\"col\">\r\n");
      out.write("                                                <div class=\"card\" style=\"border-style: none;\">\r\n");
      out.write("                                                    <div class=\"card-body\" style=\"border-style: none;\">\r\n");
      out.write("                                                        <h4 class=\"card-title\">Prescription</h4>\r\n");
      out.write("                                                        <p class=\"card-text\">   ");
      out.print(p.getPrsclist());
      out.write("      </p>  \r\n");
      out.write("                                                    </div>  \r\n");
      out.write("                                                </div> \r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div>     \r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div> \r\n");
      out.write("                            \r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div> ");
}
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div> \r\n");
      out.write("            </div>                \r\n");
      out.write("                                    \r\n");
      out.write("                                    \r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <footer class=\"footer-basic\">\r\n");
      out.write("        <div class=\"social\"><a href=\"#\"><i class=\"icon ion-social-instagram\"></i></a><a href=\"#\"><i class=\"icon ion-social-twitter\"></i></a><a href=\"#\"><i class=\"icon ion-social-facebook\"></i></a></div>\r\n");
      out.write("        <ul class=\"list-inline\">\r\n");
      out.write("            <li class=\"list-inline-item\"><a href=\"#\">Home</a></li>\r\n");
      out.write("            <li class=\"list-inline-item\"><a href=\"#\">Services</a></li>\r\n");
      out.write("            <li class=\"list-inline-item\"><a href=\"#\">About</a></li>\r\n");
      out.write("            <li class=\"list-inline-item\"><a href=\"#\">Terms</a></li>\r\n");
      out.write("            <li class=\"list-inline-item\"><a href=\"#\">Privacy Policy</a></li>\r\n");
      out.write("        </ul>\r\n");
      out.write("        <p class=\"copyright\">Company Name © 2021</p>\r\n");
      out.write("    </footer>\r\n");
      out.write("    <script src=\"../assets/js/jquery.min.js\"></script>\r\n");
      out.write("    <script src=\"../assets/bootstrap/js/bootstrap.min.js\"></script>\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
