import java.io.*;
import java.util.*;
import org.json.simple.*;
import org.json.simple.parser.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        readfromfile();
    }
    public static void readfromfile() {
        JSONParser parser = new JSONParser();
        try {
            Object obj = parser.parse(new FileReader("C:\\Users\\43664\\IdeaProjects\\testjsonsimplelib1\\src\\input-text.txt"));
            System.out.println("1");
            //JSONObject jsonObject = (JSONObject)obj;
            //String name = (String)jsonObject.get("Name");
            //String course = (String)jsonObject.get("Course");
            //JSONArray subjects = (JSONArray)jsonObject.get("Subjects");
            JSONArray subjects = (JSONArray)obj;
            System.out.println("1");
            //System.out.println("Name: " + name);
            //System.out.println("Course: " + course);
            //System.out.println("Subjects:");
            Iterator iterator = subjects.iterator();
            System.out.println("1");
            while (iterator.hasNext()) {
                System.out.println("2");
                JSONObject jsonObject = (JSONObject)iterator.next();
                System.out.println(jsonObject.get("name"));
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}