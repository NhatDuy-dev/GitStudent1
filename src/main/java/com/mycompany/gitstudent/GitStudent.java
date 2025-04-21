

package com.mycompany.gitstudent;


public class GitStudent {
//khởi tạo thuộc tính
    public class Student {
    private String studentId;
    private String name;
    private int age;
//khởi tạo đối tượng
    public Student(String studentId, String name, int age) {
        this.studentId = studentId;
        this.name = name;
        this.age = age;
    }
//lấy mã sinh viên
    public String getStudentId() { return studentId; }
    public String getName() { return name; }
    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }
 //update name sinh viên
    public void updateName(String newName) {
    this.name = newName;
}

}
}
