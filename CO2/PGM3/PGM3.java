import java.util.Scanner;
class PGM3{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string1 : ");
        String str1 = sc.next();
        System.out.println("Enter string2 : ");
        String str2 = sc.next();
        System.out.println("\nlength of string with length() :" + str1.length());
        System.out.println("\ntoUpperCase() :" + str1.toUpperCase());
        System.out.println("\ntoLowerCase() :" + str1.toLowerCase());
        System.out.println("\nsubstring(1,3) :" + str1.substring(1,3));
        System.out.println("\nconcat() :" + str1.concat(str2));
        System.out.println("\nconcatination using + operator :" + str1 + str2);

    }
}