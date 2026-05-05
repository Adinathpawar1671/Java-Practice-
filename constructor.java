public class constructor {
    public static void main(String[] args) {
        Student s1 = new Student("Adinath", 02);

        s1.marks[0] = 100;
        s1.marks[1] = 80;
        s1.marks[2] = 90;

        Student s2 = new Student(s1);
        s1.marks[1] = 88;

        for(int i = 0; i<3; i++){
            System.out.print(s2.marks[i]+" ");
        }
    }
}

class Student{
    public String name;
    public int roll_no;
    public int marks[];
    Student(){
        marks = new int[3];
        System.out.println("Constructor is called.....");

    }
    Student(String name, int roll_no){ //parameterized constructor 
        marks = new int[3];
        this.name = name;
        this.roll_no= roll_no;
    }

    // Student(Student obj1){
    //     marks = new int[3];
    //     this.name = obj1.name;
    //     this.roll_no = obj1.roll_no;
    //     this.marks = obj1.marks; //Shallow Copy c
    // }

    Student(Student obj1){
        marks = new int[3]; 
        this.name = obj1.name;
        this.roll_no = obj1.roll_no;
        for(int i=0; i<3; i++){
            this.marks[i] = obj1.marks[i]; //Deep copy
        }
    }
}
