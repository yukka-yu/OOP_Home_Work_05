package home5;

public class Result implements Model{
    Complex number1;
    Complex number2;


    public Result(Complex number1, Complex number2){
        this.number1 = number1;
        this.number2 = number2;
    }

    @Override
    public Complex sum(Complex number1, Complex number2) {
        return new Complex(number1.rational + number2.rational,number1.imaginary + number2.imaginary);
    }

    @Override
    public Complex sub(Complex number1, Complex number2) {
        return new Complex(number1.rational - number2.rational,number1.imaginary - number2.imaginary);
    }

    @Override
    public Complex mult(Complex number1, Complex number2) {
        return new Complex(number1.rational * number2.rational - number1.imaginary * number2.imaginary,
                number1.rational * number2.imaginary + number1.imaginary * number2.rational);
    }

    @Override
    public Complex div(Complex number1, Complex number2) {
        return new Complex((number1.rational * number1.rational + number1.imaginary * number2.imaginary)
                / mod2(number2), (number1.imaginary * number2.rational - number1.rational * number2.imaginary)
                / mod2(number2));
    }

    @Override
    public double mod2(Complex number) {
        return Math.pow(number.rational, 2) + Math.pow(number.imaginary, 2);
    }
}
