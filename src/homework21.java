import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class homework21 {
    public static void main(String[] args) {
HashMap<Integer,Integer> ass = new HashMap<>();
ass.put(7,2);
        ass.put(6,2);

        ass.put(515,2);

        ass.put(66,2);

        ass.put(1,2);


        System.out.println(homework21.getmaxmul(ass));

    }

 public static <K extends  Number,V extends Number> Map.Entry<K,V> getmaxmul(HashMap<K,V> map){
    int max = 0;
        int index=0;
        K maxkey = null;
        V maxval = null;
        for(Map.Entry<K,V> ent : map.entrySet()){

if(index==0){
    max = (int)(ent.getKey().intValue()*(int)ent.getValue());
    maxkey = ent.getKey();
    maxval = ent.getValue();


}else{
    if((int)(ent.getKey().intValue()*(int)ent.getValue())>max){

        max = (int)(ent.getKey().intValue()*(int)ent.getValue());
        maxkey = ent.getKey();
        maxval = ent.getValue();

    }
}
index++;
        }
return  new AbstractMap.SimpleEntry<>(maxkey, maxval);
 }
}

