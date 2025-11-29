import java.util.Scanner;


// new task
 public class Main {
    public static void main(String[] args){
     /* program that calculate the value of user input in which they calculate toRad, log, cosine.
      */
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        System.out.println(a);
        double log = Math.log(a);
        System.out.println(log);
        double Rad = Math.toRadians(a);
        System.out.println(Rad);
        double  cos = Math.cos(a);
        System.out.println(cos);


    }
}

