package ss05_access_modifier_static_method_in_java.com;

import javax.swing.*;

public class Student {
    private String name="john";
    private String classes="=C02";
     public Student(){

    }
    public Student(String name, String classes){
         this.name=name;
         this.classes=classes;

    }
    public void setName(String newName){
         this.name=newName;
    }

    public String getName() {
        return name;
    }

    public String getClasses() {
        return classes;
    }

    public void setClasses(String newClasses) {
        this.classes = newClasses;
    }
}
