import java.util.*;
class WayO
{
	//adding comments
    int outp[];
    int blk[][];
    int tra,bl;
    int low,m;
    void input()
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        outp=new int[t];
        for(int l=0;l<t;l++)
        {
            bl=sc.nextInt();
            blk=new int[bl][bl];
            tra=sc.nextInt();
            take();              
            test();          
            outp[l]=low;
        }
        for(int l=0;l<t;l++)
        {
            System.out.println(outp[l]);
        }
    }
    void take()
    {
            for(int i=0;i<bl;i++)
            {
                Scanner sc=new Scanner(System.in);
                int a=sc.nextInt();
                int b=sc.nextInt();
                for(int j=0;j<bl;j++)
                {
                    if(j>=a && j<=b )
                    blk[j][i]=0;
                    else
                    blk[j][i]=1;
                }
                
            }
            
    
    }
    void test()
    {
        for(int i=0;i<bl-tra+1;i++)
            {
                m=0;
                for(int j=0;j<bl;j++)
                {
                    for(int k=i;k<i+tra;k++)
                    {
                        if(blk[k][j]==1)
                        m++;
                    }
                }
                if(i==0)
                low=m;
                else if(low>=m)
                low=m;
            }
    }
    public static void main(String args[])
    {
        WayO ob= new WayO();
        ob.input();
    }
}
