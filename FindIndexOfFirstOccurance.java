public class FindIndexOfFirstOccurance {
    public static void main(String[] args) {
        String str1 = "omkar";
        String str2 = "kaqr";

        int result = strStr(str1,str2);
        System.out.println(result);
    }
      public static int strStr(String haystack, String needle) {
        // boolean result = haystack.contains(needle);
        // if(result){
        //     return haystack.indexOf(needle);
        // }
        return haystack.indexOf(needle);
    }
}
