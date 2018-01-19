
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class UltraMap {

    public static void main(String[] args) {
        HashMap<String, HashSet<Pokemon>> m = new HashMap<String, HashSet<Pokemon>>();

        //start electric collection
        m.put("ELECTRIC", new HashSet());
        m.put("WATER", new HashSet());
        m.put("GRASS", new HashSet());

        m.get("ELECTRIC").add(new Pokemon(25, "Picachu"));
        m.get("ELECTRIC").add(new Pokemon(25, "Voltorb"));
        m.get("ELECTRIC").add(new Pokemon(25, "Raichu"));

        m.get("WATER").add(new Pokemon(7, "Squirtle"));
        m.get("WATER").add(new Pokemon(9, "Blastoise"));

        m.get("GRASS").add(new Pokemon(1, "Bulbasuar"));
        m.get("GRASS").add(new Pokemon(2, "Ivysaur"));
        m.get("GRASS").add(new Pokemon(3, "Venosaur"));
        m.get("GRASS").add(new Pokemon(45, "Vileplume"));

        System.out.println(m);

        HashSet g = m.get("GRASS");
        Iterator it = g.iterator();
        System.out.println("Here are the grass pokemon");
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        Set types = m.keySet();
        it = types.iterator();
        System.out.println("Here are the different types of pokemon");

        while (it.hasNext()) {
            System.out.println(it.next());
        }

    }


    /* this is you are not pointing to set
       m.put("FIRE", new Pokemon(4 , "Charmander"));
       m.put("FIRE", new Pokemon(12 , "Squirtle"));
       m.put("FIRE", new Pokemon(25 , "Picachu"));
       m.put("FIRE", new Pokemon(26 , "Raichu"));
        System.out.println(m);
     */
}


