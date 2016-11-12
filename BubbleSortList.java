public class BubbleSortList
{
// Maximum size of ArrayList = Array Size
public final int Maximum_Size = 20;

// Array for list
private int[] arr;
private int currentLength;

public BubbleSortList()
{
arr = new int [Maximum_Size];
currentLength = 0;
}
// add method
public int add (int item)
{
if(currentLength >= Maximum_Size)
{
return -1;
}
else
{
arr[currentLength] = item;
currentLength++;
return currentLength;
}
}
// sort method
public void sort()
{
for(int j = currentLength -1; j > 1; j--)
{
for (int i = 0; i < j; i++)
{
if (arr[i] > arr[i+1])
{
int tmp = arr[i];
arr[i] = arr[i+1];
arr[i+1] = tmp;
}
}
}
}
