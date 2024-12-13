public class Elevador 
{
    protected int atual, qntAndares, cpPessoas, pessoasAtual;

    //construtor
    public Elevador(int atual, int qntAndares, int cpPessoas, int pessoasAtual)
    {
        this.atual = 0;
        this.qntAndares = qntAndares;
        this.cpPessoas = cpPessoas;
        this.pessoasAtual = 0;
    }

    //métodos gets
    public int getAtual()
    {
        return atual;
    }
    public int getQntAndares()
    {
        return qntAndares;
    }
    public int getCpPessoas()
    {
        return cpPessoas;
    }
    public int pessoasAtual()
    {
        return pessoasAtual;
    }

    //métodos sets
    public void setAtual(int atual)
    {
        this.atual = atual;
    }

    public void setQntAndares(int qntAndares)
    {
        this.qntAndares = qntAndares;
    }
    
    public void setCpPessoas(int cpPessoas)
    {
        this.cpPessoas = cpPessoas;
    }

    public void setPesoasAtual(int pessoasAtual)
    {
        this.pessoasAtual = pessoasAtual;
    }

    public void entrar()
    {
        if(pessoasAtual<= cpPessoas)
            pessoasAtual++;
    }
    public void sair()
    {
        if(pessoasAtual > 0)
            pessoasAtual--;
    }

    public void descer()
    {
        if(atual > 0)
            atual--;
    }
    public void subir()
    {
        if(atual < qntAndares)
            atual++;
    }
}
