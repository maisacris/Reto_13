import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "RaizCuadrada", value = "/RaizCuadrada")
public class RaizCuadrada extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        double numero = Double.parseDouble(request.getParameter("digito"));
        double raiz = Math.sqrt(numero);
        response.getWriter().println(
                "<!DOCTYPE html>\n" + "<html>\n"
                        + "<head></head>\n"
                        + "<body bgcolor=\"#fdf5e6\">\n"
                        + "<h1><b><i>RAIZ CUADRADA</i></b></h1>\n"
                        + "<p>del numero ingresado es</p>\n"+raiz
                        + "</body></html>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
