import com.my.ssm.entity.Clazz;
import com.my.ssm.entity.Student;
import com.my.ssm.entity.Teacher;
import com.my.ssm.service.Insert;
import com.my.ssm.service.Query;
import com.my.ssm.service.imp.InsertService;
import com.my.ssm.service.imp.QueryService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Set;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class TestSpring {
    @Autowired
    private Query query;
    @Autowired
    private Insert insert;
    @Test

    public void test1() throws Exception {
//        Clazz clazz = this.query.queryClazz(2L);
//        Set<Student> students = clazz.getStudents();
//        for (Student student:students){
//            System.out.println(student);
//        }
//        Set<Teacher> teachers = clazz.getTeachers();
//        for (Teacher teacher:teachers){
//            System.out.println(teacher);
//        }
//        System.out.println(clazz);
//
//        Teacher teacher = query.queryTeacher(1L);
//        System.out.println(teacher);
//        Set<Clazz> clazzs=teacher.getTclazzs();
//        for (Clazz clazz1:clazzs){
//            System.out.println(clazz1);
//        }

//        Student student = query.queryStudent(4L);
//        Clazz sclazz = student.getSclazz();
//        System.out.println(sclazz);
//        System.out.println(student);

//        List<Clazz> clazzes = query.queryAllClazz();
//            for (Clazz clazz1:clazzes){
//            System.out.println(clazz1);
//                Set<Student> students = clazz1.getStudents();
//                for (Student student:students){
//                System.out.println(student);
//                }
//            }


//        Student student=new Student();
//        student.setSname("张三丰");
//        student.setSage(15);
//        student.setSsex("男");


//        Clazz clazz = this.query.queryClazz(2L);
//        student.setSclazz(clazz);
//        insert.insertStudent(student);

        Clazz clazz=new Clazz();
        clazz.setCname("一年三班");
//        insert.insertClazz(clazz);
        insert.insertClazzAndC2t(clazz,2);

//        insert.insertC2t(25,1);
//        throw new RuntimeException();
    }
}
