package studentRecordsBackup.bst;

public interface SubjectI {
	public void registerObserver(ObserverI ob);
	public void notifyObservers(int a);
}
