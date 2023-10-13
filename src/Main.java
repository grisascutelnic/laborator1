import java.util.*;

public class Main {
    public static void main(String[] args) {
        Ceasca ceasca = new Ceasca("cilindrica", "alba", "ceramica", 0.75, true);

        ceasca.afis();

        System.out.println();

        System.out.println(ceasca.toString());

        Scanner scanner = new Scanner(System.in);
        String culoare = scanner.next();
        ceasca.setCuloare(culoare);
        System.out.println(ceasca.getCuloare());
        System.out.println(ceasca.toString());
    }
}
