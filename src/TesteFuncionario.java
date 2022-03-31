public class TesteFuncionario {
    public static void main(String[] args) {

        Cliente alex = new Cliente();
        alex.autentica(123456);
        Gerente yasmin = new Gerente();
        yasmin.setNome("Alexandro");
        System.out.println(yasmin.getNome());

        System.out.println(yasmin.getAumentoSalarial());

        System.out.println(yasmin.autentica(132546));

        yasmin.setSenha(2222);

        yasmin.setSalario(42524352345234.245252345);

        System.out.println(yasmin.getAumentoSalarial());



    }
}
