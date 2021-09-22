import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "Cuadrado", value = "/Cuadrado")
public class Cuadrado extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        int numero = Integer.parseInt(request.getParameter("numb"));
        int parameter = (int) Math.pow(numero,2);
        response.getWriter().println("<html><head></head><body><h1>el cuadrado del numero ingresado es :"+parameter+"</h1></body></html>");
    }
}
