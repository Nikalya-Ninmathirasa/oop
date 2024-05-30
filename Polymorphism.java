public class Polymorphism {

    public static void main(String[] args) {

        sample obj = new sample();
        obj.display();
        obj.display(20);
        
    }
    
}


class sample{

    void display(){
        System.out.println("I am a void function");
    }

    void display(int a){
        System.out.println(a);
    }
}
