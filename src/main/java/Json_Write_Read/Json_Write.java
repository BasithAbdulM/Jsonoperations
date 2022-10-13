package Json_Write_Read;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.FileWriter;
import java.io.IOException;

public class Json_Write {




    public static void main(String[] args) throws IOException {
        //create JSON object
        JSONObject jsonObject=new JSONObject();

        //Add Key/Value pairs usit put() method
        jsonObject.put("Name","Abdul Basith");
        jsonObject.put("Age",1);

        //["Listening Music" ,"Watching Movies","Cricket"]

        //Create object for JsonArray
        JSONArray array=new JSONArray();
        array.add("Listening Music");
        array.add("Watching Movies");
        array.add("Cricket");

        //add json array to created jsonobject
        jsonObject.put("Hobbies",array);

        FileWriter fileWriter=new FileWriter("AB.json");
        fileWriter.write(jsonObject.toJSONString());
        fileWriter.close();



    }


}
