import java.util.Scanner;

public class hw_for {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        /*
--------Кучмель Павел---------------------------------------------------------------------------
         */
        //For1. Даны целые числа K и N (N > 0). Вывести N раз число K.
        /*
        System.out.print("Сколько раз: ");
        /*
        int n = in.nextInt();
        System.out.print("Вывести число: ");
        int k = in.nextInt();
        for (int i=0;i<n;i++){
            System.out.println(k);
        }
        */
        /*
------------------------------------------------------------------------------------------------
         */
        //For2. Даны два целых числа A и B (A < B). Вывести в порядке возрастания все
        //целые числа, расположенные между A и B (включая сами числа A и B), а
        //также количество N этих чисел.
        /*
        System.out.println("Введите А и В (A<B): ");
        int a = in.nextInt();
        int b = in.nextInt();
        int n = 0;
        for (;a<=b;a++){
            System.out.print(a+" ");
            n++;
        }
        System.out.println("\n"+n);
         */
        /*
------------------------------------------------------------------------------------------------
         */
        //For3. Даны два целых числа A и B (A < B). Вывести в порядке убывания все
        //целые числа, расположенные между A и B (не включая числа A и B), а
        //также количество N этих чисел.
        /*
        System.out.println("Введите А и В (A<B): ");
        int a = in.nextInt();
        int b = in.nextInt();
        int n = 0;
        for (;(a+1)<b;){
            b--;
            System.out.print(b+" ");
            n++;
        }
        System.out.println("\n"+n);
        */
        /*
---------------------------------------------------------------------------------------------------
         */
        //For4. Дано вещественное число — цена 1 кг конфет. Вывести стоимость 1,
        //2, . . . , 10 кг конфет.
        /*
        System.out.print("Введите стоимость конфет за кг: ");
        double price = in.nextDouble();
        int weight = 1;
        double result=price*weight;
        for (;;) {
            System.out.printf("%d кг конфет будет стоить %.2f\n", weight, result);
            weight++;
            if (weight>10)break;
        }
        */
        /*
--------------------------------------------------------------------------------------------------
         */
        //For5. Дано вещественное число — цена 1 кг конфет.
        //Вывести стоимость 0.1, 0.2, . . . , 1 кг конфет.
        /*
        System.out.print("Введите стоимость конфет за кг: ");
        double price = in.nextDouble();
        for (double weight = 0.1;weight<1;weight=weight+0.1){
            System.out.printf("%.1f кг конфет стоит %f \n", weight, price*weight);
        }
        */
        /*
----------------------------------------------------------------------------------------
         */
        //For6. Дано вещественное число — цена 1 кг конфет.
        //Вывести стоимость 1.2, 1.4, . . . , 2 кг конфет.
        /*
        System.out.print("Введите стоимость конфет за кг: ");
        double price = in.nextDouble();
        for (double weight = 1.2;weight<2;weight=weight+0.2){
            System.out.printf("%.1f кг конфет стоит %.2f \n", weight, weight*price);
        }
         */
        /*
-------------------------------------------------------------------------------------------------
         */
        //For7. Даны два целых числа A и B (A < B). Найти сумму всех целых чисел
        //от A до B включительно.
        /*
        System.out.println("Введите два числа, А и В: ");
        int a = in.nextInt();
        int b = in.nextInt();
        int sum = a;
        for (int i = a;i<b;i++){
            sum +=++a;
        }
        System.out.println(sum);
        */
        /*
--------------------------------------------------------------------------------------------------
         */
        //For8. Даны два целых числа A и B (A < B). Найти произведение всех целых
        //чисел от A до B включительно.
        /*
        System.out.println("Введите два числа, А < В: ");
        int a = in.nextInt();
        int b = in.nextInt();
        int prod = a;
        for (int i = a;i<b||i==b;i++){
            prod *= ++a;
        }
        System.out.println(prod);
        */
        /*
--------------------------------------------------------------------------------------------------
         */
        //For9. Даны два целых числа A и B (A < B). Найти сумму квадратов всех целых
        //чисел от A до B включительно.
        /*
        System.out.println("Введите два числа, А < B: ");
        int a = in.nextInt();
        int b = in.nextInt();
        double sum = Math.sqrt(a);
        for (int i = a;i<b;i++){
            sum +=Math.sqrt(++a);
        }
        System.out.println(sum);
         */
        /*
----------------------------------------------------------------------------------------------
         */
        //For10. Дано целое число N (> 0). Найти сумму
        //1 + 1/2 + 1/3 + . . . + 1/N
        //(вещественное число).
        /*
        System.out.print("Введите число N: ");
        int n = in.nextInt();
        double result = 1;
        int i = 0;
        if (n == 1){
            i = 1;
        }
        else {
            i = 2;
        }
        for(;i<=n;i++){
            result = result + 1/(double)i;
        }
        System.out.println(result);
        */
        /*
---------------------------------------------------------------------------------------
         */
        //For11. Дано целое число N (> 0). Найти сумму
        //N^2 + (N + 1)^2 + (N + 2)^2 + . . . + (2·N)^2 (целое число).
        /*
        System.out.print("Введите целое число: ");
        int n = in.nextInt();
        double result = 0;
        for (int i = 0; i <= n; i++) {
            result += Math.pow(n + i, 2);
        }
        System.out.print(Math.pow(n,2)+result+Math.pow(2*n,2));
         */
        /*
-----------------------------------------------------------------------------------------
         */
        //For12. Дано целое число N (> 0). Найти произведение
        //1.1 · 1.2 · 1.3 · . . .(N сомножителей).
        /*
        System.out.print("Выберете вариант 1 или 2: ");   //понял эту задачу по разному
        int option;
        switch (option = in.nextInt()){       //возможно так делать не правильно, но ради эксперимента можно
            case 1:
                System.out.print("Введите число: ");
                int n = in.nextInt();
                double res = 1.1;
                for (double i = 1.1;i<=n;i=i+0.1){
                    res *=i+0.1;
                }
                System.out.printf("%.2f",res);
                break;
            case 2:
                System.out.print("Введите число: ");
                int n1 = in.nextInt();
                double result = 1.1;
                for (double j = 0, factor = 1.1;j<n1;j++,factor+=0.1){
                    if (factor == 1.1) continue;
                    result *= factor;
                    //System.out.println("res1 = "+res1);
                    //System.out.println("result = "+result);
                }
                System.out.printf("%.2f",result);
                break;
            default:
                System.out.println("Неверный выбор варианта");
        }
        */
        /*
--------------------------------------------------------------------------------------------
         */
        //For13. Дано целое число N (> 0). Найти значение выражения
        //1.1 ? 1.2 + 1.3 ? . . .(N слагаемых, знаки чередуются). Условный оператор не использовать.
        /*
        System.out.print("Введите число: ");
        int n = in.nextInt();
        double add = 1.1;
        double res = 1.1;
        for (int i = 1;i<n;i++){
            add+=0.1;
            //System.out.println("i = "+i);
            //System.out.println("add = "+add);
            switch (i%2){
                case 0:
                    res+=add;
                    //System.out.println("case 0\nattempt "+s++);
                    break;
                case 1:
                    res-=add;
                    //System.out.println("case 1\nattempt "+s++);
                    break;
            }
        }
        System.out.printf("%.1f",res);
        */
        /*
        //---Решение из интернета---
        System.out.print("Введите число: ");
        int n = in.nextInt();
        double res = 0;
        for (int i=1;i<=n;i++){
            res += Math.pow(-1,i+1)*(1.0+(double)i/10);
        }
        System.out.printf("%.1f",res);
         */
        /*
------------------------------------------------------------------------------------
         */
        //For14. Дано целое число N (> 0). Найти квадрат данного числа, используя для
        //его вычисления следующую формулу: N^2 = 1 + 3 + 5 + . . . + (2·N ? 1).
        //После добавления к сумме каждого слагаемого выводить текущее значение суммы
        //(в результате будут выведены квадраты всех целых чисел от 1 до N).
        /*
        System.out.print("Введите число: ");
        int n = in.nextInt();
        int add = 1;
        int res = 1;
        for (int i = 2;i<n;i++){
            add += 2;
            res += add;
            System.out.println("res = "+res);
        }
        System.out.println(res+(2*n-1));
        */
        /*
--------------------------------------------------------------------------------------
         */
        //For15. Дано вещественное число A и целое число N (> 0). Найти A в степени N:
        //A^N = A·A· . . . ·A (числа A перемножаются N раз).
        /*
        System.out.print("Введите число А: ");
        int a = in.nextInt();
        System.out.print("Введите число N: ");
        int n = in.nextInt();
        int res = a;
        for(int i = 1;i<n;i++){
            res*=a;
        }
        System.out.println(res);
         */
        /*
---------------------------------------------------------------------------------------------------
         */
        //For16. Дано вещественное число A и целое число N (> 0).
        //Используя один цикл, вывести все целые степени числа A от 1 до N.
        /*
        System.out.println("Введите");
        System.out.print("A = ");
        double a = in.nextDouble();
        System.out.print("N = ");
        int n = in.nextInt();
        int result = 1;
        for (int i = 1; i <= n; i++)
        {
            result *= a;
            System.out.println(result);
        }
         */
        /*
---------------------------------------------------------------------------------------------------------
         */
        //For17. Дано вещественное число A и целое число N (> 0). Используя один
        //цикл, найти сумму 1 + A + A^2 + A^3 + . . . + A^N.
        /*
        System.out.println("Введите");
        System.out.print("A = ");
        double a = in.nextDouble();
        System.out.print("N = ");
        int n = in.nextInt();
        double result = 1;
        for (int i=1;i<=n;i++){
            result += Math.pow(a,i);
        }
        System.out.println(result);
         */
        /*
------------------------------------------------------------------------------------------------------------
         */
        //For18. Дано вещественное число A и целое число N (> 0). Используя один
        //цикл, найти значение выражения 1 ? A + A^2 ? A^3 + . . . + (?1)^N ·A^N .
        //Условный оператор не использовать.
        /*
        System.out.println("Введите");
        System.out.print("A = ");
        double a = in.nextDouble();
        System.out.print("N = ");
        int n = in.nextInt();
        double res = 1;
        for (int i = 1;i<=n;i++){
            res += (Math.pow(-1,i)*Math.pow(a,i));
        }
        System.out.println(res+Math.pow(-1,n)*Math.pow(a,n));
         */
        /*
--------------------------------------------------------------------------------------------
         */
        //For19. Дано целое число N (> 0). Найти произведение (N–факториал).
        //Чтобы избежать целочисленного переполнения, вычислять это произведение с
        //помощью вещественной переменной и вывести его как вещественное число.
        /*
        System.out.print("Введите число (N>0): ");
        int n = in.nextInt();
        int factorial = 1;
        for (int i = 1;i<=n;i++){
            factorial *= i;
        }
        System.out.println(factorial);
         */
        /*
-------------------------------------------------------------------------------------------
         */
        //For20. Дано целое число N (> 0). Используя один цикл, найти сумму
        //1! + 2! + 3! + . . . + N!
        //(выражение N! — N–факториал — обозначает произведение всех целых чисел от 1 до N: N! = 1·2·. . .·N).
        //Чтобы избежать целочисленного переполнения, проводить вычисления с помощью вещественных переменных
        //и вывести результат как вещественное число.
        /*
        System.out.print("Введите число (N>0): ");
        int n = in.nextInt();
        int factorial = 1;
        int sum = 0;
        for (int i = 1;i<=n;i++){
            factorial *= i;
            sum +=factorial;
        }
        System.out.println(sum);
         */
        /*
-----------------------------------------------------------------------------------------------
         */
        //For21. Дано целое число N (> 0). Используя один цикл, найти сумму
        //1 + 1/(1!) + 1/(2!) + 1/(3!) + . . . + 1/(N!)
        //(выражение N! — N–факториал — обозначает произведение всех целых
        //чисел от 1 до N: N! = 1·2·. . .·N).
        //Полученное число является приближенным значением константы e = exp(1).
        /*
        System.out.print("Введите число (N>0): ");
        int n = in.nextInt();
        int factorial = 1;
        double sum = 0;
        for (int i=1;i<=n;i++){
            factorial *= i;
            sum += 1/(double)factorial;
        }
        System.out.println(sum);
         */
        /*
------------------------------------------------------------------------------------------------------
         */
        //For22. Дано вещественное число X и целое число N (> 0). Найти значение
        //выражения
        //1 + X + X^2/(2!) + . . . + X^N /(N!)
        //(N! = 1·2·. . .·N). Полученное число является приближенным значением
        //функции exp в точке X.
        /*
        System.out.print("X = ");
        double x = in.nextDouble();
        System.out.print("N = ");
        int n = in.nextInt();
        int factorial = 1;
        double sum = 1;
        for (int i = 1;i<=n;i++){
            factorial *= i;
            sum += Math.pow(x,i)/i;
        }
        System.out.println(sum);
         */
        /*
-----------------------------------------------------------------------------------------------------------
         */
        //For23. Дано вещественное число X и целое число N (> 0). Найти значение
        //выражения
        //X?X^3/(3!)+X^5/(5!)? . . . +(?1)^N·X^2·N+1/((2·N+1)!)
        //(N! = 1·2·. . .·N). Полученное число является приближенным значением
        //функции sin в точке X.
        /*
--------ВЛОЖЕННЫЕ ЦИКЛЫ----------------------------------------------------------------------------------
         */
        //For36. Даны целые положительные числа N и K. Найти сумму
        //1^K + 2^K + . . . + N^K.
        //Чтобы избежать целочисленного переполнения, вычислять слагаемые
        //этой суммы с помощью вещественной переменной и выводить результат как вещественное число.
        /*
        System.out.print("N = ");
        int n = in.nextInt();
        System.out.print("K = ");
        int k = in.nextInt();
        int result = 1;
        for (int i = 1;i<=n;i++){
            for (int j = 1;j<=k;j++){
                result += Math.pow(i,j);
            }
        }
        System.out.println(result);
        */
        /*
--------ПОСЛЕДОВАТЕЛЬНОСТИ---------------------------------------------------------------------------------
         */
        //Series10. Дано целое число N и набор из N целых чисел.
        //Если в наборе имеются положительные числа, то вывести TRUE; в противном случае вывести FALSE.
        /*
        System.out.print("Введите число N: ");
        int n = in.nextInt();
        boolean answer = false;
        boolean[] nums = new boolean[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Введите целое число: ");
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
    }
}
