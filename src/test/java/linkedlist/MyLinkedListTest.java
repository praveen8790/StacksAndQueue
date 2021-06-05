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
        linkedList.testCaseSetHead();
        for(int i=2;i>=0;i--){
            Assert.assertEquals(arr[i],linkedList.testCaseMethod());
            linkedList.testCaseSetter();
        }

    }
    public void testAppend() {
        MyLinkedList linkedList = new MyLinkedList<>();
        int[] arr ={56,30,70};
        linkedList.append(arr[0]);
        linkedList.append(arr[1]);
        linkedList.append(arr[2]);
        linkedList.testCaseSetHead();
        for(int i=0;i<3;i++){
            Assert.assertEquals(arr[i],linkedList.testCaseMethod());
            linkedList.testCaseSetter();
        }

    }

    public void testInsert1() {
        MyLinkedList linkedList = new MyLinkedList<>();
        linkedList.append(56);
        linkedList.append(70);
        linkedList.insert(56,30);
        int[] arr ={56,30,70};
        linkedList.testCaseSetHead();
        for(int i=0;i<3;i++){
            Assert.assertEquals(arr[i],linkedList.testCaseMethod());
            linkedList.testCaseSetter();
        }
    }
    public void testDeleteFirst() {
        MyLinkedList linkedList = new MyLinkedList<>();
        int[] arr ={56,30,70};
        linkedList.append(arr[0]);
        linkedList.append(arr[1]);
        linkedList.append(arr[2]);
        linkedList.deleteElementAtHead();
        linkedList.testCaseSetHead();
        for(int i=1;i<3;i++){
            Assert.assertEquals(arr[i],linkedList.testCaseMethod());
            linkedList.testCaseSetter();
        }

    }
    public void testDeleteLast() {
        MyLinkedList list = new MyLinkedList<>();
        int[] arr ={56,30,70};
        list.append(arr[0]);
        list.append(arr[1]);
        list.append(arr[2]);
        list.deleteElementAtTail();
        list.testCaseSetHead();
        for(int i=0;i<2;i++){
            Assert.assertEquals(arr[i],list.testCaseMethod());
            list.testCaseSetter();
        }

    }
    public void testSearch() {
        MyLinkedList list = new MyLinkedList<>();
        int[] arr = {56, 30, 70};
        list.append(arr[0]);
        list.append(arr[1]);
        list.append(arr[2]);
        Assert.assertTrue(list.searchable(30));
    }

    public void testInsert2() {
        MyLinkedList linkedList = new MyLinkedList<>();
        linkedList.append(56);
        linkedList.append(30);
        linkedList.append(70);
        linkedList.insert(30,40);
        int[] arr ={56,30,40,70};
        linkedList.testCaseSetHead();
        for(int i=0;i<3;i++){
            Assert.assertEquals(arr[i],linkedList.testCaseMethod());
            linkedList.testCaseSetter();
        }
    }
    public void testDelete() {
        MyLinkedList list = new MyLinkedList<>();
        int[] arr = {56, 30, 40, 70};
        for (int i = 0; i < 3; i++)
            list.append(arr[i]);

        list.delete(40);
        list.testCaseSetHead();
        for (int i = 0; i < 2; i++) {
            Assert.assertEquals(arr[i], list.testCaseMethod());
            list.testCaseSetter();
        }
        Assert.assertEquals(3,list.size());
    }

    }