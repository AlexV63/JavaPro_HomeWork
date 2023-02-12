package HW_21122022.Task3;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;


public class Task3 {

    public static void main(String[] args) {
        String ss = "KikJhYggfTgf";

        Map<String, Integer> map = ss.chars().
                mapToObj(e -> (char) e).
                collect(HashMap::new, (m, e) -> {
                    if (Character.isUpperCase(e)) {
                        if (m.containsKey("Up")) {
                            m.put("Up", m.get("Up") + 1);
                        } else m.put("Up", 1);
                    } else {
                        if (m.containsKey("Low"))
                            m.put("Low", m.get("Low") + 1);
                        else m.put("Low", 1);
                    }
                }, HashMap::putAll);

        map.entrySet().stream().forEach(System.out::println);

    }
}


