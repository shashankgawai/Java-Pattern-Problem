

// *
// **
// ***
// ****
// ***
// **
//  *

class Pattern6 {
    public static void main(String[] args) {
        // Top half of the pattern
        for (int i = 1; i <= 4; i++) {
            // Printing leading spaces
            for (int j = 4; j > i; j--) {  // Changed from j >= i to j > i
                System.out.print(" ");
            }
            // Printing stars
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Bottom half of the pattern
        for (int i = 1; i <= 3; i++) {  // Changed from i <= 4 to i <= 3
            // Printing leading spaces
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            // Printing stars
            for (int k = 3; k >= i; k--) {  // Adjusted loop condition for stars
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
