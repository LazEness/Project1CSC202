package Test;

import Model.User;
import Utils.ArrayQueue;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by LazEness on 10/12/2016.
 */
public class ArrayQueueTest {
    public ArrayQueue<User> list = new ArrayQueue<User>();
    @Test
    public void enqueue() throws Exception {
        User Tanner = new User("Tanner", "pass2");
        User Sam = new User("Sam", "pass1");
        User Jack = new User("Jack", "pass3");
        User Wit = new User("Wit", "pass4");

        list.enqueue(Sam);
        list.enqueue(Jack);
        list.enqueue(Tanner);
        list.enqueue(Wit);

        Assert.assertFalse(list.isEmpty());
    }

    @Test
    public void dequeue() throws Exception {
        User Tanner = new User("Tanner", "pass2");
        User Sam = new User("Sam", "pass1");
        User Jack = new User("Jack", "pass3");
        User Wit = new User("Wit", "pass4");

        list.enqueue(Sam);
        list.enqueue(Jack);
        list.enqueue(Tanner);
        list.enqueue(Wit);

        list.dequeue();
        list.dequeue();
        list.dequeue();
        list.dequeue();

        Assert.assertTrue(list.isEmpty());
    }

    @Test
    public void isEmpty() throws Exception {
        User Tanner = new User("Tanner", "pass2");
        list.enqueue(Tanner);
        Assert.assertFalse(list.isEmpty());
    }

    @Test
    public void size() throws Exception {
        User Tanner = new User("Tanner", "pass2");
        User Sam = new User("Sam", "pass1");
        User Jack = new User("Jack", "pass3");
        User Wit = new User("Wit", "pass4");

        list.enqueue(Sam);
        list.enqueue(Jack);
        list.enqueue(Tanner);
        list.enqueue(Wit);
        Assert.assertTrue(list.size()==4);
    }






}