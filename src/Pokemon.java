
import java.util.Objects;


public class Pokemon {
    private String name;
    private int id;
    
    public Pokemon(int i, String n){
        name = n;
        id = i;
    }
    
    public String toString(){
        return id + "->" + name; // 25 -> Picachu
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.name);
        hash = 97 * hash + this.id;
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
        final Pokemon other = (Pokemon) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }
}
