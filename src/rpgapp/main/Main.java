package rpgapp.main;
import rpgapp.characters.Hero;

/**
 * Created by shibayu36 on 2016/12/17.
 */
public class Main {
    public static void main(String[] args) {
        Hero h1 = new Hero("ゆうき");
        Hero h2 = new Hero("しばゆー");
        System.out.println(h1.name);
        System.out.println(h2.name);
    }
}
