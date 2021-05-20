package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class poll_0020pagefake_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<title>RESULTS</title>\n");
      out.write("<meta charset=\"UTF-8\">\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<link rel=\"stylesheet\" href=\"https://www.w3schools.com/w3css/4/w3.css\">\n");
      out.write("<link rel='stylesheet' href='https://fonts.googleapis.com/css?family=Roboto'>\n");
      out.write("<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("<style>\n");
      out.write("html,body,h1,h2,h3,h4,h5,h6 {font-family: \"Roboto\", sans-serif}\n");
      out.write("</style>\n");
      out.write("<body class=\"w3-light-grey\">\n");
      out.write("\n");
      out.write("<!-- Page Container -->\n");
      out.write("<div class=\"w3-content w3-margin-top\" style=\"max-width:1400px;\">\n");
      out.write("\n");
      out.write("  <!-- The Grid -->\n");
      out.write("  <div class=\"w3-row-padding\">\n");
      out.write("  \n");
      out.write("    <!-- Left Column -->\n");
      out.write("   \n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"w3-container\">\n");
      out.write("          \n");
      out.write("          <hr>\n");
      out.write("\n");
      out.write("          <p class=\"w3-large\"><b><i class=\"fa fa-asterisk fa-fw w3-margin-right w3-text-teal\"></i>RESULTS</b></p>\n");
      out.write("          <p><lable><b>BJP</b></label></p>\n");
      out.write("          <div class=\"w3-light-grey w3-round-xlarge w3-small\">\n");
      out.write("            <div class=\"w3-container w3-center w3-round-xlarge w3-teal\" style=\"width:90%\">90%</div>\n");
      out.write("          </div>\n");
      out.write("          <p><lable><b>CONGRESS</b></label></p>\n");
      out.write("          <div class=\"w3-light-grey w3-round-xlarge w3-small\">\n");
      out.write("            <div class=\"w3-container w3-center w3-round-xlarge w3-teal\" style=\"width:80%\">\n");
      out.write("              <div class=\"w3-center w3-text-white\">80%</div>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("          <p><lable><b>AAP</b></label></p>\n");
      out.write("          <div class=\"w3-light-grey w3-round-xlarge w3-small\">\n");
      out.write("            <div class=\"w3-container w3-center w3-round-xlarge w3-teal\" style=\"width:75%\">75%</div>\n");
      out.write("          </div>\n");
      out.write("          <p><lable><b>JANTADAL</b></label</p>\n");
      out.write("          <div class=\"w3-light-grey w3-round-xlarge w3-small\">\n");
      out.write("            <div class=\"w3-container w3-center w3-round-xlarge w3-teal\" style=\"width:50%\">50%</div>\n");
      out.write("          </div>\n");
      out.write("          <p><lable><b>NOTA</b></label</p>\n");
      out.write("          <div class=\"w3-light-grey w3-round-xlarge w3-small\">\n");
      out.write("            <div class=\"w3-container w3-center w3-round-xlarge w3-teal\" style=\"width:50%\">50%</div>\n");
      out.write("          </div>\n");
      out.write("          <br>\n");
      out.write("\n");
      out.write("          \n");
      out.write("          <br>\n");
      out.write("        </div>\n");
      out.write("      </div><br>\n");
      out.write("\n");
      out.write("    <!-- End Left Column -->\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("    </html>");
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
