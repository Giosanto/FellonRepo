package esami.Lab20140415;

public interface Dictionary<S> extends Iterable<Comparable> {

	public void insert(S e, Comparable k);
	public void delete(Comparable k);
	public S search(Comparable k);
	
}

