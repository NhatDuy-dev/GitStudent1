package com.mycompany.gitstudent;

public class GitStudent {

    public class Student {
// Các thuộc tính
        private String studentId;
        private String name;
        private int age;
// Constructor khởi tạo đối tượng Student
        public Student(String studentId, String name, int age) {
            this.studentId = studentId;
            this.name = name;
            this.age = age;
        }
//lấy thông tin sinh viên
        public String getStudentId() {
            return studentId;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
        // Phương thức cập nhật tên sinh viên 

        public void updateName(String newName) {
            this.name = newName;
        }
    }

}
