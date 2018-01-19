package ConferenceBooking;

import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Iterator;
import java.util.logging.Logger;
import javax.swing.ImageIcon;

public class Conference {

    private String name, description;
    private HashSet<Guest> people;
    private ImageIcon image;

    public Conference(String n, String d, String img) {
        name = n;
        description = d;
        people = new HashSet();
        image = new ImageIcon(getClass().getResource(img));
        /*
    if(img=="html.PNG")
        people.add(new Guest("Bob", "htmlpro@abc.com"));
    if(n==equals)
         */
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public HashSet<Guest> getPeople() {
        return people;
    }

    public ImageIcon getImage() {
        return image;
    }

    //to do by you later
    public boolean signup(Guest g) {
        if (people.contains(g)==false) {
            people.add(g);
            return true;
        } else {
            return false;
        }
    }

    public boolean remove(Guest g) {
        if (people.contains(g)) {
            people.remove(g);
            return true;
        } else {
            return false;
        }
    }
    public void save(PrintWriter pw, String key) {
        Iterator it = people.iterator();
        while (it.hasNext()) {
            pw.println(key);
            pw.println(it.next());
        }
    }


}


