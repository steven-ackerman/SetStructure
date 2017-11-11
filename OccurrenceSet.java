//Imports:
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;


//Begin Class:
public class OccurrenceSet<T> implements Set<T>{
	//Class Variables:
	Object key;
	int value = 1;
	
	//Create a HashMap<T, Integer>
	HashMap<T, Integer> hashMap= new HashMap<T, Integer>();
	//Create a Set from the HashMap object:
	Set<?> hashSet = hashMap.entrySet();
	//Create an Iterator for the Set from the hashSet.
	Iterator<?> it = hashSet.iterator();
	//Create a HashTable:
	Hashtable<T, Integer> hashTable = new Hashtable<T, Integer>();
	
	//Constructor:
	public OccurrenceSet(Object k, int v) {
		
	}//End Constructor
	@Override
	public boolean add(T key) {
		//Track how many times an element has been added to the set.
		//int counter = hashMap.get(key);
		//int value = 1;
		//hashMap.putIfAbsent(key, value);
		
		if (hashMap.containsKey(key)){
			//Get the value and key, then increase the value++;
			int value = hashMap.get(key);
			value++;
			hashMap.putIfAbsent(key, value);
			//hashMap.put(key, value);
			return false;
		}else {
			hashMap.put(key, value);
		}
			
		
		
	return true;
		
	}
		
	

	@Override
	public boolean addAll(Collection<? extends T> collection) throws NullPointerException{
		// Track how many times an element has been added to the set.
		Map.Entry entry = (Entry<?, ?>) it.next();
		Enumeration e = ((Hashtable<T,Integer>) collection).elements();
		while (e.hasMoreElements()){
			//Collections.addAll(hashMap,collection);
			((HashMap<T,Integer>) ((Enumeration) e).nextElement()).putAll(hashMap);
		    }
		return true;
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

/*--------<Sources>---------*
 * 
 * Java Docs:
 * https://docs.oracle.com/javase/7/docs/api/java/util/Map.Entry.html
 * 
 * Java Collections Tutorial:
 * http://www.java2s.com/Tutorial/Java/0140__Collections/CreateJavaHashtablefromHashMap.htm
 * 
 * -------<End Sources>-----*
 */
