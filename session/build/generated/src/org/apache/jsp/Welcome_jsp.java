package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import ma.projet.classes.Client;

public final class Welcome_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

 Client c;
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <title>Bienvenue</title>\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap/dist/css/bootstrap.min.css\">\n");
      out.write("    <style>\n");
      out.write("        body {\n");
      out.write("            background-color: #f8f9fa;\n");
      out.write("            font-family: 'Arial', sans-serif;\n");
      out.write("            margin: 0;\n");
      out.write("            padding: 0;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .navbar {\n");
      out.write("            background-color: #343a40;\n");
      out.write("            color: #ffffff;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .navbar-brand {\n");
      out.write("            font-size: 24px;\n");
      out.write("            font-weight: bold;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .logout-button {\n");
      out.write("            margin-left: auto;\n");
      out.write("            color: #ffffff;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .welcome-container {\n");
      out.write("            text-align: center;\n");
      out.write("            background-color: #ffffff;\n");
      out.write("            border-radius: 10px;\n");
      out.write("            box-shadow: 0px 5px 10px rgba(0, 0, 0, 0.1);\n");
      out.write("            max-width: 400px;\n");
      out.write("            margin: 50px auto;\n");
      out.write("            padding: 20px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .welcome-text {\n");
      out.write("            font-size: 36px;\n");
      out.write("            color: #343a40;\n");
      out.write("            font-weight: bold;\n");
      out.write("            margin-bottom: 20px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .name-text {\n");
      out.write("            font-size: 24px;\n");
      out.write("            color: #666;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    ");
      out.write("\n");
      out.write("    ");

        if (session == null) {
            response.sendRedirect("Login.jsp");
        } else {
            c = (Client) session.getAttribute("user");
        }
    
      out.write("\n");
      out.write("    <nav class=\"navbar navbar-expand-lg\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <a class=\"navbar-brand\" href=\"#\">Welcome Page</a>\n");
      out.write("            <a class=\"logout-button\" href=\"Logout.jsp\">Déconnexion</a>\n");
      out.write("        </div>\n");
      out.write("    </nav>\n");
      out.write("    <div class=\"welcome-container\">\n");
      out.write("        <h1 class=\"welcome-text\">Bienvenue</h1>\n");
      out.write("        <p class=\"name-text\">");
      out.print( c.getNom() );
      out.write("</p>\n");
      out.write("    </div>\n");
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
