package testClasses;

import com.google.gson.JsonParser;

public class Convertion {

    public static void ScndJsonTry() {
        String str1 = "{a: 'aaa', b: 'bbb'}";
        JsonParser simpleJSON = new JsonParser();
        System.out.println(simpleJSON.parse(str1));
    }
}
