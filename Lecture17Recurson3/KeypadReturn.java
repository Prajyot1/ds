package Lecture17Recurson3;

import java.util.Arrays;

public class KeypadReturn {
    public static String[] findKeypad(int num){
        // base
        if(num == 0){
            String[] ans = {""};
            return ans;
        }
        // recursive
        String[] smAns = findKeypad(num / 10);
        // cal
        String[] toAdd = help(num%10);
        String[] ans = new String[smAns.length * toAdd.length];
        int k = 0;
        for (int i = 0; i < smAns.length; i++) {
            for (int j = 0; j < toAdd.length; j++) {
                ans[k] = smAns[i] + toAdd[j];
                k++;
            }
        }
        return ans;
    }
    private static String[] help(int num){
        if (num == 2) {
            String[]  str = {"a","b","c"};
            return str;
        }
        else if (num == 3) {
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
        }if (num == 7) {
            String[]  str = {"p","q","r"};
            return str;
        }if (num == 8) {
            String[]  str = {"s","t","u","v"};
            return str;
        }if (num == 9) {
            String[]  str = {"w","x","y","z"};
            return str;
        }

    String[] ans = {""};
        return ans;
    }

    public static void main(String[] args) {
        int input = 234;
        System.out.println(Arrays.toString(findKeypad(input)));
    }
}
