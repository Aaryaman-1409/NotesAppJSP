package uk.ac.ucl.model;

import org.json.JSONObject;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.stream.Collectors;

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
        return this.notes;
    }

    public void setJSON(JSONObject newnotes) {
        this.notes = newnotes;
    }

    public List<Map.Entry<String, JSONObject>> toJSONList() {
        Set<String> keys = notes.keySet();
        return keys.stream()
                .filter(key->
                !(key.equals("default") || key.equals("total")))
                .map(key->Map.entry(key, notes.getJSONObject(key)))
                .collect(Collectors.toList());
    }

    enum JSONComparator implements Comparator<Map.Entry<String, JSONObject>> {
        TITLE_SORT {
            public int compare(Map.Entry<String, JSONObject> o1, Map.Entry<String, JSONObject> o2) {
                return o1.getValue().getString("name").compareTo(o2.getValue().getString("name"));
            }
        },
        CONTENT_SORT {
            public int compare(Map.Entry<String, JSONObject> o1, Map.Entry<String, JSONObject> o2) {
                return o1.getValue().getString("text").compareTo(o2.getValue().getString("text"));
            }
        }
    }

    public List<String> searchFor(String keyword) {
        List<Map.Entry<String, JSONObject>> notes = this.toJSONList();
        keyword = keyword.toLowerCase(Locale.US);
        String finalKeyword = keyword;
        return notes.stream()
                .filter(x->
                        x.getValue().getString("name").toLowerCase(Locale.US).contains(finalKeyword) ||
                        x.getValue().getString("text").toLowerCase(Locale.US).contains(finalKeyword) ||
                        x.getKey().contains(finalKeyword))
                .map(Map.Entry::getKey).collect(Collectors.toList());
    }

    public List<String> sortBy(String sortby, String order) {
        List<Map.Entry<String, JSONObject>> notes = this.toJSONList();
        switch (sortby) {
            case "title" -> notes.sort(JSONComparator.TITLE_SORT);
            case "content" -> notes.sort(JSONComparator.CONTENT_SORT);
        }
        if (order.equals("descending")) {
            Collections.reverse(notes);
        }
        return notes.stream().map(Map.Entry::getKey).collect(Collectors.toList());
    }
}

