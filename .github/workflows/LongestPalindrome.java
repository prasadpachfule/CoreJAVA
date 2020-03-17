package com.cakesoft.solution;

import java.util.Scanner;

public class LongestPalindrome 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string");
		String s=sc.next();
		String palindrome="";
		for(int i=0;i<s.length();i++)
		{
			for(int j=s.length();j>=i;j--)
			{
				String s2=s.substring(i,j);
				//String s3=new String(new StringBuffer(s2).reverse());
				
				int k=0;
				int p=s2.length()-1;
				
				char[]ch=s2.toCharArray();
				while(k<p)
				{
					char temp=ch[k];
					ch[k]=ch[p];
					ch[p]=temp;
					k++;
					p--;
				}
				String s3="";
				for(char a:ch)
				{
					s3+=a;
				}
				
				if(s2.equals(s3))
				{
					if(palindrome.length()<s2.length())
					{
						palindrome=s2;
					}
				}
			}
		}
		System.out.println(palindrome);
	}
}
