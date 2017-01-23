package com.javarush.test.level09.lesson08.task05;

/* Перехват unchecked исключений
В методе processExceptions обработайте все unchecked исключения.
Нужно вывести стек-трейс каждого возникшего исключения используя метод printStack.
Можно использовать только один блок try..
*/

public class Solution {
    public static void main(String[] args) {
        processExceptions(new Solution());
    }

    public static void processExceptions(Solution obj) {
        try {
            obj.method1();
            obj.method2();
            obj.method3();
        } catch (NumberFormatException e) {
            printStack(e);
        } catch (NullPointerException e) {
            printStack(e);
        } catch (IndexOutOfBoundsException e) {
            printStack(e);
        }
    }

    public static void printStack(Throwable throwable) {
        System.out.println(throwable);
        for (StackTraceElement element : throwable.getStackTrace()) {
            System.out.println(element);
        }
    }

    public void method1() {
        throw new NullPointerException(); // рунттаймэкс-экспепш
    }

    public void method2() {
        throw new IndexOutOfBoundsException(); // рунттаймэкс-эксе
    }

    public void method3() {
        throw new NumberFormatException(); // иллегаларгумэсепш-
    }
}
