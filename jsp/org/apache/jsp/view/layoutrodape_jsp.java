package org.apache.jsp.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class layoutrodape_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<footer class=\"text-white text-center text-lg-start\" \n");
      out.write("          style=\"background-color: #03567c;\">\n");
      out.write("          \n");
      out.write("            <!-- Grid container -->\n");
      out.write("            <div class=\"container p-4\">\n");
      out.write("              <!--Grid row-->\n");
      out.write("              <div class=\"row mt-4\">\n");
      out.write("                <!--Grid column-->\n");
      out.write("                <div class=\"col-lg-4 col-md-12 mb-4 mb-md-0\">\n");
      out.write("                  <h5 class=\"text-uppercase mb-4 text-white\">Sobre a empresa</h5>\n");
      out.write("        <p class=\"text-white\">\n");
      out.write("                    Sua viagem com a melhor agência, venha viajar com a InterWorld, \n");
      out.write("                    a mais de 10 anos no mercado, contamos com os melhores preços de passagem, hoteis e companhias áereas,\n");
      out.write("                     presente em mais de 20 paises, \n");
      out.write("                    entre eles Canada, Estados Unidos, Russia, Portugal.\n");
      out.write("                  </p>\n");
      out.write("        \n");
      out.write("                  <div class=\"mt-4\">\n");
      out.write("                    <!-- Facebook -->\n");
      out.write("                    <a type=\"button\" class=\"btn btn-floating btn-light btn-lg\"><i class=\"fab fa-facebook-f\" style=\"color:rgb(36, 129, 172);\"></i></a>\n");
      out.write("                    <!-- Dribbble -->\n");
      out.write("                    <a type=\"button\" class=\"btn btn-floating btn-light btn-lg\"><i class=\"fab fa-dribbble\" style=\"color:rgb(36, 129, 172);\"></i></a>\n");
      out.write("                    <!-- Twitter -->\n");
      out.write("                    <a type=\"button\" class=\"btn btn-floating btn-light btn-lg\"><i class=\"fab fa-twitter\" style=\"color:rgb(36, 129, 172);\"></i></a>\n");
      out.write("                    <!-- Google + -->\n");
      out.write("                    <a type=\"button\" class=\"btn btn-floating btn-light btn-lg\"><i class=\"fab fa-google-plus-g\" style=\"color:rgb(36, 129, 172);\"></i></a>\n");
      out.write("                    <!-- Linkedin -->\n");
      out.write("                  </div>\n");
      out.write("                </div>\n");
      out.write("                <!--Grid column-->\n");
      out.write("        \n");
      out.write("                <!--Grid column-->\n");
      out.write("                <div class=\"col-lg-4 col-md-6 mb-4 mb-md-0\">\n");
      out.write("                  <h5 class=\"text-uppercase mb-4 pb-1\">PESQUISE ALGUMA COISA</h5>\n");
      out.write("        \n");
      out.write("                  <div class=\"form-outline form-white mb-4\">\n");
      out.write("                    <input type=\"text\" id=\"formControlLg\" class=\"form-control form-control-lg\" />\n");
      out.write("                    <label class=\"form-label\" for=\"formControlLg\">Buscar</label>\n");
      out.write("                  </div>\n");
      out.write("        \n");
      out.write("                  <ul class=\"fa-ul\" style=\"margin-left: 1.65em;\">\n");
      out.write("                    <li class=\"mb-3\">\n");
      out.write("                      <span class=\"fa-li\"><i class=\"fas fa-home\"></i></span><span class=\"ms-2\">\n");
      out.write("                        Rua Marechal Deodoro, Taquaritinga, SP\n");
      out.write("                      </span>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"mb-3\">\n");
      out.write("                      <span class=\"fa-li\"><i class=\"fas fa-envelope\"></i></span><span class=\"ms-2\">\n");
      out.write("                        InterWorldcontato@gmail.com\n");
      out.write("                      </span>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"mb-3\">\n");
      out.write("                      <span class=\"fa-li\"><i class=\"fas fa-phone\"></i></span><span class=\"ms-2\">\n");
      out.write("                        + 01 234 567 34\n");
      out.write("                      </span>\n");
      out.write("                    </li>\n");
      out.write("                  </ul>\n");
      out.write("                </div>\n");
      out.write("                <!--Grid column-->\n");
      out.write("        \n");
      out.write("                <!--Grid column-->\n");
      out.write("                <div class=\"col-lg-4 col-md-6 mb-4 mb-md-0\">\n");
      out.write("                  <h5 class=\"text-uppercase mb-4\">HORÁRIO DE FUNCIONAMENTO</h5>\n");
      out.write("        \n");
      out.write("                  <table class=\"table text-center text-white\">\n");
      out.write("                    <tbody class=\"fw-normal\">\n");
      out.write("                      <tr>\n");
      out.write("                        <td>Seg - Ter:</td>\n");
      out.write("                        <td>8am - 9pm</td>\n");
      out.write("                      </tr>\n");
      out.write("                      <tr>\n");
      out.write("                        <td>Sex - Sab:</td>\n");
      out.write("                        <td>8am - 1am</td>\n");
      out.write("                      </tr>\n");
      out.write("                      <tr>\n");
      out.write("                        <td>Dom:</td>\n");
      out.write("                        <td>9am - 10pm</td>\n");
      out.write("                      </tr>\n");
      out.write("                    </tbody>\n");
      out.write("                  </table>\n");
      out.write("                </div>\n");
      out.write("                <!--Grid column-->\n");
      out.write("              </div>\n");
      out.write("              <!--Grid row-->\n");
      out.write("            </div>\n");
      out.write("            <!-- Grid container -->\n");
      out.write("        \n");
      out.write("            <div class=\"text-center p-3\" style=\"background-color: #00405e;\">\n");
      out.write("              <a target=\"_blank\" href=\"https://icons8.com/icon/A1uYqrWuzOIR/travel\">Travel</a> icon by <a target=\"_blank\" href=\"https://icons8.com\">Icons8</a>\n");
      out.write("              © 2022<a class=\"text-white\" href=\"/index.html\"> InterWorld.com</a>\n");
      out.write("            </div>\n");
      out.write("          </footer>\n");
      out.write("  </main>\n");
      out.write("</main>\n");
      out.write("</body>\n");
      out.write("</html>");
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
