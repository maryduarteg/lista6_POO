
public class Vetor {
    String vet[];
    int pos;

    public Vetor(int tam)
    {
        vet = new String[tam];
        pos = 0;
    }

    public void insert(String palavra)
    {
        if(pos == vet.length)
        {
            String vetAux[] = new String[vet.length+5];
            System.arraycopy(vet, 0, vetAux, 0, vet.length);
            vet = vetAux;
        }
        vet[pos] = palavra;
        pos++;
    }

    public String getPos(int pos)
    {
        if(pos < vet.length && !vet[pos].isEmpty())
            return vet[pos];
        return null;
    }

    public String getUltimaPos()
    {
        if(vet == null)
            return null;
        else return vet[pos-1];
    }

    public int getSize()
    {
        return pos;
    }
}
