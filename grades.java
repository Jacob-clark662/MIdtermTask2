import java.util.Scanner;

public class grades {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("How many section do you want: ");
        int hsec = sc.nextInt();


        int array_3d[][][] = new int[hsec][2][3];

        String[] layout = {"Java", "Databases", "Networking"};

        // for (int[][] sections : array_3d) {
        //     System.out.println(sections);
        //         for (int[] students : sections) {
        //             for (int grades : students) {
                        
        //             }
        //         }
        // }

        for (int sections = 0; sections < array_3d.length; sections++) {
            System.out.println(" ");
            System.out.println("Section " + (sections + 1));
            System.out.println("=======================");
            double secAvg = 0;
            for (int students = 0; students < array_3d[sections].length; students++) {
                System.out.println("Student " + (students + 1));
                double avg = 0;
                for (int grades = 0; grades < array_3d[sections][students].length; grades++) {
                    System.out.printf("%-15s  :", layout[grades]);
                    int gr = sc.nextInt();
                    array_3d[sections][students][grades] = gr;
                    avg += gr;
                }
                avg = avg / array_3d[sections][students].length;
                System.out.println("Average: " + avg);
                System.out.println("=======================");
                secAvg += avg;
            }
            secAvg = secAvg / array_3d[sections].length;
            System.out.println("Section average: " + secAvg);
        }






    }
}


//MOdify the code and PROMPT the user to input How Many Sections 