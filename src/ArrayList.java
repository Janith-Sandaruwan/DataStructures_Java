
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
	 * Description : Adding the given element at the end of the unsorted array
	 */

	 public void add(Object element) {
		 //check if the array is full
		 if(isFull()){
			int len = ar.length;
			int i=0;
			//if full creating a new array to add new elements
			Object[] ar2 = new Object[len + ar.length>>1];
			//copying all the element of the initial array to new array
			while (i<len) {
				ar2[i]=ar[i];
				i++;
			}
			//adding new element
			ar2[i]=element;
			//Assigning new array to ar array
			ar=ar2;
			//Incrementing the count since an element added
			count++;
		 }
		 //if the array is not full
		 else{
			 //adding new element to the end of the array
			 ar[count++]=element;
		 }
	 }

	/*
	 * Method Name : addToIndex
	 * Description : Adding the given element at the given position of the unsorted array
	 */

	public void addToIndex(Object element,int index) {
		//check if the array is full
		if(isFull()){
		   int len = ar.length;
		   int i=0;
		   //if full creating a new array to add new elements
		   Object[] ar2 = new Object[len + ar.length>>1];
		   //copying all the element of the initial array to new array
		   while (i<=index) {
			   if(i==index){
					//adding new element
					ar2[i]=element;
					i++;
			   }else{
					ar2[i]=ar[i];
					i++;
			   }
		   }
		   while(index<len){
				ar2[index+1]=ar[index];
				index++;
		   }
		   //Assigning new array to ar array
		   ar=ar2;
		   //Incrementing the count since an element added
		   count++;
		}
		//if the array is not full
		else{
			int i=count;
			while(i>index){
				ar[i+1]=ar[i];
				i--;
			}
			ar[index]=element;
			count++;
		}
	}

	/*
	 * Method Name : addFirst
	 * Description : Adding the given element at the beginig of the unsorted array
	 */

	public void addFirst(Object element) {
		//check if the array is full
		if(isFull()){
		   int len = ar.length;
		   int i=0;
		   //if full creating a new array to add new elements
		   Object[] ar2 = new Object[len + ar.length>>1];
		   //copying all the element of the initial array to new array
		   while (i<=len) {
				ar2[i+1]=ar[i];
				i++;
		   }
		   ar2[0]=element;
		   //Assigning new array to ar array
		   ar=ar2;
		   //Incrementing the count since an element added
		   count++;
		}
		//if the array is not full
		else{
			int i=count;
			while(i>=0){
				ar[i+1]=ar[i];
				i--;
			}
			ar[0]=element;
			count++;
		}
	}

}
