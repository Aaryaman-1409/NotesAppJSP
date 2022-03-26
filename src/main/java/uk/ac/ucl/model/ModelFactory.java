package uk.ac.ucl.model;

import java.io.File;
import java.io.IOException;

public class ModelFactory {
    private static Model model;

    public static Model getModel() throws IOException {
        if (model == null) {
            model = new Model();
            model.readFile(new File("./data/notes/notejson.txt"));
        }

        return model;
    }
}
