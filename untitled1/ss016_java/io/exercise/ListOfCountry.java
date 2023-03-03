package ss016_java.io.exercise;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListOfCountry {
    public static void main(String[] args) {
   File file=new File("D:\\Module02\\untitled1\\ss016_java\\io\\exercise\\csv");
   List <TheCountry> countries=new ArrayList<>();
   try(Scanner value=new Scanner(file)){
     while(value.hasNextLine()){
         String line= value.nextLine();
         String []fields=line.split(",");
         int id=Integer.parseInt(fields[0]);
         String code=fields[1];
         String name=fields[2];
         TheCountry country=new TheCountry(id,code,name);
         countries.add(country);
     }

   }catch (FileNotFoundException e){
       System.err.println("file not find");
   }
   for(TheCountry country:countries)
       System.out.println(country);

    }
}