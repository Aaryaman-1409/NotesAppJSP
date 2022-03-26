package uk.ac.ucl.helper;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.*;

public class sortJSON {
    public static List<String> sortBy(String sortby, String order, JSONObject notes) {
        List<List<String>> sorted = new ArrayList<>();
        List<String> sortedindex = new ArrayList<>();
        JSONArray keys = notes.names();
        for (int i = 0; i < keys.length(); i++) {
            String key = keys.getString(i);
            if (key.equals("default") || key.equals("total")) {
                continue;
            }
            JSONObject note = notes.getJSONObject(key);
            String name = note.getString("name").toLowerCase(Locale.US);
            String text = note.getString("text").toLowerCase(Locale.US);
            List<String> unsorted = new ArrayList<String>(Arrays.asList(key, name, text));
            sorted.add(unsorted);
        }
        if (sortby.equals("title")) {
            sorted.sort(Comparator.comparing(o -> o.get(1)));
        } else if (sortby.equals("content")) {
            sorted.sort(Comparator.comparing(o -> o.get(2)));
        }

        for (List<String> elem : sorted) {
            sortedindex.add(elem.get(0));
        }

        if (order.equals("descending")) {
            Collections.reverse(sortedindex);
        }
        return sortedindex;
    }
}
