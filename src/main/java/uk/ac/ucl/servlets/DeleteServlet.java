package uk.ac.ucl.servlets;

import org.json.JSONArray;
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

@WebServlet("/delete.html")
public class DeleteServlet extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        Model model = ModelFactory.getModel();
        JSONObject notes = model.getJSON();

        String id = request.getParameter("id");
        if (id.equals("default")) {
            response.sendRedirect("/expandednote.html?id=default");
            return;
        }

        notes.remove(id);
        String new_total = Integer.toString(Integer.parseInt(notes.getString("total")) - 1);
        notes.put("total", new_total);
        JSONArray keys = notes.names();

        for (int i = 0; i < keys.length(); i++) {
            String key = keys.getString(i);
            if (key.equals("default") || key.equals("total") || Integer.parseInt(key) < Integer.parseInt(id)) {
                continue;
            }
            JSONObject note = (JSONObject) notes.get(key);
            notes.remove(key);
            notes.put(Integer.toString(Integer.parseInt(key) - 1), note);
        }

        model.setJSON(notes);
        String jsonstring = notes.toString();

        File jsonfile = new File("./data/notes/notes.json");
        FileWriter fileWriter = new FileWriter(jsonfile, false);
        fileWriter.write(jsonstring);
        fileWriter.close();

        response.sendRedirect("/expandednote.html?id=default&action=delete");
    }
}



