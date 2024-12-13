public class Main{
    public static void main(String[] args) {
        Matrix matrix = new Matrix(10,10);
        matrix.inserir(9,9,45);
        matrix.inserir(8,5,16);
        matrix.inserir(1,7,13);
        System.out.println(matrix.soma());
        System.out.println(matrix.eQuadrada());
        System.out.println(matrix.encontrar(16));
       
    }
}