package org.apache.jsp.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class curso_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write('\r');
      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "layouttopo.jsp", out, false);
      out.write("\r\n");
      out.write("    <div class=\"row\">\r\n");
      out.write("        <h3>Sistemas Para Internet</h3>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"row\">    \r\n");
      out.write("        <h1>\r\n");
      out.write("        Sistemas Para Internet\r\n");
      out.write("        </h1>\r\n");
      out.write("        <h2>\r\n");
      out.write("        Sobre o Curso\r\n");
      out.write("        </h2>\r\n");
      out.write("        \r\n");
      out.write("        <p>\r\n");
      out.write("        O curso de Sistemas para Internet forma um tecnólogo que ocupa- se do desenvolvimento de programas, de interfaces e aplicativos, do comércio e do marketing eletrônicos, além de sítios e portais para internet e intranet. Gerencia projetos de sistemas, inclusive com acesso a banco de dados, desenvolvendo projetos de aplicações para a rede mundial de computadores e integra mídias nos sítios da internet. Atua com tecnologias emergentes como computação móvel, redes sem fio e sistemas distribuídos. Cuidar da implantação, atualização, manutenção e segurança dos sistemas para internet também são suas atribuições\r\n");
      out.write("        </p>\r\n");
      out.write("    </div>\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "layoutrodape.jsp", out, false);
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
