public class Encapsulation {

   private String name;
    int age;


    void display(){
       System.out.println(name);
       System.out.println(age);
    }


    void setter(String n1, int num){
        name = n1;
        age=num;
    }

    String getter(){
        return name;
    }

       
}

class Main{

    public static void main(String[] args) {

        Encapsulation obj = new Encapsulation();
        obj.setter("Joy", 20);
        obj.display();
        System.out.println(obj.getter());


        
    }
}

