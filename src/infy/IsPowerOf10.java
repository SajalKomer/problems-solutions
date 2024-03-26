package infy;

public class IsPowerOf10 {
    public static boolean check(long num){

        if(num==1)
            return true;
        else if(num<10)
            return false;
        else if(num%10==0){
            return check(num/10);
        }
        else
            return false;
    }

    /*
    Another approach:
    while (input >= 10 && input % 10 == 0){
        input /= 10;
      }
    return input == 1;
     */

    public static void main(String[] args) {
        long num=1000001;

        boolean val=check(num);

        if(val==true)
            System.out.println("Power of 10");
        else
            System.out.println("Not power of 10");

        System.out.println(num);

    }
}
