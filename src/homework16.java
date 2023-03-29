import java.util.HashMap;
import java.util.Map;

public class homework16 {
    public static void main(String[] args) {
        HashMap<Integer,Integer> ass = new HashMap<>();
        ass.put(45811,1122);
        ass.put(1171,224725782);

        ass.put(111,2162);

        ass.put(18511,2882);

        homework16.printoverten(ass);


    }


    public static <K,V>void printoverten(Map<K,V> map){
       for(Map.Entry<K,V> ent:map.entrySet()){

           if(ent.getValue().toString().length()>=7){
               System.out.println(ent.getKey());

           }


        }

    }
}

