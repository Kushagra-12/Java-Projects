package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Signup_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <style>\n");
      out.write("\n");
      out.write("        form {\n");
      out.write("    border: 3px solid #ccc;\n");
      out.write("    width: fit-content;\n");
      out.write("    background-color: #flflfl;\n");
      out.write("}\n");
      out.write("input[type=text], select {\n");
      out.write("    width: 100%;\n");
      out.write("    padding: 12px 20px;\n");
      out.write("    margin: 8px 0;\n");
      out.write("    display: inline-block;\n");
      out.write("    border: 1px solid #ccc;\n");
      out.write("    border-radius: 4px;\n");
      out.write("    box-sizing: border-box;\n");
      out.write("}\n");
      out.write("input[type=text], input[type=password] {\n");
      out.write("\n");
      out.write("    width: 100%;\n");
      out.write("    padding: 12px 20px;\n");
      out.write("    margin: 8px 0;\n");
      out.write("    display: inline-block;\n");
      out.write("    border: 1px solid #ccc;\n");
      out.write("    border-radius: 4px;\n");
      out.write("    box-sizing: border-box;\n");
      out.write("}\n");
      out.write("button {\n");
      out.write("    align-content:center;\n");
      out.write("    background-color: #000000;\n");
      out.write("    color: white;\n");
      out.write("    padding: 14px 20px;\n");
      out.write("    margin: 8px 220px;\n");
      out.write("    border: none;\n");
      out.write("    cursor: pointer;\n");
      out.write("    width: 50%;\n");
      out.write("}\n");
      out.write("\n");
      out.write("button:hover {\n");
      out.write("    opacity: 0.8;\n");
      out.write("}\n");
      out.write("    \n");
      out.write("\n");
      out.write(".imgcontainer {\n");
      out.write("    text-align:justify ;\n");
      out.write("    margin: 24px 0 12px 0;\n");
      out.write("}\n");
      out.write("\n");
      out.write("img.avatar {\n");
      out.write("    width: 20%;\n");
      out.write("    border-radius: 50%;\n");
      out.write("    margin: 8px 380px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".container {\n");
      out.write("    padding: 16px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("span.psw {\n");
      out.write("    float: right;\n");
      out.write("    padding-top: 16px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("</style>\n");
      out.write("    <head>\n");
      out.write("        \n");
      out.write("        <title>SIGN UP </title>\n");
      out.write("    </head>\n");
      out.write("    <h2>REGISTRATION FORM</h2>\n");
      out.write("    <body>\n");
      out.write("        <form action=\"Signup\" method=\"POST\">\n");
      out.write("             <div class=\"imgcontainer\">\n");
      out.write("    <img src=\"authentication-icon.png\" alt=\"Avatar\" class=\"avatar\" >\n");
      out.write("    <div class=\"container\">\n");
      out.write("  \n");
      out.write("           <label><b>NAME</b></label>        <input type=\"text\" name=\"name\" value=\"\" placeholder=\"Enter full name\"/> <br/>   \n");
      out.write("           <label><b>PASSWORD</b></label>   <input type=\"password\" name=\"password\" value=\"\" placeholder=\"eg:password1\" /> <br/>  \n");
      out.write("            <label><b>ADDRESS</b></label>  <input type=\"text\" name=\"address\" value=\"\" placeholder=\"Enter full address\" /> <br/>  \n");
      out.write("            <label><b>CITY</b></label>      <input type=\"text\" name=\"city\" value=\"\" placeholder=\"Enter your city\"/><br/>  \n");
      out.write("            <label><b>STATE</b></label>      <select name=\"state\" value=\"\"/> \n");
      out.write("            <option value=-1>Select State Name<option/>\n");
      out.write("            <option>Andaman and Nicobar Islands</option>\n");
      out.write("            <option>Andhra Pradesh</option>\n");
      out.write("            <option>Arunanchal Pradesh</option>\n");
      out.write("            <option>Assam</option>\n");
      out.write("            <option>Bihar</option>\n");
      out.write("            <option>Chandigarh</option>\n");
      out.write("            <option>Chhattisgarh</option>\n");
      out.write("            <option>Dadra and Nagar Haveli</option>\n");
      out.write("            <option>Daman and Diu</option>\n");
      out.write("            <option>New Delhi</option>\n");
      out.write("            <option>Goa</option>\n");
      out.write("            <option>Gujarat</option>\n");
      out.write("            <option>Haryana</option>\n");
      out.write("            <option>Himachal Pradesh</option>\n");
      out.write("            <option>Jammu and Kashmir</option>\n");
      out.write("            <option>Jharkhand</option>\n");
      out.write("            <option>Karnataka</option>\n");
      out.write("            <option>Kerala</option>\n");
      out.write("            <option>Lakshadweep</option>\n");
      out.write("            <option>Madhya Pradesh</option>\n");
      out.write("            <option>Maharashtra</option>\n");
      out.write("            <option>Manipur</option>\n");
      out.write("            <option>Meghalaya</option>\n");
      out.write("            <option>Mizoram</option>\n");
      out.write("            <option>Nagaland</option>\n");
      out.write("            <option>Odisha</option>\n");
      out.write("            <option>Puducherry</option>\n");
      out.write("            <option>Punjab</option>\n");
      out.write("            <option>Rajasthan</option>\n");
      out.write("            <option>Sikkim</option>\n");
      out.write("            <option>Tamil Nadu</option>\n");
      out.write("            <option>Telangana</option>\n");
      out.write("            <option>Tripura</option>\n");
      out.write("            <option>Uttar Pradesh</option>\n");
      out.write("            <option>Uttarakhand</option>\n");
      out.write("            <option>West Bengal</option>\n");
      out.write("        </select><br/>\n");
      out.write("            <label><b>GENDER</b></label>   <select name=\"gender\" value=\"\"/>\n");
      out.write("            <option value=-1>Enter your gender<option/>\n");
      out.write("            <option>Male</option>\n");
      out.write("            <option>Female</option>\n");
      out.write("            <option>Other</option> \n");
      out.write("            <select/><br/>\n");
      out.write("            <label><b>DATE OF BIRTH</b></label>  <br><label><b><input type=\"date\" name=\"dob\" value=\"\" /></b></label><br/><br>\n");
      out.write("              <label><b>VOTER-ID</b></label>   <input type=\"text\" name=\"vid\" value=\"\" placeholder=\"Enter 10 digit Vid\"/><br/>\n");
      out.write("           </div>\n");
      out.write("           <button type=\"submit\" value=\"Submit\">submit here</button>\n");
      out.write("           <button type=\"reset\" value=\"Reset\" /> RESET</button>\n");
      out.write("        </form>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
