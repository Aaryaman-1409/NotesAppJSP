package uk.ac.ucl.model;

import org.json.JSONObject;
import uk.ac.ucl.helper.searchJSON;
import uk.ac.ucl.helper.sortJSON;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

public class Model {
    private JSONObject notes;

    public void readFile(File file) throws FileNotFoundException {
        // Read a data file and store the data in your data structure.
        Scanner scanner = new Scanner(file);
        String text = scanner.useDelimiter("\\A").next();
        scanner.close();
        this.notes = new JSONObject(text);
    }

    public JSONObject getJSON() {
        return notes;
    }

    public void setJSON(JSONObject newnotes) {
        this.notes = newnotes;
    }

    public List<String> searchFor(String keyword) {
        return searchJSON.searchFor(keyword, this.notes);
    }

    public List<String> sortBy(String sortby, String order) {
        return sortJSON.sortBy(sortby, order, this.notes);
    }
}

