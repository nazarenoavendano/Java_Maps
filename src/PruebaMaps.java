import java.util.*;

public class PruebaMaps {
    public static void main(String[] args) {

        System.out.println("MIS LISTAS DE TIPO MAPS");

        // HashMap
        Map<Integer, String> miHashMap = new HashMap<>();
        miHashMap.put(11, "Angel Di Maria");
        miHashMap.put(10, "Lionel Messi");
        miHashMap.put(9, "Julian Alvarez");
        System.out.println("------------------");
        System.out.println("HashMap: " + miHashMap);

        // TreeMap
        Map<Integer, String> miTreeMap = new TreeMap<>();
        miTreeMap.put(11, "Carlos Tevez");
        miTreeMap.put(10, "Diego Maradora");
        miTreeMap.put(9, "Hernán Crespo");
        System.out.println("------------------");
        System.out.println("TreeMap: " + miTreeMap);

        // LinkedHashMap
        Map<Integer, String> miPrimerLinked = new LinkedHashMap<>();
        miPrimerLinked.put(20, "Gustavo Oberman");
        miPrimerLinked.put(18, "Lionel Messi");
        miPrimerLinked.put(9, "Hernán Crespo");
        System.out.println("------------------");
        System.out.println("LinkedHashMap: " + miPrimerLinked);

        System.out.println("------------------");
        System.out.println(" ");

        System.out.println("---RECORRER HASHMAP---");
        //Se lo recorrió usando un FOR 🌀🌀🌀
        for (Map.Entry<Integer, String> entry : miHashMap.entrySet()) {
            System.out.println("Camiseta: " + entry.getKey() + ", Jugador: " + entry.getValue());
        }

        System.out.println(" ");

        System.out.println("---RECORRER TREEMAP---");
        //Se lo recorrió usando un ITERATOR 🔥🔥🔥
        Iterator<Map.Entry<Integer, String>> it = miTreeMap.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<Integer, String> entry = it.next();
            System.out.println("Camiseta: " + entry.getKey() + ", Jugador: " + entry.getValue());
        }

        System.out.println(" ");

        System.out.println("---RECORRER LINKEDHASHMAP---");
        //Se lo recorrió usando un FOR EACH 🌀🌀🌀
        for (Map.Entry<Integer, String> i : miPrimerLinked.entrySet()) {
            System.out.println("Camiseta: " + i.getKey() + ", Jugador: " + i.getValue());
        }

    }
}

