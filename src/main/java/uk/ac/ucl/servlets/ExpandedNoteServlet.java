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

@WebServlet("/expandednote.html")
public class ExpandedNoteServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        // Get the data from the model
        Model model = ModelFactory.getModel();
        JSONObject notes = model.getJSON();
        String id = request.getParameter("id");
        String action = request.getParameter("action");
        JSONObject note = notes.getJSONObject(id);
        String text = note.getString("text");
        String name = note.getString("name");
        request.setAttribute("id", id);
        request.setAttribute("text", text);
        request.setAttribute("name", name);
        request.setAttribute("action", action);

        ServletContext context = getServletContext();
        RequestDispatcher dispatch = context.getRequestDispatcher("/expandedNote.jsp");
        dispatch.forward(request, response);
    }
}

