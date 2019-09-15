package com.dataStructures;

public class ArrayList implements ArrayLists {
	/*
	 * Author : Janith Sandaruwan
	 * Implementation: Dynamic arrays using java array
	 * Methods : isEmty() , 
	 */

	private int default_size = 10;
	private Object ar[]; //array reference
	private int count=0;	//element count

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

	@Override
	public boolean isEmpty() {
			return count == 0;
	}

	/*
	 * Method Name : isFull
	 * Description : Check whether the arrayList is full or not
	 * Return : boolean yes - if array is full
	 * 		  : boelan false - if array is not full 
	 */
	@Override
	public boolean isFull() {
		return count == ar.length;
	}

	 /*
	 * Method Name : add
	 * Description : Adding the given element at the end of the unsorted array
	 */
	@Override
	 public void add(Object element) {
		 //check if the array is full
		 if(isFull()){
			int len = ar.length;
			int i=0;
			//if full creating a new array to add new elements
			Object[] ar2 = new Object[len + (ar.length>>1)];
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
		   Object[] ar2 = new Object[len + (ar.length>>1)];
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
				ar[i]=ar[i-1];
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
		   Object[] ar2 = new Object[len + (ar.length>>1)];
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
			while(i>0){
				ar[i]=ar[i-1];
				i--;
			}
			ar[0]=element;
			count++;
		}
	}

	/*
	 * Method Name : replace
	 * Description : Replaing the given element at the givent point of the unsorted array
	 * @parameters :  element / int index
	 */

	public void replace(Object element,int index) throws Exception {
		//check if the array is full
		if(index<count){
		   ar[index]=element;
		}
		else{
			throw new Exception("Index is out of the range");
		}
	}

	/*
	 * Method Name : printAll
	 * Description : Print all the elements of the array
	 * @parameters : No parameters required
	 */

	public void printAll() throws Exception {
		//check if the array is full
		if(isEmpty()){
			throw new Exception("Empty com.dataStructures.ArrayList : no such elements to print");
		}
		else{
			for(int i=0;i<count;i++){
				System.out.print(ar[i]+" | ");
			}
			System.out.println();
		}
	}

	/*
	 * Method Name : size
	 * Description : return element count of the array
	 * @parameters : No parameters required
	 * @return : int count
	 */

	public int size() {
		return count;
	}

	/*
	 * Method Name : get
	 * Description : return element of the given index
	 * @parameters : int index
	 * @return : element
	 */

	public Object get(int index){
		return ar[index];
	}

	/*
	 * Method Name : indexOf
	 * Description : return index of the given element
	 * @parameters : Object element
	 * @return : index
	 */

	public int indexOf(Object element) throws Exception{
		int index = 0;
		if(isEmpty()){
			throw new Exception("Empty Array");
		}
		else{
			for(int i=0;i<ar.length;i++){
				if(element==ar[i]){
					index = i;
					break;
				}
				
			}
		}
		return index;
		
	}

	/*
	 * Method Name : contains
	 * Description : return true if the element is present
	 * @parameters : Object element
	 * @return : boolean
	 */

	public boolean contains(Object element) throws Exception{
		boolean x = false;
		if(isEmpty()){
			throw new Exception("Empty Array");
		}
		else{
			for(int i=0;i<ar.length;i++){
				if(element==ar[i]){
					x = true;
				}
				else{
					x = false;
				}
			}
		}
		return x;
	}

	/*
	 * Method Name : removeIndex
	 * Description : remove element which belongs to index
	 * @parameters : int index
	 */

	public void removeIndex(int index) throws Exception{
		if(isEmpty()){
			throw new Exception("Empty Array");
		}
		else{
			if(index<count){
				for(int i=index;i<ar.length;i++){
					ar[i]=ar[i+1];
				}
			} else throw new Exception("Index is out of the list range");
		}
	}

	/*
	 * Method Name : removeElement
	 * Description : remove element 
	 * @parameters : Object element
	 */

	public void removeElement(Object element) throws Exception{
		if(isEmpty()){
			throw new Exception("Empty Array");
		}
		else{
			int index=indexOf(element);
			removeIndex(index);
		}
	}

	/*
	 * Method Name : getTotal
	 * Description : clear the array 
	 * @parameters : No parameters required
	 */

	@Override
	public int getTotal() {
		return count;
	}
	/*
	 * Method Name : clear
	 * Description : clear the array
	 * @parameters : No parameters required
	 */
	@Override
	public void clear(){
			count=0;
	}
}
