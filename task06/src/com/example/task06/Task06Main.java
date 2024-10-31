package com.example.task06;

public class Task06Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        new Task06Main().printMethodName();
         */
    }

    void printMethodName() {
        Exception ex = new Exception("Ошибка для определения имени метода, вызвана намерено.");
        StackTraceElement[] elements = ex.getStackTrace();

        System.out.println(elements[1].getMethodName());
    }

}