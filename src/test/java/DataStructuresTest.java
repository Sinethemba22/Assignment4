import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DataStructuresTest {

    DataStructures n = new DataStructures();

    @Before
    public void setUp() throws Exception {

        DataStructures n = new DataStructures();

    }

    @Test
    public void map() {

        DataStructures map = new DataStructures("key1","Sinethemba");
        DataStructures map2 = new DataStructures("key2","Poni");

        n.map(map);
        n.map(map2);



        n.retrieveMap("key1");
        n.retrieveMap("key2");

        n.deleteMap("key2");

    }

    @Test
    public void set() {

        n.set("Sinethemba");
        n.set("Poni");
        n.set("5");

        n.retrieveSet();

    }

    @Test
    public void deleteSet() {


        n.set("Sinethemba");
        n.set("Poni");
        n.set("4");


        n.deleteSet();


    }

    @Test
    public void list() {

        n.list(6);
        n.list(33);
        n.list(38);

        n.retrieveList();

        n.deleteList();
        n.retrieveList();

    }
}