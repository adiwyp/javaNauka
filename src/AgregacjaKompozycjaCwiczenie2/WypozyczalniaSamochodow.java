package AgregacjaKompozycjaCwiczenie2;

import javax.swing.plaf.basic.BasicDirectoryModel;

public class WypozyczalniaSamochodow {

    public static void main(String[] args) {

        Klient klient1 = new Klient();
        klient1.firstName = "Jan";
        klient1.lastName = "Kowalski";

        Adres adresKlient1 = new Adres();
        adresKlient1.city = "Włocławek";
        adresKlient1.street = "Fredry";
        adresKlient1.postCode = "87-800";

        klient1.adres = adresKlient1;

        Klient klient2 = new Klient();
        klient2.firstName = "Stefan";
        klient2.lastName = "Nowak";

        Adres adresKlient2 = new Adres();
        adresKlient2.city = "Brześć Kujawski";
        adresKlient2.street = "Okrzei";
        adresKlient2.postCode = "87-880";

        klient2.adres = adresKlient2;

        Samochod auto1 = new Samochod();
        Samochod auto2 = new Samochod();
        Samochod auto3 = new Samochod();

        auto1.brand = "Audi";
        auto1.model = "A3";
        auto1.yearOfProduction = 2005;
        auto1.priceForRentPerDay = 100.0;

        auto2.brand = "BMW";
        auto2.model = "E90";
        auto2.yearOfProduction = 2010;
        auto2.priceForRentPerDay = 150.0;

        auto3.brand = "Opel";
        auto3.model = "Astra";
        auto3.yearOfProduction = 1999;
        auto3.priceForRentPerDay = 50.0;

        Wypozyczalnia wypozyczenie1 = new Wypozyczalnia();

        wypozyczenie1.klient = klient1;
        wypozyczenie1.samochod = auto1;
        wypozyczenie1.rentDays = 50;

        Wypozyczalnia wypozyczenie2 = new Wypozyczalnia();

        wypozyczenie2.klient = klient2;
        wypozyczenie2.samochod = auto2;
        wypozyczenie2.rentDays = 20;

        Wypozyczalnia wypozyczenie3 = new Wypozyczalnia();
        wypozyczenie3.klient = klient1;
        wypozyczenie3.samochod = auto3;
        wypozyczenie3.rentDays = 30;


        System.out.println("Klient: " + wypozyczenie1.klient.firstName + " " + wypozyczenie1.klient.lastName + " Wypożyczone auto: " +
                wypozyczenie1.samochod.brand + " " + wypozyczenie1.samochod.model + " Ilośc dni:" + wypozyczenie1.rentDays
                + " Cena: " + (wypozyczenie1.samochod.priceForRentPerDay * wypozyczenie1.rentDays) + "PLN");

        System.out.println("Klient: " + wypozyczenie2.klient.firstName + " " + wypozyczenie2.klient.lastName + " Wypożyczone auto: " +
                wypozyczenie2.samochod.brand + " " + wypozyczenie2.samochod.model + " Ilośc dni:" + wypozyczenie2.rentDays
                + " Cena: " + (wypozyczenie2.samochod.priceForRentPerDay * wypozyczenie2.rentDays) + "PLN");

        System.out.println("Klient: " + wypozyczenie3.klient.firstName + " " + wypozyczenie3.klient.lastName + " Wypożyczone auto: " +
                wypozyczenie3.samochod.brand + " " + wypozyczenie3.samochod.model + " Ilośc dni:" + wypozyczenie3.rentDays
                + " Cena: " + (wypozyczenie3.samochod.priceForRentPerDay * wypozyczenie3.rentDays) + "PLN");





    }

}
