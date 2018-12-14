/* Даны натуральные числа a1,b1,a2,b2. Найти сумму дробей
 * a1/b1 + a2/b2 в виде смешаной дроби с выделенной целой частью.
 */
package mypackage;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Введите натуральные числа a1, b1, a2, b2");
        Scanner scan = new Scanner(System.in);
        int numerator   = 0;
        int denominator = 0;

        int a1 = scan.nextInt();
        int b1 = scan.nextInt();
        int a2 = scan.nextInt();
        int b2 = scan.nextInt();

        if((b1 != 0)&&(b2 != 0)) {
            if (b2!=b1) {
                numerator = (a1 * b2) + (a2 * b1);
                denominator = b1 * b2;
            }
            if (b2==b1){
                numerator   = a1+a2;
                denominator = b1;
            }
            System.out.println("числитель "+numerator+"/знаменатель "+denominator);

            int full  = numerator/denominator; //целая дроби
            System.out.println("Целая дроби: "+full);
            if (numerator%denominator == 0) System.exit(0);
            numerator = numerator - (denominator * full);
            a1 = numerator;
            a2 = denominator;

            while(a1 != a2)
            {
                if(a1>a2)
                {
                    int tmp = a1;
                    a1=a2;
                    a2=tmp;
                }
                a2=a2-a1;
            }
            System.out.println("Н.о.д: "+a2);
            if(a2!=0)
            {
                System.out.println("Целая часть: "+full+"; числитель: "+numerator/a2+" / знаменатель: "+denominator/a2);
            }
            else
            {
                System.out.println("Целая часть: "+full+"; числитель: "+numerator+" / знаменатель: "+denominator);
            }
        }
        else {
            System.out.println("Делить на 0 нельзя");

        }
        scan.close();

    }

}