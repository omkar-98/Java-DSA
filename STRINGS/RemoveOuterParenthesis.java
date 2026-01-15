import java.util.*;
public class RemoveOuterParenthesis {
    public static void main(String[] args) {
        String str = "(()())";
        String result = removePara(str);
        System.out.println(result);
    }

    // public static String removePara(String str) {
    // int len = str.length(), count = 0;
    // StringBuilder result = new StringBuilder();

    // for (int i = 0; i < len; i++) {
    // char ch = str.charAt(i);

    // if (ch == '(') {

    // if (count > 0) {
    // result.append(ch);
    // }
    // count++;
    // } else if (ch == ')') {
    // if (count > 0) {
    // result.append(ch);
    // }
    // count--;
    // }
    // }
    // return result.toString();
    // }

    public static String removePara(String str) {

        int len = str.length();
        Stack <Character>st = new Stack<>();
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < len; i++) {
            char ch = str.charAt(i);

            if(ch == '('){
                if(st.size() > 0){
                    result.append(ch);
                }
                st.push(ch);
            }

            else{
                st.pop();  // important to remove first else 1 outer closing parenthesis added 

                if(st.size() > 0){
                    result.append(ch);
                }
            }
        }
        return result.toString();
    }
}
