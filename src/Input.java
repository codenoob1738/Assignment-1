public class Input {

    public static String[][] removeDuplicates(String[][] records) {

        String[][] people = new String[records.length][4];

        int count = 0;

        for (int a = 0; a < records.length; a++) { // Loop through each record in the input array and check for duplicates

            String role = records[a][0];
            String firstName = records[a][1];
            String lastName = records[a][2];
            int hours = Integer.parseInt(records[a][4]);

            boolean found = false;

            for (int b = 0; b < count; b++) { 

                if (people[b][0].equals(role) 
                        && people[b][1].equals(firstName)
                        && people[b][2].equals(lastName)) {

                    int total = Integer.parseInt(people[b][3]);
                    people[b][3] = String.valueOf(total + hours);

                    found = true;
                    break;
                }
            }

            if (found == false) { // If the person is not found in the people array, add them as a new entry
                people[count][0] = role;
                people[count][1] = firstName;
                people[count][2] = lastName;
                people[count][3] = String.valueOf(hours);

                count++;
            }
        }

        String[][] result = new String[count][4];

        for (int i = 0; i < count; i++) { 
            result[i] = people[i];
        }

        return result;
    }
}