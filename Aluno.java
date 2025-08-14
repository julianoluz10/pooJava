public class Aluno {
    //1.Atributo
    //Public Tipo Nome,Nota
    public String nome;
    public double nota;

    //2.Metodo
    public void verificarStatus(){
        System.out.println("Nome: "+ nome);
        System.out.println("Nota: "+ nota);
        if(nota>=6.0){
            System.out.println(nome + " Aprovado ");
        }
        else{
            System.out.println(nome + " Reprovado ");
        }
    }
}
