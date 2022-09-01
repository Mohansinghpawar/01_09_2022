import java.util.ArrayList;     //importing Librarys
import java.util.LinkedList;    //importing Librarys

public class MergingTwoList {
    public static void main(String[] args)
    {
        LinkedList<Integer> listObj1 = new LinkedList<>();
        listObj1.add(12);
        listObj1.add(37);
        listObj1.add(52);
        LinkedList<Integer> listObj2 = new LinkedList<>();
        listObj2.add(21);
        listObj2.add(46);
        listObj2.add(61);
        LinkedList<Integer> mergedList = new LinkedList<>();
        mergedList.addAll(listObj1);
        mergedList.addAll(listObj2);

        System.out.println("listObj1 : "+listObj1);
        System.out.println("listObj2 : "+listObj2);
        System.out.println("MergedList: "+mergedList);
}
}
