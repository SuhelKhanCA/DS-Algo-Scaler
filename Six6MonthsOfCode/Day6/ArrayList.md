ArrayList:- It is a dynamic array of objects.
        Difference :
            1. Arrays are natural data structures whereas ArrayList is an added class.
            2. Arrays are of fixed size whereas Arraylist can grow and shrink.
            3. Arrays can hold primitve datatypes whereas ArrayList can hold objects only.
Creating an ArrayList:
        Syntax: 
        ArrayList<Stirng> list1 = new ArrayList<String>();
        ArrayList<Integer> list1 = new ArrayList<Integer>();

        Note : The Integer wrapper class is used in place of a primitive 'int'.

Methods on ArrayList: 
       1. add(value) ==>> append the value at the end of list
       2. add(index, value) ==>> insert the  given value just before the given index, shifing subsequent values to the right.
       3. clear() ==>> remove all the elements of the list
       4. indexOf(value) ==>> find the index of the value given if found. return -1 if value not found.
       5. get(index) ==>> return the value at the given index.
       6. remove ==>> removes/returns value at given index, shifting at the subsequent values to the left
       7. set(index, value) ==>> replaces value at the index with the given value.
       8. size() >> return the number of elements in the list.
       9. toString(listObj) ==>> returns a string representation of the list such as "[11, 45, 5. -9]".
















Note :- Removal from the end of the ArrayList is faster than the removal of from start.