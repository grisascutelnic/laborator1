import java.util.*;

public class Main {
    public static void main(String[] args) {
        Ceasca ceasca = new Ceasca("cilindrica", "alba", "ceramica", 0.75, true);

        ceasca.afis();

        System.out.println();

        System.out.println(ceasca.toString());
    }
}
