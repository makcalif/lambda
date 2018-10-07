package com.list.transform;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ListToMap {
    public static void main(String[] args) {

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
          new Student("John", "Chemistry"),
          new Student("Derek", "Physics"),
          new Student("Kirk", "Biology"),
          new Student("Norman", "Chemistry"),
          new Student("Norman", "Biology")
        );

        return students;
    }

    private static class Student {
        private String name;
        private String subject;

        public Student(String name, String subject) {
            this.name = name;
            this.subject = subject;
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

        @Override
        public String toString() {
            return "Student{" +
                    "name='" + name + '\'' +
                    ", subject='" + subject + '\'' +
                    '}';
        }
    }
}
