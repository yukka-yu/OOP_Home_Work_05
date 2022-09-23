package home5;

import java.io.IOException;

public class Presentor {
    View view;
    Result re;
    Complex number1;
    Complex number2;
    Complex result;
    FileWrite fileWrite;

    public Presentor(View v){
        this.view = v;
    }


    public void Button() throws IOException {
        fileWrite = new FileWrite();

        while (true) {
            double choice = view.getValue("What numbers will we work with?\n1 - complex numbers\n2 - rational numbers\n3 - Exit\nChoice: ", 3);
            if (choice == 1) {
                double a1 = view.getValueNoChoice("Enter the rational part of the first number: ");
                double b1 = view.getValueNoChoice("Enter the imaginary part of the first number: ");
                number1 = new Complex(a1, b1);
                double a2 = view.getValueNoChoice("Enter the rational part of the second number: ");
                double b2 = view.getValueNoChoice("Enter the imaginary part of the second number: ");
                number2 = new Complex(a2, b2);
            }
            if (choice == 2) {
                double a1 = view.getValueNoChoice("Enter the first number: ");
                number1 = new Complex(a1);
                double a2 = view.getValueNoChoice("Enter the second number: ");
                number2 = new Complex(a2);
            }
            if(choice == 3){
                break;
            }
            re = new Result(number1, number2);
            double choice2 = view.getValue("What action do you want?\n1 - '+'\n2 - '-'\n3 - '*'\n4 - '/'\n", 4);
            switch ((int) choice2) {
                case 1 -> {
                    result = re.sum(number1, number2);
                    System.out.println(number1 + " + " + number2 + " = " + result);
                    fileWrite.write(number1 + " + " + number2 + " = " + result + "\n");
                }
                case 2 -> {
                    result = re.sub(number1, number2);
                    System.out.println(number1 + " - " + number2 + " = " + result);
                    fileWrite.write(number1 + " - " + number2 + " = " + result + "\n");

                }
                case 3 -> {
                    result = re.mult(number1, number2);
                    System.out.println(number1 + " * " + number2 + " = " + result);
                    fileWrite.write(number1 + " * " + number2 + " = " + result + "\n");

                }
                case 4 -> {
                    result = re.div(number1, number2);
                    System.out.println(number1 + " / " + number2 + " = " + result);
                    fileWrite.write(number1 + " / " + number2 + " = " + result + "\n");

                }
            }
        }


    }
}
