package AgregacjaKompozycja;

public class Bank {

    public static void main(String[] args) {

       UzytkownikKonta uzytkownik1 = new UzytkownikKonta();

       uzytkownik1.firstName = "Jan";
       uzytkownik1.lastName = "Kowalski";
       uzytkownik1.pesel = "123456789";

       Adres adresUzytkownika1 = new Adres();

       adresUzytkownika1.city = "Warszawa";
       adresUzytkownika1.street = "Polska";
       adresUzytkownika1.postCode = "01-000";
       adresUzytkownika1.houseNumber = "1";
       adresUzytkownika1.flatNumber = "1";

      uzytkownik1.livingAddress = adresUzytkownika1; // refencja livingAddress na adresUzytkownika
        // -> przypisanie adresu zamieszkania do adresu wprowadzonego
      uzytkownik1.registeredAddress = adresUzytkownika1;
      KontoBankowe konto1 = new KontoBankowe();
      konto1.owner = uzytkownik1;   // referencja owner na uzytkownik1
      konto1.balance = 10_000;

       Kredyt kredyt1 = new Kredyt();
       kredyt1.borrower = uzytkownik1; // referencja borrower na uzytkownik1
       kredyt1.cashBorrowed = 1000;
       kredyt1.cashReturned = 900;
       kredyt1.interestRate = 1.5;
       kredyt1.termMonth = 12;

       UzytkownikKonta uzytkownik2 = new UzytkownikKonta();
       uzytkownik2.firstName = "Monika";
       uzytkownik2.lastName = "Kowalska";
       uzytkownik2.pesel = "987654321";

        uzytkownik2.registeredAddress = new Adres();
        uzytkownik2.registeredAddress.city = "Poznan";
        uzytkownik2.registeredAddress.street = "Wiejska";
        uzytkownik2.registeredAddress.postCode = "61-245";
        uzytkownik2.registeredAddress.houseNumber = "99";
        uzytkownik2.registeredAddress.flatNumber = "2";

        uzytkownik2.livingAddress = adresUzytkownika1;


        KontoBankowe konto2 = new KontoBankowe();
       konto2.owner = uzytkownik2;
       konto2.balance = 5_000;

       Kredyt kredyt2 = new Kredyt();
       kredyt2.borrower = uzytkownik2;
       kredyt2.cashBorrowed = 2000;
       kredyt2.cashReturned = 1000;
       kredyt2.interestRate = 1.5;
       kredyt2.termMonth = 12;

        System.out.println("Osoba 1:");
        System.out.println(konto1.owner.firstName + " " + konto1.owner.lastName);
        System.out.println("Posiada konto zasilone kwotą: " + konto1.balance);
        System.out.println("Zameldowana pod adresem: " + uzytkownik1.registeredAddress.city + " " +
                uzytkownik1.registeredAddress.street + " " + uzytkownik1.registeredAddress.houseNumber + "/" +
                uzytkownik1.registeredAddress.flatNumber);

        System.out.println("Mieszka pod adresem: " + uzytkownik1.livingAddress.city + " " +
                uzytkownik1.livingAddress.street + " " + uzytkownik1.livingAddress.houseNumber + "/" +
                uzytkownik1.livingAddress.flatNumber);



        System.out.println("Osoba 2:");
        System.out.println(konto2.owner.firstName + " " + konto2.owner.lastName);
        System.out.println("Posiada konto zasilone kwotą: " + konto2.balance);
        System.out.println("Zameldowana pod adresem: " + uzytkownik2.registeredAddress.city + " " +
                uzytkownik2.registeredAddress.street + " " + uzytkownik2.registeredAddress.houseNumber + "/"
                + uzytkownik2.registeredAddress.flatNumber);

        System.out.println("Mieszka pod adresem: " + uzytkownik2.livingAddress.city + " " +
                uzytkownik2.livingAddress.street + " " + uzytkownik2.livingAddress.houseNumber + "/"
                + uzytkownik2.livingAddress.flatNumber);


    }
}
