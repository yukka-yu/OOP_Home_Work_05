package home5;

import java.util.Scanner;

public class View {
    Scanner in = new Scanner(System.in);

    public double getValue(String title, int choice) {
        System.out.printf("%s", title);
        double number = in.nextDouble();
        while(number > choice || number < 1){
            System.out.printf("Lead no less than 1 and no more than %d\n", choice);
            number = in.nextDouble();
        }
        return number;
    }

    public double getValueNoChoice(String string){
        System.out.printf("%s", string);
        return in.nextDouble();
    }

}
