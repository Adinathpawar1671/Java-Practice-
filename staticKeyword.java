public class staticKeyword {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("Adinath");
        s1.getName();
        s1.schoolName = "CPS";
        System.out.println(s1.percentage(17, 15, 12, 60));

        Student s2 = new Student();
        System.out.println("School name of s2 is : "+ s2.schoolName);
    }
}

class Student{
    String name;
    String roll_no;

    static String schoolName;

    static float percentage(int a, int b, int c, int totalMarks){
        return ((float)(a+b+c)/totalMarks) * 100;   
    }

    int totalMarks(int a, int b, int c){
        return a+b+c;
    }

    public void setName(String name){
        this.name = name;
    }

    public void getName(){
        System.out.println(this.name);
    }
}
