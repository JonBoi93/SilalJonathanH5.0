import java.util.Random;

public class BubbleSortListTest
{
public static void  main(String args[])
{
Random rnd = new Random();
int listItem = 0;
BubbleSortList sortList = new BubbleSortList();
do
{
int randomNumber = rnd.nextInt((150-50) + 150) + 50;
listItem = sortList.add(randomNumber);
}
while (listItem >= 0);

