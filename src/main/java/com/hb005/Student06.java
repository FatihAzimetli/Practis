package com.hb005;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Student06 {

    @Id
    private int id;

    @Column(name = "student_name", nullable = false)
    private String name;

    private int grade;

    @OneToMany
    @JoinColumn // !!! FK burada olussun istesekde , Hibernate buna musade etmiyor ve en
    // performansli cozum olan Many tarafina yani Book06 tablosuna FK kolunu olusturuyor
    //!!! eger hic bir tarafda JoinColumn yazmazsak ozaman Hibernate iliskileri takip etmek
    // icin 3. bir tablo olusturur
    private List<Book06> bookList = new ArrayList<>();

        // !!!GETER -SETTER

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public List<Book06> getBookList() {
        return bookList;
    }

        //    public void setBookList(List<Book06> bookList) {
//        this.bookList = bookList;
//    }
        //!!! toString()

    @Override
    public String toString() {
        return "Student06{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", grade=" + grade +
                ", bookList=" + bookList +
                '}';
    }
}