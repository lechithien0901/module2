package ss12_java_collections_framework.exercise;

import java.util.Comparator;

public class ProductLikedList implements Comparator <Product> {

    @Override
   public int compare(Product o1,Product o2){
        if (o1.getPrice()> o2.getPrice()) return 1;
       else if (o1.getPrice()< o2.getPrice()) return -1;
       return 0;
    }



}
