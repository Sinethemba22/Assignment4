import java.util.*;

public class DataStructures {

    String name;
    String keyElement;


    Map map = new HashMap();
    Set set = new HashSet();
    List listA = new ArrayList();

    public DataStructures(){

    }

    public DataStructures(String key,String name){

        this.name = name;
        this.keyElement = key;

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setKey(String key) {
        this.keyElement = key;
    }

    public String getName() {
        return name;
    }

    public String getKey() {
        return keyElement;
    }


    public void map(DataStructures d){

        map.put(d.keyElement, d.name);

    }

    public void retrieveMap(String k){

        String element1 = (String) map.get(k);

        System.out.println(element1);


    }

    public void deleteMap(String k){

        map.remove(k);

        System.out.println("After deleting "+k +" it should be empty");
        String element2 = (String) map.get(k);
        System.out.println(element2);


    }


    public void set(String name){

        set.add(name);

    }

    public void retrieveSet(){

        System.out.println(set);

    }

    public void deleteSet(){

        set.remove(0);
        System.out.println("After removing...");
        System.out.println(set);

    }

    public void list(int b){

        listA.add(b);
        System.out.println(listA);

    }

    public void deleteList(){

        listA.remove(0);

    }

    public void retrieveList(){

        System.out.println(listA);


    }


}
