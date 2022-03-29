package uk.ac.ucl.servlets;

import org.json.JSONObject;
import uk.ac.ucl.model.Model;
import uk.ac.ucl.model.ModelFactory;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

@WebServlet("/save.html")
public class SaveServlet extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        Model model = ModelFactory.getModel();
        JSONObject notes = model.getJSON();

        String id = request.getParameter("id");
        if (id.equals("default")) {
            id = Integer.toString(Integer.parseInt(notes.getString("total")) + 1);
            notes.put("total", id);
        }

        JSONObject note = new JSONObject();
        note.put("name", request.getParameter("name"));
        note.put("text", request.getParameter("text"));

        notes.put(id, note);
        model.setJSON(notes);
        String jsonstring = notes.toString();

        File jsonfile = new File("./data/notes/notes.json");
        FileWriter fileWriter = new FileWriter(jsonfile, false);
        fileWriter.write(jsonstring);
        fileWriter.close();

        response.sendRedirect("/expandednote.html?action=save&id=" + id);
    }
}

