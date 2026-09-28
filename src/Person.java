// Abstract class Person must implement this interface.
public abstract class Person implements ParticipateHours {
  // Write a program using abstract classes to represent people
  private String firstName;
  private String lastName;
  private int totalHours;

  // Constructor
  public Person(String parmFirstName, String parmLastName) {
    this.firstName = parmFirstName;
    this.lastName = parmLastName;
    this.totalHours = 0;
  }

   // Getters
  public abstract String getTitle();

  public String getFirstName() {
    return firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public int getTotalHours() {
    return totalHours;
  }

  // Setters 
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public void setTotalHours(int totalHours) {
    this.totalHours = totalHours;
  }

  public void addHours(int hours) {
    this.totalHours += hours;
  }

  // Displays persons title, first/last name, and hours spent
  public void printSummary() {
    System.out.println(getTitle() + " " + firstName + " " + lastName + " " + "Total hours: " + totalHours);
  }
}
