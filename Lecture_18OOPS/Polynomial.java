package Lecture_18OOPS;

public class Polynomial {
    DynamicArray Coefficient;

    Polynomial(){
        DynamicArray dA = new DynamicArray();
    }

    public void setCoefficient(DynamicArray coefficient) {
        Coefficient = coefficient;
    }
}
