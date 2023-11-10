package atividade04;

/*
 * Interface para implementa��o da classe "BST".
 */
public interface BST_IF {
	public void insert(Integer element);
	public int search(Integer element) throws Exception; //lan�ar exce��o caso n�o encontre
	public int[] preOrder();
	public int[] order();
	public int[] postOrder();
	public boolean isComplete();
}
