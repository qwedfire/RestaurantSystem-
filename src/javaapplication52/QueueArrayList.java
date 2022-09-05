/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication52;

/**
 * @author LAND
 */
public class QueueArrayList<T> {
    private int count;
    private T[] customers;

    public QueueArrayList() {
        count = 0;
        customers = (T[]) new Human[1];
    }

    public void push(T data) {
        if (count == customers.length) {
            doubleArray();
        }
        customers[count] = data;
        count++;
    }

    public T pop() {
        if (count != 0) {
            T data = customers[0];  //取出的值
            for (int i = 0; i < count - 1; i++) {  //重新設定陣列
                customers[i] = customers[i + 1];
            }
            count--;
            return data;
        }
        return null;
    }

    public void insert(int index, T data) {
        if (count == customers.length) {
            doubleArray();
        }
        for (int i = count; i > index; i--) {
            customers[i] = customers[i - 1];  //index後面的陣列內容重新設定
        }
        customers[index] = data;  //index為新加的資料
        count++;
    }

    public void print() {
        String a = "";
        for (int i = 0; i < size(); i++) {
            a += "第" + (i + 1) + "筆資料 " + customers[i] + "\n";
        }
        System.out.print(a);
    }

    public int size() {
        return count;
    }

    private void doubleArray() {
        T tmp[] = (T[]) new Object[customers.length * 2];
        for (int i = 0; i < customers.length; i++) {
            tmp[i] = customers[i];
        }
        customers = tmp;
    }
}
