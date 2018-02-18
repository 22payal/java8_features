import java.util.ArrayList;
import java.util.List;

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

         list.add(new Employee1("abc", 22));
         list.add(new Employee1("xyz", 23));
         list.add(new Employee1("nbc", 27));
         list.add(new Employee1("abc", 26));
         list.add(new Employee1("nnc", 21));

         System.out.println("The required employees are: ");

         for (Employee1 employee1 : list)
         {
             String s =employee1.getName();


             if ( (s.charAt(0)=='n' ) && (employee1.getAge()>24)) {
                 System.out.println(employee1.getName());
             }
         }
     }
 }