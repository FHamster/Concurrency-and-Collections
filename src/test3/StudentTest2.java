package test3;

import test3.collectionTest.Util;

import java.security.Key;
import java.util.Iterator;
import java.util.List;
import java.util.Map;


public class StudentTest2
{
    public static void main(String[] args)
    {
        Map<String, Student> map = Util.generateStudentMap(100);

        Iterator<String> stringIt = map.keySet().iterator();

        System.out.println("key\n");
        //前十个key
        int i = 0;
        while (stringIt.hasNext() && i < 10)
        {
            System.out.println(stringIt.next());
            i++;
        }

        System.out.println("value\n");
        //前十个value
        i = 0;
        Iterator<Student> studentIt = map.values().iterator();
        while (studentIt.hasNext() && i < 10)
        {
            System.out.println(studentIt.next());
            i++;
        }

        System.out.println("entry\n");
        //前十个entry
        i = 0;
        Iterator<Map.Entry<String, Student>> entryIt = map.entrySet().iterator();
        while (entryIt.hasNext() && i < 10)
        {
            System.out.println(entryIt.next());
            i++;
        }

    }
}
