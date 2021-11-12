
// * * * * *
// * * * *
// * * *
// * *
// *

public class Main
{
    public static void main(String[] args) {
        printStarPattern(5);
    }

    public static void printStarPattern(int rows) {
        int i, j;
        for (i=0; i<rows; i++) {
            for(j=i; j<rows; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}