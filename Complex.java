package home5;

public class Complex implements Model{
    double x, y;

    /**
     * Коструктор с двумя аргументами
     * @param x рациональная часть
     * @param y мнимая часть

     */
    public Complex (double x, double y){
        this.x = x;
        this.y = y;
    }

    /**
     * Конструктор с одним аргументом
     * @param x рациональная часть
     */
    public Complex(double x){
        this.x = x;
        this.y = 0;
    }



    /**
     * Метод суммы
     * @param b Число которое складывают с первым
     * @return  Число сумма
     */
    @Override
    public Complex sum(Complex b) {
        return new Complex(x + b.x, y + b.y);
    }

    /**
     * Метод вычитания
     * @param b Вычитаемое число
     * @return Число результирующее
     */
    @Override
    public Complex sub(Complex b) {
        return new Complex(  x - b.x, y - b.y);

    }

    /**
     * Метод умножения
     * @param b умножаемое число
     * @return результыт умножения
     */
    @Override
    public Complex mult(Complex b) {
        return new Complex(  x * b.x - y * b.y, x * b.y + y * b.x);
    }

    /**
     * Метод деления
     * @param b делитель
     * @return  частное
     */
    @Override
    public Complex div(Complex b) {
        return new Complex( (x*b.x + y*b.y) / (Math.pow(b.x, 2)+Math.pow(b.y, 2)),
                            (y * b.x - x * b.y) / (Math.pow(b.x, 2)+Math.pow(b.y, 2)) );
    }

    /**
     * Метод печати
     * @return Вывод строки
     */
    @Override
    public String toString() {
        if(y != 0)  {
            return String.format("%f + %f*i", x, y);
        }
        else{
            return String.format("%f", x);
        }
    }

    /**
     * Установка мнимой части числа
     * @param y
     */
    public void setY(double y) {
        this.y = y;
    }

    /**
     * Установка рациональной части числа
     * @param x
     */
    public void setX(double x) {
        this.x = x;
    }
}
