public class Gerente extends Funcionario	{
    int	senha;
    int	numeroDeFuncionariosGerenciados;


    public Gerente (String _nome, String _cpf, double _salario, int _senha) {
        super( _nome, _cpf, _salario);
        this.senha = _senha;
    }
  
    public	boolean	autentica(int senha) {
        if	(this.senha	==	senha)	{
            System.out.println("Acesso Permitido!");
            return true;
        } else {
            System.out.println("Acesso Negado!");
            return false;
        }
    }
  
    @Override
    public	double	getBonificacao() {
        return this.salario	*	0.15	+	1000;
    }




}