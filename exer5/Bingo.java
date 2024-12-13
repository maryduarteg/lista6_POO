import java.util.Random;

public class Bingo {
    protected int vet[], MAX, pos;
    public Bingo(int MAX)
    {
        this.MAX = MAX;
        this.vet = new int[MAX];
        this.pos = 0;
    }
    public boolean inserido(int vet[], int pos, int atual)
    {
        int i = 0;
        while(i<pos && atual != vet[i])
            i++;
        if(atual == vet[i])
            return true;
        return false;
    }
    
    public void sortear()
    {
        Random ramdom = new Random();
        int atual = ramdom.nextInt(this.MAX)+1;
        while(inserido(vet,pos, atual))
            atual = ramdom.nextInt(this.MAX)+1;
        vet[pos] = atual;
        pos++;
    }

    public int[] getVetor()
    {
        return vet;
    }
    public int ultimo()
    {
        return vet[pos-1];
    }
}
