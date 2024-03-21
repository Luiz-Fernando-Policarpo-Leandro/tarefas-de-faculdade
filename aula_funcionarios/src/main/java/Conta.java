public class Conta {
    private int numero;
    private String titular;
    private double saldo;
    private static int	totalDeContas;


    void init(int _num, String _tit, double _sal) {
        this.numero = _num;
        this.titular = _tit;
        this.saldo = _sal;
        Conta.totalDeContas	=	Conta.totalDeContas	+	1;
    }
    void dados_do_usuario() {
        System.out.printf("nome: %s \nnumero: %d \nsaldo: %2f\n\n",this.titular,this.numero,this.saldo);
    }

    public	int	getTotalDeContas() {
        return	Conta.totalDeContas;
    }


}
