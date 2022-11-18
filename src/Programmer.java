import java.time.LocalDate;
import java.time.Month;

public class Programmer extends Person implements PersonAble{
    private String thinks;

    public Programmer(int id, String fullName, byte age, char gender, String email, String phoneNumber, double governmentsSalary, String thinks) {
        super(id, fullName, age, gender, email, phoneNumber, governmentsSalary);
        this.thinks = thinks;
    }

    public String getThings() {
        return thinks;
    }

    public void setThings(String things) {
        this.thinks = things;
    }

    @Override
    public void favoriteSport() {
        System.out.println("Swimming");
    }

    @Override
    public String favoriteLanguage() {
        return "English";
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
        return LocalDate.of(2004,2,17);
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
        return "Programmer{" +
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
