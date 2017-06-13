package MyList;

import java.util.Iterator;

public class MyArrayList<AnyType> implements Iterable<AnyType> {
	
	private static final int DEFAULT_CAPACITY = 10;
	
	private int theSize;
	private AnyType[] theItems;
	
	public MyArrayList(){
		doClear();
	}
	
	public void clear(){
		doClear();
	}
	
	private void doClear(){
		theSize = 0; ensureCapacity( DEFAULT_CAPACITY );
	};
	
	public int size(){	
		return theSize;
	}
	public boolean isEmpty(){	
		return size()==0;
	}
	public void trimToSize(){	
		ensureCapacity( size() );
	}
	
	@SuppressWarnings("unchecked")
	public void ensureCapacity(int newCapacity){
		if( newCapacity < theSize)
			return;
		
		AnyType[] old = theItems;
		theItems = (AnyType[]) new Object[ newCapacity ];
//		theItems =  new AnyType[newCapacity ];
		for(int i=0; i<size(); i++)
			theItems[i] = old[i];
		
	}

	@Override
	public Iterator<AnyType> iterator() {
		// TODO Auto-generated method stub
		return null;
	}
}
