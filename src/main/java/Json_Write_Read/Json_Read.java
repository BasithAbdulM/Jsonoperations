package Json_Write_Read;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

public class Json_Read {

    public static void main(String[] args) throws IOException, ParseException {

        //create object for JSONPARSER
        JSONParser jsonParser=new JSONParser();

        FileReader fileReader=new FileReader("AB.json");

        Object parse=jsonParser.parse(fileReader);

        JSONObject jsonObject= (JSONObject) parse;

        String name= (String) jsonObject.get("Name");
        Long Age= (Long) jsonObject.get("Age");
        JSONArray array= (JSONArray) jsonObject.get("Hobbies");
        Iterator iterator=array.iterator();
        System.out.println("Name is :" +name);
        System.out.println("Age is :" +Age);

        while (iterator.hasNext()){
            System.out.println("Hobbies is :"+iterator.next());
        }



    }
}
