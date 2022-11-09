package school.mjc.stage0.loops.finalTask;

public class Pyramid {
    public void printPyramid(int cathetusLength) {
        for (int i = 1; i <= cathetusLength; i++) {  //первый столбик
            for (int j = 1; j < cathetusLength+1-i; j++) { // пробелы до цифр
                System.out.print(" ");
            }
            for (int num = i; num >= 1; num--){ //цифры до 1
                System.out.print(num);
            }
            for (int k = 2; k <= i; k++){ //от 1
                System.out.print(k);
            }
        System.out.println();
        }
    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(9);
    }
}
