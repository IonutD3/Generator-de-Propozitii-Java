
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GeneratorPropozitii generator = new GeneratorPropozitii();

        int numarMaxim = generator.getNumarMaximCombinatii();
        int numarPropozitii;

        System.out.println("=== Generator de Propozitii ===");
        System.out.println(
            "Poti genera intre 1 si " + numarMaxim + " de propozitii."
        );

        while (true) {
            System.out.print("Cate propozitii doresti sa generezi? ");
            String intrare = scanner.nextLine().trim();

            try {
                numarPropozitii = Integer.parseInt(intrare);

                if (numarPropozitii >= 1
                        && numarPropozitii <= numarMaxim) {
                    break;
                }

                System.out.println(
                    "Introdu un numar intre 1 si " + numarMaxim + "."
                );

            } catch (NumberFormatException e) {
                System.out.println(
                    "Intrare invalida! Te rog sa introduci un numar intreg."
                );
            }
        }

        Set<String> propozitii = generator.genereaza(numarPropozitii);

        System.out.println("\nPropozitiile generate:");

        int index = 1;

        for (String propozitie : propozitii) {
            System.out.println(index + ". " + propozitie);
            index++;
        }

        System.out.println(
            "\nAu fost generate " + propozitii.size()
                    + " propozitii unice."
        );

        scanner.close();
    }
}
