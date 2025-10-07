class inheritence{
    public static void main(String[] args) {
        // Fish shark = new Fish();
        // shark.swim();
        // shark.eat();

        Bird b1=new Bird();
        b1.eat();
    b1.fly();
    Fish f1=new Fish();
    f1.eat();
        
    }
}

//Base class
class Animal{
    String color;
    void eat(){
        System.out.println("Eating");
    }
    void breathe(){
    System.out.println("Breathes");
}
}

//single level inheritence
// //Derived class
// class Fish extends Animal{
//     int fins;
//     void swim(){
//         System.out.println("Swimming");
//     }
// }


//multilevel inheritence
//derived from prev cls
// class Mammals extends Animal{
//     int legs;
// }
//derived from prev cls
// class Dog extends Mammals{
//     String breed;
// }

//hierarchial inheritence  2 or more child classes
class Bird extends Animal{
    int wings;
    void fly(){
        System.out.println("Flying");
    }
}
class Fish extends Animal{
    int fins;
   void swim(){
    System.out.println("Swimming");
   }
}

//hybrid inheritence