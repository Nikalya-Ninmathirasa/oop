public class Construct {

   int age ;
   int rollno;
  

  Construct(int a, int b){
  System.out.println("Initial Call");
   age =a;
   rollno =b;

 }


 void display(){
    System.out.println(rollno);
 }

  
   
    public static void main(String[] args) {

        Construct obj = new Construct(30,201);
       


        System.out.println(obj.age);
        System.out.println(obj.rollno);
        

        
    }
    
}
