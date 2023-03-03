package ss12_java_collections_framework.exercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ProductManager implements Comparator<Product> {
    @Override
    public int compare(Product o1,Product o2){
        if (o1.getPrice()>o2.getPrice())return 1;
        else if (o1.getPrice()< o2.getPrice())return -1;
        else return 0;
    }
    ArrayList<Product>products=new ArrayList<Product>();
    public void addProduct(Product product){
        products.add(product);
    }

    public void setProducts(Product product){
        for (Product product1 :products){
            if (product1.getId()==product.getId()){
                product1.setId(product.getId());
                product1.setPrice(product.getPrice());
            }
        }

    }
    public void deleteProducts(int product){
        Product product2=null;
        for (Product product1: products){
            if (product1.getId()==product){
                product2=product1;
                break;

            }
        }
        if (product2!=null){
            products.remove(product2);
        }

    }
    public void PrintProduct(){
        for (Product product :products){
            System.out.println("the Id of Product is : "+product.getId()+"the Name of Product is : " +
                    " "+product.getName()+"the Price of Product is : "+product.getPrice());
        }
    }
    public void searchProduct(Product product){
        Product product3=null;
        for(Product product1:products){
            if (product1.getName()==product.getName()){
                product3=product1;
                break;

            }
        }
        if (product3!=null){
            System.out.println(product3);
        }
    }


    public void sortProductsByName() {
        System.out.println("\n" +
                "sort ascending by name");
       Collections.sort(products);
       for (Product product:products){
           System.out.println(product);
       }
        System.out.println("Sort ascending by Price");
       Collections.sort(products,this::compare);
       for (Product product:products){
           System.out.println(product);
       }


    }

    public static void main(String[] args) {

      ProductManager productManager=new ProductManager();
      Product product=new Product(1,"coca",13000);
      Product product1=new Product(2,"pepsi",16000);
      Product product2=new Product(3,"milk",17000);
      productManager.addProduct(product);
      productManager.addProduct(product1);
      productManager.addProduct(product2);
        System.out.println("Before sorting:");
        productManager.PrintProduct();

        productManager.sortProductsByName();

        System.out.println("After sorting:");
        productManager.PrintProduct();
    }

}