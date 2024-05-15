import java.io.*;
import java.util.Random;

public class Main {
    public static void main(String[] args) throws IOException {
        int[] numb = new int[100];


        int sum = 0;
        int min = numb[0];
        int max = numb[0];
        ;

        Random random = new Random();
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("numbers.txt"));


        for (int i = 0; i < numb.length; i++) {


            numb[i] = random.nextInt(0, 100);
            System.out.println(numb[i]);

            //    bufferedWriter.write(numb[i] + "");
            String a = String.valueOf(numb[i]);
            bufferedWriter.write(a);
            bufferedWriter.newLine();
            bufferedWriter.flush();

        }
        File file = new File("numbers.txt");
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        while (true) {
            String line = bufferedReader.readLine();
            if (line == null) {
                break;
            }
            int number = Integer.parseInt(line);
            int i = 0;
            i++;
            numb[i] = number;


            System.out.println(number);
        }

        for (int i = 0; i < numb.length; i++) {
            //           numb[i] = random.nextInt(0, 100);
            sum += numb[i];
        }
        System.out.println("Сумма всех чисел: " + sum);
//        System.out.println(sum);

        for (int i = 0; i < numb.length; i++) {

            if (numb[i] > max) {
                max = numb[i];
            }
        }

        System.out.println("Самое большое число: " + max);

        for (int i = 0; i < numb.length; i++) {

            if (numb[i] < min) {
                min = numb[i];
            }
        }
        System.out.println("Самое маленькое число: " + min);

        for (int i = 0; i < numb.length; i++) {
//            numb[i] = random.nextInt(0, 100);
            if (numb[i] % 2 == 0) {

                System.out.println("Числа кратные двум: " + numb[i]);
            }
        }
    }
}

//1) Создайте новый проект и создайте в нем текстовый файл
//
//    2) Придумать алгоритм, который бы записал в файл 100 случайных чисел
//    3) Придумать алгоритм, который бы прочитал весь файл и вычислил бы:
//
//    3.1) Сумму всех чисел
//    3.2) Самое больше и самое маленькое число
//    3.3) Сколько чисел делятся на 2