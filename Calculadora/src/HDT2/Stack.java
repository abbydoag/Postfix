package HDT2;
//Stack acciones
import java.util.ArrayList;
public class Stack <N>implements IStack<N>{
	ArrayList<N> stackA = new ArrayList<N>();
	@Override
	public void push(N data) {
		stackA.add(data);
	}
	@Override
	//Eliminar elemento
	public N pop() {
		N erase = stackA.get(stackA.size()-1);
		stackA.remove(erase);
		return erase;
	}
	@Override
	//Ver ultimo elemento
	public N peek() {
		N peek = stackA.get(stackA.size()-1);
		return peek;
	}
	@Override
	//Tamaño arraylist
	public int size() {
		return stackA.size();
	}
}
