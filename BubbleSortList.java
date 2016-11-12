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
// print method
public void print()
{
for (int i = 0; i < currentLength; i++)
{
System.out.print(arr[i] + " ");
}
System.out.print("\n");
}
}
