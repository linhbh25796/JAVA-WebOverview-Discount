import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "CalculateServlet",urlPatterns = "/display-discount")
public class CalculateServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String description = request.getParameter("description");
        float price =  Float.parseFloat(request.getParameter("price"));
        int discount_percent = Integer.parseInt(request.getParameter("discount_percent"));

        float discount_amount = (float) (price * discount_percent * 0.1);
        float discount_price = price - discount_amount;

        PrintWriter writer = response.getWriter();
        DisplayProduct  displayProduct = new DisplayProduct();
        String htmlText = displayProduct.createByProduct(new Product(description,price,discount_percent,discount_amount,discount_price));
        writer.print(htmlText);


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
