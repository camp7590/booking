
package ConferenceBooking;

import java.util.Objects;


public class Guest {
    private String name, email;
    
    public Guest(String n, String e){
        name = n;
        email = e;
    }
    
    public Guest(String info){
        // covertsname<email.com> to Guest object
        int div = info.indexOf("<");// where email starts
        name = info.substring(0,div);
        email = info.substring(div + 1, info.length() - 1);
    }
    
    public String toString(){
        return  name + "<" + email + ">";
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 89 * hash + Objects.hashCode(this.name);
        hash = 89 * hash + Objects.hashCode(this.email);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Guest other = (Guest) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.email, other.email)) {
            return false;
        }
        return true;
    }
}
