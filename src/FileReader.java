import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class FileReader {
    int index = 0;
    BufferedReader bufferedReader ;

    FileReader(){

    }
    public ArrayList<String[]> readFile(String filePath) throws IOException {
        ArrayList<String[]> listOfattributes = new ArrayList<>();
       // Ok i have downloaded some csv parsers, and tested them but it it hard, so i will consider ';' as delimiter if now here change it's valie :
        String delimiter = ",";
        bufferedReader = new BufferedReader(new InputStreamReader(Files.newInputStream(Paths.get(filePath))));
        String line;
        while ((line = bufferedReader.readLine()) != null){
            listOfattributes.add(line.split(delimiter));
        }
        bufferedReader.close(); // sure why not
        //TODO: I know this is wildly unscalable, and it should be replaced with buffor that reads line, and then if you want to read next one it read again
        // Slower but it will never overflow;
        return listOfattributes;
    }
}
