package com.example.corejava.basics;

/**
 * Demonstrates Object-Oriented Programming (OOP) concepts in Java
 */
public class OOPExample {
    public static void demonstrate() {
        System.out.println("OOP Example:");
        // Inheritance and Polymorphism
        Animal dog = new Dog("Buddy");
        Animal cat = new Cat("Whiskers");
        dog.speak();
        cat.speak();
        // Encapsulation
        Person person = new Person("Alice", 25);
        System.out.println("  Person: " + person.getName() + ", Age: " + person.getAge());
        person.setAge(26);
        System.out.println("  Updated Age: " + person.getAge());
    }
}

class Animal {
    protected String name;
    public Animal(String name) { this.name = name; }
    public void speak() { System.out.println("  Animal speaks"); }
}
class Dog extends Animal {
    public Dog(String name) { super(name); }
    @Override public void speak() { System.out.println("  Dog " + name + " barks"); }
}
class Cat extends Animal {
    public Cat(String name) { super(name); }
    @Override public void speak() { System.out.println("  Cat " + name + " meows"); }
}
class Person {
    private String name;
    private int age;
    public Person(String name, int age) { this.name = name; this.age = age; }
    public String getName() { return name; }
    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }
}
