import java.io.*;

class Employee implements java.io.Serializable
{
    public int age;
    public String name;

    // Default constructor
    public Employee(int age, String name)
    {
        this.age = age;
        this.name = name;
    }

}

class question2
{
    public static void main(String[] args)
    {
        Employee object = new Employee(10, "Payal Nigam");
        String filename = "file.ser";

        
        try
        {
           
            FileOutputStream file = new FileOutputStream(filename);
            ObjectOutputStream out = new ObjectOutputStream(file);

            
            out.writeObject(object);

            out.close();
            file.close();

            System.out.println("Object has been serialized");

        }

        catch(IOException ex)
        {
            System.out.println("IOException is caught");
        }


        Employee object1 = null;

       
        try
        {
            
            FileInputStream file = new FileInputStream(filename);
            ObjectInputStream in = new ObjectInputStream(file);

           
            object1 = (Employee)in.readObject();

            in.close();
            file.close();

            System.out.println("Object has been deserialized ");
            System.out.println("age is " + object1.age);
            System.out.println("name is " + object1.name);
        }

        catch(IOException ex)
        {
            System.out.println("IOException is caught");
        }

        catch(ClassNotFoundException ex)
        {
            System.out.println("ClassNotFoundException is caught");
        }

    }

}
