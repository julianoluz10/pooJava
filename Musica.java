public class Musica {
    //1.Atributros
    //public Tipo titulo
    //artista duracaoEmSegundos
    public String titulo;
    public String artista;
    int duracaoEmSegundos;

    //Metdod Construtor
    public Musica(String titulo, String artista, int duracaoEmSegundos){
        this.titulo = titulo;
        this.artista = artista;
        this.duracaoEmSegundos = duracaoEmSegundos;


    }
    //Mostrar Informacoes
    public void mostrarInformacoes(){
        System.out.println("Titulo: " + titulo);
        System.out.println("Artista: " + artista);
        System.out.println("Duracao em segundos: " + duracaoEmSegundos);
    }



}
