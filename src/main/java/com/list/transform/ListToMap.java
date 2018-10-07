package com.list.transform;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ListToMap {
    public static void main(String[] args) {

        mapUsingPropertyAsKeyAndObjectAsValue();

        // find student with best grade
        getMaxAndMinByGrade();

        // create a map where subject is key and value is list of Students
        mapListOfStudentsBySubjects();

    }

    private static void mapListOfStudentsBySubjects() {
        List<Student> students = getStudents();
        Map<String, List<Student>> map = students.stream()
                .collect(Collectors.groupingBy(Student::getSubject));

        map.entrySet().stream()
                .forEach(v -> System.out.println(v));
    }

    private static void getMaxAndMinByGrade() {
        List<Student> students = getStudents();
        students.stream()
                .min(Comparator.comparing(Student::getGrade).reversed())
                .ifPresent(max -> System.out.println(String.format("Student with highest greade: %s", max)));

        students.stream()
                .min(Comparator.comparing(Student::getGrade))
                .ifPresent(min -> System.out.println(String.format("Student with lowest greade: %s", min)));
    }

    private static void mapUsingPropertyAsKeyAndObjectAsValue() {
        List<Student> students = getStudents();

        // merge func to take care of duplicate keys in Student -> subject
        BinaryOperator<Student> mergeFunction = (s1, s2) -> {
            System.out.println("duplicate key: " + s1.getSubject() + ":" + s2.getSubject());
            return s1;
        };

        Map<String, Student> map = students.stream()
                                    .collect(Collectors.toMap(Student::getSubject, Function.identity(), mergeFunction));

        map.entrySet()
                .stream()
                .forEach(System.out::println);
    }

    private static List<Student> getStudents () {
        List<Student> students = Arrays.asList(
          new Student("John", "Chemistry", 55),
          new Student("Derek", "Physics", 65),
          new Student("Kirk", "Biology", 75),
          new Student("Norman", "Chemistry", 85),
          new Student("Norman", "Biology", 95)
        );

        return students;
    }

    private static class Student {
        private String name;
        private String subject;
        private Integer grade;

        public Student(String name, String subject, Integer grade) {
            this.name = name;
            this.subject = subject;
            this.grade = grade;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getSubject() {
            return subject;
        }

        public void setSubject(String subject) {
            this.subject = subject;
        }

        public Integer getGrade() {
            return grade;
        }

        public void setGrade(Integer grade) {
            this.grade = grade;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "name='" + name + '\'' +
                    ", subject='" + subject + '\'' +
                    ", grade=" + grade +
                    '}';
        }
    }
}
