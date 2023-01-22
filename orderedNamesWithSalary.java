import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class orderedNamesWithSalary {

    public static void main(String[] args){

        List<Employee> list = new ArrayList<>();
        String path = "C:\\OneDriveTemp\\in.txt";


        try(BufferedReader br = new BufferedReader(new FileReader(path))){

            String employeeCsv = br.readLine();

            while(employeeCsv != null){
                String[] fields = employeeCsv.split(",");
                list.add(new Employee(fields[0], Double.parseDouble(fields[1])));
                employeeCsv = br.readLine();
            }

            Collections.sort(list); // Classe respons�vel por ordenar os nomes

            for(Employee employee: list){
                System.out.println(employee.getName() + "; " + String.format("%.2f", employee.getSalary()));
            }

        }  catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }
    }

}
