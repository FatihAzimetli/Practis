package com.annation;
//Bu kilas bir POJO Klastir ve ilk bastan olusturulur
import javax.persistence.*;

@Entity //!!! @entity koydugumuz sinif, veritabanina bir tabloya karsilik gelecek
@Table(name = "t_student01")//olusacak olan tablonun ismini degistirdik
public class Student01 {


@Id //burasi paymeri ki oldu ve unic oldu (primary key)
    private int id;




@Column(name = "student_name",length = 100, nullable = false, unique = false)//bunun yazmamizin ana sebebi costumuze etmek icindir
private String name;//Javaa konusacaksam name  yazilkacak SQL konusalacalsa student_name yazilacak


   // @Transient //bu java persentens secilecek //DB grade isminde bir kolon olusmasin diye yaziyoruz
    private int grade;


   // @Lob//large object foto gibi büyük boyutlu veriler DB de tutulabiliyor
   // private byte[] image;

    //geter seter


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

    //to sitring metodunuda olusturduk

    @Override
    public String toString() {
        return "Student01{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", grade=" + grade +
                '}';
    }
}
