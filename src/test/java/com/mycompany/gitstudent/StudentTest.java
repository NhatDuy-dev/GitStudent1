package com.mycompany.gitstudent;

import org.testng.Assert;
import org.testng.annotations.Test;

public class StudentTest {

    @Test
    public void testGetName() {
        GitStudent.Student s = new GitStudent().new Student("S001", "An", 20);
        Assert.assertEquals(s.getName(), "An");
    }

    @Test
    public void testSetAge() {
        GitStudent.Student s = new GitStudent().new Student("S001", "Hai", 20);
        s.setAge(22);
        Assert.assertEquals(s.getAge(), 22);
    }

    @Test
    public void testUpdateName() {
        GitStudent.Student s = new GitStudent().new Student("S001", "Minh", 20);
        s.updateName("Bình");
        Assert.assertEquals(s.getName(), "Bình");
    }
}
