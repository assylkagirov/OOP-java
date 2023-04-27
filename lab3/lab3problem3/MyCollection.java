package lab3problem3;

public interface MyCollection<E>{
	

	public int size();
	public int setSize(int size);
	public void add(Object element);
	public void addall(MyCollection<E> collection);
	boolean contains(Object element);
	boolean isEmpty();
	boolean removeElement(Object element);
	boolean removeAll(MyCollection<E> collection);
	E[] toArray();
	
}