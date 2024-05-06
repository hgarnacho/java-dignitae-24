package com.dignitae.hibernate05_manytomany.model;

import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import jakarta.persistence.GenerationType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "student")
public class StudentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @ManyToMany
    @JoinTable(
        name = "student_course",
        joinColumns = @JoinColumn(name = "student_id"),
        inverseJoinColumns = @JoinColumn(name = "course_id")
    )

    private Set<CourseEntity> courses = new HashSet<>();

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<CourseEntity> getCourses() {
        return courses;
    }

    public void setCourses(Set<CourseEntity> courses) {
        this.courses = courses;
    }

    public void addCourse(CourseEntity courseEntity){
        this.courses.add(courseEntity);
    }

    public void removeCourse(CourseEntity courseEntity){
        this.courses.remove(courseEntity);
    }

    public boolean existsCourse(CourseEntity courseEntity){
        return this.courses.contains(courseEntity);
    }

}

