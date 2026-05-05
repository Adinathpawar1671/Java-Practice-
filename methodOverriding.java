public class methodOverriding {
    public static void main(String[] args) {
        Dog richard = new Dog();
        richard.eat();
    }
    
}

class Animal{
    public void eat(){
        System.out.println("eats grass");
    }
}

class Dog extends Animal{
    public void eat(){
        System.out.println("eats water");
    }
}
