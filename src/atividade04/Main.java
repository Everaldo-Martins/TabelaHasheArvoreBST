package atividade04;

public class Main {

	public static void main(String[] args) {
		TabelaHash_IF minhaTabelaHash = new TabelaHash(5);
		minhaTabelaHash.insert(15);
		minhaTabelaHash.insert(10);
		System.out.println("\"0: 10\\n1: 15\\n2: \\n3: \\n4: \\n\"");
		System.out.println(minhaTabelaHash.print());

	}

}
