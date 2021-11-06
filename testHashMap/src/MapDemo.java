import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo {

    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"A");
        map.put(2,"B");
        map.put(3,"C");
        map.put(4,"D");
        map.put(5,"F");
        // key trong map la duy nhat
        map.put(5,"D");
        System.out.println(map.get(5));
        // Để lập các phần tử trong map sử dụng Set
        Set<Integer> keySet = map.keySet();
        for(Integer i: keySet){
            System.out.println(i+" "+map.get(i));
        }
        // go key
        map.remove(1);
        System.out.println("sau khi xoa ");
        for(Integer i: keySet){
            System.out.println(i+" "+map.get(i));
        }
        // lap dung entry
        for(Map.Entry<Integer, String> s : map.entrySet()){
            s.getKey();
            s.getValue();
        }


    }
   // https://www.youtube.com/watch?v=pD0zYtZaY2E&t=310s&ab_channel=JMasterTrungT%C3%A2mJava
}
