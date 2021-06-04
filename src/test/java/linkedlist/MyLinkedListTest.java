package linkedlist;

import junit.framework.TestCase;
import org.junit.Assert;

public class MyLinkedListTest extends TestCase {
    public void testAdd() {
        MyLinkedList linkedList = new MyLinkedList<>();
        int[] arr ={70,30,56};
        linkedList.add(arr[0]);
        linkedList.add(arr[1]);
        linkedList.add(arr[2]);
        for(int i=2;i>=0;i--){
            Assert.assertEquals(arr[i],linkedList.testCaseMethod());
            linkedList.testCaseSetter();
        }
    }
}