import java.util.ArrayList;
import java.util.Collections;
import java.util.*;

import static java.util.Locale.filter;
import static jdk.nashorn.internal.objects.NativeArray.map;

class Employee1
 {
     String Name;
     int Age;

     Employee1(String name , int age)
     {
         this.Name= name;
         this.Age= age;
     }

     public void setAge(int age)
     {
         Age = age;
     }

     public void setName(String name)
     {
         Name = name;
     }

     public int getAge()
     {
         return Age;
     }

     public String getName()
     {
         return Name;
     }
 }

 public class question6
 {
     public static void main(String[] args) {
         List<Employee1> list = new ArrayList<>();

         Employee1 emp = new Employee1("payal",28);

         list.add(new Employee1("abc", 22));
         list.add(new Employee1("xyz", 23));
         list.add(new Employee1("nbc", 27));
         list.add(new Employee1("abc", 26));
         list.add(new Employee1("nnc", 21));


         System.out.println("The required employees are: ");

             list.stream().filter(p -> p.getName().startsWith("n")).filter(p ->p.getAge()> 24)   
                 .map(p ->p.getName())
                 .forEach(System.out::println);
     }
 }