public class Main {
    public static void main(String[] args) {
      String personTitle = "";                         // Persons role (professor/TA/Student)
      String firstName = "";                        // First name
      String lastName = "";                         // Last name
      int courseHours = 0;
      String courseName = "";

      // Scan the full record given all at once
      String[][] orgSchoolRecords = {
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

      // To store data after removing duplicated date
      String[][] validatedSchoolRecords = {};

      // Place holder, variable name are subjected to change
      // Display original data record
      // To be called after validation of duplicate records module
      System.out.println("-----------------------------------");
      System.out.println("|      Original data Records      |");
      System.out.println("-----------------------------------");
      for (int i = 0; i < orgSchoolRecords.length; i++) {
        personTitle = orgSchoolRecords[i][0];                         // Persons role (professor/TA/Student)
        firstName = orgSchoolRecords[i][1];                        // First name
        lastName = orgSchoolRecords[i][2];                         // Last name
        courseName = orgSchoolRecords[i][3];
        courseHours = Integer.parseInt(orgSchoolRecords[i][4]);   // Hours put into course
        System.out.println(personTitle +  ' ' + firstName + ' ' + lastName + ' ' + courseName + ' ' + courseHours);
      }

      // Assignmen requirement: produce a printout of all the people with total hours through polymorphism.
      // TODO: Use polymorphism to compute hours
      // TODO: add hours to the person
      
      // The final printout format - Title (Professor/TA/Student) FirstName LastName TotalHours
      /* for (int i = 0; i < schoolRecords.length; i++) {
        if (valSchoolRecords[i] !=null) {
          System.out.println(
            valSchoolRecords[i].getPersonTitle() + " " +
            valSchoolRecords[i].getFirstName() + " " +
            valSchoolRecords[i].getLastName() + " " +
            valSchoolRecords[i].getCourseName()  + " " +
            valSchoolRecords[i].getCourseHours()
          );
        }
      } // For loop */
    }
}
