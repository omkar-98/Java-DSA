public class ReverseWords_in_String {
    public static void main(String[] args) {

        String str = "omkar daptare";
        String result = reverseWordString(str);
        System.out.println(result);

    }

    // ***************** APPROACH 1 **********************

    public static String reverseWordString(String str) {
        int len = str.length();
        str = reverse(str);
        System.out.println("after reverse : " + str );
        String result = "";

        for (int i = 0; i < len; i++) {
            String word = "";
            while (i < len && str.charAt(i) != ' ') {
                word += str.charAt(i);
                i++;
            }
           word =  reverse(word);

            if (word.length() > 0) {
                result += " ";
                result += word;
            }
        }

        return result.substring(1);

    }

    // reverse a string
    public static String reverse(String str) {
        int len = str.length();
        StringBuffer sb = new StringBuffer();

        for (int i = len - 1; i >= 0; i--) {
            sb.append(str.charAt(i));
        }
        String result = sb.toString();
        return result;
    }

    // ********************************* APPROACH 2   this is only for reverse string (Not suitable for this question ) ******************************

    // public static String reverseWordString(String str) {

    // char[] arr = str.toCharArray();
    // int left = 0, right = 0;
    // while (right < str.length()) {
    // if (arr[right] == ' ') {
    // reverseArray(arr, left, right - 1);
    // left = right + 1;
    // }
    // right++;
    // }

    // reverseArray(arr, left, right - 1);
    // left = 0;
    // right = str.length() - 1;
    // reverseArray(arr, left, right);
    // return new String(arr);
    // }

    // private static void reverseArray(char[] arr, int left, int right) {

    // while (left < right) {
    // char temp = arr[left];
    // arr[left] = arr[right];
    // arr[right] = temp;
    // left++;
    // right--;
    // }
    // }

}
