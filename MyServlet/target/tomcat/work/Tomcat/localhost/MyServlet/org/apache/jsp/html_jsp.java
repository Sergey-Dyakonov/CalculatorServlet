/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2021-04-29 16:07:59 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class html_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/style_1.css", Long.valueOf(1619685925543L));
    _jspx_dependants.put("/script.js", Long.valueOf(1619711758744L));
  }

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


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

      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <title>Calculator</title>\r\n");
      out.write("    <style>\r\n");
      out.write("        ");
      out.write("input{\r\n");
      out.write("    border-radius: 12px;\r\n");
      out.write("}");
      out.write("\r\n");
      out.write("    </style>\r\n");
      out.write("    <script type=\"text/javascript\">\r\n");
      out.write("        ");
      out.write("function setInp(){\r\n");
      out.write("    let val=document.getElementById(\"inp\").value;\r\n");
      out.write("    switch (val){\r\n");
      out.write("        case '1':{\r\n");
      out.write("            document.getElementById(\"form\").innerHTML=\"A:<input name='a'/><br><br>B:<input name='b'/><br><br><input type='submit' name='oper' value='-'>\";\r\n");
      out.write("            break;\r\n");
      out.write("        }\r\n");
      out.write("        case '2':{\r\n");
      out.write("            document.getElementById(\"form\").innerHTML=\"A:<input name='a'/><br><br>B:<input name='b'/><br><br><input type='submit' name='oper' value='+'>\";\r\n");
      out.write("            break;\r\n");
      out.write("        }\r\n");
      out.write("        case '3':{\r\n");
      out.write("            document.getElementById(\"form\").innerHTML=\"A:<input name='a'/><br><br>B:<input name='b'/><br><br><input type='submit' name='oper' value='*'>\";\r\n");
      out.write("            break;\r\n");
      out.write("        }\r\n");
      out.write("        case '4':{\r\n");
      out.write("            document.getElementById(\"form\").innerHTML=\"A:<input name='a'/><br><br>B:<input name='b'/><br><br><input type='submit'  name='oper' value='/'>\";\r\n");
      out.write("            break;\r\n");
      out.write("        }\r\n");
      out.write("        case '5':{\r\n");
      out.write("            document.getElementById(\"form\").innerHTML=\"A:<input name='a'/><br><br><input type='submit'  name='oper' value='sin(x)'>\";\r\n");
      out.write("            break;\r\n");
      out.write("        }\r\n");
      out.write("        case '6':{\r\n");
      out.write("            document.getElementById(\"form\").innerHTML=\"A:<input name='a'/><br><br><input type='submit'  name='oper' value='cos(x)'>\";\r\n");
      out.write("            break;\r\n");
      out.write("        }\r\n");
      out.write("        case '7':{\r\n");
      out.write("            document.getElementById(\"form\").innerHTML=\"A:<input name='a'/><br><br><input type='submit'  name='oper' value='tg(x)'>\";\r\n");
      out.write("            break;\r\n");
      out.write("        }\r\n");
      out.write("        case '8':{\r\n");
      out.write("            document.getElementById(\"form\").innerHTML=\"A:<input name='a'/><br><br><input type='submit'  name='oper' value='ctg(x)'>\";\r\n");
      out.write("            break;\r\n");
      out.write("        }\r\n");
      out.write("        case '9':{\r\n");
      out.write("            document.getElementById(\"form\").innerHTML=\"A:<input name='a'/><br><br><input type='submit' name='oper' value='ln(x)'>\";\r\n");
      out.write("            break;\r\n");
      out.write("        }\r\n");
      out.write("        case '10':{\r\n");
      out.write("            document.getElementById(\"form\").innerHTML=\"A:<input name='a'/><br><br><input type='submit'  name='oper' value='lg(x)'>\";\r\n");
      out.write("            break;\r\n");
      out.write("        }\r\n");
      out.write("        case '11':{\r\n");
      out.write("            document.getElementById(\"form\").innerHTML=\"A:<input name='a'/><br><br><input type='submit'  name='oper' value='sec(x)'>\";\r\n");
      out.write("            break;\r\n");
      out.write("        }\r\n");
      out.write("        case '12':{\r\n");
      out.write("            document.getElementById(\"form\").innerHTML=\"A:<input name='a'/><br><br><input type='submit'  name='oper' value='cosec(x)'>\";\r\n");
      out.write("            break;\r\n");
      out.write("        }\r\n");
      out.write("        case '13':{\r\n");
      out.write("            document.getElementById(\"form\").innerHTML=\"A:<input name='a'/><br><br><input type='submit'  name='oper' value='sh(x)'>\";\r\n");
      out.write("            break;\r\n");
      out.write("        }\r\n");
      out.write("        case '14':{\r\n");
      out.write("            document.getElementById(\"form\").innerHTML=\"A:<input name='a'/><br><br><input type='submit'  name='oper' value='ch(x)'>\";\r\n");
      out.write("            break;\r\n");
      out.write("        }\r\n");
      out.write("        case '15':{\r\n");
      out.write("            document.getElementById(\"form\").innerHTML=\"A:<input name='a'/><br><br>B:<input name='b'/><br><br><input type='submit'  name='oper' value='a^b'>\";\r\n");
      out.write("            break;\r\n");
      out.write("        }\r\n");
      out.write("    }\r\n");
      out.write("}");
      out.write("\r\n");
      out.write("    </script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<label for=\"inp\">\r\n");
      out.write("    Choose operation:\r\n");
      out.write("</label><select name=\"operation\" id=\"inp\" onchange=\"setInp()\">\r\n");
      out.write("    <option value=\"1\" selected>-</option>\r\n");
      out.write("    <option value=\"2\">+</option>\r\n");
      out.write("    <option value=\"3\">*</option>\r\n");
      out.write("    <option value=\"4\">/</option>\r\n");
      out.write("    <option value=\"5\">sin(x)</option>\r\n");
      out.write("    <option value=\"6\">cos(x)</option>\r\n");
      out.write("    <option value=\"7\">tg(x)</option>\r\n");
      out.write("    <option value=\"8\">ctg(x)</option>\r\n");
      out.write("    <option value=\"9\">ln(x)</option>\r\n");
      out.write("    <option value=\"10\">lg(x)</option>\r\n");
      out.write("    <option value=\"11\">sec(x)</option>\r\n");
      out.write("    <option value=\"12\">cosec(x)</option>\r\n");
      out.write("    <option value=\"13\">sh(x)</option>\r\n");
      out.write("    <option value=\"14\">ch(x)</option>\r\n");
      out.write("    <option value=\"15\">a^b</option>\r\n");
      out.write("</select>\r\n");
      out.write("<br><br>\r\n");
      out.write("<form action=\"Answer\" method=\"post\" id=\"form\">\r\n");
      out.write("    A:<input name=\"a\"/><br><br>B:<input name=\"b\"/><br><br><input type=\"submit\"  name='oper' value='-'>\r\n");
      out.write("</form>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
