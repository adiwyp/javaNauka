public class Zmienne {
    public static void main(String[] args) {

        String firstName;
        String lastName;
        int age;
        double height;
        double weight;
        String favoriteDish;

        firstName = "Jan";
        lastName = "Kowalski";
        age = 30;
        height = 1.80;
        weight = 100.1;
        favoriteDish = "Pizza";

        /* Możemy również zastosować zapis zmiennych z przypisanymi wartościami:
            String firstName = "Jan"
            String lastName = "Kowalski"
            int age = 30;
            double height = 1.80;
            double weight = 100.1;
            String favoriteDish = "Pizza";

            lub:

            String firstName = "Jan", lastName = "Kowalski;
            int age = 30;
            double height = 1.80, weight = 100.1;
            String favoriteDish = "Pizza";
       */

        final String pesel = "1234567890"; // final - brak możliwości nadpisania wartości zmiennej

        System.out.println(firstName + " " + lastName + ", " + age + " lat");
        System.out.println("Waga: " + weight + " kg");
        System.out.println("Wzrost: " + height + " cm");
        System.out.println("PESEL: " + pesel);
        System.out.println("Ulubione danie: " + favoriteDish);
        System.out.println("Jeśli " + firstName + " będzie jadł dużo " + favoriteDish + " prawdopodobnie przytyje 1kg i " +
                "będzie ważyć " + (weight + 1) + " kg");
    }
}
