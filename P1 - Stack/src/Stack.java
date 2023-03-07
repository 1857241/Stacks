import java.util.ArrayList;

public class Stack<T> {
	ArrayList<T> data;
	public Stack() {
		data = new ArrayList<T>();

	}
	public void push(T t) {
		data.add(t);
	}
	public T pop() {
		if(data.size() == 0) {
			return null;
		}
		else {
			data.remove(data.size()-1);
		}
		return null;
	}
	
	public int size() {
		return data.size();
	}
	public boolean empty() {
		if(data.size() == 0) {
			return true;
		}
		else {
			return false;
		}
	}
	public T peek() {
		return data.get(data.size()-1);
	}
}

