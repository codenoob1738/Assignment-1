public class Main {
    public static void main(String[] args) {
      String personTitle = "";   // Persons title (professor/TA/Student)
      String firstName = "";     // First name
      String lastName = "";      // Last name
      int courseHours = 0;       // hours in a course/lab
      String courseName = "";    // Course name

      // Scan the full record given all at once
      String[][] orgSchoolRecords = {   // array stores raw data
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
      String[][] validatedSchoolRecords = Input.removeDuplicates(schoolRecords);
      // Unique objects array (looks through name to find total hours)
      Person[] uniquePersons = new Person[20];
      int peopleCount = 0;

      for (int i = 0; i < validatedSchoolRecords.length; i++) {   // Using validatedSchoolRecords from input.java 
        personTitle = validatedSchoolRecords[i][0];
        firstName = validatedSchoolRecords[i][1];
        lastName = validatedSchoolRecords[i][2];
        courseHours = Integer.parseInt(validatedSchoolRecords[i][4]);

        // Check if person already exists
        Person academicPerson = null;
        for (int j = 0; j < peopleCount; j++) {
          if (uniquePersons[j].getFirstName().equals(firstName) &&
            uniquePersons[j].getLastName().equals(lastName)) {
            academicPerson = uniquePersons[j];
            break;
          }
        }   // end of for loop

        // If no existing/duplicated person found, create new object based on title
        if (academicPerson == null) {
          if (personTitle.equals("Professor")) {        // If person title is professor
            academicPerson = new Professor(firstName, lastName);   
          } else if (personTitle.equals("TA")) {        // If person title is TA
            academicPerson = new Ta(firstName, lastName);  
          } else {                                               // If person title is neither professor/TA, then its student
            academicPerson = new Student(firstName, lastName);
          }

          uniquePersons[peopleCount] = academicPerson;
          peopleCount++;
        }   // End of if statement

        // Produce a printout of all the people with total hours through polymorphism.
        int calculatedHours = academicPerson.getParticipatingHours(courseHours);   // polymorphism, calls the interface
        academicPerson.addHours(calculatedHours);
      }

      // Printout original record (Title First name, Last name, Course name, Course/lab hours)
      System.out.println("-----------------------------------");
      System.out.println("|      Original data Records      |");
      System.out.println("-----------------------------------");
      for (int i = 0; i < orgSchoolRecords.length; i++) {
        personTitle = orgSchoolRecords[i][0];                     // Persons role (professor/TA/Student)
        firstName = orgSchoolRecords[i][1];                       // First name
        lastName = orgSchoolRecords[i][2];                        // Last name
        courseName = orgSchoolRecords[i][3];                      // Course Name
        courseHours = Integer.parseInt(orgSchoolRecords[i][4]);   // Hours put into course/lab
        System.out.println(personTitle +  ' ' + firstName + ' ' + lastName + ' ' + courseName + ' ' + courseHours);
      }

      System.out.println("----------------------------------------------");
      System.out.println("|      Validated data without duplication    |");
      System.out.println("----------------------------------------------");
      for (int i = 0; i < validatedSchoolRecords.length; i++) {
        personTitle = validatedSchoolRecords[i][0];
        firstName = validatedSchoolRecords[i][1];
        lastName = validatedSchoolRecords[i][2];
        courseName = validatedSchoolRecords[i][3];
        courseHours = Integer.parseInt(validatedSchoolRecords[i][4]);
        System.out.println(personTitle + " " + firstName + " " + lastName + " " + courseName + " " + courseHours);
      }
      
      // Produce a printout of all the people with their hours
      System.out.println("-----------------------------------");
      System.out.println("|      Total Hours Per Person     |");
      System.out.println("-----------------------------------");
      // Printout format [ Title, first name, last name, total hours attended ]
      for (int i = 0; i < peopleCount; i++) {
        uniquePersons[i].printSummary();
      }
    }
}
