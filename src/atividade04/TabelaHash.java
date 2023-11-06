package atividade04;

import java.util.ArrayList;
import java.util.List;

public class TabelaHash implements TabelaHash_IF {
	private int size;
	private List<List<Integer>> frame; // tabela

	public TabelaHash(int size) {
		this.size = size;
		this.frame = new ArrayList<>(size);
		for (int i = 0; i < size; i++) {
			frame.add(new ArrayList<>());
		}
	}

	@Override
	public void insert(int element) {
		int index = hash(element);
		frame.get(index).add(0, element);
	}

	@Override
	public void remove(int element) throws Exception {
		int index = hash(element);
		List<Integer> list = frame.get(index);

		if (list.contains(element)) {
			list.remove(Integer.valueOf(element));
		} else {
			throw new Exception("Elemento não encontrado na tabela.");
		}
	}

	@Override
	public int search(int element) throws Exception {
		int index = hash(element);
		List<Integer> list = frame.get(index);

		if (list.contains(element)) {
			return element;
		} else {
			throw new Exception("Elemento não encontrado na tabela.");
		}
	}

	@Override
	public String print() {
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < size; i++) {
			result.append(i).append(": ");
			List<Integer> list = frame.get(i);
			for (int j = 0; j < list.size(); j++) {
				result.append(list.get(j));
				if (j < list.size() - 1) {
					result.append(", ");
				}
			}
			result.append("\n");
		}
		return result.toString();
	}

	private int hash(int element) {
		return element % size;
	}
}