/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package startdev;

import java.util.Scanner;

/**
 *
 * @author user
 */
class Task1 {
        public void run(){
            System.out.println(" Task 1 ");
            System.out.println("Введите число градусов по Цельсию: ");
            Scanner scanner= new Scanner(System.in);
            int celsi = scanner.nextInt();
            int forengeit = celsi * 9/5 + 32;
            System.out.println("По Фарингейту это будет: ");
            System.out.println(forengeit);
            System.out.println("----- конец задачи 1 ------");
}
}
