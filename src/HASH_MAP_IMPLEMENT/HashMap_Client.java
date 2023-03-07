package HASH_MAP_IMPLEMENT;

public class HashMap_Client {
    public static void main(String[] args) {
        HashMap<String,Integer> map=new HashMap<>();
        map.put("Ishika",26);
        map.put("Anikate",6);
        map.put("Aakrati",1);
//        System.out.println(map);
//        map.put("Ishika",9);
//        System.out.println(map);
//        System.out.println(map.get("Anikate"));
//        System.out.println(map.containsKey("Aakrati"));
        map.remove("Anikate");
        System.out.println(map);
    }
}
