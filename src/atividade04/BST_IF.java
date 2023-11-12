package atividade04;

/*
<<<<<<< HEAD
 * Interface para implementação da classe "BST".
 */
public interface BST_IF {
	public void insert(Integer element);
	public Integer search(Integer element) throws Exception; //lançar exceção caso não encontre
=======
 * Interface para implementa��o da classe "BST".
 */
public interface BST_IF {
	public void insert(Integer element);
	public int search(Integer element) throws Exception; //lan�ar exce��o caso n�o encontre
>>>>>>> 7a26361589734c9be39d51faef62b957f1506403
	public int[] preOrder();
	public int[] order();
	public int[] postOrder();
	public boolean isComplete();
}