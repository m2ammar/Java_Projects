import java.util.Scanner;

public class ReportCard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter your Name: ");
        String name = scanner.nextLine();


        System.out.println("Enter your Roll Number: ");
        double rollNumber = scanner.nextDouble();


        System.out.println("Marks of Math: ");
        int marksOfMath = scanner.nextInt();


        System.out.println("Marks of Physics: ");
        int marksOfPhysics = scanner.nextInt();


        System.out.println("Marks of Chemistry: ");
        int marksOfChemistry = scanner.nextInt();

        //Calculation
        double totalMarks = marksOfMath + marksOfPhysics + marksOfChemistry;
        System.out.println(totalMarks);

        //Average
        double average = totalMarks / 3.0;
        System.out.println(average);

        String grade;
        if (average >= 80 ) {
            grade = "A";
        } else if (average >= 70 ){a
            grade = "B";
        } else if (average >= 60){
            grade ="C";
        } else{
            grade = "Fail";
        }

        System.out.println("--Report Card--");
        System.out.println("Name " + name);
        System.out.println("Marks of Math " + marksOfMath);
        System.out.println("Marks of Physics " + marksOfPhysics);
        System.out.println("Marks of Chemistry " + marksOfChemistry);
        System.out.println("Total " + totalMarks);
        System.out.println("Average " + average);
        System.out.println("Grade " + grade);


    }
}
