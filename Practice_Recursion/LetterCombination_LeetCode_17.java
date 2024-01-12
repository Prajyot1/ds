package Practice_Recursion;
import java.util.List;
import java.util.LinkedList;
public class LetterCombination_LeetCode_17 {
    public static String help(int num){
        if(num == 2) return "abc";
        else if(num == 3) return "def";
        else if(num == 4) return "ghi";
        else if(num == 5) return "jkl";
        else if(num == 6) return "mno";
        else if(num == 7) return "pqrs";
        else if(num == 8) return "tuv";
        else if(num == 9) return "wxyz";
        else return "";
    }
    public static List<String> letterCombinations(String digits) {
        List<String> ans = new LinkedList<>();
        lett(digits,"",ans);
        return ans;
    }
    public static void lett(String digits , String sm , List<String> ans){
        // base
        if(digits.length() == 0){
            ans.add(sm);
            return;
        }
        // call
        char ch = digits.charAt(0);
        String code = help(Character.getNumericValue(ch));
        System.out.println(code);
        System.out.println(ch);
        for(int i = 0; i < code.length(); i++){
            lett(digits.substring(1) , code.charAt(i) + sm ,ans);
        }
    }

    public static void main(String[] args) {
        List<String> ans = letterCombinations("523");
        System.out.println(ans);
    }
}
