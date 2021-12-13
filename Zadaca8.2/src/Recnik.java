import java.util.HashMap;
import java.util.Map;
public class Recnik {
    Map<String, String> recnik = new HashMap<String, String>();

    public void vnesiMapa() {
        recnik.put("Glass", "Чаша");
        recnik.put("Bottle", "Шише");
        recnik.put("Book", "Книга");
        recnik.put("Notebook", "Тетратка");
    }

    public void translate (String s) {
        if (recnik.containsKey(s))
        {
            System.out.println(recnik.get(s));
        }
        else
            System.out.println("Не постои таков збор.");
    }
}
