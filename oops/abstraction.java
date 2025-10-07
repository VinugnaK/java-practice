class abstraction{
    public static void main(String[] args) {
mustang my = new mustang();
//Animal - horse - mustang
//for b/w
        // Horse h = new Horse();
        // h.eat();
        // h.walk();
        // System.out.println(h.color);
        // h.changecolor();
        // System.out.println(h.color);
        // Chicken c = new Chicken();
        // c.eat();
        // c.walk();

        
        //u willf get eror becoz abstract cls cannot create objects
        // Animal a = new Animal();

    }
}

abstract class Animal{
    String color;
    Animal(){
        System.out.println("Anmal constructor called");
        color="bbrown";
    }
    void eat(){
        System.out.println("animat eats");
    }
    //given only idea not implementation that every cls shd have walk function
    abstract void walk();
}

class Horse extends Animal{
    Horse(){
        System.out.println("Horse constructor called");
    }
    void changecolor(){
        color="darkbrown";
    }
    void walk(){
        System.out.println("Horse is walking");
    }
}
class mustang extends Horse{
    mustang(){
        System.out.println("Mustang constructor called");
    }
}

class Chicken extends Animal{

     Chicken() {
        System.out.println("Chicken constructor called");
    }
    
    void changecolor(){
        color="white";
    }
    void walk(){
        System.out.println("Chicken is walking");
    }
}