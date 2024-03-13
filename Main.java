// 2.14	EXERCÍCIOS:	MODIFICANDO	O	HELLO	WORLD

public class Main {
  public static void main(String[] args) {
    System.out.println("Hello, world of this bazil!"); // 1.	 Altere	seu	programa	para	imprimir	uma	mensagem	diferente
    System.out.println("hello world, but's the second"); // 2.	 Altere	seu	programa	para	imprimir	duas	linhas	de	texto	usando	duas	linhas	de	código	System.out.

    System.out.println("this is onlyone mensage\nin the same line");
  }
}

// 2.15	O QUE PODE DAR ERRADO? R: o erro esta na falta de ponto e virgula no final da linha 4(que é 3º linha visivelmente)

/* 2.17	EXERCÍCIOS	OPCIONAIS Um	arquivo	fonte	Java	deve	sempre	ter	a	extensão		.java		ou	o	compilador	o	rejeitará.	Além	disso, existem	 algumas	 outras	 regras	 na	 hora	 de	 dar	 o	 nome	 a	 um	 arquivo	 Java.	 Experimente	 gravar	 o código	desse	capítulo	com		OutroNome.java		ou	algo	similar. Compile	e	verifique	o	nome	do	arquivo	gerado.	Como	executar	a	sua	aplicação?

R: 
apos usar o comando: 'javac' com o arquivo java alterado, ele retorna um erro, onde o nome do arquivo deve ser o mesmo da classe.

prompt:
copy.java:3: error: class Main is public, should be declared in a file named Main.java
public class Main {


*/