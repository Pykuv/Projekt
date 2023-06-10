package models;
import interfaces.BasicInterface;
import interfaces.PatientInterface;

/**
 * Class pacjentów
 */
public class Patient extends BasicData implements BasicInterface, PatientInterface {
  public String work = "programmers";

    /**
     * String[] returned with set properties
     * @return
     */
    public String[] PatientData() {
        return new String[]{
                "gender: " + this.getGender(),
                "name: " + this.getName(),
                "age: " + this.getAge(),
        };
    }

    /**
     *
     * @param opt
     */
    @Override
    public void welcome(String opt) {
        System.out.println(HELLO + opt);
    }
}