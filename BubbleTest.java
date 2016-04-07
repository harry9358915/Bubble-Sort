//U10316050 莊智翔
public class BubbleTest {
	public static void main(String[] args){
		int[] RandomArray = {5,25,1,4,78,45,65,35};//Create Array
		System.out.println("Array:");
		for(int i=0;i<RandomArray.length;i++){
			if(i == RandomArray.length-1){//print array after using bubble sort algorithm
				System.out.println(RandomArray[i]);
			}else{
				System.out.print(RandomArray[i]+",");
			}
		}
		System.out.println("Bubble sort:");
		BubbleSort(RandomArray);//sort an array using bubble sort algorithm
		for(int i=0;i<RandomArray.length;i++){
			if(i == RandomArray.length-1){//print array after using bubble sort algorithm
				System.out.print(RandomArray[i]);
			}else{
				System.out.print(RandomArray[i]+",");
			}
		}
	}

	private static void BubbleSort(int[] randomArray) {
		int n = randomArray.length;
		int temp;
		for(int i=0;i<n;i++){
			for(int k=1;k<(n-i);k++){
				if(randomArray[k]<randomArray[k-1]){
					temp = randomArray[k];
					randomArray[k] = randomArray[k-1];
					randomArray[k-1] = temp;
				}
			}
		}
		// TODO Auto-generated method stub
		
	}
}
