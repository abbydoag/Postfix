package HDT2;
import junit.framework.TestCase;
import org.junit.jupiter.api.Test;

class testCalcu extends TestCase{
	@Test
	//Ver último elemento del arrayList
	public void testPeek() {
		IStack<Integer> test = new Stack<Integer>();
		test.push(2);
		test.push(6);
		test.push(0);
		test.push(4);
		assertEquals(4, (int)test.peek());
	}
	//Eliminar elemento de arraylist y ver el nuevo
	public void testPop() {
		IStack<Integer> test = new Stack<Integer>(); 
		test.push(7);
		test.push(9);
		test.push(1);
		test.push(5);
		int elementRemoved= test.pop();
		assertEquals(5, elementRemoved);
		//ver el nuevo ultimo
		assertEquals(1, (int)test.peek());
	}
}
