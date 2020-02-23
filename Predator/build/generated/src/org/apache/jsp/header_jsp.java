package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class header_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("<table><tr><td width=\"600\">\n");
      out.write("                  <h1>Predator</h1>\n");
      out.write("                </td>\n");
      out.write("                <td>\n");
      out.write("                    <c:if test=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${prijavljen==null}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                        <form method=\"post\" action=\"/Trgovina/Prijava\">\n");
      out.write("                        Korisničko ime: <input type=\"text\" name=\"user\" /><br/>\n");
      out.write("                        Lozinka: <input type=\"password\" name=\"pass\" /> \n");
      out.write("                        <input type=\"submit\" value=\"Prijava\" />\n");
      out.write("                        </form>\n");
      out.write("                        <a href=\"/Predator/Registracija\">Novi korisnik</a>\n");
      out.write("                     </c:if>\n");
      out.write("                     <c:if test=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${prijavljen!=null}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                         Prijavljen je \n");
      out.write("                         <c:if test=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${prijavljen.tip==1}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                             kupac:\n");
      out.write("                         </c:if>\n");
      out.write("                         <c:if test=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${prijavljen.tip==2}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                             administrator:\n");
      out.write("                         </c:if>                             \n");
      out.write("                         ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${prijavljen.ime}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(' ');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${prijavljen.prezime}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("<br/>\n");
      out.write("                         <a href=\"/Predator/Odjava\">Odjava</a><br/>\n");
      out.write("                         <c:if test=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${prijavljen.tip==2}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                            <a href=\"/Predator/PovijestPrijava\">Povijest prijava</a><br/>\n");
      out.write("                            <a href=\"/Predator/OdabirKupca\">Povijest kupnje za kupca</a>\n");
      out.write("                         </c:if>  \n");
      out.write("                         <c:if test=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${prijavljen.tip==1}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                            <a href=\"/Predator/PovijestKupnje?idkor=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${prijavljen.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">Povijest kupnje</a>\n");
      out.write("                         </c:if>\n");
      out.write("                     </c:if>\n");
      out.write("                </td>\n");
      out.write("                <td>\n");
      out.write("                    <a href=\"/Predator/KosaricaUredi\">\n");
      out.write("                        <img src=\"slike/kosarica.png\" width=\"70px\"></a> (");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${kosarica==null?0:kosarica.size()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(")\n");
      out.write("                </td>\n");
      out.write("        </table>\n");
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
