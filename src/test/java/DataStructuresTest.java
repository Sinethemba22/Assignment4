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

        DataStructures map = new DataStructures("keyElement1", "Sinethemba");
        DataStructures map2 = new DataStructures("keyElement2","Poni");


        n.map(map);
        n.map(map2);


        n.retrieveMap("key element1");
        n.retrieveMap("Key element2");

        n.deleteMap("Key element2");


    }

    @Test
    public void set() {
    }

    @Test
    public void deleteSet() {
    }

    @Test
    public void list() {
    }
}