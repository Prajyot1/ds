package Lecture_11;

public class EquilibriumIndex {
    public static int findEuilibrium(int[] array){
        int sumL=0;
        int sumR=0;
        int totalSum =0;
        for (int i = 0; i < array.length; i++) {
            totalSum += array[i];
        }
        sumR = totalSum;
        for (int i = 0; i < array.length ; i++) {
            sumR -= array[i];
            if (sumL == sumR){
                //System.out.println(" Equilibrium Index is "+i);
                return i;
            }
            sumL += array[i];
        }
        return -1;
    }
    public static void main(String[] args) {
        //int[] array = {1,4,9,3,2};
        int[] array ={1,4,6};
        //int[] array ={1,-1,4};
        int result = findEuilibrium(array);
        if ((result == -1)) {
            System.out.println("No Equlibrium index found ");
        } else {
            System.out.println("Euilibrium Index Found at "+result);
        }
    }
}
