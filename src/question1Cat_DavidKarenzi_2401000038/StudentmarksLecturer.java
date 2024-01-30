package question1Cat_DavidKarenzi_2401000038;

public class StudentmarksLecturer {

    public static void main(String[] args) {
        double Max = 0, Min = Double.MAX_VALUE;

        double[] mathsMarks = {15.9, 17.3, 19.7, 18.5};
        double[] frenchMarks = {7.3, 8.2, 9.1, 8.2};
        double[] chemistryMarks = {11.3, 10.5, 13.2, 12.5};

        System.out.println("\r------------------------------------------------------------------------------------------------");
        System.out.printf("%-15s%-15s%-15s%-15s%-15s%-15s%-15s\n",
                "|Student", "|Carine", "|Ella", "|Edena", "|Ellen", "|Max", "|Min");
        System.out.println("------------------------------------------------------------------------------------------------");

        for (int i = 0; i < mathsMarks.length; i++) {
            double Carine = mathsMarks[i];
            double Ella = frenchMarks[i];
            double Edena = chemistryMarks[i];
            
            double totalMarks = Carine + Ella + Edena;
            Max = Math.max(Max, totalMarks);
            Min = Math.min(Min, totalMarks);

            System.out.printf("%-15s%-15s%-15s%-15s%-15s%-15s%-15s\n",
                    "" + mathsMarks[i], "|" + frenchMarks[i], "|" + chemistryMarks[i], "| " + totalMarks,
                    "|" + Max, "|" + Min);
            System.out.println("------------------------------------------------------------------------------------------------");
        }

        System.out.printf("%-15s%-15s%-15s%-15s%-15s%-15s%-15s\n",
                "|Min", "|", "|", "|", "|", "|", "|" + Min);
        System.out.println("------------------------------------------------------------------------------------------------");
        System.out.printf("%-15s%-15s%-15s%-15s%-15s%-15s%-15s\n",
                "|Max", "|", "|", "|", "|", "|", "|" + Max);
        System.out.println("------------------------------------------------------------------------------------------------");
    }
}
