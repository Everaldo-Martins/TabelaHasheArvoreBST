package atividade04;

/*
<<<<<<< HEAD
 * Interface para implementação da classe "TabelaHash", a qual deve
 * ser implementada usando endereçamento fechado e o método da divisão.
 */
public interface TabelaHash_IF {
	public void insert(Integer element);
	public void remove(Integer element) throws Exception; //lançar exceção caso o element não esteja na tabela
	public int search(Integer element) throws Exception; //lançar exceção caso o element não esteja na tabela
=======
 * Interface para implementa��o da classe "TabelaHash", a qual deve
 * ser implementada usando endere�amento fechado e o m�todo da divis�o.
 */
public interface TabelaHash_IF {
	public void insert(Integer element);
	public void remove(Integer element) throws Exception; //lan�ar exce��o caso o element n�o esteja na tabela
	public int search(Integer element) throws Exception; //lan�ar exce��o caso o element n�o esteja na tabela
>>>>>>> 7a26361589734c9be39d51faef62b957f1506403
	public String print();
	
	/*
	 OBSERVACAO:
	 O metodo print() deve mostrar todos os elementos de cada posicao da tabela.
	 Exemplo (com uma tabela de 8 posicoes):
	 0: 24, 16
	 1: 
	 2: 10
	 3: 19, 11, 3
	 4: 12, 4
	 5: 
	 6: 22, 14, 6
	 7: 15
	 */
}