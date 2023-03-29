import java.util.*;

public class homework22 {

    public static void main(String[] args) {


        HashMap<Integer,Integer> ass = new HashMap<>();
        ass.put(7,6);
        ass.put(6,18);

        ass.put(515,2);

        ass.put(66,9);

        ass.put(1,222);


        System.out.println();
        homework22.printkv(ass);


    }
public static <K extends Comparable<? super K>,V extends Comparable <? super  V>> void printkv(Map<K,V> map ){
    Map<K,V> ass = new LinkedHashMap<>();
    ArrayList<K> kk= new ArrayList<>();
ArrayList<V>kkv = new ArrayList<>();

    for(Map.Entry<K,V> ent:map.entrySet()){
            kk.add(ent.getKey());
            kkv.add(ent.getValue());
        }
    Collections.sort(kk);
    Collections.sort(kkv, Collections.reverseOrder());
    for(int i=0;i<kk.size();i++){
        ass.put(kk.get(i),kkv.get(i));

    }
    System.out.println(ass);
}



}
///public static <K extends Comparable<? super K>, V extends Comparable<? super V>> void printKVDesc(Map<K, V> map) {
//    List<K> keys = new ArrayList<>(map.keySet());
//    List<V> values = new ArrayList<>(map.values());
//
//    Collections.sort(keys);
//    Collections.sort(values, Collections.reverseOrder());
//
//    for (K key : keys) {
//        System.out.println(key + " : " + values.get(keys.indexOf(key)));
//    }
//}
//쥐피티 찾아보니까...

//뭔말?