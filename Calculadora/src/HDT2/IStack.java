package HDT2;

public interface IStack <N>{
	public void push (N data);
	public N pop();
	public N peek();
	public int size();
}
