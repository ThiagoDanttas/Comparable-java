import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class orderedNames {

    public static void main(String[] args){

        List<String> list = new ArrayList<>();
        String path = "C:\\OneDriveTemp\\in.txt";
        try(BufferedReader br = new BufferedReader(new FileReader(path))){

            String line = br.readLine();
            while(line != null){
                list.add(line);
                line = br.readLine();
            }

            Collections.sort(list); // Classe respons�vel por ordenar os nomes
            for(String name: list){
                System.out.println(name);
            }

        } catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }
    }

}
