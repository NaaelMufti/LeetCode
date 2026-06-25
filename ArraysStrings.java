public class ArraysStrings 
{
    public static void main(String[] args)  
    {
        String str = "LeetCode 75 Arrays and Strings";
        System.out.println(str);

        // 1768
        System.out.println("Merge Strings Alternatively");
        String word1 = "abc";
        String word2 = "pqr";
        System.out.println("abc + pqr = " + mergeAlternately(word1, word2));

        String word3 = "ab";
        String word4 = "pqrs";
        System.out.println("ab + pqrs = " + mergeAlternately(word3, word4));
    }

    // 1768. Merge Strings Alternately
    public static String mergeAlternately(String word1, String word2) 
    {
          String merged = "";
          int i = 0;
          int j = 0;

          while (i < word1.length() && j < word2.length())
          {
            merged += word1.charAt(i++);
            merged += word2.charAt(j++);
          }

          if (i < word1.length())
          {
            while (i < word1.length())
                merged += word1.charAt(i++);
          } else if (j < word2.length())
          {
            while (j < word2.length())
                merged += word2.charAt(j++);
          }
        
        return merged;
    }
}

