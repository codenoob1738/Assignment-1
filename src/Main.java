public class Main {
    public static void main(String[] args) {
      // Assignment requirement: Scan the full record given all at once
      String[][] schoolRecords = {
        {"Professor", "Isaac", "Newton", "Physics", "6"},
        {"TA", "Marie", "Curie", "Physics", "6"},
        {"Professor", "Isaac", "Newton", "Calculus", "4"},
        {"Student", "Amy", "Adams", "Calculus", "4"},
        {"Student", "Will", "Smith", "Calculus", "4"},
        {"Student", "Brad", "Pitt", "Physics", "6"},
        {"Student", "Will", "Smith", "Physics", "6"},
        {"Professor", "Dmitri", "Mendeleev", "Chemistry", "6"},
        {"TA", "Carl", "Gauss", "Calculus", "4"},
        {"Student", "Amy", "Adams", "Economics", "3"},
        {"Professor", "Adam", "Smith", "Economics", "3"},
        {"TA", "Marie", "Curie", "Chemistry", "6"},
        {"Student", "Brad", "Pitt", "Chemistry", "6"},
        {"Student", "Will", "Smith", "Chemistry", "6"}
      }; 

      // Place holder array for People Objects
      People[] people = new People[20];
      int count = 0;

      // Place holder, variable name are subjected to change
      for (int i = 0; i < schoolRecords.length; i++) {
        String role = schoolRecords[i][0];                         // Persons role (professor/TA/Student)
        String first = schoolRecords[i][1];                        // First name
        String last = schoolRecords[i][2];                         // Last name
        int courseHours = Integer.parseInt(schoolRecords[i][4]);   // Hours put into course
      }

      // Assignment requirement: Every person must be mentioned in the printout only once.
      // TODO: Check if person already exists in array
      // TODO: If not, create a subclass object

      // Assignmen requirement: produce a printout of all the people with total hours through polymorphism.
      // TODO: Use polymorphism to compute hours
      // TODO: add hours to the person
      
      // Assignment requirement: The final printout format - Title (Professor/TA/Student) FirstName LastName TotalHours
      for (int i = 0; i < people.length; i++) {
        if (people[i] !=null) {
          System.out.println(
            people[i].getTitle() + " " +
            people[i].getFirstName() + " " +
            people[i].getLastName() + " " +
            people[i].getTotalHours()
          );
        }
      }
    }
}
