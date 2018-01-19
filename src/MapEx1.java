
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;


public class MapEx1 {

    
    public static void main(String[] args) {
        HashMap<String, String> m = new HashMap<String, String>();
        m.put("ON", "Toronto");
        m.put("PE", "Charllotetown");
        m.put("NF", "St. John's");
        m.put("NS", "Hailfax");
        m.put("NB", "Frederiction");
        m.put("PQ", "Quebec City");
        m.put("MB", "Winnipeg");
        m.put("SK", "Regina");
        m.put("AB", "Edmonton");
        m.put("BC", "Vancover");
        m.put("AB" , " Calgary");
        System.out.println(m);
        //replcae bc city
        m.replace("BC", "Victoria");
        //eremove with the key
        m.remove("ON");
        System.out.println(m);
        //starnge for loop;
        for (Map.Entry<String, String> prov : m.entrySet()) {
            System.out.println(prov.getKey() + "->" + prov.getValue());
            
        }
        //getting a list of provinces
        Set provs = m.keySet();
        Iterator it = provs.iterator();
        while(it.hasNext())
            System.out.println(it.next() + ", ");
        
        System.out.println("The capital of Manibota is " + m.get("MB"));
        
        
        
        
    }
    
}
