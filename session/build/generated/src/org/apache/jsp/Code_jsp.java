package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Code_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <title>Code de Vérification</title>\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap/dist/css/bootstrap.min.css\">\n");
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
      out.write("        html, body {\n");
      out.write("            display: grid;\n");
      out.write("            height: 100%;\n");
      out.write("            width: 100%;\n");
      out.write("            place-items: center;\n");
      out.write("            background: linear-gradient(-135deg, #c850c0, #4158d0);\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        ::selection {\n");
      out.write("            background: #4158d0;\n");
      out.write("            color: #fff;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .container {\n");
      out.write("            width: 380px;\n");
      out.write("            background: #fff;\n");
      out.write("            border-radius: 15px;\n");
      out.write("            box-shadow: 0px 15px 20px rgba(0, 0, 0, 0.1);\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .container h2 {\n");
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
      out.write("        .container form {\n");
      out.write("            padding: 10px 30px 50px 30px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .container form .mb-3 {\n");
      out.write("            height: 50px;\n");
      out.write("            width: 100%;\n");
      out.write("            margin-top: 20px;\n");
      out.write("            position: relative;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .container form input {\n");
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
      out.write("        .container form input:focus,\n");
      out.write("        .container form input:valid {\n");
      out.write("            border-color: #4158d0;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .container form label {\n");
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
      out.write("        .container form input:focus ~ label,\n");
      out.write("        .container form input:valid ~ label,\n");
      out.write("        .container form input[type=\"text\"]:focus + label,\n");
      out.write("        .container form input[type=\"text\"]:not(:placeholder-shown) + label {\n");
      out.write("            top: 0%;\n");
      out.write("            font-size: 16px;\n");
      out.write("            color: #4158d0;\n");
      out.write("            background: #fff;\n");
      out.write("            transform: translateY(-50%);\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .container form .custom-message {\n");
      out.write("            color: #ff0000;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .container form .btn-primary {\n");
      out.write("            color: #fff;\n");
      out.write("            border: none;\n");
      out.write("            padding-left: 0;\n");
      out.write("            margin-top: 20px;\n");
      out.write("            font-size: 20px;\n");
      out.write("            font-weight: 500;\n");
      out.write("            cursor: pointer;\n");
      out.write("            background: linear-gradient(-135deg, #c850c0, #4158d0);\n");
      out.write("            width: 100%;\n");
      out.write("            border-radius: 0;\n");
      out.write("            transition: all 0.3s ease;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .container form .btn-primary:active {\n");
      out.write("            transform: scale(0.95);\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <div class=\"container mt-5\">\n");
      out.write("        <h2>Vérification</h2>\n");
      out.write("        <form action=\"Code\" method=\"post\">\n");
      out.write("            <div class=\"mb-3\">\n");
      out.write("                <input type=\"text\" class=\"form-control\" id=\"verificationCode\" name=\"verificationCode\">\n");
      out.write("                <label for=\"verificationCode\" class=\"form-label\">Code de Vérification :</label>\n");
      out.write("            </div>\n");
      out.write("            <p class=\"custom-message\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${msg}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\n");
      out.write("            <button type=\"submit\" class=\"btn btn-primary btn-block\">Envoyer</button>\n");
      out.write("        </form>\n");
      out.write("    </div>\n");
      out.write("    <script>\n");
      out.write("        // Add event listener to hide the placeholder when user starts typing\n");
      out.write("        document.getElementById('verificationCode').addEventListener('input', function () {\n");
      out.write("            this.setAttribute('data-empty', this.value === '' ? 'true' : 'false');\n");
      out.write("        });\n");
      out.write("    </script>\n");
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
