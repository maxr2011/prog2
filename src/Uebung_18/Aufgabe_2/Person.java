package Uebung_18.Aufgabe_2;

/**
 * Created by maxr2011 on 10.02.2018.
 */
public class Person implements Comparable{
  private String firstName;
  private String lastName;

  public Person(String firstName, String lastName){
    this.firstName = firstName;
    this.lastName = lastName;
  }

  public String getFirstName() {
    return firstName;
  }

  public String getLastName() {
    return lastName;
  }

  @Override
  public String toString() {
    return "Person{firstName='" + firstName + "', lastName='" + lastName + "'}";
  }

  @Override
  public int compareTo(Object o) {
    Person other = (Person) o;
    return this.lastName.compareTo(other.lastName);
  }
}