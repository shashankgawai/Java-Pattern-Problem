
// XXXX
//  XXX
//   XX
//    X



public class Pattern5

{
    public static void main(String[] args) {

        for(int i = 1;i<=4;i++)
        {

        // Space Print 1st 
        for(int j=1;j<=i;j++)
        {
            System.out.print(" ");
            
        }
        for(int k=4;k>=i;k--)
        {
            System.out.print("X");
        }
        System.out.println();

          

        }

    }
    
}
