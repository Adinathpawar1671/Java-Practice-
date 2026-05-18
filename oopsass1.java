public class oopsass1 {
    public static void main(String[] args) {
        Complex a = new Complex(3,8);
        Complex b = new Complex(4,6);
        System.out.println(a.add(a, b));
        System.out.println(a.Substract(a, b));
        System.out.println(a.mul(a, b));
    }
}
class Complex{
    float real;
    float img;
    Complex(float r, float i){
        real = r;
        img = i;
    }       
    public Float add(Complex a, Complex b){
        return ((a.real + b.real)+(a.img+b.img));
    }
    public Float Substract(Complex a, Complex b){
        return ((a.real - b.real)-(a.img-b.img));
    }
    public Float mul(Complex a, Complex b){
        return ((a.real * b.real)+(a.real*b.img))+((a.img*b.real)+(a.img*b.real));
    }
}