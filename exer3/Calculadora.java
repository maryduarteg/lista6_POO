public class Calculadora 
{
    protected double n1, n2, resul;
    protected char op;

    public Calculadora(double n1, double n2, char op)
    {
        this.n1 = n1;
        this.n2 = n2;
        this.op = op;
    }

    public double calcular()
    {
        switch(op)
        {
            case '+': resul = n1+n2; break;
            case '-': resul = n1-n2; break;
            case '*': resul = n1*n2; break;
            case '/': if(n2 != 0 ) resul = n1/n2; else resul = Double.NaN; break;
        }
        return resul;
    }
}
