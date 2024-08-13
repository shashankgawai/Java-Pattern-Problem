// 1 2 3 4 5 
// 10 9 8 7 6
// 11 12 13 14 15
// 20 19 18 17 16
// 21 22 23 24 25
// 30 29 28 27 26
// 31 32 33 34 35
// 40 39 38 37 36


class Pattern20
{
    public static void main(String[] args) {
        

        int count=0;
        for(int i = 1;i<=8;i++)
        {
            if (i%2 !=0)
            {
                for(int j=1;j<=5;j++)
                {
                    count=count+1;
                    System.out.print(count+" ");
                }

            }
            else
            {
                int temp=count+1;
                for(int j=count+5;j>=temp;j--)
                {
                    count=count+1;
                    System.out.print(j+" ");
                }
            }
            System.out.println();


        }
    }
}