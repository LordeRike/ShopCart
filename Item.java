public class Item {
    String nome;
    double preco;

    public Item(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }
    
    public void aplicarCupom(double desconto){

        this.preco -= desconto;
    }
}