package web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ProductDao;
import model.Product;



public class ProductController extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private ProductDao productDao;

    public void init() {
        productDao = new ProductDao();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        register(request, response);
        //return;
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        response.sendRedirect("/product registrationJPA/src/main/webapp/productregister.jsp");
        //return;
    }

    private void register(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String name = request.getParameter("name");
        String barcode = request.getParameter("barcode");
        String colour = request.getParameter("colour");
        String description = request.getParameter("description");

        Product product = new Product();
        product.setName(name);
        product.setBarcode(barcode);
        product.setColour(colour);
        product.setDescription(description);

        productDao.saveProduct(product);

        RequestDispatcher dispatcher = request.getRequestDispatcher("/registersuccess.jsp");
        dispatcher.forward(request, response);
    }
}
