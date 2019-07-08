package SerialAndDeserial;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerialAndDeserial {
	public static void printdata(ProductData object1) 
    { 
  
        System.out.println("ProductId = " + object1.ProductId); 
        System.out.println("ProdName = " + object1.ProdName); 
        System.out.println("Price = " + object1.Price); 
        System.out.println("ProductInfo ="+object1.ProductInfo);
    } 
  
public static void main(String[] args) 
    { 
        ProductData object = new ProductData(35454, "PhilipsTrimmer", 3500,null);
        String filename = "Products.txt"; 
  
        // Serialization 
        try { 
  
            // Saving of object in a file 
            FileOutputStream file = new FileOutputStream 
                                           ("C:\\Users\\Damodaran.Krishnan\\git\\devOps\\sign\\src\\main\\java\\SerialAndDeserial\\Products.txt"); 
            ObjectOutputStream out = new ObjectOutputStream 
                                           (file); 
  
            // Method for serialization of object 
            out.writeObject(object); 
  
            out.close(); 
            file.close(); 
  
            System.out.println("Object has been serialized\n"
                              + "Data before Deserialization."); 
            printdata(object); 
  
            // value of static variable changed 
            object.Price = 4500; 
        } 
  
        catch (IOException ex) { 
            System.out.println("IOException is caught"); 
        } 
  
        object = null; 
  
        // Deserialization 
        try { 
  
            // Reading the object from a file 
            FileInputStream file = new FileInputStream 
                                         ("C:\\Users\\Damodaran.Krishnan\\git\\devOps\\sign\\src\\main\\java\\SerialAndDeserial\\Products.txt"); 
            ObjectInputStream in = new ObjectInputStream 
                                         (file); 
  
            // Method for deserialization of object 
            object = (ProductData)in.readObject(); 
  
            in.close(); 
            file.close(); 
            System.out.println("Object has been deserialized\n"
                                + "Data after Deserialization."); 
            printdata(object); 
  
            
        } 
  
        catch (IOException ex) { 
            System.out.println("IOException is caught"); 
        } 
  
        catch (ClassNotFoundException ex) { 
            System.out.println("ClassNotFoundException" + 
                                " is caught"); 
        } 
    } 
} 

