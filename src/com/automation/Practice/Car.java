package com.Saikumarjava;

public class Car {
      String name,color,model;
      double price;
      int capacity;
     public Car(String name,String color)//constructor
     {
    	 this.name=name;
    	 this.color=color;
     }
     public Car(String name,String color,double price)
     {
    	 this.name=name;
    	 this.color=color;
    	 this.price=price;
     }
     public Car(String name,String color,double price,int capacity,String model)
     {
    	 this.name=name;
    	 this.color=color;
    	 this.price=price;
    	 this.capacity=capacity;
    	 this.model=model;
     }
     public static void main(String args[])
     {
    	 Car c1=new Car("Audi","Black");
    	 Car c2=new Car("Benz","White",6000000);
    	 Car c3=new Car("Benz","Black",4600000,6,"Y3");
    	 System.out.println(c1.name+" "+c1.color);
    	 System.out.println(c2.name+" "+c2.color+" "+c2.price);
    	 System.out.println(c3.name+" "+c3.color+" "+c3.price+" Capacity:"+c3.capacity+" Model:"+c3.model);

     }
}
