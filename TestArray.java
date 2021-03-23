public class TestArray {

    public static void main(String[] args) {

        Array num = new Array(3);//builds the array with the given length

        System.out.println("Just testing the methods present in Array class.");

        //insert method inserts int values in the array
        //if the array is full, it increases the array size and inserts the new value at the end of the array
        num.insert(1);
        num.insert(2);
        num.insert(7);
        num.insert(4);
        num.insert(5);

        //remove method removes the value at given index
        //the array sizes is decreased by one each time the method is called
        num.removeAt(3);

        //print method prints each array value in new line
        num.print();

        //indexOf method prints the array value of a given method
        System.out.println("The value 5 is in the position:" + num.indexOf(5));
        System.out.println("The maximum value is:" + num.max());
    }
}
