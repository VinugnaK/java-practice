public class constructors{
    public static void main(String[] args) {
        student s1=new student("Vinugna",3);
        System.out.println(s1.name);
         
          student s3=new student("Vinugna");
           student s4=new student(3);
           s1.marks[0]=100;
           s1.marks[1]=80;
           s1.marks[2]=50;
           student s2=new student(s1);
           s1.marks[2]=99;

           for(int i=0;i<3;i++){
            System.out.println(s2.marks[i]);
           }
           
    }      
}
class student{
 String name;
 int roll;
 String password;
 int marks[];

 
 student(student s1){

    //shallow copy constructor
    // marks=new int[3];
    // this.name=s1.name;
    // this.roll=s1.roll;
    // this.marks=s1.marks;

    //deep copy constructor
    marks = new int[3];
    this.name = s1.name;
    this.roll=s1.roll;
    for(int i=0;i<marks.length;i++){
        this.marks[i]=s1.marks[i];
    }

    
   
 }
   //parametrized
    student(String name,int roll) {
        marks=new int[3];
         this.name=name;
         this.roll=roll;
    }
    //non parametrized
    student(){
        marks=new int[3];
    System.out.println("constructor is called");
    }
    //parametrized
    student(int roll){
        marks=new int[3];
        this.roll=roll;
    }
    //parametrized
    student(String name){
        marks=new int[3];
        this.name=name;
    }

 
}