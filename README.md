# Generator de Propoziții în Java | Java Sentence Generator

## 🇷🇴 Română

### Descriere

**Generator de Propoziții** este o aplicație dezvoltată în Java care generează propoziții aleatorii prin combinarea unor subiecte, verbe, obiecte și complemente.

Utilizatorul introduce numărul de propoziții dorite, iar aplicația generează propoziții unice, fără duplicate. Numărul maxim de combinații este calculat automat pe baza dimensiunii tablourilor de cuvinte.

### Funcționalități

- Generarea aleatorie a propozițiilor.
- Introducerea interactivă a numărului de propoziții.
- Validarea datelor introduse de utilizator.
- Prevenirea generării propozițiilor duplicate.
- Calcularea automată a numărului maxim de combinații.
- Organizarea codului în clase separate, cu responsabilități distincte.

### Tehnologii și concepte utilizate

- **Java** – limbajul de programare.
- **Arrays** – stocarea cuvintelor în categorii.
- **Random** – selectarea aleatorie a elementelor.
- **LinkedHashSet** – păstrarea propozițiilor unice și a ordinii de inserare.
- **Scanner** – citirea datelor introduse de utilizator.
- **Exception handling** – gestionarea intrărilor numerice invalide.
- **Object-Oriented Programming (OOP)** – separarea logicii aplicației în clase.
- **Input validation** – verificarea intervalului permis înainte de generare.

### Structura proiectului

```text
Generator-de-Propozitii-Java/
├── src/
│   ├── Main.java
│   └── GeneratorPropozitii.java
└── README.md
```

- **`Main.java`** – gestionează interacțiunea cu utilizatorul, validează numărul introdus și afișează rezultatele.
- **`GeneratorPropozitii.java`** – conține tablourile de cuvinte, calculează numărul maxim de combinații și generează propozițiile unice.

### Calcularea automată a combinațiilor

Numărul maxim de combinații este calculat folosind lungimea fiecărui tablou:

`subiecte.length * verbe.length * obiecte.length * complemente.length`

De exemplu, dacă fiecare categorie conține 5 cuvinte, numărul maxim este:

**5 × 5 × 5 × 5 = 625 de combinații.**

Dacă se adaugă sau se elimină cuvinte dintr-o categorie, limita se actualizează automat. Nu este necesară modificarea manuală a numărului maxim în alte părți ale programului.

### 1. Generarea aleatorie a cuvintelor

Clasa GeneratorPropozitii utilizează tablouri pentru a organiza cuvintele în categorii. Pentru fiecare propoziție, este selectat aleatoriu câte un element din fiecare categorie.

```bash
String subiect = subiecte[
    generatorAleatoriu.nextInt(subiecte.length)
];

String verb = verbe[
    generatorAleatoriu.nextInt(verbe.length)
];
```

Metoda nextInt() selectează un indice valid din intervalul corespunzător dimensiunii tabloului.

### 2. Eliminarea duplicatelor

Rezultatele sunt stocate într-un LinkedHashSet<String>.

```bash
Set<String> propozitii = new LinkedHashSet<>();
propozitii.add(propozitie);
```

Utilizarea interfeței Set permite lucrul cu o colecție de elemente distincte, în timp ce LinkedHashSet păstrează ordinea de inserare.

### 3. Generarea unui număr de propoziții

Metoda genereaza(int numar) construiește propoziții până când colecția conține numărul solicitat de rezultate distincte.

```bash
while (propozitii.size() < numar) {
    // Selectarea cuvintelor și construirea propoziției.
    // Adăugarea rezultatului în colecție.
}
```

Deoarece o propoziție duplicată nu mărește dimensiunea colecției, procesul continuă până când sunt obținute suficiente rezultate distincte.

### Cerințe

- Java JDK instalat.
- Terminal sau IDE compatibil cu Java.

### Compilare și rulare

Execută comenzile din directorul principal al proiectului.

1. Compilează fișierele Java:

```bash
javac -d out src/*.java
```

2. Rulează aplicația:

```bash
java -cp out Main
```

Directorul `out/` va conține fișierele compilate `.class`, separate de codul sursă.

### Limitări

- Propozițiile sunt construite prin combinarea unor elemente prestabilite.
- Numărul maxim de combinații depinde de numărul de cuvinte disponibile în fiecare categorie.

### Scop educațional

Proiectul urmărește exersarea conceptelor fundamentale din Java: clase, tablouri, colecții, generare aleatorie, validarea intrărilor, tratarea excepțiilor și organizarea codului într-o structură modulară.

