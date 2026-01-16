public class ReverseAString {
    public static void main(String[] args) {
        String str = "    a good   example    ";
        String result = reversedString(str);
        System.out.println(result);
    }

    public static String reversedString(String str){
        StringBuilder result = new StringBuilder("");
        str = str.trim();
        String arr[] = str.split(" ");

        for(int i= arr.length-1; i>=0;i--){
            result.append(arr[i]);
            result.append(" ");
        }
        String finalString = result.toString();
        return finalString.trim();
    }
}
