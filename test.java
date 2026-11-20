public class test {
    public static void main(String[] args) {

        System.out.println("\nuwu\n"); 

        int counter = 1;

        int testest[][][] = { 
             {{10,20},{30,40}}, {{50,60}, {70,80} }
        };


        for(int i = 0; i < testest.length; i++ ) {
            System.out.println("3d layers [" + counter + "]:");
            for(int x = 0; x < testest[i].length; x++) {
                for(int y = 0; y < testest[i][x].length; y++) {
                    System.out.print(" " + testest[i][x][y]);

                }
                System.out.println("");
            }
            counter++;
        }
    }
}