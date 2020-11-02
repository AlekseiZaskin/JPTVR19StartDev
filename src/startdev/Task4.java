/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package startdev;

import java.util.Random;

/**
 *
 * @author user
 */
public class Task4 {
    public void run(){
        System.out.println("----- Задача 4 ------");
        System.out.println("Создаем одномерный массив  из 10 ячеек типа int, \nзаполняем его случайными ЧЕТНЫМИ числами и выводим \nего значения в цикле");
        int sum=0;
        int myArray[] = new int[10];
        Random random = new Random();
        for(int i = 0; i < myArray.length; i++){
            myArray[i]= random.nextInt(9+1)*2;          
        }
            for(int i=0; i<myArray.length; i++) {
        sum=sum+myArray[i];
        }        for(int i=0; i < myArray.length; i++){
            System.out.printf("%3d",myArray[i]);
        }
        for(int i=0; i < myArray.length; i++){
            System.out.printf("%3d",myArray[i]);
        }
        
        System.out.println("Сумма всех чисел массива: ");
        System.out.println(sum);
        System.out.println("min = ");

        System.out.println("max = ");
        System.out.println("----- конец задачи 4 ------");
    }
}
