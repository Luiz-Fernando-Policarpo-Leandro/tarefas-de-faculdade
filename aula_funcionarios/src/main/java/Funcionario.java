public class Funcionario {
    protected String nome;
    protected String cpf;
    protected double salario;

    public Funcionario(String _nome, String _cpf, double _salario) {
      this.nome = _nome;
      this.cpf = _cpf;
      this.salario = _salario;
    };

    public double getBonificacao() {
      return this.salario	* 0.10;
    };

    public	String	getInfo() {
      return "nome:	"	+	this.nome	+	"	com	salário	"	+	this.salario;
    };

};
