package uk.ac.ucl.servlets;

import org.json.JSONObject;
import uk.ac.ucl.model.Model;
import uk.ac.ucl.model.ModelFactory;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/index.html")
public class IndexServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        // Get the data from the model
        Model model = ModelFactory.getModel();
        JSONObject notes = model.getJSON();
        request.setAttribute("notes", notes);

        ServletContext context = getServletContext();
        RequestDispatcher dispatch = context.getRequestDispatcher("/index.jsp");
        dispatch.forward(request, response);
    }
}
