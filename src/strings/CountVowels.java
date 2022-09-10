package strings;

public class CountVowels {

    public static void vowel(String s) {
        int v = 0;
        s = s.toLowerCase();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u')
                ;
            {
                v++;
            }
        }
        System.out.println(v);
    }

    public static void main(String[] args) {

        vowel("hello");
    }
}



