//Imports:
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.HashMap;

//Begin Class:
public class OccurrenceSet<T> implements Set<T>{
	//Class Variables:
	Object key;
	int value;
	//Create a HashMap<T, Integer>
	HashMap<T, Integer> hashMap= new HashMap<T, Integer>();
	//Constructor:
	public OccurrenceSet(Object k, int v) {
		
	}//End Constructor
	@Override
	public boolean add(T key) {
		//Track how many times an element has been added to the set.
		//int counter = hashMap.get(key);
		int value = 1;
		if (hashMap.get(key) != null){
			//Get the value and keyvalue++;
			hashMap.containsKey(key);
			value++;
			//hashMap.put(key, value);
			
		}
			
		
		
	return false;
		
	}
		
	

	@Override
	public boolean addAll(Collection<? extends T> arg0) {
		// Track how many times an element has been added to the set.
		return false;
	}

	@Override
	public void clear() {
		// Clears Data in the Hash Map.
		hashMap.clear();
		return;
		
	}

	@Override
	public boolean contains(Object o) {
		// 
		
		return false;
	}

	@Override
	public boolean containsAll(Collection<?> c) {
		// Does the 
		return false;
	}

	@Override
	public boolean isEmpty() {
		// Check to see if the Set is empty
		
		return false;
	}

	@Override
	public Iterator<T> iterator() {
		//Returns an Iterator with elements sorted by their add counts in ascending order.
		
		return null;
	}

	@Override
	public boolean remove(Object o) {
		// remove the necessary element from the set completely
		return false;
	}

	@Override
	public boolean removeAll(Collection<?> c) {
		// remove	the	necessary elements from	the	set completely
		return false;
	}

	@Override
	public boolean retainAll(Collection<?> c) {
		// 
		return false;
	}

	@Override
	public int size() {
		//Return the number of unique elements currently in the set.
		
		return 0;
	}

	@Override
	public Object[] toArray() {
		// 
		return null;
	}

	@Override
	public <T> T[] toArray(T[] a) {
		// 
		return null;
	}
	@Override
	public String toString() {
		String elementRepresentation = new String();
		return elementRepresentation;
	}


}//End OccurenceSet Class.
