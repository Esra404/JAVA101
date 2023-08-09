package MultivValueMap_Map;

import jakarta.ws.rs.core.MultivaluedHashMap;
import jakarta.ws.rs.core.MultivaluedMap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class _Main {
    public static void main(String[] args) {
        Map<String , String > map= new HashMap<>();
        map.put("1","this is number 1");
        map.put("2","this is number 2");
        map.put("3","this is number 3");
        map.put("4","this is number 4");
        map.put(null,"usman is  ull");
        map.put("5",null);
        map.put(null,null);
        System.out.println(map);

        MultivaluedMap<String ,String> multivaluedMap= new MultivaluedHashMap<>();
        multivaluedMap.put("1", List.of("usman", "usman1","usman2"));
        multivaluedMap.addAll("2", "khalid1 ","khalid2");
        multivaluedMap.putIfAbsent("3",List.of("usman khlaid"));
        System.out.println(multivaluedMap);
        System.out.println(multivaluedMap.getFirst("2"));

        String strin= multivaluedMap.get("2").stream().map(String::strip).map(String::toUpperCase)
                .collect(Collectors.joining("-"));
        System.out.println(strin);
        System.out.println(slug("usman usman khalid is coming home "));
    }

    static String slug(String string){
        return Arrays.stream(string.split(" ")).collect(Collectors.joining("-"));
    }
}
