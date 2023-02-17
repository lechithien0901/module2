package demo1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class User implements Comparable<User> {
    @Override
    public int compareTo(User o){
        if(this.height>o.height)return 1;
        if(this.height<o.height)return -1;
        return 0;

    }
    public int id;
    public String name;
    public int age;
    public int height;

    public User(int id, String name, int age, int height) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.height = height;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {
        ArrayList<User>userArrayList=new ArrayList<>();
        userArrayList.add(new User(1,"Lê Chí Thiện",19,171));
        userArrayList.add(new User(2,"Lê Chí Thanh",29,156));
        userArrayList.add(new User(3,"Lê Chí Hảo",63,154));
        Comparator<User>comparator=new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                if (o1.age>o2.age)return 1;
                if (o1.age<o2.age)return -1;
                return 0;
            }

        };
       userArrayList.sort(comparator);
        System.out.println(userArrayList);
        Collections.sort(userArrayList);
        System.out.println(userArrayList);

    }


}
