package test3;

import test3.collectionTest.Util;

import java.util.List;
import java.util.Map;


public class StudentTest
{
    public static void main(String[] args)
    {
//        List<StudentV2> list = Util.getRandomStudents(5);
//        Map<String, StudentV2> map = Util.makeStudentMap(list);

        //测试搜索时间
        int n = 10000000;
        Map<String, Student> map = Util.generateStudentMap(n);
        map.put("asd", Util.getARandomStudents());


        long start1, start2;
        long end1, end2;
/*

        start1 = System.nanoTime();
        Util.searchStudent(map, "asd");
        end1 = System.nanoTime();
*/

        List<Student> list = Util.getRandomStudents(n);
        Student s = Util.getARandomStudents();
        list.add(s);

        start2 = System.nanoTime();
        Util.searchName(list, s.getName());
        end2 = System.nanoTime();

//        System.out.println(end1 - start1);
        System.out.println(end2 - start2);
        System.out.println("done");


    }
}
