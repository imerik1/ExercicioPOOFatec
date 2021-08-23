package fatec.imerik1.src.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ErikSantanaServlet
 */
@WebServlet("/erik-servlet.html")
public class ErikSantanaServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public ErikSantanaServlet() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>ErikSantanaServlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<div'>");
            out.println("<h2>Nome: Erik Santana Marques dos Santos</h2>");
            out.println("<h2>RA: 1290482013016</h2>");
            out.println("<h2><a href=\"https://github.com/imerik1\" >Acessar meu github</a></h2>");
            out.println("</br>");
            out.println("</br>");
            out.println("</div>");
            out.println("</body>");
            out.println("</html>");
        }
    }
}
