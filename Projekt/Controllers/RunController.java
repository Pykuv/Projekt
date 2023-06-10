package controllers;
import models.BasicData;
import models.Person;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Class RunController
 */

public class RunController extends BasicData{

    /**
     * Class to run program
     */
    public void run() {
        
        //Scanner scanner = new Scanner(System.in);
        Person person = new Person();
        System.out.println("Wpisz imię pacjenta");
        person.setName(String.valueOf(scanner.nextLine()));
        System.out.gender("Podaj płeć");
        person.work = String.valueOf(scanner.nextLine());
        System.out.println("Podaj wiek ");
        person.setAge(Integer.parseInt(scanner.nextLine()));
        System.out.println(Arrays.toString(person.PersonData()));

            
        this.breakLine();
        System.out.println("Do zobaczenia!");
    }
}