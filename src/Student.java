// Write a proper class hierarchy to represent professors, TAs and students.
public class Student  extends Person {
    // Constructor
    public Student(String firstName, String lastName) {
        super(firstName, lastName);
    }

    @Override
    public String getTitle() {
        return "Student";
    }

    @Override
    public int getParticipatingHours(int courseHours) {
        return courseHours; // students attend all 6 hours 
    }
}
