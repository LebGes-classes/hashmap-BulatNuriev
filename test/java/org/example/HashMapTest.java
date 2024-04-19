
package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class HashMapTest {
    private HashMap<String,Integer> map;
    @BeforeEach
    void setUp () {
        map = new HashMap<>();
        map.put("Максим", 20);
        map.put("Гриша", 19);
        map.put("Лог", 30);
        map.put("Ботя", 1);
        map.put("Рик", 2);
        map.put("Морти", 3);
    }
    @Test
    void put () {
        map.put("Зикон", 30);
        Assertions.assertTrue(map.containsKey("Зикон"));
    }
    @Test
    void containsKey() {
        map.put("Максим", 21);
        Assertions.assertTrue(map.containsKey("Максим"));
    }
    @Test
    void containsValue () {
        Assertions.assertTrue(map.containsValue(30));
    }
    @Test
    void remove () {
        Assertions.assertEquals(20, map.remove("Максим"));
        Assertions.assertFalse(map.containsKey("Максим"));
    }
    @Test
    void get () {
        Assertions.assertEquals(1, map.get("Лог"));
    }
    @Test
    void size () {
        Assertions.assertEquals(6,map.size());
    }
}
