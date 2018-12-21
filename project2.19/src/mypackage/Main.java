/*
Два массива x и y данного размера n заполнены случайными целыми числами, упорядоченными по не убыванию.
Построить третий массив 𝑧 размера 2n из чисел массивов x и y, также упорядоченный по не убыванию. Сортировку не использовать.
*/
package mypackage;
import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int n=10, max=99,number=0;
        int[] arrX= new int[n];
        int[] arrY= new int[n];
        int[] arrZ= new int[2*n];
        Random rnd = new Random(System.currentTimeMillis());

        for (int i = 0; i < n; i++) {
            number = rnd.nextInt(max);
            arrX[i]=number;
            number = rnd.nextInt(max);
            arrY[i]=number;
        }
        Arrays.sort(arrX);
        Arrays.sort(arrY);

        for(int x:arrX) {
            System.out.print(" "+x);
        }
        System.out.println();
        for(int y:arrY) {
            System.out.print(" "+y);
        }
        for (int i = 0; i < n; i++){
            arrZ[i] = arrX[i];
        }
        int j=0;
        for (int i = n; i < 2*n; i++){
            arrZ[i] = arrY[j]; j++;
        }
        int i=0;
        for (int z=0; z<2*n; z=z+2){
            if (arrX[i]<arrX[i]){
                arrZ[z] = arrX[i];
                arrZ[z+1]=arrY[i];
            }
            else {
                arrZ[z] = arrY[i];
                arrZ[z+1]=arrX[i];
            }
            i++;
        }
        System.out.println();
        for (int z:arrZ){
            System.out.print(" "+z);
        }
    }
}