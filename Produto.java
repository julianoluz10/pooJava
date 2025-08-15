
//public class NOME{}
public class Produto {
           //1.Atributo
          //public TIPO NOME;
         //tamanho,preco,cor,unidade,marca,nome
    public String nome;
    public double tamanho;
    public double preco;
    public String cor;
    public int unidade;
    public String marca;
    public int quantidade;
    public int venda;
    public int posVenda = (quantidade - venda);



//           //2.Metodo
//          //Mostra informacoes do produto
//    public void mostraInformacoes(){
//        System.out.println("Nome: " +nome);
//        System.out.println("Preco: " +preco);
//        System.out.println("Marca: " +marca);
//
//        //3.Metodo
//        //Estoque
//        System.out.println("Quantidade: " + quantidade);
//        System.out.println("Venda: " + venda);
//        System.out.println("PosVenda: " + posVenda);
//
//    }
//    public void adcEstoque(int valor){
//        quantidade = quantidade + valor;
//    }

    //Metodo Construtor

    public Produto(String nome, double tamanho, double preco, String marca){
        this.nome = nome;
        this.tamanho = tamanho;
        this.preco = preco;
        this.marca = marca;
    }
    //Mostrar informacoes
    public void mostraInformacoes(){
        System.out.println("Nome: " + nome);
        System.out.println("Preco: " + preco);
        System.out.println("Marca: " + marca);
        System.out.println("Tamanho: " + tamanho);
    }


}
