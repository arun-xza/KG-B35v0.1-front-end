/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.68
 * Generated at: 2019-03-06 14:10:37 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class facaltyreg_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
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

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


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

      out.write("<link href=\"bootstrap/bootstrap.min.css\" rel=\"stylesheet\" id=\"bootstrap-css\">\r\n");
      out.write("<script src=\"bootstrap/bootstrap.min.js\"></script>\r\n");
      out.write("<script src=\"bootstrap/jquery.min.js\"></script>\r\n");
      out.write("<!------ Include the above in your HEAD tag ---------->\r\n");
      out.write("\r\n");
      out.write("<div class=\"container\">\r\n");
      out.write("<div class=\"row justify-content-center\">\r\n");
      out.write("                    <div class=\"col-md-8\">\r\n");
      out.write("                        <div class=\"card\">\r\n");
      out.write("                            <div class=\"card-header\"></div>\r\n");
      out.write("                            <div class=\"card-body\">\r\n");
      out.write("\r\n");
      out.write("                                <form class=\"form-horizontal\" method=\"post\" action=\"facaltyreg\">\r\n");
      out.write("\r\n");
      out.write("                                    <div class=\"form-group\">\r\n");
      out.write("                                        <label for=\"name\" class=\"cols-sm-2 control-label\">Faculty Name</label>\r\n");
      out.write("                                        <div class=\"cols-sm-10\">\r\n");
      out.write("                                            <div class=\"input-group\">\r\n");
      out.write("                                                <span class=\"input-group-addon\"><i class=\"fa fa-user fa\" aria-hidden=\"true\"></i></span>\r\n");
      out.write("                                                <input type=\"text\" class=\"form-control\" name=\"name\" id=\"name\" placeholder=\"Enter your Name\" />\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"form-group\">\r\n");
      out.write("                                        <label for=\"email\" class=\"cols-sm-2 control-label\"> Email</label>\r\n");
      out.write("                                        <div class=\"cols-sm-10\">\r\n");
      out.write("                                            <div class=\"input-group\">\r\n");
      out.write("                                                <span class=\"input-group-addon\"><i class=\"fa fa-envelope fa\" aria-hidden=\"true\"></i></span>\r\n");
      out.write("                                                <input type=\"text\" class=\"form-control\" name=\"email\" id=\"email\" placeholder=\"Enter your Email\" />\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"form-group\">\r\n");
      out.write("                                        <label for=\"username\" class=\"cols-sm-2 control-label\">Address</label>\r\n");
      out.write("                                        <div class=\"cols-sm-10\">\r\n");
      out.write("                                            <div class=\"input-group\">\r\n");
      out.write("                                                <span class=\"input-group-addon\"><i class=\"fa fa-users fa\" aria-hidden=\"true\"></i></span>\r\n");
      out.write("                                                <textarea  class=\"form-control\" name=\"address\" id=\"username\" placeholder=\"Enter your Address\" ></textarea>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"form-group\">\r\n");
      out.write("                                        <label for=\"password\" class=\"cols-sm-2 control-label\">Branch</label>\r\n");
      out.write("                                        <div class=\"cols-sm-10\">\r\n");
      out.write("                                            <div class=\"input-group\">\r\n");
      out.write("                                                <span class=\"input-group-addon\"><i class=\"fa fa-lock fa-lg\" aria-hidden=\"true\"></i></span>\r\n");
      out.write("                                               <select class=\"form-control\" name=\"branch\">\r\n");
      out.write("                                               <option value=\"ece\">ECE</option>\r\n");
      out.write("                                                <option value=\"cse\">CSE</option>\r\n");
      out.write("                                                 <option value=\"me\">ME</option>\r\n");
      out.write("                                                  <option value=\"cv\">CV</option>\r\n");
      out.write("                                               </select>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"form-group\">\r\n");
      out.write("                                        <label for=\"confirm\" class=\"cols-sm-2 control-label\">Sem</label>\r\n");
      out.write("                                        <div class=\"cols-sm-10\">\r\n");
      out.write("                                            <div class=\"input-group\">\r\n");
      out.write("                                                <span class=\"input-group-addon\"><i class=\"fa fa-lock fa-lg\" aria-hidden=\"true\"></i></span>\r\n");
      out.write("                                                <input type=\"text\" class=\"form-control\" name=\"sem\" id=\"confirm\" placeholder=\"Enter Semister\" />\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                     <div class=\"form-group\">\r\n");
      out.write("                                        <label for=\"confirm\" class=\"cols-sm-2 control-label\">SSLC Percentage</label>\r\n");
      out.write("                                        <div class=\"cols-sm-10\">\r\n");
      out.write("                                            <div class=\"input-group\">\r\n");
      out.write("                                                <span class=\"input-group-addon\"><i class=\"fa fa-lock fa-lg\" aria-hidden=\"true\"></i></span>\r\n");
      out.write("                                                <input type=\"text\" class=\"form-control\" name=\"sslc\" id=\"confirm\" placeholder=\"SSLC Percentage\" />\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"form-group\">\r\n");
      out.write("                                        <label for=\"confirm\" class=\"cols-sm-2 control-label\">PUC Percentage</label>\r\n");
      out.write("                                        <div class=\"cols-sm-10\">\r\n");
      out.write("                                            <div class=\"input-group\">\r\n");
      out.write("                                                <span class=\"input-group-addon\"><i class=\"fa fa-lock fa-lg\" aria-hidden=\"true\"></i></span>\r\n");
      out.write("                                                <input type=\"text\" class=\"form-control\" name=\"puc\" id=\"confirm\" placeholder=\"PUC Percentage\" />\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                     <div class=\"form-group\">\r\n");
      out.write("                                        <label for=\"confirm\" class=\"cols-sm-2 control-label\">UG Percentage</label>\r\n");
      out.write("                                        <div class=\"cols-sm-10\">\r\n");
      out.write("                                            <div class=\"input-group\">\r\n");
      out.write("                                                <span class=\"input-group-addon\"><i class=\"fa fa-lock fa-lg\" aria-hidden=\"true\"></i></span>\r\n");
      out.write("                                                <input type=\"text\" class=\"form-control\" name=\"ug\" id=\"confirm\" placeholder=\"UG Percentage\" />\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"form-group\">\r\n");
      out.write("                                        <label for=\"confirm\" class=\"cols-sm-2 control-label\">PG Percentage</label>\r\n");
      out.write("                                        <div class=\"cols-sm-10\">\r\n");
      out.write("                                            <div class=\"input-group\">\r\n");
      out.write("                                                <span class=\"input-group-addon\"><i class=\"fa fa-lock fa-lg\" aria-hidden=\"true\"></i></span>\r\n");
      out.write("                                                <input type=\"text\" class=\"form-control\" name=\"pg\" id=\"confirm\" placeholder=\"pg Percentage\" />\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"form-group \">\r\n");
      out.write("                                        <input type=\"Submit\" class=\"btn btn-primary btn-lg btn-block login-button\">Submit</input>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"login-register\">\r\n");
      out.write("                                        \r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </form>\r\n");
      out.write("                            </div>\r\n");
      out.write("\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("</div>");
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
