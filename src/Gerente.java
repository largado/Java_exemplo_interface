public class Gerente extends  Funcionario {
    private int senha;
    private String sobrenome;

    public void setSenha(int senha){
        this.senha = senha;
    }

    public boolean autentica(int senha){
        if(this.senha ==senha){
            return true;
        } else {
            return false;
        }
    }

    public double getBonificacao(){
        return super.salario;


    }

    public double getAumentoSalarial(){
        return super.getAumentoSalarial() + super.getSalario();
    }



}
