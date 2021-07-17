package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Person p1 = new Person();
        p1.setName("ABC");

        System.out.println("Person 1 - " + p1.getId() + " : " + p1.getName());
        // p1.sayHello();

        Employee contractor = new Contractor("contractor", 10, 10);
        Employee fullTimeEmployee = new FullTimeEmployee("full time employee", 8);
        System.out.println(contractor.calculateSalary());
        System.out.println(fullTimeEmployee.calculateSalary());
    }
}


class Person {

    private double id;
    private String name;

    public Person() {
        // Only Person class can access and assign
        id = Math.random();
        sayHello();
    }

    // This method is protected for giving access within Person class only
    private void sayHello() {
        System.out.println("Hello - " + getId());
    }

    public double getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}


abstract  class Sum {
    public abstract int sumOfTow(int n1, int n2);

    public void display() {
        System.out.println("Method of sum class");
    }
}

class Calculate extends Sum {
    @Override
    public int sumOfTow(int n1, int n2) {
        return n1 + n2;
    }
}


abstract class Employee {

    private String name;
    private int paymentPerHour;

    public Employee(String name, int paymentPerHour) {
        this.name = name;
        this.paymentPerHour = paymentPerHour;
    }

    public abstract int calculateSalary();
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getPaymentPerHour() {
        return paymentPerHour;
    }
    public void setPaymentPerHour(int paymentPerHour) {
        this.paymentPerHour = paymentPerHour;
    }
}


 class Contractor extends Employee {

    private int workingHours;
    public Contractor(String name, int paymentPerHour, int workingHours) {
        super(name, paymentPerHour);
        this.workingHours = workingHours;
    }
    @Override
    public int calculateSalary() {
        return getPaymentPerHour() * workingHours;
    }
}


class FullTimeEmployee extends Employee {
    public FullTimeEmployee(String name, int paymentPerHour) {
        super(name, paymentPerHour);
    }
    @Override
    public int calculateSalary() {
        return getPaymentPerHour() * 8;
    }
}



abstract class Shape {
    String color;

    // these are abstract methods
    abstract double area();

    public abstract String toString();

    // abstract class can have constructor
    public Shape(String color) {
        System.out.println("Shape constructor called");
        this.color = color;
    }

    // this is a concrete method
    public String getColor() {
        return color;
    }
}


class Circle extends Shape {
    double radius;

    public Circle(String color, double radius) {

        // calling Shape constructor
        super(color);
        System.out.println("Circle constructor called");
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public String toString() {
        return "Circle color is " + super.color + "and area is : " + area();
    }

}

class Rectangle extends Shape {

    double length;
    double width;

    public Rectangle(String color, double length, double width) {
        // calling Shape constructor
        super(color);
        System.out.println("Rectangle constructor called");
        this.length = length;
        this.width = width;
    }

    @Override
    double area() {
        return length * width;
    }

    @Override
    public String toString() {
        return "Rectangle color is " + super.color + "and area is : " + area();
    }

}

 class AbstractionTest {
    public static void main(String[] args) {
        Shape s1 = new Circle("Red", 2.2);
        Shape s2 = new Rectangle("Yellow", 2, 4);

        System.out.println(s1.toString());
        System.out.println(s2.toString());
    }
}


//An abstract class is a class that is declared with abstract keyword.
//        An abstract method is a method that is declared without an implementation.
//        An abstract class may or may not have all abstract methods. Some of them can be concrete methods
//        A method defined abstract must always be redefined in the subclass, thus making overriding compulsory OR either make subclass itself abstract.
//        Any class that contains one or more abstract methods must also be declared with abstract keyword.
//        There can be no object of an abstract class. That is, an abstract class can not be directly instantiated with the new operator.
//        An abstract class can have parameterized constructors and default constructor is always present in an abstract class.




/**
 * This is parent (also called as super or base) class Animal
 *
 */
class Animal {
    int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void sound() {
        System.out.println("By default it is mute");
    }
}

/**
 * This is subclass (also called as derived or child or extended) Dog which is extending Animal
 *
 */
class Dog extends Animal {

    // Own behavior
    private void bark() {
        System.out.println("Dog '" + getId() + "' is barking");
    }

    // Overriding super class behavior
    @Override
    public void sound() {
        bark();
    }
}





