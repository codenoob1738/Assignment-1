// Write a proper class hierarchy to represent professors, TAs and students.
public class Ta extends Person {
    int labHours;

    // Constructor
    public Ta(String firstName, String lastName) {
        super(firstName, lastName);
    }

    @Override
    public String getTitle() {
        return "TA";
    }

    @Override
    public int getParticipatingHours(int courseHours) {
        labHours = (courseHours > 4) ? 2 : 1;   // if total hours > 4 then lab hours = 2, otherwise lab hours 1
        return labHours;   // TA has 2 hours
    }
}
