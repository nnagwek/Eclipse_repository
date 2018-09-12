//Assignment  7 b
package mypack;

public class Generic_Example2 {

	public static void main(String[] args) {
		Pair<Integer,String> pair=new OrderedPair<>();
		

		pair.setkeys(100);
		pair.setValues("abc");
		
		System.out.println(pair.getKey()+" "+pair.getVAlue());

	}

}


interface Pair<K,V>
{
	public K getKey();
	public V getVAlue();
	public void setkeys(K keys);
	public void setValues(V values);
}


class OrderedPair<K,V> implements Pair<K,V>
{
private K keys;
private V Values;
	@Override
	public K getKey() {
	
		return keys;
	}

	@Override
	public V getVAlue() {
		
		return Values;
	}
	
	

	@Override
	public void setkeys(K keys) {
	 this.keys=keys;
		
	}

	@Override
	public void setValues(V values) {
		this.Values=values;
		
	}

	
	
	
}
