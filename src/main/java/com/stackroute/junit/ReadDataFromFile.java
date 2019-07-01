package main.java.com.stackroute.junit;

import java.io.IOException;
import java.nio.file.*;;
public class ReadDataFromFile{
    public String readFileAsString(String fileName)throws Exception
    {
        int len;
        try {
            String data = "";

                data = new String(Files.readAllBytes(Paths.get(fileName)));
                data=data.toUpperCase();
                len=data.length();

            return data+len;
        }
        catch (IOException e) {
            e.printStackTrace();
            return "File location not found";
        }
    }


}
