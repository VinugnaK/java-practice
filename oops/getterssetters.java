class getterssetters{
   
public static void main(String[] args) {
    //creating an object
    pen p1 = new pen();//created a pen obj called p1
    p1.setcolor("orange");
    System.out.println(p1.getcolor());
    p1.settip(5);
    System.out.println(p1.gettip());
    p1.setcolor("yellow");
    System.out.println(p1.getcolor());

   
}
    

}

class pen{
    //define properties and functions
    private String color;
    private int tip;
      String getcolor(){
        return this.color;
     }
     void setcolor(String newColor){
      this.color=newColor;
    }
     int gettip(){
        return this.tip;
     }
    void settip(int newtip){
       this.tip=newtip;
    }
}



