
public class ArrayList {
	/*
	 * Author : Janith Sandaruwan
	 * Implementation: Dynamic arrays using java array
	 * Methods : isEmty() , 
	 */

	private int default_size = 10;
	private Object ar[]; //array reference
	private int count;	//element count
	
	/*
	 * Default constructor 
	 * Parameters : no parameters required
	 */
	
	public ArrayList(){
		ar = new Object[default_size];
	}

	/*
	 * Parameterized constructor 
	 * Parameters : size to be initialized
	 * Type : int
	 */
	
	public ArrayList(int size){
		ar = new Object[size];
	}
	
	/*
	 * Method Name : isEmpty
	 * Description : Check whether the arrayList is empty or not
	 * Return : boolean yes - if array is empty
	 * 		  : boelan false - if array is not empty 
	 */

	 public boolean isEmpty() {
		 return count == 0;
	 }

	 /*
	 * Method Name : isFull
	 * Description : Check whether the arrayList is full or not
	 * Return : boolean yes - if array is full
	 * 		  : boelan false - if array is not full 
	 */

	public boolean isFull() {
		return count == ar.length;
	}

	 /*
	 * Method Name : add
	 * Description : Adding the given element at the end of the sorted array
	 */

	 public void add(Object element) {
		 //check if the array is full
		 if(isFull()){
			int len = ar.length;
			int i=0;
			//if full creating a new array to add new elements
			Object[] ar2 = new Object[len + ar.length>>1];
			while (i<len) {
				ar2[i]=ar[i];
				i++;
			}
			ar2[i++]=element;
			count++;
		 }
		 //check if the array is not full
		 else{
			 ar[count++]=element;
		 }
	 }

}
