package Calc;

public class Calculadoracientifica extends Calculadora{

    @Override
    public float divisao(float num1, float num2) {
        return num1 / num2;
    }

    @Override
    public float multiplicaao(float num1, float num2) {
        return num1 * num2;
    }

    @Override
    public float soma(float num1, float num2) {
        return num1 + num2;
    }

    @Override
    public float subtracao(float num1, float num2) {
       return num1 - num2;
    }

    public double raizQuadrada(double num1){
        return Math.sqrt(num1);
    }

    public double potencia(double base, double expoente){
        return Math.pow(base, expoente);
    }

    
}
