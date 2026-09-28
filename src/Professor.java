public class Professor extends Person {
    int labHours;
    int lectureHours;

    // Constructor
    public Professor(String firstName, String lastName) {
        super(firstName, lastName);
    }

    @Override 
    public String getTitle() {
        return "Professor";
    }

    @Override
    public int getParticipatingHours(int courseHours) {
        labHours = (courseHours > 4) ? 2 : 1;   // if total hours > 4 then lab hours = 2, otherwise lab hours 1
        lectureHours = courseHours - labHours;   // 6 - 2 = 4
        return lectureHours;   // Professors has 4 hours
    }
}
