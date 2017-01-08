import java.text.BreakIterator;

/**
 * Created by shibayu36 on 2016/12/23.
 */

public class UnicodeCharSample {
    public static void main(String[] args) {
        String s = "\uD869\uDEC0あか\u3099";
        System.out.println(s);
        System.out.println(s.length());
        System.out.println(s.codePointCount(0, s.length()));

        BreakIterator bi = BreakIterator.getCharacterInstance();
        bi.setText(s);
        int length = 0;
        while (bi.next() != BreakIterator.DONE) {
            length++;
        }
        System.out.println(length);
    }
}
