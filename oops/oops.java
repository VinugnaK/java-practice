public class oops{
public static void main(String[] args) {
    //creating an object
    pen p1 = new pen();//created a pen obj called p1
    p1.setcolor("orange");
    System.out.println(p1.color);
    p1.settip(5);
    System.out.println(p1.tip);

    Bankaccount ba=new Bankaccount();
    ba.username="Vinugna";
    //ba.password="1234";....u will get error becoz password is private
    //here in set pass it is calling function and then it is using,here this class iisnt changing the password the function setpass is changing,in which that class can acces the password(private) variable
    ba.setpass("qwertyu");
}
    
}


class pen{
    //define properties and functions
    String color;
    int tip;

     void setcolor(String newColor){
      color=newColor;
    }
    void settip(int newtip){
        tip=newtip;
    }
}

class student{
String name;
int age;
float percentage;//cgps

void calcpercentage(int phy,int chem,int math){
    percentage=(phy+chem+math)/3;
}


}
class Bankaccount{
    public String username;
    private String password;

    public void setpass(String pwd){
        password=pwd;
    }

}