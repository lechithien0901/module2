package ss07_abstract_class_and_interface_java;

import ss07_abstract_class_and_interface_java.resizeable.Resizeable;

public class Rectangle extends ss06_inheritance.Rectangle implements Resizeable {
  @Override
 public double resize(double percent){
      return (percent/100)*getPerimeter();
  }

}
