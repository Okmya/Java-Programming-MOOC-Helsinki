
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author m.brzyska
 */
public class Room {

    private ArrayList<Person> persons;

    public Room() {
        this.persons = new ArrayList<>();
    }

    public void add(Person person) {
        persons.add(person);
    }

    public boolean isEmpty() {
        if (persons.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    public ArrayList<Person> getPersons() {
        return this.persons;

    }

    public Person shortest() {

        if (this.persons.isEmpty()) {
            return null;
        }

        Person shortestPerson = this.persons.get(0);

        for (Person person : persons) {
            if (shortestPerson.getHeight() > person.getHeight()) {
                shortestPerson = person;
            }
        }

        return shortestPerson;
    }

    public Person take() {
        if (this.persons.isEmpty()) {
            return null;
        }
        
        Person shortestPerson = this.shortest();
        
        
        
        return persons.remove(persons.indexOf(shortestPerson));
        
        
        
        

    }

}
