package main.java.com.stackroute.junit;
/*
program to read data from the file and displaying the contents in the file
 */
import java.io.IOException;
import java.nio.file.*;;
public class ReadDataFromFile{
    public String readFileAsString(String fileName)throws Exception
    {
        int len;
        try {
            String data = "";

                data = new String(Files.readAllBytes(Paths.get(fileName)));//getting the data from the file using the path
                data=data.toUpperCase();//coverting into upper case
                len=data.length();

            return data+len;//returning the data along with the length
        }
        catch (IOException e) {
            e.printStackTrace();
            return "File location not found";//returning error message if the location is not found
        }
    }


}
