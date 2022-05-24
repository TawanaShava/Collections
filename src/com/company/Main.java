package com.company;
import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
	List<String> employees = new ArrayList<>();
    try(BufferedReader br = new BufferedReader(new FileReader("src/data.txt"))){

        String line;
        while ((line = br.readLine()) !=null){
            employees.add(line);
        }
    }catch (IOException e){
        e.printStackTrace();
    }
    //prints out size of collection

        System.out.println("The size of the collection is: " + employees.size());

        //the standard loop : for
        System.out.println("--------------------------------------------------------");
        System.out.println("FOR LOOP : ");
        for (int i =0;i< employees.size();i++){
            System.out.println(employees.get(i));
    }
        //For each loop
        System.out.println("---------------------------------------------------------");
        System.out.println("FOR EACH LOOP : ");
        for (String employee:employees
             ) {
            System.out.println(employee);
        }

        //Iterator Interface
        System.out.println("---------------------------------------------------------");
        System.out.println("ITERATOR INTERFACE : ");
        Iterator<String> it = employees.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
                     }
}
}
