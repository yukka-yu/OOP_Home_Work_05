package home5;

public class Complex{
    double rational, imaginary;

    /**
     * Коструктор с двумя аргументами
     * @param rational рациональная часть
     * @param imaginary мнимая часть

     */
    public Complex (double rational, double imaginary){
        this.rational = rational;
        this.imaginary = imaginary;
    }

    /**
     * Конструктор с одним аргументом
     * @param rational рациональная часть
     */
    public Complex(double rational){
        this.rational = rational;
        this.imaginary = 0;
    }

    /**
     * Метод печати
     * @return Вывод строки
     */
    @Override
    public String toString() {
        if(imaginary != 0)  {
            return String.format("%f + %f*i", rational, imaginary);
        }
        else{
            return String.format("%f", rational);
        }
    }

}
