 class Class{
 
    
        // variables
       
        String name;
        int rollno;

        //method

       void display(){

            System.out.println(name);
            System.out.println(rollno);

            

       } 
  class Main {
	
            public static void main (String[] args) {
                    
                    Class obj = new Class();
                    obj.name = "Joe";
                    obj.rollno = 1001;
                    
                    obj.display();
                    
                }
            }
       
    
    
}