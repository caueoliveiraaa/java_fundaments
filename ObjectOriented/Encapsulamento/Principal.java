package ObjectOriented.Encapsulamento;

public class Principal {
    public static void main(String[] args) {
        Pessoa objeto = new Pessoa();
        objeto.setNome("Cauê");
        objeto.setIdade(24);

        System.out.println(objeto.getNome());
        System.out.println(objeto.getIdade());
    }
}
