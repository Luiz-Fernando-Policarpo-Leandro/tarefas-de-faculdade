public class Main {
    public static void main(String[] args) {
        Conta minhaconta = new Conta();
        minhaconta.init(0,"luiz", 40028922);

      ControleDeBonificacoes	controle	=	new	ControleDeBonificacoes();
        
      Gerente	gerente	=	new	Gerente("gabriel", "000.000.000-00", 5000, 1234);
        controle.registra(gerente);
        
      Funcionario	funcionario	=	new	Funcionario("gabriel", "000.000.000-01", 5000);
        controle.registra(funcionario2);

      
        
      System.out.println( funcionario.nome + "" +  + "" + "\n" + controle.getTotalDeBonificacoes());
      
    }
}