import java.time.LocalDate;
import java.time.Month;

public class Doctor extends Person implements PersonAble{
    private String thinks;

    public Doctor(int id, String fullName, byte age, char gender, String email, String phoneNumber, double governmentsSalary, String thinks) {
        super(id, fullName, age, gender, email, phoneNumber, governmentsSalary);
        this.thinks = thinks;
    }

    public String getThinks() {
        return thinks;
    }

    public void setThinks(String thinks) {
        this.thinks = thinks;
    }
    @Override
    public void favoriteSport() {
        System.out.println("Volleyball");
    }

    @Override
    public String favoriteLanguage() {
        return "Russia";
    }

    @Override
    public Month favoriteMouth() {
        return Month.FEBRUARY;
    }

    @Override
    public String getLastName() {
        return getFullName().substring(5);
    }

    @Override
    public LocalDate getDateOfBrith() {
        return LocalDate.of(2007,12,1);
    }

    @Override
    public String getPhoneNumberAndEmail() {
        if (getEmail().contains("@")){
            return getEmail();
        }else {
            return "error";
        }
    }
    @Override
    public void getPeopleOfAllAges(Person[] people) {
        for (Person person:people) {
            System.out.println(person.getAge());
        }
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "id=" + super.getId() +
                ", fullName='" + super.getFullName() + '\'' +
                ", age=" + super.getAge() +
                ", gender=" + super.getGender() +
                ", email='" + super.getEmail() + '\'' +
                ", phoneNumber='" + super.getPhoneNumber() + '\'' +
                ", governmentsSalary=" + super.getGovernmentsSalary() + "thinks='" + thinks + '\'' +
                '}';
    }
}
