package ObjectOriented.Construtor;

@SuppressWarnings("all")

public class Principal {
    public static void main(String[] args) {
        Pessoa p = new Pessoa();
        Pessoa p2 = new Pessoa("Cauê", 24);

        // Pessoa p        -> Cria uma variável do tipo Pessoa
        // = new Pessoa(); -> Executa o construtor

        // Construtor é um método (função) que executa ao instanciar
    }
}
