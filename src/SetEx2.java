
import java.util.HashSet;

public class SetEx2 {

    public static void main(String[] args) {
        HashSet<Pokemon> b = new HashSet<Pokemon>();
        b.add(new Pokemon(25, "Picachu"));
        b.add(new Pokemon(4, "Charmander"));
        b.add(new Pokemon(7, "Squirtle"));
        b.add(new Pokemon(12, "Butterfree"));
        b.add(new Pokemon(25, "Picachu"));
        System.out.println(b);
    }

}
