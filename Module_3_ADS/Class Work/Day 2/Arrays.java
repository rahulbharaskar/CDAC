/**/
class Arrays{
	static int search(int arr[],int size,int key, int capacity){
		if(size> capacity){
			System.out.println("Array is full");
			return size;
		}
		
		
		for(int i = 0; i<size; i++){
			if(arr[i] == key){
				return i;
			}
		}
		return -1;
		
		static int delete(int arr[], int size, int key){
			search(arr,size,key);
			if(pos == -1){
				System.out.println("Not Found");
				eturn size;
		}
		// element is present then shift remaining elements
		for(int )
			
	
	public static void main(String[] args){
		int a1[] = new int[100];
	
		int size = 10;
		int n = size;
		
		a1[1] = 11;
		a1[2] = 13;
		a1[3] = 15;
		a1[4] = 17;
		a1[5] = 19;
		a1[6] = 21;
		a1[7] = 23;
		a1[8] = 25;
		a1[9] = 27;
		a1[10] = 29;
		
		for(int i=0; i<size;i++){
			System.out.print(a1[i]+" ")
		}
		
		int key = 48;
		int pos = search (a1,size,key);
		if(pos != -1)
			System.out.println("")