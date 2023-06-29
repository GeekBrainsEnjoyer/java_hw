package HW;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class HW2 {
    public static void main(String[] args) throws SecurityException, IOException {
        String pathProject = System.getProperty("user.dir");
        // writeExtensionType(
        // getExtensionType(
        // showCurrentFile(pathProject)));
        int[] arr = { 2, 5, 4, 3 };
        String filePath = pathProject.concat("\\BubbleSorting(log).txt");
        bubbleSort(filePath, arr);

    }

    // 1) Напишите метод, который определит тип (расширение) файлов из текущей папки
    // и выведет в консоль результат вида
    // 1 Расширение файла: txt
    // 2 Расширение файла: pdf
    // 3 Расширение файла:
    // 4 Расширение файла: jpg

    static String[] showCurrentFile(String dirPath) {
        File currentDir = new File(dirPath);
        return currentDir.list();
    }

    static String[] getExtensionType(String[] list) {
        for (int i = 0; i < list.length; i++) {
            int dotIndex = list[i].lastIndexOf(".");
            if (dotIndex != -1)
                list[i] = list[i].substring(dotIndex);
            else if (dotIndex == -1)
                list[i] = "";
        }
        return list;
    }

    static void writeExtensionType(String[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            System.out.println(i + 1 + " Расширение файла: " + list[i]);
        }
    }

    // 2) Реализуйте алгоритм сортировки пузырьком числового массива, результат
    // после каждой итерации запишите в лог-файл.

    static void bubbleSort(String filePath, int array[]) throws IOException {
        File myFile = new File(filePath);
        FileWriter writer = new FileWriter(myFile);

        int temp = 0;

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j + 1] > array[j]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }

                for (int k = 0; k < array.length; k++) {
                    writer.write(array[k] + " ");
                }
                writer.write("\n");
            }

        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        writer.close();
    }

}
