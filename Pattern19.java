// 1
// 2 6
// 3 7 10
// 4 8 11 13


public class Pattern19
 {

    public static void main(String[] args)
     {

       
        for(int i = 1;i<=4;i++)
        {
            int no=i;
            for(int j=1; j<=i;j++)
            {   
                
                System.out.print(" "+no);
                no=no+5-j;


            }
            System.out.println();
        }
        
    }
    
}
