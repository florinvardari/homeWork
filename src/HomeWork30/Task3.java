package HomeWork30;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Task3 {

    //3)Create a Map that will store Employee name and salary. Write a logic to retrieve an employee who gets the highest salary. Output should be in the below format
    //John Smith=$100000

    public static void main(String[] args) {

        Map<String,Double>employee=new HashMap<>();
        employee.put("Alper",75.00);
        employee.put("Florin",76.60);
        employee.put("Rinor",72.00);

        var larges=employee.entrySet();
        double maxSalary=0;
        String maxPaid="";


        var entrySet=employee.entrySet();
        for(var entry:entrySet){
            if(entry.getValue()>maxSalary){
                maxSalary=entry.getValue();
                maxPaid= entry.getKey();

            }
        }
        System.out.println(maxPaid+"=$"+maxSalary);



    }
}