import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {

        System.out.println("Внеси кој збор сакаш да се преведе од Англиски на Македонски");

        try
        {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String s = br.readLine();

            Recnik r = new Recnik();
            r.vnesiMapa();
            r.translate(s);
        }

        catch (IOException e) {
            System.out.println(e.toString());
        }
    }
}
