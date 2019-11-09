package hashmapetest.demo;

import hashmapetest.domain.User;
import org.junit.Test;

import java.util.*;

public class HashMapDemo {

    /**
     * 已知一个 HashMap<Integer，User>集合， User 有 name（String）和 age（int）属性。请写一个方法实现对
     * HashMap 的排序功能，该方法接收 HashMap<Integer，User>为形参，返回类型为 HashMap<Integer，User>，
     * 要求对 HashMap 中的 User 的 age 倒序进行排序。排序时 key=value 键值对不得拆散。
     */
    @Test
    public void fun1() {
        HashMap<Integer, User> users = new HashMap<>();
        //将数据存入HashMap中
        users.put(1, new User("张三", 39));
        users.put(2, new User("李四", 26));
        users.put(3, new User("王五", 31));
        users.put(4, new User("赵六", 30));

        System.out.println(users);
        System.out.println("=============================");

        HashMap<Integer, User> sortHashMap = sortHashMap(users);

        System.out.println(sortHashMap);

    }

    public HashMap<Integer, User> sortHashMap(HashMap<Integer, User> map) {

        //首先拿到map集合的键值对
        Set<Map.Entry<Integer, User>> entrySet = map.entrySet();

        System.out.println("Map.Entry<Integer, User>" + entrySet);
        System.out.println("=============================");

        //将set集合转为list集合，使用工具类的排序方法
        List<Map.Entry<Integer, User>> list = new ArrayList<Map.Entry<Integer, User>>(entrySet);

        //使用collections集合工具对list进行排序，排序规则使用匿名内部类来实现
        Collections.sort(list, new Comparator<Map.Entry<Integer, User>>() {
            @Override
            public int compare(Map.Entry<Integer, User> o1, Map.Entry<Integer, User> o2) {
                int i = o2.getValue().getAge() - o1.getValue().getAge();
                return i;
            }
        });

        //创建一个新的有序的HashMap子类的集合
        LinkedHashMap<Integer, User> linkedHashMap = new LinkedHashMap<Integer, User>();
        //将list中的数据存储在linkedHashM中
        for (Map.Entry<Integer, User> entry : list) {
            linkedHashMap.put(entry.getKey(), entry.getValue());
        }

        return linkedHashMap;
    }

    public void fun2(){

    }

}
