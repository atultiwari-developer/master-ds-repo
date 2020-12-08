package interview;

import java.util.HashMap;
import java.util.Iterator;

public final class Immutable {

    private final int id;
    private final String name;
    private final HashMap<String,String> testMap;

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public HashMap<String,String> getTestMap(){
        return (HashMap<String,String>) testMap.clone();
    }
    public Immutable(int id,String name,HashMap<String,String> hm){
        this.id = id;
        this.name = name;
        HashMap<String,String> testMap = new HashMap<>();
        Iterator<String> itr = hm.keySet().iterator();
        String key;
        while(itr.hasNext()){
            key = itr.next();
            testMap.put(key,hm.get(key));
        }
        this.testMap = testMap;

    }


    public static void main(String[] args) {

    }
}
