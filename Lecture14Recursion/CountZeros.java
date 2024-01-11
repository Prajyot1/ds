package Lecture14Recursion;

public class CountZeros {
    public static int NofoZeros(int number){
        if(number < 10){
//            if (number==0)
//                return 1;
//            else
                return 0;
        }
        if((number % 10 )== 0){
            return 1 + NofoZeros(number/10) ;
        }
        else
            return NofoZeros((number/10));

    }
    public static void main(String[] args) {
//      int num = 1020400;
      int num = 708300;
        int ans = NofoZeros(num);
        System.out.println(ans);
    }
}


