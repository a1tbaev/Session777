import java.time.LocalDate;
import java.time.Month;

public class Main {
    public static void main(String[] args) {
        Programmer programmer = new Programmer(1,"Adil Aitbaev", (byte) 12,'M', "adil@gmail.com", "0707", 40000,"laptop");
        Programmer programmer1 = new Programmer(2,"Adil Aitbaev", (byte) 12,'M', "adil@gmail.com", "0707", 40000,"laptop");
        Programmer programmer2 = new Programmer(3,"Adil Aitbaev", (byte) 12,'M', "adil@gmail.com", "0707", 40000,"laptop");
        Programmer[] programmers = {programmer, programmer1, programmer2};

        Driver driver = new Driver(4,"Kani Akjoltoi kyzy", (byte) 13, 'F', "kani@gmail.com", "1234", 30000, "Car");
        Driver driver1 = new Driver(5,"Kani Akjoltoi kyzy", (byte) 13, 'F', "kani@gmail.com", "1234", 30000, "Car");
        Driver driver2 = new Driver(6,"Kani Akjoltoi kyzy", (byte) 13, 'F', "kani@gmail.com", "1234", 30000, "Car");
        Driver[] drivers = {driver, driver1, driver2};

        Doctor doctor = new Doctor(7,"balan tukuncho", (byte) 14, 'M', "balancha@", "112233", 22000,"injection");
        Doctor doctor1 = new Doctor(8,"balan tukuncho", (byte) 14, 'M', "balancha@", "112233", 22000,"injection");
        Doctor doctor2 = new Doctor(9,"balan tukuncho", (byte) 14, 'M', "balancha@", "112233", 22000,"injection");
        Doctor[] doctors = {doctor, doctor1, doctor2};

        meth(programmers);
        meth1(drivers);
        meth2(doctors);


    }
    public static void meth(Programmer[] programmers){
        for (Programmer programmer:programmers) {
            System.out.println(programmer);
            programmer.favoriteSport();
            programmer.favoriteLanguage();
            System.out.println(programmer.favoriteMouth());
            System.out.println(programmer.getLastName());
            System.out.println(programmer.getDateOfBrith());
            System.out.println(programmer.getPhoneNumberAndEmail());
            programmer.getPeopleOfAllAges(programmers);
        }
    }
    public static void meth1(Driver[] drivers){
        for (Driver driver:drivers) {
            System.out.println(driver);
            driver.favoriteSport();
            driver.favoriteLanguage();
            System.out.println(driver.favoriteMouth());
            System.out.println(driver.getLastName());
            System.out.println(driver.getDateOfBrith());
            System.out.println(driver.getPhoneNumberAndEmail());
            driver.getPeopleOfAllAges(drivers);
        }
    }
    public static void meth2(Doctor[] doctors){
        for (Doctor doctor:doctors) {
            System.out.println(doctor);
            doctor.favoriteSport();
            doctor.favoriteLanguage();
            System.out.println(doctor.favoriteMouth());
            System.out.println(doctor.getLastName());
            System.out.println(doctor.getDateOfBrith());
            System.out.println(doctor.getPhoneNumberAndEmail());
            doctor.getPeopleOfAllAges(doctors);
        }
    }
}