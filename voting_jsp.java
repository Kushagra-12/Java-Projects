package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class voting_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Vote Here</title>\n");
      out.write("        <style>\n");
      out.write("           .imgcontainer {\n");
      out.write("    text-align: center;\n");
      out.write("    margin: 24px 0 12px 0;\n");
      out.write("}\n");
      out.write("\n");
      out.write("img.avatar {\n");
      out.write("    width: 20%;\n");
      out.write("    border-radius: 0%;\n");
      out.write("    margin-left: 10px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("            button {\n");
      out.write("    align-content:center;\n");
      out.write("    background-color: #000000;\n");
      out.write("    color: white;\n");
      out.write("    padding: 14px 20px;\n");
      out.write("    margin: 8px 220px;\n");
      out.write("    border: none;\n");
      out.write("    cursor: pointer;\n");
      out.write("    width: 50%;\n");
      out.write("}\n");
      out.write("form {\n");
      out.write("    \n");
      out.write("     border: 3px solid #000000;\n");
      out.write("    width: min-content;\n");
      out.write("    background-color: #d1e0e0;\n");
      out.write("    margin-left: 350px;\n");
      out.write("    padding: auto;\n");
      out.write("    backface-visibility: visible;\n");
      out.write("    \n");
      out.write("}\n");
      out.write(".container {\n");
      out.write("    padding: 16px;\n");
      out.write("    \n");
      out.write("}\n");
      out.write("\n");
      out.write("</style>\n");
      out.write("    </head>\n");
      out.write("    <body >\n");
      out.write("        ");
 if(session!=null)
           {
            if(session.getAttribute("vid")!=null)
            {
            String name =(String)session.getAttribute("vid");
            }
            else
             {
             response.sendRedirect("Voter.jsp");
             }
           }
        
      out.write("\n");
      out.write("       \n");
      out.write("        <form action=\"Votin\" method=\"POST\">\n");
      out.write("            <h1><label><b>VOTE HERE</label></b></h1>\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <input type=\"radio\" name=\"name\" value=\"bjp\"  /><label><b>BHARTIYA JANTA PARTY</b></label></br>\n");
      out.write("                <div class=\"imgcontainer\">\n");
      out.write("    <img src=\"download.jpg\" alt=\"Avatar\" class=\"avatar\">\n");
      out.write("  </div>\n");
      out.write("\n");
      out.write("           \n");
      out.write("         <input type=\"radio\" name=\"name\" value=\"congress\" /><label><b>INDIAN NATIONAL CONGRESS</label></b> <br/>\n");
      out.write("        <div class=\"imgcontainer\">\n");
      out.write("    <img src=\"download2.png\" alt=\"Avatar\" class=\"avatar\">\n");
      out.write("  </div>\n");
      out.write("\n");
      out.write("          <input type=\"radio\" name=\"name\" value=\"aap\"  /><label><b>AAM AADMI PARTY</label></b> <br/>\n");
      out.write("        <div class=\"imgcontainer\">\n");
      out.write("    <img src=\"download 2.jpg\" alt=\"Avatar\" class=\"avatar\">\n");
      out.write("  </div>\n");
      out.write("\n");
      out.write("          <input type=\"radio\" name=\"name\" value=\"jantadal\" /><label><b>JANTADAL </label></b><br/>\n");
      out.write("        <div class=\"imgcontainer\">\n");
      out.write("    <img src=\"download3.png\" alt=\"Avatar\" class=\"avatar\">\n");
      out.write("  </div>\n");
      out.write("\n");
      out.write("          <input type=\"radio\" name=\"name\" value=\"nota\" /><label><b>NONE OF THE ABOVE(NOTA</label></b>)<br/>\n");
      out.write("        <div class=\"imgcontainer\">\n");
      out.write("    <img src=\"nota.png\" alt=\"Avatar\" class=\"avatar\">\n");
      out.write("  </div>\n");
      out.write("        \n");
      out.write("          <button type=\"submit\" value=\"Vote\"  />VOTE HERE</button>\n");
      out.write("         <button type=\"button\" class=\"button\" > <a href=\"poll pagefake.jsp\">RESULTS</a></button>\n");
      out.write("          </div>\n");
      out.write("        </form> \n");
      out.write("        \n");
      out.write("               </body>\n");
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
