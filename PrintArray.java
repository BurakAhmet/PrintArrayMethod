public class PrintArray {
		private static void printArray(int[] arr) {
		for(int i=0;i<arr.length;i++)
		{
			if(i==0)
			{
				System.out.print("["+arr[i]+",");
			}
			else if(i==arr.length-1) 
			{
				System.out.print(arr[i]+"]\n");
			}
			else 
			{
				System.out.print(arr[i]+",");
			}
		}
	}
}