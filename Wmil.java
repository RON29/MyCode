import java.io.*;
import java.util.*;
class Wmil
{
    int t,n;
    String q,s;
    int ot=0;
    int in[],out[];
    void input()throws java.io.IOException
    {
        //Scanner sc=new Scanner(System.in);
        java.io.InputStreamReader ir=new java.io.InputStreamReader(System.in);
        java.io.BufferedReader br=new java.io.BufferedReader(ir);
        t=Integer.parseInt(br.readLine());
        out=new int[t];
        for(int i=0;i<t;i++)
        {
            n=Integer.parseInt(br.readLine());
            q=br.readLine();
            s=br.readLine();
            in=new int[n+1];
            String str=br.readLine()+" ";
            String st1="";
            int k=0;
            for(int j=0;j<str.length();j++)
            {
                char c=str.charAt(j);
                if(c==' ')
                {
                    in[k]=Integer.parseInt(st1);
                    k++;
                    st1="";
                }
                else
                st1=st1+c;
            }
                
            chk();
            out[i]=ot;
            ot=0;
        }
        for(int i=0;i<t;i++)
        {
            System.out.println(out[i]);
        }    
    }
    void chk()
    {
        int c=0;
        if(q.equalsIgnoreCase(s)==true)
        {
            ot=in[n];
            return;
        }
        c++;
        int z=0;
        for(int i=0;i<n;i++)
        {
            char e=s.charAt(i);
            char f=q.charAt(i);
            if(e==f)
            {
                z++;
            }
        }
        ot=in[0];
        for(int i=1;i<=z;i++)
        {
            if(ot<=in[i])
            ot=in[i];
        }
        return;
    }
    public static void main(String args[])throws java.io.IOException
    {
        Wmil ob=new Wmil();
        ob.input();
    }
}

    
        
                
