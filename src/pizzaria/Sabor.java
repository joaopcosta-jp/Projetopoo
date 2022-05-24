package pizzaria;

public class Sabor extends Pizza {
    
    int id;
    String nome;
    String tipo;
    float valor;

    public int getid(){

        return id;

    }

    public void setid(int id){

        this.id = id;

    }

    public String getnome(){

        return nome;

    }

    public void setnome(String nome){

        this.nome = nome;

    }

    public String gettipo(){

        return tipo;

    }

    public void settipo(String tipo){

        this.tipo = tipo;

    }

    public float getvalor(){

        return valor;

    }

    public void setvalor(float valor){

        this.valor = valor;

    }

}
