
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;

public class GeneratorPropozitii {

    private final String[] subiecte = {
        "Elevul", "Profesorul", "Copilul", "Artistul", "Programatorul"
    };

    private final String[] verbe = {
        "citeste", "scrie", "invata", "descopera", "construieste"
    };

    private final String[] obiecte = {
        "o carte", "un program", "o poveste", "un proiect", "un raspuns"
    };

    private final String[] complemente = {
        "in biblioteca", "cu atentie", "in fiecare zi",
        "pentru examen", "impreuna cu prietenii"
    };

    private final Random random = new Random();

    public int getNumarMaximCombinatii() {
        return subiecte.length
                * verbe.length
                * obiecte.length
                * complemente.length;
    }

    public Set<String> genereaza(int numar) {
        int numarMaxim = getNumarMaximCombinatii();

        if (numar <= 0 || numar > numarMaxim) {
            throw new IllegalArgumentException(
                "Numarul trebuie sa fie intre 1 si " + numarMaxim + "."
            );
        }

        Set<String> propozitii = new LinkedHashSet<>();

        while (propozitii.size() < numar) {
            String propozitie = subiecte[random.nextInt(subiecte.length)]
                    + " "
                    + verbe[random.nextInt(verbe.length)]
                    + " "
                    + obiecte[random.nextInt(obiecte.length)]
                    + " "
                    + complemente[random.nextInt(complemente.length)]
                    + ".";

            propozitii.add(propozitie);
        }

        return propozitii;
    }
}
