package Lecture17Recurson3;

public class printKeypadCombination {

    private static String[] help(int num){
        if (num == 2) {
            String[]  str = {"a","b","c"};
            return str;
        }else if (num == 3) {
            String[]  str = {"d","e","f"};
            return str;
        }else if (num == 4) {
            String[]  str = {"g","h","i"};
            return str;
        }else if (num == 5) {
            String[]  str = {"j","k","l"};
            return str;
        }else if (num == 6) {
            String[]  str = {"m","n","o"};
            return str;
        }else if (num == 7) {
            String[]  str = {"p","q","r","s"};
            return str;
        }else if (num == 8) {
            String[]  str = {"t","u","v"};
            return str;
        }else if (num == 9) {
            String[]  str = {"w","x","y","z"};
            return str;
        }
        String[]  str = {""};
        return str;
    }

        public static void printcombination(int num , String stringOutputSoFar){
        if (num <= 0) {
            System.out.println(stringOutputSoFar);
            return;
        }
        String [] combinaton = help(num%10);
            for (String ch:combinaton) {
                printcombination(num/10,ch+stringOutputSoFar);
            }

    }

    public static void printcombination(int num){
        printcombination(num,"");
    }

    public static void main(String[] args) {
        int num = 459;
        printcombination(num);
    }
}

