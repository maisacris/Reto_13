import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

@WebServlet(name = "Ramdon", value = "/Ramdon")
public class Ramdon extends HttpServlet {

    ArrayList<Double> numero = new ArrayList<Double>();
    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        numero.add(Math.random()*10+1);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        for (int i=1; i<10;i++){
            numero.add(Math.random()*10+1);
        }
        double suma = 0;

        for(int contador =0;contador<numero.size();contador++ ){
            suma += numero.get(contador);
        }

        response.getWriter().println("La suma de los numeros ingresados es:"+suma);
        response.getWriter().println("numeros ingresados"+ Arrays.toString(new ArrayList[]{numero}));
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
