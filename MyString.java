/*
 * Fernando Duffoo
 * CSCI 231
 * 7/17/2022
 * Project 10
 */

public class MyString
{
    private char data[];
    public MyString(char[] chars)
    {
        data=chars;
    }
    public char charAt(int i)
    {
        for(int j=0;j<data.length;j++)
        {
            if(i==j)
            {
                return data[i];
            }
        }
        return 0;
    }
    public int length()
    {
        return data.length;
    }
     public MyString substring(int begin, int end)
    {
        for(int j=begin;j<end;j++)
        {
            System.out.print(data[j]+",");
        }
        return new MyString(data);
    }
    public MyString toLowerCase()
    {
        for(int a=0;a<data.length;a++)
        {
            if(data[a]>='A'&&data[a]<='Z')
            {
                data[a] = (char)((int)data[a] + 32);
            }
        }
        return new MyString(data);
    }
    public boolean equals(MyString others)
    {
        for(int i=0;i<others.length();i++) 
        {
            if(data[i]!=others.charAt(i))
            {
                return false;
            }
        }
        return true;
    }
    public MyString valueOf(int i)
    {
        char data1[]=Integer.toString(i).toCharArray();
        return new MyString(data1);
    }
    public static void main(String[] args) 
    {
       char[] arr= {'A','b','C','d','E'}; 
       char[] arr1= {'f','G','h','I','j'};
       MyString str= new MyString(arr);
       MyString str1= new MyString(arr);
       MyString str2= new MyString(arr1);
       
       System.out.println("CharAt method test: ");
       System.out.println(str.charAt(2));
       
       System.out.println("\nLength method test: ");
       System.out.println(str.length());
       
       System.out.println("\nSubstring method test: ");
       str.substring(2,4);
       System.out.println("");
       
       System.out.println("\nLowercase method test: ");
       MyString result=str1.toLowerCase();
       for(int i=0;i<result.length();i++)
       System.out.print(result.charAt(i)+",");
       System.out.println("");
       result=str2.toLowerCase();
       for(int i=0;i<result.length();i++)
       System.out.print(result.charAt(i)+",");
       
       System.out.println("\n\n1st Equal method test: "+str.equals(str1));
       System.out.println("\n2nd Equal method test: "+str.equals(str2));
       
       System.out.println("\nValueOf method test: ");
       result=str.valueOf(1234);
       for(int i=0;i<result.length();i++)
       System.out.print(result.charAt(i)+"");
    }
}