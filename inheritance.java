public class inheritance {
    public static void main(String[] args) {
        
        // Fish shark = new Fish();
        // shark.eat();

        Dog dobby = new Dog();
        dobby.eat();
        dobby.legs = 4;
        System.out.println(dobby.legs);
    }
   
}

class Animal{
    String color;

    void eat(){
        System.out.println("Eats");
    }

    void breath(){
        System.out.println("breaths");
    }
}

// class Fish extends Animal{
//     int fins;

//     void swim(){
//         System.out.println("Swims");
//     }
// }

class Mammals extends Animal{
    int legs;
}

class Dog extends Mammals{
    String breed;
}