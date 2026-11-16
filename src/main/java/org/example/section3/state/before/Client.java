package org.example.section3.state.before;

public class Client {
    public static void main(String[] args) {
        Student student = new Student("ledaekdl");
        OnlineCourse onlineCourse = new OnlineCourse();

        Student daehee = new Student("daehee");
        daehee.addPrivateCourse(onlineCourse);

        onlineCourse.addStudent(student);
        onlineCourse.changeState(OnlineCourse.State.PRIVATE);

        onlineCourse.addStudent(daehee);

        onlineCourse.addReview("hello", student);

        System.out.println(onlineCourse.getState());
        System.out.println(onlineCourse.getStudents());
        System.out.println(onlineCourse.getReviews());
    }
}
