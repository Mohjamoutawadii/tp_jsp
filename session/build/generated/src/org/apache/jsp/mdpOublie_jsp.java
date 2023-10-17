package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class mdpOublie_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <title>Page d'Activation</title>\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap/dist/css/bootstrap.min.css\">\n");
      out.write("    <style>\n");
      out.write("        body {\n");
      out.write("            background: linear-gradient(-135deg, #c850c0, #4158d0);\n");
      out.write("            font-family: Arial, sans-serif;\n");
      out.write("            margin: 0;\n");
      out.write("            padding: 0;\n");
      out.write("            display: flex;\n");
      out.write("            align-items: center;\n");
      out.write("            justify-content: center;\n");
      out.write("            min-height: 100vh;\n");
      out.write("            \n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .container {\n");
      out.write("            text-align: center;\n");
      out.write("            background-color: #ffffff;\n");
      out.write("            border-radius: 10px;\n");
      out.write("            box-shadow: 0px 5px 10px rgba(0, 0, 0, 0.1);\n");
      out.write("            max-width: 600px;\n");
      out.write("            padding: 40px; /* Increased padding value */\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .title {\n");
      out.write("            font-size: 35px;\n");
      out.write("            font-weight: 600;\n");
      out.write("            color: #fff;\n");
      out.write("            background: linear-gradient(-135deg, #c850c0, #4158d0);\n");
      out.write("            border-radius: 10px 10px 0 0;\n");
      out.write("            padding: 20px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .mb-3 {\n");
      out.write("            margin-bottom: 20px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .label {\n");
      out.write("            font-size: 17px;\n");
      out.write("            font-weight: 400;\n");
      out.write("            color: #999999;\n");
      out.write("            transition: all 0.3s ease;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .input {\n");
      out.write("            height: 50px;\n");
      out.write("            width: 100%;\n");
      out.write("            outline: none;\n");
      out.write("            font-size: 17px;\n");
      out.write("            padding-left: 20px;\n");
      out.write("            border: 1px solid lightgrey;\n");
      out.write("            border-radius: 25px;\n");
      out.write("            transition: all 0.3s ease;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .input:focus,\n");
      out.write("        .input:valid {\n");
      out.write("            border-color: #4158d0;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .input:focus ~ .label,\n");
      out.write("        .input:valid ~ .label {\n");
      out.write("            font-size: 16px;\n");
      out.write("            color: #4158d0;\n");
      out.write("            background: #fff;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .custom-message {\n");
      out.write("            color: #ff0000; /* Red text color for messages */\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .field {\n");
      out.write("            background: linear-gradient(-135deg, #c850c0, #4158d0);\n");
      out.write("            color: #fff;\n");
      out.write("            border: none;\n");
      out.write("            font-size: 20px;\n");
      out.write("            font-weight: 500;\n");
      out.write("            padding: 15px 0;\n");
      out.write("            margin-top: 20px;\n");
      out.write("            border-radius: 0 0 10px 10px;\n");
      out.write("            cursor: pointer;\n");
      out.write("            transition: all 0.3s ease;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .field:hover {\n");
      out.write("            background: linear-gradient(-135deg, #4158d0, #c850c0);\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <h1 class=\"title\">Page d'Activation</h1>\n");
      out.write("        <form action=\"mdpOublie\" method=\"POST\">\n");
      out.write("            <div class=\"mb-3\">\n");
      out.write("                <label for=\"email\" class=\"label\">Email</label>\n");
      out.write("                <input type=\"email\" class=\"input\" id=\"email\" name=\"email\" required>\n");
      out.write("            </div>\n");
      out.write("            <p class=\"custom-message\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${msg}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\n");
      out.write("            <button type=\"submit\" class=\"field\">Envoyer le Code d'Activation</button>\n");
      out.write("        </form>\n");
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
