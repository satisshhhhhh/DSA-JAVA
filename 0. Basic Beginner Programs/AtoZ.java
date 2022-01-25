public class AtoZ {
    // System.out.println('a' + 'b'); -> char-a + char-b
    // This wont print ab cuz '' -> char. It will convert it into ASCII value
    // and return an Integer i.e. 195

    // System.out.println('a' + 3);
    // This will return 100 that is d in ASCII

    // System.out.println((char)('a' + 3));
    // This will print d cuz we convert the 100 into character

    public static void main(String[] args) {
        // NOT A GOOD/OPTIMAL SOLUTION - to much memory wastage
        String series = "";
        for (int i = 0; i < 26; i++) {
            char ch = (char) ('a' + i);
            series = series + ch;
        }
        System.out.println(series);

        // STRINGBUILDER
        // Only one object is made and changes are done in that object only
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            char ch = (char) ('a' + i);
            builder.append(ch);
        }
        System.out.println(builder.toString());
    }
}