### Exemplu de rezultat

```bash
=== Generator de Propozitii ===
Poti genera intre 1 si 625 de propozitii.
Cate propozitii doresti sa generezi? 3

Propozitiile generate:
1. Elevul citeste o carte in biblioteca.
2. Programatorul construieste un proiect cu atentie.
3. Artistul descopera o poveste in fiecare zi.

Au fost generate 3 propozitii unice.
```

Exemplul este ilustrativ. Propozițiile diferă de la o rulare la alta, deoarece cuvintele sunt selectate aleatoriu.

---

## 🇬🇧 English

### Description

**Java Sentence Generator** is a Java application that generates random sentences by combining subjects, verbs, objects, and complements.

The user specifies how many sentences to generate, and the application produces unique sentences without duplicates. The maximum number of possible combinations is calculated automatically from the sizes of the word arrays.

### Features

- Random sentence generation.
- Interactive user input for the desired number of sentences.
- Input validation.
- Duplicate prevention.
- Automatic calculation of the maximum number of combinations.
- Separation of application logic into dedicated classes.

### Technologies and Concepts

- **Java** – programming language.
- **Arrays** – storing words in separate categories.
- **Random** – randomly selecting elements.
- **LinkedHashSet** – storing unique sentences while preserving insertion order.
- **Scanner** – reading user input.
- **Exception handling** – handling invalid numeric input.
- **Object-Oriented Programming (OOP)** – separating application responsibilities into classes.
- **Input validation** – checking the permitted range before generating sentences.

### Project Structure

```text
Generator-de-Propozitii-Java/
├── src/
│   ├── Main.java
│   └── GeneratorPropozitii.java
└── README.md
```

- **`Main.java`** – manages user interaction, validates the requested number, and displays the results.
- **`GeneratorPropozitii.java`** – stores the word arrays, calculates the maximum number of combinations, and generates unique sentences.

### Automatic Combination Calculation

The maximum number of combinations is calculated using the length of each array:

`subiecte.length * verbe.length * obiecte.length * complemente.length`

For example, if each category contains five words, the maximum number is:

**5 × 5 × 5 × 5 = 625 combinations.**

Adding or removing words automatically updates the limit. No manual changes to the maximum value are required elsewhere in the application.

### 1. Random Word Selection

The GeneratorPropozitii class stores words in arrays and randomly selects one element from each category to construct a sentence.

```bash
String subiect = subiecte[
    generatorAleatoriu.nextInt(subiecte.length)
];

String verb = verbe[
    generatorAleatoriu.nextInt(verbe.length)
];
```

The nextInt() method selects a valid array index based on the array length.

### 2. Duplicate Prevention

Generated sentences are stored in a LinkedHashSet<String>.

```bash
Set<String> propozitii = new LinkedHashSet<>();
propozitii.add(propozitie);
```

The Set interface provides a collection of distinct elements, while LinkedHashSet preserves insertion order.

### 3. Generating a Requested Number of Sentences

The genereaza(int numar) method continues generating sentences until the collection contains the requested number of distinct results.

```bash
while (propozitii.size() < numar) {
    // Select words and construct a sentence.
    // Add the result to the collection.
}
```

Duplicate sentences do not increase the collection size, so generation continues until enough distinct results have been collected.

### Requirements

- Java JDK installed.
- A terminal or Java-compatible IDE.

### Compile and Run

Run the following commands from the project root directory.

1. Compile the Java source files:

```bash
javac -d out src/*.java
```

2. Run the application:

```bash
java -cp out Main
```

The `out/` directory stores compiled `.class` files separately from the source code.

### Limitations

- Sentences are constructed from predefined elements.
- The maximum number of combinations depends on the number of words available in each category.

### Learning Objectives

This project provides practice with fundamental Java concepts, including classes, arrays, collections, random generation, input validation, exception handling, and modular code organization.

### Example Output

```bash
=== Generator de Propozitii ===
Poti genera intre 1 si 625 de propozitii.
Cate propozitii doresti sa generezi? 3

Propozitiile generate:
1. Elevul citeste o carte in biblioteca.
2. Programatorul construieste un proiect cu atentie.
3. Artistul descopera o poveste in fiecare zi.

Au fost generate 3 propozitii unice.
```

This output is illustrative. The generated sentences vary between runs because words are selected randomly.

---

## 👤 Autor / Author

**IonutD**
