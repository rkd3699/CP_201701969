package ����3;

import java.util.Random ;
public class �ζ�
{
    public static void main(String args[])
    {
        int a[] = new int[6];
        Random rand = new Random(); 
        System.out.print(" <�ζ� ���� ���α׷�>");
        System.out.println();
        for(int i=0;i<=5;i++)    
        {
            a[i] = rand.nextInt(45)+1; 
            for(int j=0;j<i;j++) 
            {
              
                if(a[i]==a[j])  
                {
                    i--;
                }
            }
        }
        for(int k=0;k<=5;k++)
        {
            if(k==5)
            {
                System.out.print(a[k]);
            }
            else
            {    
                System.out.print(a[k]+" ");
            }
        }
    
        
    }}