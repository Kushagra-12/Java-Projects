package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class CheckVoter_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <head>\n");
      out.write("        <style>\n");
      out.write("            form {\n");
      out.write("    border: 3px solid #f1f1f1;\n");
      out.write("    width:80%;\n");
      out.write("    margin-left: 10px;\n");
      out.write("}\n");
      out.write("input[type=text], input[type=password] {\n");
      out.write("\n");
      out.write("    width: 100%;\n");
      out.write("    padding: 12px 20px;\n");
      out.write("    margin: 8px 0px;\n");
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
      out.write("    margin:8px 0px;\n");
      out.write("   border: none;\n");
      out.write("    cursor: pointer;\n");
      out.write("    width: 50%;\n");
      out.write("}\n");
      out.write("            .imgcontainer {\n");
      out.write("    text-align: center;\n");
      out.write("    margin: 24px 0 12px 0;\n");
      out.write("}\n");
      out.write("\n");
      out.write("img.avatar {\n");
      out.write("    width: 80%;\n");
      out.write("    border-radius: 0%;\n");
      out.write("}\n");
      out.write("img.avatar2\n");
      out.write("{\n");
      out.write("    width: 20%;\n");
      out.write("    border-radius: 50%;\n");
      out.write("        \n");
      out.write("}\n");
      out.write("\n");
      out.write(".container {\n");
      out.write("    padding: 16px;\n");
      out.write("}\n");
      out.write("button {\n");
      out.write("    background-color: #000000;\n");
      out.write("    color: white;\n");
      out.write("    padding: 14px 20px;\n");
      out.write("    margin: 8px 50px;\n");
      out.write("    border: none;\n");
      out.write("    cursor: pointer;\n");
      out.write("    width: 80%;\n");
      out.write("}\n");
      out.write("\n");
      out.write("                \n");
      out.write("            \n");
      out.write("            </style>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>GET DETAILS</title>\n");
      out.write("    </head>\n");
      out.write("    <h1><label><b>CHECK DETAILS HERE</b></label></h1>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        ");
 if(session!=null)
           {
            if(session.getAttribute("oname")!=null)
            {
            String name =(String)session.getAttribute("oname");
            }
            else
             {
             response.sendRedirect("CheckVoter.jsp");
             }
           }
        
      out.write("\n");
      out.write("        \n");
      out.write("        <form action=\"FetchVoter\" method=\"POST\">\n");
      out.write("             <div class=\"imgcontainer\">\n");
      out.write("    <img src=\"book.jpg\" alt=\"Avatar\" class=\"avatar\">\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("  </div >\n");
      out.write(" \n");
      out.write("            <label><b>Enter Voter's Identification Number</b></label> \n");
      out.write("            <input type=\"text\" name=\"vid\" value=\"\" /><br/> \n");
      out.write("           \n");
      out.write("  \n");
      out.write("            <button type=\"submit\" value=\"Check\"/>CHECK</button>\n");
      out.write("         <div class=\"imgcontainer\">\n");
      out.write("         <img src=\"hand.png\" alt=\"Avatar\" class=\"avatar2\">\n");
      out.write("        \n");
      out.write("    <img src=\"lock.png\" alt=\"Avatar\" class=\"avatar2\">\n");
      out.write("    <img src=\"box.png\" alt=\"Avatar\" class=\"avatar2\">\n");
      out.write("         </div></form>\n");
      out.write("        \n");
      out.write("        <form action=\"OperatorES\">\n");
      out.write("            \n");
      out.write("         <input type=\"submit\" value=\"logout\" />   \n");
      out.write("        </form>    \n");
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
