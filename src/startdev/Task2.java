/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package startdev;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class Task2 {
    public void run(){
        System.out.println("----- Задача 2 ------");
        System.out.println("Загадано число от 5 до 10: ");
        
        System.out.println("Отгадай: ");
        Random random = new Random();
        int attempt = 0; 
        do {
            int myNumber = random.nextInt(10 - 5 + 1)+0;
            Scanner scanner = new Scanner(System.in);
            int gamerNumber = scanner.nextInt();
            if (gamerNumber != myNumber){
                attempt++;
            }
            if(myNumber == gamerNumber){
                System.out.println("Ты выиграл");
                break;
            }else{
                if(attempt > 1){
                    System.out.println("Ты проиграл");
                    System.out.println("----- конец задачи 2 ------");
    }
   
            }
        } while (true);
    }
}