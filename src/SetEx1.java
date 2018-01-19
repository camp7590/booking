
import java.util.HashSet;

public class SetEx1 {

    public static void main(String[] args) {
        HashSet<String> b = new HashSet<String>();
        b.add("Picachu");
        b.add("Charmander");
        b.add("Squirtle");
        b.add("Butterfree");
        b.add("Picachu");
        System.out.println(b);
        System.out.println("Picachu".hashCode());
        System.out.println("Charmander".hashCode());
        System.out.println("Squirtle".hashCode());
        System.out.println("Butterfree".hashCode());
        b.remove("Squirtle");
        System.out.println("I now have " + b.size() + " pokemon");//3
        b.clear();
        System.out.println("I now have " + b.size() + " pokemon");//3

    }

}
