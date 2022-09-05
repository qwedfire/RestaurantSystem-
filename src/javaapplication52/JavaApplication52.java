/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication52;

import java.util.Scanner;

/**
 * @author LAND
 */
public class JavaApplication52 {

    public enum Input {
        ADD,
        GET,
        INSERT,
        PREPARE,
        END;

        public static Input getvalue(int index) {
            Input input[] = Input.values();
            return input[index - 1];
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // QueueLinkedList 實作
        QueueLinkedList<Human> qll = new QueueLinkedList();
        while (true) {
            System.out.print("輸入數字(1~5): 1.加入Human 2.取出Human 3.插入Human 4.準備中的餐點 5.結束");
            Input input = Input.getvalue(sc.nextInt());
            switch (input) {
                case ADD:
                    qll.push(new Human());
                    break;
                case GET:
                    Human tmp = qll.pop();     //取出資料並刪除
                    System.out.println("取出" + tmp);
                    break;
                case INSERT:
                    System.out.println("輸入插入的位置0~" + qll.size());
                    qll.insert(sc.nextInt(), new Human());
                    break;
                case PREPARE:
                    System.out.println(qll.peek());
                    break;
                case END:
                    System.exit(0);
            }
            System.out.println("目前資料");
            qll.order();
            System.out.println("-----");
            qll.print();
        }
        
       /* QueueArrayList實作
        QueueArrayList<Human> qal=new QueueArrayList();             
         while(true){
            System.out.print("輸入功能1加入Human2取出Human3插入Human4準備中的餐點5結束");
            Input input=Input.getvalue(sc.nextInt());
            switch(input){
                case ADD:                                        
                    qal.push(new Human());
                    break;
                case GET:
                    Human tmp=qal.pop();     //取出資料並刪除
                    System.out.println("取出"+tmp);                    
                    break;
                case INSERT:
                    System.out.println("輸入插入的位置0~"+qal.size());
                    qal.insert(sc.nextInt(), new Human());
                    break;
                case PREPARE:
                    
                    break;
                case END:
                    System.exit(0);                        
            }
            System.out.println("目前資料");           
            qal.print();
        }*/
    }
}

