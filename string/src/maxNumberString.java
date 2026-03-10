public class maxNumberString {

    public static String purify(String s) {
        int i = 0;
        while (i < s.length() && s.charAt(i) == '0') {
            i++;
        }
        return (i == s.length()) ? "0" : s.substring(i);
    }

    public static String max(String a, String b) {
        String s = purify(a);
        String t = purify(b);


        if (s.length() > t.length()) return a;
        if (s.length() < t.length()) return b;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != t.charAt(i)) {
                return (s.charAt(i) > t.charAt(i)) ? a : b;
            }
        }

        return s.length() >= t.length() ? a : b;
    }

    public static void main(String[] args) {
        String[] arr = {
                "2000",
                "23144148",
                "0001230456787979"
        };

        String maxS = arr[0];
        for (int i = 1; i < arr.length; i++) {
            maxS = max(maxS, arr[i]);
        }

        System.out.println(maxS);
    }
}
