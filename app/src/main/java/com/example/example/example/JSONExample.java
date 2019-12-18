package com.example.example.example;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.LinkedHashMap;
import java.util.Map;

public class JSONExample {

    private static void createJson() throws JSONException{
        JSONObject obj = new JSONObject();
        JSONArray jsonArray = new JSONArray();

            jsonArray.put(Integer.parseInt("college"),"govt");
            obj.put("name", jsonArray);
            obj.put("age",2);
            obj.put("salary", true);
            obj.put("CalculateString", "John");




        System.out.print(obj);
    }

    public static void main(String[] args) {

        try {
            createJson();
        } catch (JSONException e) {
            e.printStackTrace();
        }


    }
}