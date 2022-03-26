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
import java.util.List;


@WebServlet("/sort.html")
public class SortServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Model model = ModelFactory.getModel();
        JSONObject notes = model.getJSON();
        String sortby = request.getParameter("sortby");
        String order = request.getParameter("order");
        List<String> sortResult = model.sortBy(sortby, order);
        request.setAttribute("results", sortResult);
        request.setAttribute("notes", notes);
        request.setAttribute("sortby", sortby);
        request.setAttribute("order", order);

        // Invoke the JSP page.
        ServletContext context = getServletContext();
        RequestDispatcher dispatch = context.getRequestDispatcher("/sort.jsp");
        dispatch.forward(request, response);
    }
}
