public class loops
{
    public static void main(String[] args)
    {
        int n=5,i,j;
        for(i=0;i<=n;i++)
        {
            for(j=0;j<5;j++)
            {
                if(i==0||i==n||j==0)
                {
                    if((i==0 && j==0)||(i==5 && j==0))
                    {
                        System.out.print("  ");
                    }
                   System.out.print("* ");
                }
                else
                {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        
    }
}