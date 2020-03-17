import java.util.ArrayList;
import java.util.List;

public class Modules {
    public static void main (String [] args){

        //Use of list
        List moduleList = new ArrayList();


        moduleList.add("Module2 ADP");
        moduleList.add("Module3 ITS");
        moduleList.add("Module4 PRM");
        moduleList.add("Module5 ADT");

        moduleList.add(0,"Module1 ADP");

        moduleList.remove(2);
        moduleList.remove("Module5 ADT");

        System.out.println(moduleList);





    }
}
