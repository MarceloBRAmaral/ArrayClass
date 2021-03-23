//import java.util.Arrays;

public class Array {

    private int[] items;//to be used as the main array
    private int[] itemsCopy;//to be used as a copy of the main array when needed
    private int index;
    int indexOfArray;

    //constructor to build new arrays
    public Array(int length){
        items = new int[length];
    }

    //method to print all array elements one per line
    public void print(){
        for (int i=0; i<items.length; i++){
        System.out.println(items[i]);
        }
    }

    //insert int values in the array starting from the index 0
    //when the initial length is reached, the array length increases by one
    public void insert(int item){
        if (index<items.length){
            items[index] = item;
        }
        else{
            itemsCopy = items;
            items = new int[itemsCopy.length+1];
            for (int j=0; j<itemsCopy.length; j++){
                items[j] = itemsCopy[j];
            }
            items[itemsCopy.length] = item;
        }
        index++;
    }

    //removes the array value at index position
    public void removeAt(int index){
        itemsCopy = items;
        items = new int[itemsCopy.length-1];
        for (int j=0; j<items.length; j++){
            if (j<index) {
                items[j] = itemsCopy[j];
            }
            else {
                items[j] = itemsCopy[j + 1];
            }
        }
    }

    //searches for the first value in the array and gives its index
    //if the value is not found, it gives a -1
    public int indexOf(int value){

        indexOfArray = -1;
        for (int i=0; i<items.length; i++){

            if(items[i]==value){
                indexOfArray = i;
                break;
            }
        }
        return indexOfArray;
    }

    //searches and returns the largest number
    public int max(){
        int max = items[0];
        for (int i=0; i<items.length-1; i++){
            if (items[i+1]>items[i]){
                max = items[i+1];
            }
        }
        return max;
    }
}
