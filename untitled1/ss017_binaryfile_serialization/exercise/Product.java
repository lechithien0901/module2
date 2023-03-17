package ss017_binaryfile_serialization.exercise;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Product implements Serializable {
    public static final String FILE_IS_NOT_FOUND = "File is not Found";
    private int id;
    private String name;
    private String address;
    private double price;
    public Product(){}

    public Product(int id, String name, String address, double price) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public double getPrice() {
        return price;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", price=" + price +
                '}';
    }
    public static void Write(String path, List<Product>products){
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(path);
            ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(products);
            objectOutputStream.flush();
            objectOutputStream.close();
            fileOutputStream.close();

        }catch (IOException e){
            e.getMessage();
            System.out.println(FILE_IS_NOT_FOUND);

        }
    }

    public static List<Product> Read(String path){
List<Product>products=new ArrayList<>();
        try {
    FileInputStream fileInputStream = new FileInputStream(path);
    ObjectInputStream objectInputStream=new ObjectInputStream(fileInputStream);
    products=(List<Product>) objectInputStream.readObject();
}catch (IOException |ClassNotFoundException e ){
    e.getMessage();
            System.out.println("file is not have");


}
        return products;

    }
    public static void searchProducts(String path,String product){
        try{
            BufferedReader reader=new BufferedReader(new FileReader(path));
            String line=reader.readLine();
            while (line!=null){
                String arr[]=line.split(",");
                int id=Integer.parseInt(arr[0].trim());
                String name=arr[1].trim();
                String address=arr[2].trim();
                double price=Double.parseDouble(arr[3].trim());
                if (name==product){
                    System.out.println("The product information you just searched for is :");
                    System.out.println("whose product id is = "+id);
                    System.out.println("whose product name is = "+name);
                    System.out.println("whose product address is = "+address);
                    System.out.println("whose product price is = "+price);
                }
            }

        }catch (IOException |NumberFormatException e){
            e.getMessage();
        }
    }

    public static void main(String[] args) {
        List<Product>products=new ArrayList<>();
        products.add(new Product(1,"coffe","hightland",13000));
        products.add(new Product(2,"coca","hightland",15000));
        products.add(new Product(3,"pepsi","hightland",12990));
        products.add(new Product(4,"car","toyota",30000000));
        Scanner value=new Scanner(System.in);
        System.out.println("entry the link you want searth and add and write in file");
        String dest=value.nextLine();
        Write(dest,products);
        System.out.println("file has been written to");
        List<Product>list=new ArrayList<>();
        list=Read(dest);
        for (Product step:list){
            System.out.println(step);

        }
        System.out.println("\n" +
                "Enter the name of the product you want to search here");
        String name=value.nextLine();
        searchProducts(dest,name);
    }
}

