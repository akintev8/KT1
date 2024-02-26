public class Zad3 {
    public static void main(String[] args) {
        String[] strs = {"ass","asds","as","asdsds"};
        String word = strs[0];
        String res="";
        boolean isChange=true;
        for (int i = 1; i < strs.length; i++) {
            if (strs[i].length() > word.length()) {
                for (int j = 0; j < word.length(); j++) {
                    if (word.charAt(j) != strs[i].charAt(j)&& j==0) {
                        word = "";
                        break;
                    } else if (word.charAt(j) != strs[i].charAt(j)&& j!=0) {
                        word=word.substring(0, word.length()-1);
                    }
                }
            } else {
                for (int j = 0; j < strs[i].length(); j++) {
                    if (word.charAt(j) != strs[i].charAt(j)&&j==0) {
                        word = "";
                        break;
                    } else if (word.charAt(j) != strs[i].charAt(j)&&j!=0) {
                        word = word.substring(0, j);
                        break;
                    }
                }
            }
        }
        System.out.println(word);

    }
}
