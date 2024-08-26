public class StudentPassFail {
    public static void main(String[] args) {
        // Example grades for three subjects
        int grade1 = 45;  
        int grade2 = 38;  
        int grade3 = 50;  
        
        // Initialize the count of failed subjects
        int failedCount = 0;
        
        int[] grades = {grade1, grade2, grade3};
        
        for (int subject = 0; subject < grades.length; subject++) {
            int grade = grades[subject];
            
            // Nested switch case to check grade for each subject
            switch (subject) {
                case 0:
                case 1: 
                case 2: 
                    // Inner switch to determine if the grade is passing or failing
                    switch (grade) {
                        default:
                            // If grade is more than 40, it is a pass
                            // No action needed here
                            break;
                        case 40:
                        case 39:
                        case 38:
                        case 37:
                        case 36:
                        case 35:
                        case 34:
                        case 33:
                        case 32:
                        case 31:
                        case 30:
                        case 29:
                        case 28:
                        case 27:
                        case 26:
                        case 25:
                        case 24:
                        case 23:
                        case 22:
                        case 21:
                        case 20:
                        case 19:
                        case 18:
                        case 17:
                        case 16:
                        case 15:
                        case 14:
                        case 13:
                        case 12:
                        case 11:
                        case 10:
                        case 9:
                        case 8:
                        case 7:
                        case 6:
                        case 5:
                        case 4:
                        case 3:
                        case 2:
                        case 1:
                        case 0:
                            // If grade is 40 or less, consider as fail
                            failedCount++;
                            break;
                    }
                    break;
                default:
                    // Should not occur
                    System.out.println("Unexpected subject index.");
                    break;
            }
        }
        
        // Determine and print the result based on the count of failed subjects
        if (failedCount == 0) {
            System.out.println("The student passes.");
        } else {
            System.out.println("The student failed in " + failedCount + " subject(s).");
        }
    }
}
