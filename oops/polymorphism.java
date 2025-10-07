class polymorphism{
    public static void main(String[] args) {
       calculator c1=new calculator();
       //method overloading
       System.out.println(c1.sum(2,3));
       System.out.println(c1.sum(2.0f,4.0f));
       System.out.println(c1.sum(7,8,9));

       Fish f1 = new Fish();
       f1.eat();
       
    }
}
class Animal{
    void eat(){
        System.out.println("Eating");
    }
}
class Fish extends Animal{
    void eat(){
        System.out.println("Fish is eating");
    }
}
class calculator{
    //method overloading (compile time)(static)
    int sum(int a,int b){
        return a+b;
    }
    float sum(float a ,float b){
        return a+b;
    }
    int sum(int a,int b,int c){
        return a+b+c;
    }
}