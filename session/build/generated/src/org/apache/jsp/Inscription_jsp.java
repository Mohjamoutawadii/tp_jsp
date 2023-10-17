package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Inscription_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <title>Inscription</title>\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css?family=Poppins:400,500,600,700&display=swap\">\n");
      out.write("\n");
      out.write("    <style>\n");
      out.write("        @import url('https://fonts.googleapis.com/css?family=Poppins:400,500,600,700&display=swap');\n");
      out.write("\n");
      out.write("        * {\n");
      out.write("            margin: 0;\n");
      out.write("            padding: 0;\n");
      out.write("            box-sizing: border-box;\n");
      out.write("            font-family: 'Poppins', sans-serif;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        html,\n");
      out.write("        body {\n");
      out.write("            display: grid;\n");
      out.write("            height: 100%;\n");
      out.write("            width: 100%;\n");
      out.write("            place-items: center;\n");
      out.write("            background: linear-gradient(-135deg, #c850c0, #4158d0);\n");
      out.write("\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        ::selection {\n");
      out.write("            background: #4158d0;\n");
      out.write("            color: #fff;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .wrapper {\n");
      out.write("            width: 380px;\n");
      out.write("            background: #fff;\n");
      out.write("            border-radius: 15px;\n");
      out.write("            box-shadow: 0px 15px 20px rgba(0, 0, 0, 0.1);\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .wrapper .title {\n");
      out.write("            font-size: 35px;\n");
      out.write("            font-weight: 600;\n");
      out.write("            text-align: center;\n");
      out.write("            line-height: 100px;\n");
      out.write("            color: #fff;\n");
      out.write("            user-select: none;\n");
      out.write("            border-radius: 15px 15px 0 0;\n");
      out.write("            background: linear-gradient(-135deg, #c850c0, #4158d0);\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .wrapper form {\n");
      out.write("            padding: 10px 30px 50px 30px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .wrapper form .field {\n");
      out.write("            height: 50px;\n");
      out.write("            width: 100%;\n");
      out.write("            margin-top: 20px;\n");
      out.write("            position: relative;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .wrapper form .field input {\n");
      out.write("            height: 100%;\n");
      out.write("            width: 100%;\n");
      out.write("            outline: none;\n");
      out.write("            font-size: 17px;\n");
      out.write("            padding-left: 20px;\n");
      out.write("            border: 1px solid lightgrey;\n");
      out.write("            border-radius: 25px;\n");
      out.write("            transition: all 0.3s ease;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .wrapper form .field input:focus,\n");
      out.write("        .wrapper form .field input:valid {\n");
      out.write("            border-color: #4158d0;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .wrapper form .field label {\n");
      out.write("            position: absolute;\n");
      out.write("            top: 50%;\n");
      out.write("            left: 20px;\n");
      out.write("            color: #999999;\n");
      out.write("            font-weight: 400;\n");
      out.write("            font-size: 17px;\n");
      out.write("            pointer-events: none;\n");
      out.write("            transform: translateY(-50%);\n");
      out.write("            transition: all 0.3s ease;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .wrapper form .field input:focus ~ label,\n");
      out.write("        .wrapper form .field input:valid ~ label,\n");
      out.write("        .wrapper form .field input:placeholder-shown ~ label {\n");
      out.write("            top: 0%;\n");
      out.write("            font-size: 16px;\n");
      out.write("            color: #4158d0;\n");
      out.write("            background: #fff;\n");
      out.write("            transform: translateY(-50%);\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .wrapper form .content {\n");
      out.write("            display: flex;\n");
      out.write("            width: 100%;\n");
      out.write("            height: 50px;\n");
      out.write("            font-size: 16px;\n");
      out.write("            align-items: center;\n");
      out.write("            justify-content: space-around;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .wrapper form .content .checkbox {\n");
      out.write("            display: flex;\n");
      out.write("            align-items: center;\n");
      out.write("            justify-content: center;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .wrapper form .content input {\n");
      out.write("            width: 15px;\n");
      out.write("            height: 15px;\n");
      out.write("            background: red;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .wrapper form .content label {\n");
      out.write("            color: #262626;\n");
      out.write("            user-select: none;\n");
      out.write("            padding-left: 5px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .wrapper form .content .pass-link {\n");
      out.write("            color: \"\";\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .wrapper form .field input[type=\"submit\"] {\n");
      out.write("            color: #fff;\n");
      out.write("            border: none;\n");
      out.write("            padding-left: 0;\n");
      out.write("            margin-top: -10px;\n");
      out.write("            font-size: 20px;\n");
      out.write("            font-weight: 500;\n");
      out.write("            cursor: pointer;\n");
      out.write("            background: linear-gradient(-135deg, #c850c0, #4158d0);\n");
      out.write("            transition: all 0.3s ease;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .wrapper form .field input[type=\"submit\"]:active {\n");
      out.write("            transform: scale(0.95);\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("    <div class=\"wrapper\">\n");
      out.write("        <div class=\"title\">Inscription</div>\n");
      out.write("        <form action=\"Inscription\" method=\"post\">\n");
      out.write("            <div class=\"field\">\n");
      out.write("                <input type=\"text\" id=\"nom\" name=\"nom\" required>\n");
      out.write("                <label for=\"nom\">Nom :</label>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"field\">\n");
      out.write("                <input type=\"text\" id=\"prenom\" name=\"prenom\" required>\n");
      out.write("                <label for=\"prenom\">Prénom :</label>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"field\">\n");
      out.write("                <input type=\"email\" id=\"email\" name=\"email\" required>\n");
      out.write("                <label for=\"email\">Email :</label>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"field\">\n");
      out.write("                <input type=\"password\" id=\"motdepasse\" name=\"motdepasse\" required>\n");
      out.write("                <label for=\"motdepasse\">Mot de passe :</label>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"field\">\n");
      out.write("                <input type=\"date\" name=\"date\" value=\"\">\n");
      out.write("                <label for=\"date\">Date :</label>\n");
      out.write("            </div>\n");
      out.write("            <input type=\"submit\" value=\"Valider\" class=\"field\">\n");
      out.write("        </form>\n");
      out.write("    </div>\n");
      out.write("</body>\n");
      out.write("\n");
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
