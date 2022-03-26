package uk.ac.ucl.helper;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class searchJSON {
    public static List<String> searchFor(String keyword, JSONObject notes) {
        List<String> matches = new ArrayList<>();
        JSONArray keys = notes.names();

        for (int i = 0; i < keys.length(); i++) {
            String key = keys.getString(i);
            if (key.equals("default") || key.equals("total")) {
                continue;
            }
            JSONObject note = notes.getJSONObject(key);
            String name = note.getString("name");
            String text = note.getString("text");
            if (key.contains(keyword) || name.toLowerCase(Locale.US).contains(keyword.toLowerCase(Locale.US)) || text.toLowerCase(Locale.US).contains(keyword.toLowerCase(Locale.US))) {
                matches.add(key);
            }
        }
        return matches;
    }
}
