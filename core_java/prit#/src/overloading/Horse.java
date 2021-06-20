package overloading;

class Animal{
public void print(){
System.out.println("Animal print method");
}
}
 
public class Horse extends Animal{
public void print(){
//super.print();
System.out.println("Horse specific Print method");
}
public static void main(String args[]) {
Horse s = new Horse();
s.super.print();
                s.print();
 
}
}