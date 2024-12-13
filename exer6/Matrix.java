public class Matrix
{
    protected int matrix[][], linhas, colunas;
    public Matrix(int linhas, int colunas)
    {
        this.linhas = linhas;
        this.colunas = colunas;
        matrix = new int[linhas][colunas];
        for(int i = 0; i<linhas; i++)
        {
            for(int j = 0; j<colunas; j++)
                matrix[i][j] = 0;
        }
    }

    public boolean inserir(int linha, int coluna, int num)
    {
        if(linha >= linhas || coluna >= colunas)
        {
            return true;
        }

        matrix[linha][coluna] = num;
        return false;
    }
    public int soma()
    {
        int soma = 0;
        for(int i = 0; i<linhas; i++)
        {
            for(int j = 0; j<colunas; j++)
                soma += matrix[i][j];
        }
        return soma;
    }

    public boolean eQuadrada()
    {
        if(linhas == colunas)
            return true;
        return false;
    }

    public int encontrar(int valor) {
        for (int i = 0; i < linhas; i++) { 
            for (int j = 0; j < colunas; j++) { 
                if (matrix[i][j] == valor) {
                    return i; 
                }
            }
        }
        return -1; 
    }
    
}