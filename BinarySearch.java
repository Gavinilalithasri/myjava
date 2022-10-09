package JAVA;

public class BinarySearch {
	int BinarySearch(int arr[],int x,int l,int h) {
		while(l<=h) {
			int m=(l+h)/2;
			if(arr[m]==x)
				return m;
			else if(arr[m]<x)
				l=m+1;
			else
				h=m-1;
		}
		return -1;
	}

}
