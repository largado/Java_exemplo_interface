public class TesteFuncionario {
    public static void main(String[] args) {

        Gerente alex = new Gerente();
        alex.setSalario(10000.00);
        alex.setNome("Alexandro");
        System.out.println(alex.getNome());

        System.out.println(alex.getAumentoSalarial());

        System.out.println(alex.getSalario());

        alex.setSenha(2222);

        alex.setSalario(42524352345234.245252345);

        System.out.println(alex.getAumentoSalarial());



    }
}
