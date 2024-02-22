public class Zad3 {
    public static void main(String[] args) {
        String[] strs = {"dog","racecar","car"};
        String word = strs[0];
        String res="";
        for (int i = 1; i < strs.length; i++) {
            if (strs[i].length() > word.length()) {
                for (int j = 0; j < word.length(); j++) {
                    if (word.charAt(j) != strs[i].charAt(j)) {
                        res = word.substring(j, word.length() - 1);
                        break;
                    }
                }
            } else {
                for (int j = 0; j < strs[i].length(); j++) {
                    if (word.charAt(j) != strs[i].charAt(j)) {
                        res = word.substring(0, j);
                        break;
                    }
                }
            }
        }
        System.out.println(res);
    }
}
