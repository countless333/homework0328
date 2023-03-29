import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class homework13 {
    public static void main(String[] args) {

        ArrayList<Integer> a = new ArrayList<>();
        a.add(12);
        a.add(8);
        a.add(3);
        a.add(6);
        System.out.println(homework13.add(a));



    }
    public static Integer add(List<?>list){
        int sum=0;
        for(Object b : list){

            sum+=(int)b;

        }
        return sum;
    }




}
