
public class Circulo
{
    private double centroX, centroY, raio;
    public Circulo(double x, double y, double raio)
    {
        centroX = x;
        centroY = y;
        this.raio = raio;
    }
    public void setX(double x)
    {
        centroX = x;
    }
    public void setY(double y)
    {
        centroY = y;
    }
    public void setRaio(double raio)
    {
        this.raio = raio;
    }
    
    public double getRaio()
    {
        return raio;
    }

    public double getX()
    {
        return centroX;
    }
    public double getY()
    {
        return centroY;
    }

    public boolean comparaCirculo(Circulo c)
    {
        if(this.centroX == c.getX() && this.centroY == c.getY() && this.raio == c.getRaio())
            return true;

        return false;
    }

    public void move(double x, double y)
    {
        centroX =  x;
        centroY = y;
    }

    public double area()
    {
        double pi = Math.PI;
        return pi * Math.pow(raio,2); 
    }

    public double perimetro()
    {
        double pi = Math.PI;
        return 2 * pi * raio; 
    }
}