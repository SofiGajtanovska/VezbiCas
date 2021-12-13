import java.util.HashMap;
import java.util.Map;

public class Recnik {
    public static void main(String[] args) {

        Map<String,String> recnik = new HashMap<String,String>();
        recnik.put("cat", "маче");
        recnik.put("dog", "куче");
        recnik.put("cow", "крава");
        recnik.put("hi", "здраво");
        recnik.put("fish", "риба");

        System.out.println("Клучеви: "+recnik.keySet());
        System.out.println("Вредности: "+recnik.values());

        for(Map.Entry<String,String> entry : recnik.entrySet()){
            System.out.println(entry.getKey()+" | "+entry.getValue());
        }

        if(recnik.containsKey("hi"))
            System.out.println("Преводот за 'hi' e :" + recnik.get("hi"));
        else
            System.out.println("Не постои збор hi.");
    }
}
