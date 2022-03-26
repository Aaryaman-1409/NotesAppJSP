/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.45
 * Generated at: 2022-03-26 11:36:26 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import org.json.JSONObject;
import org.json.JSONArray;

public final class expandedNote_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("java.util.List");
    _jspx_imports_classes.add("org.json.JSONObject");
    _jspx_imports_classes.add("org.json.JSONArray");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <title>\n");
      out.write("        ");
      out.print((String) request.getAttribute("name"));
      out.write("\n");
      out.write("    </title>\n");
      out.write("</head>\n");
      out.write("<body style=\"background-color: #202124\">\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/header.jsp", out, false);
      out.write("\n");
      out.write("<div class=\"main\">\n");
      out.write("    ");

        String action = (String) request.getAttribute("action");
        String text = (String) request.getAttribute("text");
        String name = (String) request.getAttribute("name");
        String id = (String) request.getAttribute("id");
    
      out.write("\n");
      out.write("    ");
 if (action != null) {
        if (action.equals("save")) {
      out.write("\n");
      out.write("    <div class=\"text-success text-center\"\n");
      out.write("         style=\"margin: 5vh; padding:0.5vh; background-color: #ECF5EA; border-radius: 0.2rem;\" id=\"alert\"><h6>Note saved\n");
      out.write("        successfully</h6></div>\n");
      out.write("    ");
} else if (action.equals("delete")) {
      out.write("\n");
      out.write("    <div class=\"text-danger text-center\"\n");
      out.write("         style=\"margin: 5vh; padding:0.5vh; background-color: #FEEAE7; border-radius: 0.2rem;\" id=\"alert\"><h6>Note\n");
      out.write("        deleted successfully</h6></div>\n");
      out.write("    ");

            }
        }
    
      out.write("\n");
      out.write("    <form method=\"post\" action=\"/save.html\">\n");
      out.write("        <div class=\"form-group text-light\" style=\"margin: 5vh; font-family: 'Roboto Light',sans-serif\">\n");
      out.write("            <h4><label for=\"name\">Enter title</label></h4>\n");
      out.write("            <textarea class=\"form-control bg-secondary text-light\" id=\"name\" name=\"name\" rows=\"2\"\n");
      out.write("                      required>");
      out.print(name);
      out.write("</textarea>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"form-group text-light\" style=\"margin:5vh; font-family: 'Roboto Light',sans-serif\">\n");
      out.write("            <h4><label for=\"text\">Enter content of note</label></h4>\n");
      out.write("            <textarea class=\"form-control bg-secondary text-light\" id=\"text\" name=\"text\" rows=\"10\"\n");
      out.write("                      required>");
      out.print(text);
      out.write("</textarea>\n");
      out.write("        </div>\n");
      out.write("        <input type=\"hidden\" id=\"id\" name=\"id\" value=");
      out.print(id);
      out.write(">\n");
      out.write("        <button style=\"margin: 5vh; font-family: 'Roboto Light',sans-serif\" class=\"btn my-2 my-sm-0 btn-success\"\n");
      out.write("                type=\"submit\">Save\n");
      out.write("        </button>\n");
      out.write("    </form>\n");
      out.write("    <form method=\"post\" action=\"/delete.html\">\n");
      out.write("        <input type=\"hidden\" name=\"id\" value=");
      out.print(id);
      out.write(">\n");
      out.write("        <button style=\"margin: 5vh; font-family: 'Roboto Light',sans-serif\" class=\"btn my-2 my-sm-0 btn-danger\"\n");
      out.write("                type=\"submit\">Delete\n");
      out.write("        </button>\n");
      out.write("    </form>\n");
      out.write("    <form method=\"get\" action=\"/index.html\">\n");
      out.write("        <button style=\"margin: 5vh; font-family: 'Roboto Light',sans-serif\" class=\"btn my-2 my-sm-0 btn-primary\"\n");
      out.write("                type=\"submit\">Back to Home\n");
      out.write("        </button>\n");
      out.write("    </form>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<script>\n");
      out.write("    const myTimeout = setTimeout(hideAlert, 500);\n");
      out.write("\n");
      out.write("    function fade(element) {\n");
      out.write("        let opacity = 1;\n");
      out.write("        let counter = setInterval(function () {\n");
      out.write("            if (opacity <= 0.1) {\n");
      out.write("                clearInterval(counter);\n");
      out.write("                element.style.display = 'none';\n");
      out.write("            }\n");
      out.write("            element.style.opacity = opacity;\n");
      out.write("            element.style.filter = 'alpha(opacity=' + opacity * 100 + \")\";\n");
      out.write("            opacity -= opacity * 0.05;\n");
      out.write("        }, 25);\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    function hideAlert() {\n");
      out.write("        if (document.getElementById(\"alert\") != null) {\n");
      out.write("            fade(document.getElementById(\"alert\"));\n");
      out.write("        }\n");
      out.write("    }\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
