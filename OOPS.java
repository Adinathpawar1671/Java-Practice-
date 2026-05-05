public class OOPS{
    public static void main(String[] args) {
        Pen p1 = new Pen(); //created a Pen object called p1
        p1.setColor("red");
        System.out.println(p1.getColor());

        // BankAccount b1 = new BankAccount();
        // b1.username="Adinath";
        // System.out.println("username : "+b1.username);
        // b1.setPassword("mynameisadinath");
    }
}

class Pen{
    // properties 
    private String color;
    private int tip;

    // functions
    public String getColor(){
        return this.color;
    }

    public int getTip(){
        return this.tip;
    }

    public void setColor(String color){
        this.color = color;
    }

    void setip(int newTip){
        tip = newTip;
    }
}

class Animal{
    String name;
    int age;
    float percentage;

    void calPercentage(float math, float english, float hindi){
        percentage = (math + english + hindi) /3;
    }
}

class BankAccount{
    public String username;
    private String password;

    public void setPassword(String pwd){
        password = pwd;
    }

}