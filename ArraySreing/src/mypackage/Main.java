package mypackage;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	//c клавиатуры вводится последовательностт строку до пустой строки
    // создать массив строк и его отсортровать
         final int nmax = 100;
         String [] array = new String[nmax];
         Scanner scan = new Scanner(System.in);
         String s = scan.nextLine();
         int n = 0;
         while (!s.isEmpty()){
             array[n++] = new String(s);
             s = scan.nextLine();
         }
         System.out.println("Исходный массив строк");
         for (int i = 0; i<n; i++)
             System.out.println(array[i]);
         //Сортировка массивка строк array
         for (int i =0; i<n-1; i++){
             //search min
             int imin = i;
             for (int j=i+1; j<n; j++){
                 if (array[j].compareTo(array[imin])<0){
                     imin = j;
                 }
             }
             //обмен array[i] и array[imin]
             String temp = array[i];
             array[i] = array[imin];
             array[imin] = temp;
         }
        System.out.println("Отсортированный массив строк");
        for (int i = 0; i<n; i++)
            System.out.println(array[i]);
    }
}
