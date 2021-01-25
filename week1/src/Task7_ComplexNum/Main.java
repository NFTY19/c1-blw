package Task7_ComplexNum;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        double Fr = in.nextDouble();
        double Fi = in.nextDouble();
        double Sr = in.nextDouble();
        double Si = in.nextDouble();
        ComOperation comOperation = new ComOperation(Fr, Fi, Sr, Si);
        comOperation.add();
        comOperation.reduce();
        comOperation.multiply();
    }
}
