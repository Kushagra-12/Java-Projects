package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("f \n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("  \n");
      out.write("  <title>evoting page</title>\n");
      out.write("  <meta charset=\"utf-8\">\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("  <link href=\"https://fonts.googleapis.com/css?family=Montserrat\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("  <link href=\"https://fonts.googleapis.com/css?family=Lato\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\n");
      out.write("  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("  <style>\n");
      out.write("  body {\n");
      out.write("      font: 400 15px Lato, sans-serif;\n");
      out.write("      line-height: 1.8;\n");
      out.write("      color: #818181;\n");
      out.write("  }\n");
      out.write("  h2 {\n");
      out.write("      font-size: 24px;\n");
      out.write("      text-transform: uppercase;\n");
      out.write("      color: #303030;\n");
      out.write("      font-weight: 600;\n");
      out.write("      margin-bottom: 30px;\n");
      out.write("  }\n");
      out.write("  h4 {\n");
      out.write("      font-size: 19px;\n");
      out.write("      line-height: 1.375em;\n");
      out.write("      color: #303030;\n");
      out.write("      font-weight: 400;\n");
      out.write("      margin-bottom: 30px;\n");
      out.write("  }  \n");
      out.write("  .jumbotron {\n");
      out.write("      background-color: #000000;\n");
      out.write("      color: #fff;\n");
      out.write("      padding: 100px 25px;\n");
      out.write("      font-family: Montserrat, sans-serif;\n");
      out.write("  }\n");
      out.write("  .container-fluid {\n");
      out.write("      padding: 60px 50px;\n");
      out.write("  }\n");
      out.write("  .bg-grey {\n");
      out.write("      background-color: #f6f6f6;\n");
      out.write("  }\n");
      out.write("  .logo-small {\n");
      out.write("      color: #f4511e;\n");
      out.write("      font-size: 50px;\n");
      out.write("  }\n");
      out.write("  .logo {\n");
      out.write("      color: #f4511e;\n");
      out.write("      font-size: 200px;\n");
      out.write("  }\n");
      out.write("  .thumbnail {\n");
      out.write("      padding: 0 0 15px 0;\n");
      out.write("      border: none;\n");
      out.write("      border-radius: 0;\n");
      out.write("  }\n");
      out.write("  .thumbnail img {\n");
      out.write("      width: 100%;\n");
      out.write("      height: 100%;\n");
      out.write("      margin-bottom: 10px;\n");
      out.write("  }\n");
      out.write("  .carousel-control.right, .carousel-control.left {\n");
      out.write("      background-image: none;\n");
      out.write("      color: #f4511e;\n");
      out.write("  }\n");
      out.write("  .carousel-indicators li {\n");
      out.write("      border-color: #f4511e;\n");
      out.write("  }\n");
      out.write("  .carousel-indicators li.active {\n");
      out.write("      background-color: #f4511e;\n");
      out.write("  }\n");
      out.write("  .item h4 {\n");
      out.write("      font-size: 19px;\n");
      out.write("      line-height: 1.375em;\n");
      out.write("      font-weight: 400;\n");
      out.write("      font-style: italic;\n");
      out.write("      margin: 70px 0;\n");
      out.write("  }\n");
      out.write("  .item span {\n");
      out.write("      font-style: normal;\n");
      out.write("  }\n");
      out.write("  .panel {\n");
      out.write("      border: 1px solid #000000; \n");
      out.write("      border-radius:0 !important;\n");
      out.write("      transition: box-shadow 0.5s;\n");
      out.write("  }\n");
      out.write("  .panel:hover {\n");
      out.write("      box-shadow: 5px 0px 40px rgba(0,0,0, .2);\n");
      out.write("  }\n");
      out.write("  .panel-footer .btn:hover {\n");
      out.write("      border: 1px solid #f4511e;\n");
      out.write("      background-color: #fff !important;\n");
      out.write("      color: #f45lle;\n");
      out.write("  }\n");
      out.write("  .panel-heading {\n");
      out.write("      color: #fff !important;\n");
      out.write("      background-color: #000000 !important;\n");
      out.write("      padding: 25px;\n");
      out.write("      border-bottom: 1px solid transparent;\n");
      out.write("      border-top-left-radius: 0px;\n");
      out.write("      border-top-right-radius: 0px;\n");
      out.write("      border-bottom-left-radius: 0px;\n");
      out.write("      border-bottom-right-radius: 0px;\n");
      out.write("  }\n");
      out.write("  .panel-footer {\n");
      out.write("      background-color: white !important;\n");
      out.write("  }\n");
      out.write("  .panel-footer h3 {\n");
      out.write("      font-size: 32px;\n");
      out.write("  }\n");
      out.write("  .panel-footer h4 {\n");
      out.write("      color: #aaa;\n");
      out.write("      font-size: 14px;\n");
      out.write("  }\n");
      out.write("  .panel-footer .btn {\n");
      out.write("      margin: 15px 0;\n");
      out.write("      background-color: #f4511e;\n");
      out.write("      color: #fff;\n");
      out.write("  }\n");
      out.write("  .navbar {\n");
      out.write("      margin-bottom: 0;\n");
      out.write("      background-color: #000000;\n");
      out.write("      z-index: 9999;\n");
      out.write("      border: 0;\n");
      out.write("      font-size: 12px !important;\n");
      out.write("      line-height: 1.42857143 !important;\n");
      out.write("      letter-spacing: 4px;\n");
      out.write("      border-radius: 0;\n");
      out.write("      font-family: Montserrat, sans-serif;\n");
      out.write("  }\n");
      out.write("  .navbar li a, .navbar .navbar-brand {\n");
      out.write("      color: #fff !important;\n");
      out.write("  }\n");
      out.write("  .navbar-nav li a:hover, .navbar-nav li.active a {\n");
      out.write("      color: #f4511e !important;\n");
      out.write("      background-color: #fff !important;\n");
      out.write("  }\n");
      out.write("  .navbar-default .navbar-toggle {\n");
      out.write("      border-color: transparent;\n");
      out.write("      color: #fff !important;\n");
      out.write("  }\n");
      out.write("  footer .glyphicon {\n");
      out.write("      font-size: 20px;\n");
      out.write("      margin-bottom: 20px;\n");
      out.write("      color: #f4511e;\n");
      out.write("  }\n");
      out.write("  .slideanim {visibility:hidden;}\n");
      out.write("  .slide {\n");
      out.write("      animation-name: slide;\n");
      out.write("      -webkit-animation-name: slide;\n");
      out.write("      animation-duration: 1s;\n");
      out.write("      -webkit-animation-duration: 1s;\n");
      out.write("      visibility: visible;\n");
      out.write("  }\n");
      out.write("  @keyframes slide {\n");
      out.write("    0% {\n");
      out.write("      opacity: 0;\n");
      out.write("      transform: translateY(70%);\n");
      out.write("    } \n");
      out.write("    100% {\n");
      out.write("      opacity: 1;\n");
      out.write("      transform: translateY(0%);\n");
      out.write("    }\n");
      out.write("  }\n");
      out.write("  @-webkit-keyframes slide {\n");
      out.write("    0% {\n");
      out.write("      opacity: 0;\n");
      out.write("      -webkit-transform: translateY(70%);\n");
      out.write("    } \n");
      out.write("    100% {\n");
      out.write("      opacity: 1;\n");
      out.write("      -webkit-transform: translateY(0%);\n");
      out.write("    }\n");
      out.write("  }\n");
      out.write("  @media screen and (max-width: 768px) {\n");
      out.write("    .col-sm-4 {\n");
      out.write("      text-align: center;\n");
      out.write("      margin: 25px 0;\n");
      out.write("    }\n");
      out.write("    .btn-lg {\n");
      out.write("        width: 100%;\n");
      out.write("        margin-bottom: 35px;\n");
      out.write("    }\n");
      out.write("  }\n");
      out.write("  @media screen and (max-width: 480px) {\n");
      out.write("    .logo {\n");
      out.write("        font-size: 150px;\n");
      out.write("    }\n");
      out.write("  }\n");
      out.write("  </style>\n");
      out.write("   <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>HOME</title>\n");
      out.write("        <style>\n");
      out.write("            body{\n");
      out.write("                margin: 0px;\n");
      out.write("                font-family: Arial;\n");
      out.write("            }\n");
      out.write("            .heading{\n");
      out.write("                background-color: #d1e0e0;\n");
      out.write("                height: 8vh;\n");
      out.write("                width: 100vw;\n");
      out.write("                border-top: 2px solid #2c3e50;\n");
      out.write("                border-bottom: 2px solid #2c3e50;\n");
      out.write("            }\n");
      out.write("            .title{\n");
      out.write("                color: white;\n");
      out.write("                margin: auto;\n");
      out.write("                text-align: center;\n");
      out.write("              \n");
      out.write("                \n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            .showbox{\n");
      out.write("                width: 50vw;\n");
      out.write("                height: 85vh;\n");
      out.write("                background-color: #95a5a6;\n");
      out.write("                display: flex;\n");
      out.write("                margin:auto;\n");
      out.write("                margin-top: 20px;\n");
      out.write("                box-shadow: 2px 2px 2px 2px #34495e;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            .wrapper{\n");
      out.write("                display: flex;\n");
      out.write("                margin: 200px;\n");
      out.write("               \n");
      out.write("            }\n");
      out.write("            .title2{\n");
      out.write("                text-align: center;\n");
      out.write("                color: #34495e;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            .btn {\n");
      out.write("    background-color: #000000;\n");
      out.write("     background-position: center;\n");
      out.write("     align-content: center;\n");
      out.write("     align-self: center;\n");
      out.write("    color: white;\n");
      out.write("    padding: 14px 20px;\n");
      out.write("    margin: 20px 320px ;\n");
      out.write("    border: none;\n");
      out.write("    cursor: pointer;\n");
      out.write("    width:  50%;\n");
      out.write("}\n");
      out.write("img.avatar {\n");
      out.write("    width: 50%;\n");
      out.write("    border-radius: 50%;\n");
      out.write("}\n");
      out.write(".imgcontainer {\n");
      out.write("    text-align: center;\n");
      out.write("    margin: 24px 0 12px 0;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".btn:hover {\n");
      out.write("    opacity: 0.8;\n");
      out.write("    \n");
      out.write("    \n");
      out.write("}\n");
      out.write(".background-image\n");
      out.write("{\n");
      out.write("    color: #000000;\n");
      out.write("    margin:8px 0;\n");
      out.write("    width: 100%;\n");
      out.write("    height: 400px;\n");
      out.write("    \n");
      out.write("}\n");
      out.write("        \n");
      out.write("    \n");
      out.write("        </style>            \n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    \n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<body id=\"myPage\" data-spy=\"scroll\" data-target=\".navbar\" data-offset=\"60\">\n");
      out.write("\n");
      out.write("<nav class=\"navbar navbar-default navbar-fixed-top\">\n");
      out.write("  <div class=\"container\">\n");
      out.write("    <div class=\"navbar-header\">\n");
      out.write("      <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\"#myNavbar\">\n");
      out.write("        <span class=\"icon-bar\"></span>\n");
      out.write("        <span class=\"icon-bar\"></span>\n");
      out.write("        <span class=\"icon-bar\"></span>                        \n");
      out.write("      </button>\n");
      out.write("      <a class=\"navbar-brand\" href=\"#myPage\">ONLINE-VOTING</a>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"collapse navbar-collapse\" id=\"myNavbar\">\n");
      out.write("      <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("        \n");
      out.write("        <li><a href=\"#services\">SERVICES</a></li>\n");
      out.write("        \n");
      out.write("        <li><a href=\"#pricing\">FAQ'S</a></li>\n");
      out.write("        <li><a href=\"#contact\">CONTACT</a></li>\n");
      out.write("      </ul>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</nav>\n");
      out.write("\n");
      out.write("<div class=\"jumbotron text-center\">\n");
      out.write("  <h1>E-VOTING</h1> \n");
      out.write("  <p></p> \n");
      out.write("  <form>\n");
      out.write("   \n");
      out.write("  </form>\n");
      out.write("</div>\n");
      out.write("      <h1 class=\"title2\">Login As</h1>\n");
      out.write("            \n");
      out.write("               \n");
      out.write("                <form action=\"Voter\" method=\"POST\">\n");
      out.write("                    <a href=\"Voter.jsp\" class=\"btn voter\">Voter</a><br>\n");
      out.write("                \n");
      out.write("                </form>\n");
      out.write("                 <form action=\"Operator\" method=\"POST\" >\n");
      out.write("                    <a href=\"operator.jsp\" class=\"btn operator\">Operator</a><br>\n");
      out.write("                </form>\n");
      out.write("                \n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("\n");
      out.write("<!-- Container (About Section) -->\n");
      out.write("<div id=\"about\" class=\"container-fluid\">\n");
      out.write("  <div class=\"row\">\n");
      out.write("    <div class=\"col-sm-8\">\n");
      out.write("      <h2>we power democracy!!</h2><br>\n");
      out.write("      <h4><b>Online Voting enables voters to cast their vote privately and easily from any location and on any device with Internet access (PC, tablet, smartphone, etc.), ensuring maximum election engagement by enabling remote and disabled voters to participate on equal terms.Our team of electoral experts have years of accumulated knowledge and are attuned to the singular needs that each election requires..</b></h4><br>\n");
      out.write("      <p><b>We strive on understanding the needs of electoral organizations to provide efficient and transparent elections and the rights of citizens to vote on equal terms.</b></p>\n");
      out.write("      <p><b>Our technology provides the perfect balance between efficiency and the highest level of security and transparency standards currently available.</b></p>\n");
      out.write("     \n");
      out.write("      <br>\n");
      out.write("      \n");
      out.write("    </div>\n");
      out.write("    <div class=\"col-sm-4\">\n");
      out.write("      <span class=\"glyphicon glyphicon-signal logo\"></span>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div class=\"container-fluid bg-grey\">\n");
      out.write("  <div class=\"row\">\n");
      out.write("    <div class=\"col-sm-4\">\n");
      out.write("      <span class=\"glyphicon glyphicon-globe  logo slideanim\"></span>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"col-sm-8\">\n");
      out.write("      <h2>Our Values</h2><br>\n");
      out.write("      <h4><strong>MISSION:</strong> PROVIDING THE\n");
      out.write("RIGHT ELECTION\n");
      out.write("SOLUTION\n");
      out.write("AT THE RIGHT TIME\n");
      out.write("FOR EVERY ELECTION.</h4><br>\n");
      out.write("      <p><strong>VISION:</strong> \n");
      out.write("In a time of voter apathy, it is still possible for political parties to better engage and provide practical voting access to their party members, and as a result, help increase election turnout and voter???s accessibility, all while providing a more efficient and secure election process.\n");
      out.write("On-site elections can be costly, and as party members are geographically dispersed, full election participation is difficult to achieve. As you begin planning for your next party election keep in mind the key advantages that Online Voting can provide: help your party achieve cost-effectiveness, increase voter turnouts and an overall more transparent election process</p>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<!-- Container (Services Section) -->\n");
      out.write("<div id=\"services\" class=\"container-fluid text-center\">\n");
      out.write("  <h2>SERVICES</h2>\n");
      out.write("  <h4>what we offer!</h4>\n");
      out.write("  <br>\n");
      out.write("  <div class=\"row slideanim\">\n");
      out.write("    <div class=\"col-sm-4\">\n");
      out.write("        <span class=\" glyphicon glyphicon-tasks  logo-small\"></span>\n");
      out.write("      <h4>POLL results</h4>\n");
      out.write("      <p>Best polling solutions!</p>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"col-sm-4\">\n");
      out.write("      <span class=\"glyphicon glyphicon-cloud-upload logo-small\"></span>\n");
      out.write("      <h4>CENTRAL DATABASE</h4>\n");
      out.write("      <p>centrally stored data..</p>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"col-sm-4\">\n");
      out.write("      <span class=\"glyphicon glyphicon-th-list logo-small\"></span>\n");
      out.write("      <h4>PRESERVING DEMOCRACY</h4>\n");
      out.write("      <p>Eliminating false votes </p>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("  <br><br>\n");
      out.write("  <div class=\"row slideanim\">\n");
      out.write("    <div class=\"col-sm-4\">\n");
      out.write("      <span class=\"glyphicon glyphicon-leaf logo-small\"></span>\n");
      out.write("      <h4>ENVIRONMENT FRIENDLY</h4>\n");
      out.write("      <p>saving paper work.</p>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"col-sm-4\">\n");
      out.write("      <span class=\"glyphicon glyphicon-certificate logo-small\"></span>\n");
      out.write("      <h4>CERTIFIED</h4>\n");
      out.write("      <p>website with authanticated certifications..</p>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"col-sm-4\">\n");
      out.write("      <span class=\"glyphicon glyphicon-wrench logo-small\"></span>\n");
      out.write("      <h4 style=\"color:#303030;\">HARD WORK</h4>\n");
      out.write("      <p>we put our best to provide best service..</p>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<\n");
      out.write("  <h2></h2>\n");
      out.write("  <div id=\"myCarousel\" class=\"carousel slide text-center\" data-ride=\"carousel\">\n");
      out.write("    <!-- Indicators -->\n");
      out.write("    <ol class=\"carousel-indicators\">\n");
      out.write("      <li data-target=\"#myCarousel\" data-slide-to=\"0\" class=\"active\"></li>\n");
      out.write("      <li data-target=\"#myCarousel\" data-slide-to=\"1\"></li>\n");
      out.write("      <li data-target=\"#myCarousel\" data-slide-to=\"2\"></li>\n");
      out.write("    </ol>\n");
      out.write("\n");
      out.write("    <!-- Wrapper for slides -->\n");
      out.write("    <div class=\"carousel-inner\" role=\"listbox\">\n");
      out.write("      <div class=\"item active\">\n");
      out.write("        <h4>\"Voting is the most precious right of every citizen, and we have a moral obligation to ensure the integrity of our voting process. !\"<br><span>Hillary Clinton, Comment Box</span></h4>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"item\">\n");
      out.write("        <h4>\"The difference between a democracy and a dictatorship is that in a democracy you vote first and take orders later;in a dictatorship you don't have to waste your time voting!\"<br><span>Charles Bukowski</span></h4>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"item\">\n");
      out.write("        <h4>\"Could I... BE any more happy with this website?\"<br><span>Chandler Bing, Actor, FriendsAlot</span></h4>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <!-- Left and right controls -->\n");
      out.write("    <a class=\"left carousel-control\" href=\"#myCarousel\" role=\"button\" data-slide=\"prev\">\n");
      out.write("      <span class=\"glyphicon glyphicon-chevron-left\" aria-hidden=\"true\"></span>\n");
      out.write("      <span class=\"sr-only\">Previous</span>\n");
      out.write("    </a>\n");
      out.write("    <a class=\"right carousel-control\" href=\"#myCarousel\" role=\"button\" data-slide=\"next\">\n");
      out.write("      <span class=\"glyphicon glyphicon-chevron-right\" aria-hidden=\"true\"></span>\n");
      out.write("      <span class=\"sr-only\">Next</span>\n");
      out.write("    </a>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<!-- Container (Pricing Section) -->\n");
      out.write("<div id=\"pricing\" class=\"container-fluid\">\n");
      out.write("  <div class=\"text-center\">\n");
      out.write("    <h2>FAQ'S</h2>\n");
      out.write("    <h4>Detailed Information!</h4>\n");
      out.write("  </div>\n");
      out.write("  <div class=\"row slideanim\">\n");
      out.write("    <div class=\"col-sm-4 col-xs-12\">\n");
      out.write("      <div class=\"panel panel-default text-center\">\n");
      out.write("        <div class=\"panel-heading\">\n");
      out.write("          <h1>IS DATA VERIFIED?</h1>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"panel-body\">\n");
      out.write("            <image style=\"align-items: center\" src=\"voting-icon.png\" class=\"avatar\">\n");
      out.write("        </div>\n");
      out.write("        <div class=\"panel-footer\">\n");
      out.write("          <h3> VOTER VERIFICATION </h3>\n");
      out.write("          <h4>Online Voter Registration provides a secure, customizable, accurate and accessible voter registration interface that works seamlessly with existing voter lists and includes functionality such as authentication, removal of duplicate entries, and validation of registrants. It streamlines the administrative efforts of election staff through a robust platform that pulls, updates and stores all voter contact, address.</h4>\n");
      out.write("         \n");
      out.write("        </div>\n");
      out.write("      </div>      \n");
      out.write("    </div>     \n");
      out.write("    <div class=\"col-sm-4 col-xs-12\">\n");
      out.write("      <div class=\"panel panel-default text-center\">\n");
      out.write("        <div class=\"panel-heading\">\n");
      out.write("          <h1>IS IT SAFE?</h1>\n");
      out.write("        </div>\n");
      out.write("           <image style=\"align-items: center\" src=\"box-icon.png\" class=\"avatar\">\n");
      out.write("        \n");
      out.write("        <div class=\"panel-footer\">\n");
      out.write("          <h3>SECURITY ENSURED</h3>\n");
      out.write("          <h4>Online voting enables voter authentication via pre-existing or new voting authentication methods (digital certificates, password based credentials, etc.)<br> <br><br> Once authenticated, voter credentials are securely generated and delivered giving voters the means to verify that their vote has been cast-as-intended, recorded-as-cast and counted-as-recorded</h4>\n");
      out.write("          \n");
      out.write("        </div>\n");
      out.write("      </div>      \n");
      out.write("    </div>       \n");
      out.write("    <div class=\"col-sm-4 col-xs-12\">\n");
      out.write("      <div class=\"panel panel-default text-center\">\n");
      out.write("        <div class=\"panel-heading\">\n");
      out.write("          <h1>PERSONAL DATA </h1>\n");
      out.write("        </div>\n");
      out.write("       <image style=\"align-items: center\" src=\"register.png\" class=\"avatar\"> <br>\n");
      out.write("       <div class=\"panel-footer\">\n");
      out.write("          <h3>DATA REQUIRED<br>FOR REGISTRATION</h3>\n");
      out.write("          <h4><br><br> Date of birth<br>Address<br>name<br>Voter-id<br>City<br>State<br>Password<br>Gender<br> </h4>\n");
      out.write("          \n");
      out.write("        </div>\n");
      out.write("      </div>      \n");
      out.write("    </div>    \n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<!-- Container (Contact Section) -->\n");
      out.write("<div id=\"contact\" class=\"container-fluid bg-grey\">\n");
      out.write("  <h2 class=\"text-center\">CONTACT US</h2>\n");
      out.write("  <div class=\"row\">\n");
      out.write("    <div class=\"col-sm-5\">\n");
      out.write("      <p>Contact us and we'll get back to you within  hour.</p>\n");
      out.write("      <p><span class=\"glyphicon glyphicon-map-marker\"></span> Indore, INDIA</p>\n");
      out.write("      <p><span class=\"glyphicon glyphicon-phone\"></span> +00 1515151515</p>\n");
      out.write("      <p><span class=\"glyphicon glyphicon-envelope\"></span> evoting@gov.com</p>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"col-sm-7 slideanim\">\n");
      out.write("      <div class=\"row\">\n");
      out.write("        <div class=\"col-sm-6 form-group\">\n");
      out.write("          <input class=\"form-control\" id=\"name\" name=\"name\" placeholder=\"Name\" type=\"text\" required>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"col-sm-6 form-group\">\n");
      out.write("          <input class=\"form-control\" id=\"email\" name=\"email\" placeholder=\"Email\" type=\"email\" required>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("      <textarea class=\"form-control\" id=\"comments\" name=\"comments\" placeholder=\"Comment\" rows=\"5\"></textarea><br>\n");
      out.write("      <div class=\"row\">\n");
      out.write("        <div class=\"col-sm-12 form-group\">\n");
      out.write("          <button class=\"btn btn-default pull-right\" type=\"submit\">Send</button>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<!-- Add Google Maps -->\n");
      out.write("<div class=\"background-image\" style=\"height:400px;width:100%;\">\n");
      out.write("    <image class=\"background-image\" src=\"03header.png\">\n");
      out.write("    \n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("<footer class=\"container-fluid text-center\">\n");
      out.write("  <a href=\"#myPage\" title=\"To Top\">\n");
      out.write("    <span class=\"glyphicon glyphicon-chevron-up\"></span>\n");
      out.write("  </a>\n");
      out.write("  \n");
      out.write("</footer>\n");
      out.write("\n");
      out.write("<script>\n");
      out.write("$(document).ready(function(){\n");
      out.write("  // Add smooth scrolling to all links in navbar + footer link\n");
      out.write("  $(\".navbar a, footer a[href='#myPage']\").on('click', function(event) {\n");
      out.write("    // Make sure this.hash has a value before overriding default behavior\n");
      out.write("    if (this.hash !== \"\") {\n");
      out.write("      // Prevent default anchor click behavior\n");
      out.write("      event.preventDefault();\n");
      out.write("\n");
      out.write("      // Store hash\n");
      out.write("      var hash = this.hash;\n");
      out.write("\n");
      out.write("      // Using jQuery's animate() method to add smooth page scroll\n");
      out.write("      // The optional number (900) specifies the number of milliseconds it takes to scroll to the specified area\n");
      out.write("      $('html, body').animate({\n");
      out.write("        scrollTop: $(hash).offset().top\n");
      out.write("      }, 900, function(){\n");
      out.write("   \n");
      out.write("        // Add hash (#) to URL when done scrolling (default click behavior)\n");
      out.write("        window.location.hash = hash;\n");
      out.write("      });\n");
      out.write("    } // End if\n");
      out.write("  });\n");
      out.write("  \n");
      out.write("  $(window).scroll(function() {\n");
      out.write("    $(\".slideanim\").each(function(){\n");
      out.write("      var pos = $(this).offset().top;\n");
      out.write("\n");
      out.write("      var winTop = $(window).scrollTop();\n");
      out.write("        if (pos < winTop + 600) {\n");
      out.write("          $(this).addClass(\"slide\");\n");
      out.write("        }\n");
      out.write("    });\n");
      out.write("  });\n");
      out.write("})\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("</body>\n");
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
