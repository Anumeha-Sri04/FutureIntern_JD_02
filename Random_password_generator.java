import java.util.Random;
import java.util.Scanner;
public class randomPasswordGenerator {
    public static void main(String args[])
    {
       Random r= new Random();
       Scanner sc=new Scanner(System.in);
       String lower_case="qwertyuiopasdfghjklzxcvbnm";
       String upper_case="QWERTYUIOPASDFGHJKLZXCVBNM";
       String nums="1234567890";
       String special_chars="`~!@#$%^&*()_+=[]{};':|,./<>?-";
       String combinations=lower_case+upper_case+nums+special_chars;
        System.out.println("Enter the length of the password you need!! ");
        int len=sc.nextInt();
        char[] password= new char[len];
        for(int i=0;i<len;i++)
        {
            password[i]=combinations.charAt(r.nextInt(combinations.length()));
        }
        System.out.println("The generated password is :" +new String(password));
    }
}

