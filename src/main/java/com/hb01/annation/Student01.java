package com.hb01.annation;
//Bu kilas bir POJO Klastir ve ilk bastan olusturulur
import javax.persistence.*;

@Entity // !!! @Entity koydugumuz sinif, veritabaninda bir tabloya karsilik gelecek
@Table(name = "t_student01") // !!! olusacak olan tablonun ismini degistirdik
public class Student01 { // @Table kullanmamis olsaydik , olusacak tablomuzun ismi student01 olacakti

    @Id // !!! primary key
    private int id;

    @Column(name = "student_name", length = 100, nullable = false, unique=false) // tablodaki header customize etmek
    private String name; // Java'ca konusacaksam name , SQL'ce konusacaksam student_name kullanacagim

    //@Transient // !!! DB'de grade isminde bir kolon olusmasin
    private int grade;

//    @Lob // !!! Large object ile buyuk boyutlu veriler DB de tutulabiliyor
//    private byte[] image;

    // !!! GETTER - SETTER ******************

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

    // !!! toString() *******************************

    @Override
    public String toString() {
        return "Student01{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", grade=" + grade +
                '}';
    }
}