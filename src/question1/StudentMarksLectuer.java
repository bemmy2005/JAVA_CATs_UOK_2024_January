package question1;



public class StudentMarksLectuer {
    public static void main(String[] args) {
        double maths = 0;
        double french = 0;
        double chemistry = 0;
        double minfrench = 0;
        double minchemistry = 0;
        double maxfrench = 0;
        double maxchemistry = 0;
        double totalMarks = 0;
        double percentage = 0;
        double average = 0;

        double minMaths = 0;
        double maxMaths = 0;

        String[] students = {"Caline", "Ella", "Edena", "Ellen"};

        double[] mathsMarks = {15.9, 17.3, 19.7, 18.5};
        double[] frenchMarks = {7.3, 8.2, 9.1, 8.2};
        double[] chemistryMarks = {11.3, 10.5, 13.2, 12.5};

        System.out.println("\r------------------------------------------------------------------------------------------------");
        System.out.printf("%-15s%-15s%-15s%-15s%-15s%-15s\n",
                "|Student", "|Maths", "|french", "|Design", "|Percentage", "|Average");
        System.out.println("------------------------------------------------------------------------------------------------");
        for (int i = 0; i < students.length; i++) {
            maths = mathsMarks[i];
            french = frenchMarks[i];
            chemistry = chemistryMarks[i];

            totalMarks = maths + french + chemistry;
            percentage = (double) totalMarks / 3;
            average = (double) totalMarks / 3;

            minMaths = Math.min(mathsMarks[0], Math.min(mathsMarks[1], mathsMarks[2]));
            maxMaths = Math.max(mathsMarks[0], Math.max(mathsMarks[1], Math.max(mathsMarks[2], mathsMarks[3])));

            minfrench = Math.min(frenchMarks[0], Math.min(frenchMarks[1], frenchMarks[2]));
            maxfrench = Math.max(frenchMarks[0], Math.max(frenchMarks[1], frenchMarks[2]));

            minchemistry = Math.min(chemistryMarks[0], Math.min(chemistryMarks[1], chemistryMarks[2]));
            maxchemistry = Math.max(chemistryMarks[0], Math.max(chemistryMarks[1], chemistryMarks[2]));

            System.out.printf("|%-15s|%-15.1f|%-15.1f|%-15.1f|%-15.1f|%-15.1f|\n",
                    students[i], maths, french, chemistry, percentage, average);
            System.out.println("------------------------------------------------------------------------------------------------");
        }

        System.out.printf("|%-15s|%-15.1f|%-15.1f|%-15.1f|%-15s|%-15s|\n",
                "Min", minMaths, minfrench, minchemistry, " ", " ");
        System.out.println("------------------------------------------------------------------------------------------------");
        System.out.printf("|%-15s|%-15.1f|%-15.1f|%-15.1f|%-15s|%-15s|\n",
                "Max", maxMaths, maxfrench, maxchemistry, " ", " ");
        System.out.println("------------------------------------------------------------------------------------------------");
    }
}

