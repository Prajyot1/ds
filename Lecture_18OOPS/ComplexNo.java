package Lecture_18OOPS;

public class ComplexNo {
    private int real;
    private int imaginary;

    ComplexNo(int real , int imaginary){
        this.real = real;
        this.imaginary = imaginary;
    }

    public int getImaginary() {
        return imaginary + 'i';
    }

    public int getReal() {
        return real;
    }
    public void setReal(int real){
        this.real = real;
    }
    public void setImaginary(int imaginary){
        this.imaginary = imaginary;
    }
    public void print(){
        System.out.println(real +" + "+imaginary+"i");
    }
    public void add(ComplexNo c){
        this.real = this.real + c.real ;
        this.imaginary = this.imaginary + c.imaginary ;
    }
    public void multiply(ComplexNo c){
        this.real = this.real * c.real;
        this.imaginary = this.imaginary * c.imaginary;
    }
    public static ComplexNo add(ComplexNo c1 , ComplexNo c2){
        ComplexNo c = new ComplexNo(0,0);
         c.real = c1.real + c2.real;
         c.imaginary = c1.imaginary + c2.imaginary;
        return c;
    }
    public ComplexNo conjugate(){
        ComplexNo c1 = new ComplexNo(0,0);
        c1.real = this.real;
        c1.imaginary = - this.imaginary;
        return c1;
    }
}
