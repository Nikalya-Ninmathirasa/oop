public class Overriding {

    public static void main(String[] args) {
        
        Dog obj = new Dog();
        Cat obj2 = new Cat();
        System.out.println(obj.nolegs);
        System.out.println(obj.canBark);
        System.out.println(obj2.name);
        obj.eat();
        obj.walk();
       
        
    }

    
}



class Animal {

    int nolegs =4;

     void eat(){
        System.out.println("eating");
    }

     void walk(){
        System.out.println("walking");
    }
}

class Dog extends Animal {
    
    boolean canBark = true;

    int nolegs =5;
    

}


class Cat extends Animal  {

    String name = "Alex";

    
}

