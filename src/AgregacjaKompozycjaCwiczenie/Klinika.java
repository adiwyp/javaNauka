package AgregacjaKompozycjaCwiczenie;

public class Klinika {

    public static void main(String[] args) {

        Wlasciciel wlasciciel1 = new Wlasciciel();
        wlasciciel1.firstName = "Jan";
        wlasciciel1.lastName = "Kowalski";

        Adres adresWlasciciel1 = new Adres();
        adresWlasciciel1.city = "Poznań";
        adresWlasciciel1.street = "Szwajcarska";
        adresWlasciciel1.postCode = "61-245";

        wlasciciel1.address = adresWlasciciel1;


        Zwierze zwierze1 = new Zwierze();
        zwierze1.owner = wlasciciel1;
        zwierze1.animalName = "Burek";
        zwierze1.age = 10;
        zwierze1.species = "Pies";

        Zwierze zwierze2 = new Zwierze();
        zwierze2.owner = wlasciciel1;
        zwierze2.animalName = "Łatka";
        zwierze2.age = 5;
        zwierze2.species = "Kot";

        Wizyta wizyta1 = new Wizyta();
        wizyta1.zwierze = zwierze1;
        wizyta1.description = "Problem z łapą";
        wizyta1.date = "01.01.2026";

        Wizyta wizyta2 = new Wizyta();
        wizyta2.zwierze = zwierze2;
        wizyta2.description = "Problem z okiem";
        wizyta2.date = "02.02.2026";

        Wlasciciel wlasciciel2 = new Wlasciciel();
        wlasciciel2.firstName = "Monika";
        wlasciciel2.lastName = "Nowak";

        Adres adresWlasciciel2 = new Adres();
        adresWlasciciel2.city = "Warszawa";
        adresWlasciciel2.street = "Zachodnia";
        adresWlasciciel2.postCode = "01-000";

        wlasciciel2.address = adresWlasciciel2;

        Zwierze zwierze3 = new Zwierze();
        zwierze3.owner = wlasciciel2;
        zwierze3.animalName = "Frodo";
        zwierze3.age = 2;
        zwierze3.species = "Krowa";

        Wizyta wizyta3 = new Wizyta();
        wizyta3.zwierze = zwierze3;
        wizyta3.description = "Problem z uchem";
        wizyta3.date = "03.03.2026";

        System.out.println("Wizyta 1:" + wizyta1.date);
        System.out.println("Dane właścieciela: " + zwierze1.owner.firstName + " " + zwierze1.owner.lastName);
        System.out.println("Adres: " + zwierze1.owner.address.city + " " + zwierze1.owner.address.street + " " +
                adresWlasciciel1.postCode);
        System.out.println("Zwierze: " + zwierze1.animalName + " " + zwierze1.species + " wiek: " + zwierze1.age);
        System.out.println("Opis problemu: " + wizyta1.description);

        System.out.println("Wizyta 2:" + wizyta2.date);
        System.out.println("Dane właścieciela: " + zwierze2.owner.firstName + " " + zwierze2.owner.lastName);
        System.out.println("Adres: " + zwierze1.owner.address.city + " " + zwierze1.owner.address.street + " " +
                adresWlasciciel1.postCode);
        System.out.println("Zwierze: " + zwierze2.animalName + " " + zwierze2.species + " wiek: " + zwierze2.age);
        System.out.println("Opis problemu: " + wizyta2.description);

        System.out.println("Wizyta 3:" + wizyta3.date);
        System.out.println("Dane właścieciela: " + zwierze3.owner.firstName + " " + zwierze3.owner.lastName);
        System.out.println("Adres: " + zwierze3.owner.address.city + " " + zwierze3.owner.address.street + " " +
                adresWlasciciel2.postCode);
        System.out.println("Zwierze: " + zwierze3.animalName + " " + zwierze3.species + " wiek: " + zwierze3.age);
        System.out.println("Opis problemu: " + wizyta3.description);









    }
}
