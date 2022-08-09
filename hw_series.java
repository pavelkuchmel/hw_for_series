import java.util.Scanner;
public class hw_series {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        /*
--------Кучмель Павел---------------------------------------------------------------------------------
         */
        //Series10. Дано целое число N и набор из N целых чисел.
        //Если в наборе имеются положительные числа, то вывести TRUE; в противном случае вывести FALSE.
        /*
        System.out.print("Введите число N: ");
        int n = in.nextInt();
        boolean answer = false;
        boolean[] nums = new boolean[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Введите целое число: ");
            int num = in.nextInt();
            if (num <= 0) {
                nums[i] = false;
            }
            else {
                nums[i] = true;
            }
        }
        for (int j = 0; j < n; j++){
            if (nums[j]==true){
                answer = true;
                break;
            }
        }
        System.out.println(answer);
        */
        /*
---------------------------------------------------------------------------------------------------------
         */
        //Series11. Даны целые числа K, N и набор из N целых чисел. Если в наборе
        //имеются числа, меньшие K, то вывести TRUE; в противном случае вывести FALSE.
        //-----2 варианта решения------
        /*
        System.out.print("Выберете вариант решения (1 или 2): ");
        int option = in.nextInt();
        switch (option){
            case 1:
        System.out.print("Введите число К: ");
        int k = in.nextInt();
        System.out.print("Введите число N: ");
        int n = in.nextInt();
        boolean answer = false;
        for (int i = 1;i<=n;i++){
            System.out.print("Введите число: ");
            int num = in.nextInt();
            if (num>=k){
                continue;
            }
            else{
                answer = true;
                break;
            }
        }
        System.out.println(answer);
        break;
            case 2:
                System.out.print("Введите число К: ");
                int k1 = in.nextInt();
                System.out.print("Введите число N: ");
                int n1 = in.nextInt();
                boolean answer1 = false;
                boolean[] nums = new boolean[n1];
                for (int j = 0;j<n1;j++){
                    System.out.print("Введите целое число: ");
                    int num = in.nextInt();
                    if (num<k1){
                        nums[j]=true;
                    }
                    else {
                        nums[j]=false;
                    }
                    }
                for (int l = 0;l<n1;l++){
                    if (nums[l]==true){
                        answer1 = true;
                                break;
                    }
                }
                System.out.println(answer1);
                }
         */
        /*
-----------------------------------------------------------------------------------------------------------------
         */
        //Series12. Дан набор ненулевых целых чисел; признак его завершения — число 0.
        //Вывести количество чисел в наборе.
        /*
        int i = 1;
        for (;;i++){
            System.out.print("Введите ненулевое целое число: ");
            int num = in.nextInt();
            if (num == 0)break;
        }
        System.out.println(i);
         */
        /*
-------------------------------------------------------------------------------------------------
         */
        //Series13. Дан набор ненулевых целых чисел; признак его завершения — число 0.
        //Вывести сумму всех положительных четных чисел из данного набора.
        //Если требуемые числа в наборе отсутствуют, то вывести 0.
        /*
        int sum = 0;
        for (int i = 1;;i++){
            System.out.print("Ведите целое число: ");
            int num = in.nextInt();
            if (num==0){
                break;
            }
            else {
                if (num > 0){
                    sum+=num;
                }
            }
        }
        System.out.println(sum);
         */
        /*
-------------------------------------------------------------------------------------------------------------
         */
        //Series14. Дано целое число K и набор ненулевых целых чисел; признак его
        //завершения — число 0. Вывести количество чисел в наборе, меньших K.
        /*
        System.out.print("Введите число К: ");
        int k = in.nextInt();
        int i = 0;
        for (;;){
            System.out.print("Введите целое число: ");
            int num = in.nextInt();
            if (num > k) i++;
            else if (num == 0) break;
        }
        System.out.println("Количество чисел в наборе, меньших К: "+i);
         */
        /*
-----------------------------------------------------------------------------------------------------------
         */
        //Series15. Дано целое число K и набор ненулевых целых чисел; признак его
        //завершения — число 0. Вывести номер первого числа в наборе, большего K.
        //Если таких чисел нет, то вывести 0.
        /*
        System.out.print("Введите число К: ");
        int k = in.nextInt();
        int answer = 0;
        for (int i = 0;;i++){
            System.out.print("Введите число: ");
            int num = in.nextInt();
            if (num>k&&answer==0) answer = num;
            else if (num==0) break;
        }
        System.out.println("Первое число в наборе, большее К: "+answer);
         */
        /*
----------------------------------------------------------------------------------------------------
         */
        //1. Составьте программу, выводящую на экран квадраты чисел от 10 до 20.
        /*
        for (int i = 10;i<=20;i++){
            System.out.println("Квадрат числа "+i+" = "+i*i+" ");
        }
         */
        /*
---------------------------------------------------------------------------------------------------
         */
        //2. Составьте программу, которая вычисляет
        //сумму чисел от 1 до n.значение n вводится с клавиатуры.
        /*
        System.out.print("Введите число n: ");
        int n = in.nextInt();
        int sum = 0;
        for (int i = 1;i<=n;i++){
            sum+=i;
        }
        System.out.println(sum);
         */
        /*
---------------------------------------------------------------------------------------------------------
         */
        //3. Составьте программу,
        //которая вычисляет произведение чисел от 1 до n.n вводится с клавиатуры.
        /*
        System.out.print("Введите число n: ");
        int n = in.nextInt();
        int mult = 1;
        for (int i = 1;i<=n;i++){
            mult*=i;
        }
        System.out.println(mult);
        */
        /*
-------------------------------------------------------------------------------------------------------------
         */
        //4. С клавиатуры вводятся n чисел. Составьте программу, которая определяет кол-во отрицательных,
        //кол-во положительных и кол-во нулей среди введеных чисел.Значение n вводится с клавиатуры.
        /*
        int positiv = 0;
        int negativ = 0;
        int zero = 0;
        for (;;){
            System.out.print("Введите число: ");
            int num = in.nextInt();
            if (num>0&&num!=666)positiv++;
            else if (num<0)negativ++;
            else zero++;
            System.out.println("Введено "+positiv+" положительных чисел.");
            System.out.println("Введено "+negativ+" отрицательных чисел.");
            System.out.println("Введено "+zero+" нулей.");
            System.out.println("Что бы завершить программу введите 666.\n");
            if (num==666)break;
        }
        System.out.println("---Program completed---");
        */
        /*
------------------------------------------------------------------------------------------------------------
         */
        //Series16. Дано целое число K и набор ненулевых целых чисел; признак
        //его завершения — число 0. Вывести номер последнего числа в наборе,
        //большего K. Если таких чисел нет, то вывести 0.
        /*
        System.out.print("Введите число К: ");
        int k = in.nextInt();
        int answer = 0;
        for (int i = 0;;i++){
            System.out.print("Введите число: ");
            int num = in.nextInt();
            if (num>k) answer = num;
            else if (num==0) break;
        }
        System.out.println("Последнее число в наборе, большее К: "+answer);
         */
        /*
---------------------------------------------------------------------------------------------
         */
        //Series17. Дано вещественное число B, целое число N и набор из N вещественных чисел,
        //упорядоченных по возрастанию. Вывести элементы
        //набора вместе с числом B, сохраняя упорядоченность выводимых чисел.
        /*
        System.out.print("Введие вещественное число В: ");
        double b = in.nextDouble();
        System.out.print("Введите целое число N: ");
        int n = in.nextInt();
        int check = 0;
        for (int i = 0;i<n;i++){
            System.out.print("Введите вещественное число: ");
            double num = in.nextDouble();
            if (b<=num&&check==0){
                System.out.println(b);
                check = 1;
            }
            System.out.println(num);
        }
        if (check==0) System.out.println(b);
        */
        /*
-----------------------------------------------------------------------------------------------------
         */
        //Series18. Дано целое число N и набор из N целых чисел, упорядоченный
        //по возрастанию. Данный набор может содержать одинаковые элементы.
        //Вывести в том же порядке все различные элементы данного набора.
        /*
        System.out.print("Введите целое число N: ");
        int n = in.nextInt();
        int check = 0;
        for (int i = 1;i<=n;i++){
            System.out.print("Введите целое число: ");
            int num = in.nextInt();
            if (num!=check){
                System.out.println(num);
                check = num;
            }
        }
         */
        /*
--------------------------------------------------------------------------------------------------------
         */
        //6. В сберкассу на трёхпроцентный вклад положили S рублей.Какой станет сумма вклада через N лет.
        /*
        System.out.print("Введите сумму вклада: ");
        double amount = in.nextDouble();
        System.out.print("Введите количество лет вклада: ");
        int years = in.nextInt();
        String year = "";
        int i = 1;
        if (i == 1) year = "год";
        else if (i > 1 && i < 5) year = "года";
        else if (i > 4 && i < 10 || i == 0) year = "лет";
        for (;i<=years;i++){
            double income = amount*3/100;
            System.out.print("За "+i+" "+year+" доход со вклада составит: "+income+"\n");
            amount+=income;
        }
        System.out.println("Cумма вклада через"+year+" составит: "+amount);
         */
        /*
---------------------------------------------------------------------------------------------------------------
         */
        //7. Ввести с клавиатуры 10 пар чисел. сравнить числа в каждой паре и напечатать большие из них.
        for (int i = 0;i<10;i++){
            System.out.println("Введите пару чисел: ");
            int num1 = in.nextInt();
            int num2 = in.nextInt();
            if (num1==num2) System.out.println("Числа равны. \n");
            else if (num1<num2)System.out.println("Большее число: \n"+num1);
            else if (num1>num2)System.out.println("Большее число: \n"+num1);

        }
    }
}
