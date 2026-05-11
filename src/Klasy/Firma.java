package Klasy;

public class Firma {

    public static void main(String[] args) {

        Pracownik pracownik1 = new Pracownik();
        Pracownik pracownik2 = new Pracownik();
        Pracownik pracownik3 = new Pracownik();

        pracownik1.firstName = "Jan";
        pracownik1.lastName = "Kowalski";
        pracownik1.dateOfBirth = "01-01-1990";
        pracownik1.seniority = 10;

        String pracownik1Info = pracownik1.getInfo();


        pracownik2.firstName = "Monika";
        pracownik2.lastName = "Nowak";
        pracownik2.dateOfBirth = "12-05-1995";
        pracownik2.seniority = 5;

        String pracownik2Info = pracownik2.getInfo();

        pracownik3.firstName = "Jan";
        pracownik3.lastName = "Kowalski";
        pracownik3.dateOfBirth = "10-10-1970";
        pracownik3.seniority = 20;

        String pracownik3Info = pracownik3.getInfo();

        System.out.println("Lista pracowników w firmie XYZ:");
        System.out.println(pracownik1Info);
        System.out.println(pracownik2Info);
        System.out.println(pracownik3Info);

    }
}
