package Lecture_18OOPS;

public class ComplexTest {
    public static void main(String[] args) {
        ComplexNo c1 = new ComplexNo(2,3);
        c1.print();

        c1.setReal(10);
        c1.setImaginary(30);
        c1.print();

        ComplexNo c2 = new ComplexNo(1,5);
        c1.add(c2);
        c1.print();
        c2.print();

        ComplexNo c3 = new ComplexNo(3,2);
        c3.multiply(c2);
        c3.print();
        c2.print();

        ComplexNo c4 = ComplexNo.add(c1,c3);
        c1.print();
        c3.print();
        c4.print();

        ComplexNo c5 = c1.conjugate();
        c5.print();

    }
}
