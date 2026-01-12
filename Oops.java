//     class Pen{
//     String color;
//     String type;
//     public void write(){//method
//         System.out.println("writing something");
//     }
//     public void printColor(){
//         System.out.println(this.color);//this tells the methods that which object is called
//     }
// }
// public class Oops{
//     public static void main(String[] args) {
//         Pen pen1=new Pen();//creating object
//         pen1.color="blue";
//         pen1.type="gel";
//         // System.out.println(pen1.color);
//         // System.out.println(pen1.type);
//         // pen1.write();//method calling
//         Pen pen2=new Pen();
//         pen2.color="black";
//         pen2.type="ballpoint";

//         pen1.printColor();
//         pen2.printColor();
//     }
// }

//constructor:same name as class name and no return type and for one object constructor can be called only once
// class Student{
//     String name;
//     int age;
//     public void printInfo(){
//         System.out.println(this.name);
//         System.out.println(this.age);
//     }
//     // Student(){ //non parameterized constructor
//     //     System.out.println("constructor called");
//     // }
    
//     // Student(String name,int age){ //parameterized constructor
//     //     this.name=name;
//     //     this.age=age;

//     Student(Student s2){ //default  constructor
//     this.name=s2.name;
//     this.age=s2.age;
// }
// Student(){}
//     }
// public class Oops{
//     public static void main(String[] args) {
// // Student std1= new Student(); //non parameterized constructor
// // std1.name="suhani";
// // std1.age=21;

// // Student std1= new Student("suhani",20);//parameterized constructor
// // std1.printInfo();

// Student s1= new Student();
// s1.name="suhani";
// s1.age=21;

// Student s2=new Student(s1);

// s2.printInfo();
//     }
// }

//polymorphism:method overloading(compile-time) and method overriding(run-time)
//in method overloading same method name with different parameters or different data types of parameters
//in method overriding same method name with same parameters in parent and child class

//inheritance
// class Animal{
//     void eat(){
//         System.out.println("eating...");
//     }
// }
//     class Dog extends Animal{//single inheritance
//         void bark(){
//             System.out.println("barking...");
//         }
//     }
// class Puppy extends Dog{//multilevel inheritance
//     void weep(){
//         System.out.println("weeping...");
//     }
// }
// class Penguin extends Animal{//hierarchical inheritance
//     void swim(){
//         System.out.println("swimming...");
//     }
// }
//  public class Oops{
//     public static void main(String[] args) {
//         Puppy p=new Puppy();
//         p.weep();
//         p.bark();
//         p.eat();

//         Penguin pg=new Penguin();
//         pg.swim();
//         pg.eat();
    
    
//    bank.Account acc1 = new bank.Account();
//    acc1.name ="suhani";
//     }}

//abstraction
// abstract class Animal{
// //for abstract we cannot create object
// Animal(){
//     System.out.println("animal is created");
// }
//     abstract void walk();
// public void eats(){
//     System.out.println("eating...");
// }
//     }

// class Horse extends Animal{
//     Horse(){
//         System.out.println("horse is created");
//     }
//     public void walk(){
//         System.out.println("walks on 4 legs");
//     }
// }
//     class Chicken extends Animal{
//         public void walk(){
//             System.out.println("walks on 2 legs");
//         }
//     }
//     public class Oops{
//         public static void main(String[] args) {
//             Horse a1=new Horse();
//             a1.walk();
//             Chicken a2=new Chicken();
//             a2.eats();
//         }
//     }

//interface
// interface Animal{
//     void eats();
// }
// interface Herbivore {

// }
// class Horse implements Animal, Herbivore{
//     public void eats(){
//         System.out.println("eats grass");
//     }
    
// }
//     public class Oops{
//         public static void main(String[] args) {
//             Horse h1=new Horse();
//             h1.eats();
            
//         }
//     }
    //static: belongs to class rather than object