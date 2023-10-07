package Thecodeworld;
//20 students in a class with the roll number 101-120.split them into 4 groups.bassed on their roll number.
//each group contain 5 students.
import java.util.Arrays;

public class _6_rollnumber {

	public static void main(String[] args) {

		        int startRollNo = 101; // Starting roll number of the class
		        int groupSize = 5; // Number of students in each group
		        int numGroups = 4; // Total number of groups
		        
		        // Loop through each group
		        for (int i = 1; i <= numGroups; i++) {
		            System.out.println("Group " + i + ":");
		            
		            // Loop through each student in the group
		            for (int j = 0; j < groupSize; j++) {
		                int rollNo = startRollNo + (i - 1) + (j * numGroups);
		                System.out.println(rollNo);
		            }
		            
		            System.out.println(); // Print an empty line between groups
		        }
		    }
		}
