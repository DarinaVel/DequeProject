import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class DEQueueTest {

    @Test
    public void front() {
        DEQueue<String> q = new DEQueue<String>(new String[]{"apple", "orange", "pear"});
        String expected = "apple";
        String actual = q.front();
        Assert.assertEquals(expected, actual);
        DEQueue<Integer> q1 = new DEQueue<Integer>(new Integer[]{3, 1, 6, 5});
        Integer expected1 = 3;
        Integer actual1 = q1.front();
        Assert.assertEquals(expected1, actual1);
        DEQueue<Integer> q2 = new DEQueue<Integer>(new Integer[]{});
        Integer expected2 = null;
        Integer actual2 = q2.front();
        Assert.assertEquals(expected2, actual2);
    }

    @Test
    public void back() {
        DEQueue<String> q = new DEQueue<String>(new String[]{"apple", "orange", "pear"});
        String expected = "pear";
        String actual = q.back();
        Assert.assertEquals(expected, actual);
        DEQueue<Integer> q1 = new DEQueue<Integer>(new Integer[]{3, 1, 6, 5});
        Integer expected1 = 5;
        Integer actual1 = q1.back();
        Assert.assertEquals(expected1, actual1);
        DEQueue<Integer> q2 = new DEQueue<Integer>(new Integer[]{});
        Integer expected2 = null;
        Integer actual2 = q2.back();
        Assert.assertEquals(expected2, actual2);
    }

    @Test
    public void pushFront() {
        String expected = "apple, orange, pear";
        DEQueue<String> q = new DEQueue<String>();
        q.pushFront("pear");
        q.pushFront("orange");
        q.pushFront("apple");
        String actual = q.toString();
        Assert.assertEquals(expected, actual);
        String expected1 = "3, 1, 6, 5";
        DEQueue<Integer> q1 = new DEQueue<Integer>();
        q1.pushFront(5);
        q1.pushFront(6);
        q1.pushFront(1);
        q1.pushFront(3);
        String actual1 = q1.toString();
        Assert.assertEquals(expected, actual);
        String expected2 = "";
        DEQueue<Integer> q2 = new DEQueue<Integer>();
        q1.pushFront(null);
        String actual2 = q2.toString();
        Assert.assertEquals(expected2, actual2);
    }

    @Test
    public void pushBack() {
        String expected = "apple, orange, pear";
        DEQueue<String> q = new DEQueue<String>();
        q.pushBack("apple");
        q.pushBack("orange");
        q.pushBack("pear");
        String actual = q.toString();
        Assert.assertEquals(expected, actual);
        String expected1 = "3, 1, 6, 5";
        DEQueue<Integer> q1 = new DEQueue<Integer>();
        q1.pushBack(3);
        q1.pushBack(1);
        q1.pushBack(6);
        q1.pushBack(5);
        String actual1 = q1.toString();
        Assert.assertEquals(expected, actual);
        String expected2 = "";
        DEQueue<Integer> q2 = new DEQueue<Integer>();
        q1.pushBack(null);
        String actual2 = q2.toString();
        Assert.assertEquals(expected2, actual2);
    }

    @Test(expected = NullPointerException.class)
    public void popBack() {
        String expected = "apple, orange";
        String expectedd = "pear";
        DEQueue<String> q = new DEQueue<String>(new String[]{"apple", "orange", "pear"});
        String actuall = q.popBack();
        String actual = q.toString();
        Assert.assertEquals(expected, actual);
        Assert.assertEquals(expectedd, actuall);
        String expected1 = "3, 1";
        DEQueue<Integer> q1 = new DEQueue<Integer>(new Integer[]{3, 1, 6, 5});
        Integer expectedd1 = 6;
        q1.popBack();
        Integer actuall1 = q1.popBack();
        String actual1 = q1.toString();
        Assert.assertEquals(expected1, actual1);
        Assert.assertEquals(expectedd1, actuall1);
        DEQueue<Integer> q2 = new DEQueue<Integer>(new Integer[]{});
        Integer actual2 = q2.popBack();
        Integer expected2 = null;
        Assert.assertEquals(expected2, actual2);
    }

    @Test(expected = NullPointerException.class)
    public void popFront() {
        String expected = "orange, pear";
        String expectedd = "apple";
        DEQueue<String> q = new DEQueue<String>(new String[]{"apple", "orange", "pear"});
        String actuall = q.popFront();
        String actual = q.toString();
        Assert.assertEquals(expected, actual);
        Assert.assertEquals(expectedd, actuall);
        String expected1 = "6, 5";
        DEQueue<Integer> q1 = new DEQueue<Integer>(new Integer[]{3, 1, 6, 5});
        Integer expectedd1 = 1;
        q1.popFront();
        Integer actuall1 = q1.popFront();
        String actual1 = q1.toString();
        Assert.assertEquals(expected1, actual1);
        Assert.assertEquals(expectedd1, actuall1);
        DEQueue<Integer> q2 = new DEQueue<Integer>(new Integer[]{});
        Integer actual2 = q2.popFront();
        Integer expected2 = null;
        Assert.assertEquals(expected2, actual2);
    }

    @Test
    public void size() {
        DEQueue<String> q = new DEQueue<String>(new String[]{"apple", "orange", "pear"});
        int expected = 3;
        int actual = q.size();
        Assert.assertEquals(expected, actual);
        DEQueue<Integer> q1 = new DEQueue<Integer>(new Integer[]{3, 1, 6, 5});
        int expected1 = 4;
        int actual1 = q1.size();
        Assert.assertEquals(expected1, actual1);
        DEQueue<Integer> q2 = new DEQueue<Integer>(new Integer[]{});
        int expected2 = 0;
        int actual2 = q2.size();
        Assert.assertEquals(expected2, actual2);
    }

    @Test
    public void clear() {
        DEQueue<String> q = new DEQueue<String>(new String[]{"apple", "orange", "pear"});
        q.clear();
        String expected = "";
        String actual = q.toString();
        Assert.assertEquals(expected, actual);
        DEQueue<Integer> q1 = new DEQueue<Integer>(new Integer[]{3, 1, 6, 5});
        q1.clear();
        String expected1 = "";
        String actual1 = q1.toString();
        Assert.assertEquals(expected1, actual1);
        DEQueue<Integer> q2 = new DEQueue<Integer>(new Integer[]{});
        q2.clear();
        String expected2 = "";
        String actual2 = q2.toString();
        Assert.assertEquals(expected2, actual2);
    }

    @Test
    public void toArray() {
        DEQueue<String> q = new DEQueue<String>(new String[]{"apple", "orange", "pear"});
        String[] expected = new String[]{"apple", "orange", "pear"};
        String[] actual = q.toArray(String.class);
        Assert.assertEquals(expected, actual);
        DEQueue<Integer> q1 = new DEQueue<Integer>(new Integer[]{3, 1, 6, 5});
        Integer[] expected1 = new Integer[]{3, 1, 6, 5};
        Integer[] actual1 = q1.toArray(Integer.class);
        Assert.assertEquals(expected1, actual1);
        DEQueue<Integer> q2 = new DEQueue<Integer>(new Integer[]{});
        Integer[] expected2 = new Integer[]{};
        Integer[] actual2 = q2.toArray(Integer.class);
        Assert.assertEquals(expected2, actual2);
    }
}