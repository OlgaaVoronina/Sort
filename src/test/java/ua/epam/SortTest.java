package ua.epam;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Olia on 11.09.2016.
 */
public class SortTest {

    private Sort sort;

    int[] arr00 = {1, 5, 3, 2, 4};
    int[] arr01 = {1, 5, 3, 2, 4};
    int[] arr02 = {1, 5, 3, 2, 4};
    int[] arr03 = {1, 5, 3, 2, 4};
    int[] arr04 = {1, 5, 3, 2, 4};
    int[] arr05 = {1, 5, 3, 2, 4};
    
    int[] arr1 = {1, 2, 3, 4, 5};

    @Before
    public void runSort(){ sort = new Sort(); } //inicialization

    //buble
    @Test
    public void bubbleSort(){
        sort.bubbleSort(arr00);
        Assert.assertArrayEquals(arr00, arr1);
    }

    @Test
    public void bubbleSort1(){
        int size = (sort.bubbleSort(arr00)).length;
        Assert.assertTrue( size == 5);
    }

    //selection
    @Test
    public void selectionSort() {
        sort.selectionSort(arr01);
        Assert.assertArrayEquals(arr01, arr1);
    }

    @Test
    public void selectionSort1(){
        int size = (sort.selectionSort(arr01)).length;
        Assert.assertTrue( size == 5);
    }

    //insertion
    @Test
    public void insertionSort(){
        sort.insertionSort(arr02);
        Assert.assertArrayEquals(arr02, arr1);
    }

    @Test
    public void insertionSort1(){
        int size = (sort.insertionSort(arr02)).length;
        Assert.assertFalse( size == 10);
    }

    //quick
    @Test
    public void quickSort(){
        sort.quickSort(arr03, 0, 4);
        Assert.assertArrayEquals(arr03, arr1);
    }

    public void quickSort1(){
        int size = (sort.quickSort(arr03, 0, 4)).length;
        int sizeArr1 = arr1.length;
        Assert.assertTrue( size == sizeArr1);
    }

    //shella
    @Test
    public void shellaSort() {
        sort.shellaSort(arr04);
        Assert.assertArrayEquals(arr04, arr1);
    }

    //gnome
    @Test
    public void gnomeSort() {
        sort.gnomeSort(arr05);
        Assert.assertArrayEquals(arr05, arr1);
    }

}
