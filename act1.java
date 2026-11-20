import java.util.Scanner;

public class act1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int array_3d[][] = new int[3][3];

        while (true) {
            System.out.println("===========================");
            System.out.println("Enter the 9 numbers ");
            for (int x = 0;x < array_3d.length; x++) {
                for (int y = 0; y < array_3d[x].length; y++) {
                    int num = sc.nextInt();
                    array_3d[x][y] = num;
                }
            }
            int counter = 1;
            // for rows
            int row1 = 0;
            int row2 = 0;
            int row3 = 0;
            // for colums
            int col1 = 0;
            int col2 = 0;
            int col3 = 0;
            // for diagonals
            int dia1 = 0;
            int dia2 = 0;
            int counterDia = 3;
            for (int[] number : array_3d) {
                int colCounter = 1;
                for (int sum : number) {
                // for rows
                if (counter == 1) {
                    row1 += sum;
                }
                if (counter == 2) {
                    row2 += sum;
                }
                if (counter == 3) {
                    row3 += sum;
                }
                // for colums
                if (colCounter == 1) {
                    col1 += sum;
                }
                if (colCounter == 2) {
                    col2 += sum;
                }
                if (colCounter == 3) {
                    col3 += sum;
                }
                // for diagonal
                if (colCounter == counter) {
                    dia1 += sum;
                }
                
                if (counterDia - colCounter == 0) {
                    dia2 += sum;
                }
                colCounter++;
                }
                counter++;
                counterDia--;
            }
            System.out.printf("=========================================================================================\n");
            System.out.printf("\n%45s  \n%20d %5d %5d %10d  \n%20d %5d %5d %10d  \n%20d %5d %5d %10d  \n Column sum: %7d %5d %5d ","Row Sum", array_3d[0][0], array_3d[0][1], array_3d[0][2], row1, array_3d[1][0], array_3d[1][1], array_3d[1][2], row2, array_3d[2][0], array_3d[2][1], array_3d[2][2], row3, col1, col2, col3);
            System.out.printf("\n \n=======================================================================================\n Diagonal sum 1: %d\n Diagonal sum 2: %d\n \n", dia1, dia2);

            
            String answer;
            while (true) {
                System.out.print("Try again y or n: ");
                answer = sc.nextLine().trim();
                if (answer.equalsIgnoreCase("y") || answer.equalsIgnoreCase("n")) {
                    break;
                }
                System.out.println("Invalid input pls enter y or n");
            }
    
            if (answer.equalsIgnoreCase("n")) {
                break;
            } 
        }
    }
}

    
