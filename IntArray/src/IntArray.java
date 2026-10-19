import java.util.Arrays;
import java.util.Random;

public class IntArray{
    //private data fields
    private int length;
    private int[] myArray;
    public IntArray(int l){
        myArray= new int[l];
        length= l;
    }
    //clear array
    public void clear(){
        myArray = new int[0];
        length=0;
    }
    //find array size
    public int size(){
        return length;
    }
    //fills array with random numbers upt to a desired length
    public void fillRand(){
        Random rand = new Random();
        for (int i=0; i< length; i++){
            myArray[i]=rand.nextInt(6)+1;
        }
    }
    //set an element of array to a new value
    public void set(int element, int newValue){
        myArray[element]=newValue;
    }
    //get method for a spefic index in array
    public int get(int element){
        return myArray[element];
    }
    //checks  to see if array is empty
    public boolean isEmpty(){
        return length==0;
    }
    //sort method using imported arrays module
    public void sort(){
        Arrays.sort(myArray);
    }
    //to string method using imported arrays module
    public String toString(){
        return Arrays.toString(myArray);
    }
}