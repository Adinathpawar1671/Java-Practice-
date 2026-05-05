public class superKeyword {
    public static void main(String[] args) {
        Horse h1 = new Horse();
        System.out.println(h1.color);
    }
}
 class Animal{
    String color;
    Animal(){
        System.out.println("Animal constructor called");
    }
}
class Horse extends Animal{
    Horse(){
        // super(); // this will call animal constructor first but it also default behaviour of extended class, ie even if I dont write super(), it will call the animal constructor first

        super.color = "brown";//We can access the color properties and name it like this!
        System.out.println("Horse constructor called");
    }
}
