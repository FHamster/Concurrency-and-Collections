package test3.collectionTest;

import test3.Student;

import java.util.*;

public class Util
{

    /**
     * @param
     * @return 返回分布在[0, upLimit]的随机整数
     */
    public static int getRandomNumber(int upLimit)
    {
        return new Random().nextInt(upLimit + 1);
    }

    /**
     * @param min
     * @param max
     * @return 返回分布在[min, max]的随机整数
     */
    public static int getRandomNumber(int min, int max)
    {
        if (min > max)
        {
            throw new IllegalArgumentException("min =" + min + ">" + "max=" + max);
        }
        return min + new Random().nextInt(max + 1 - min);
    }

    /**
     * @param min
     * @param max
     * @return 返回长度在min到max之间随机名字
     */
    public static String getRandomName(int min, int max)
    {
        StringBuilder sb = new StringBuilder();

        int n = getRandomNumber(min, max);

        while (n > 0)
        {
            sb.append((char) getRandomNumber('a', 'z'));
            n--;
        }
        return sb.toString();
    }

    /**
     * @param stuList 将转换为mao的student list
     * @return 由list转换成的student map
     */
    public static Map makeStudentMap(List<Student> stuList)
    {
        Map<String, Student> map = new HashMap<>();


        Iterator<Student> stuIt = stuList.iterator();

        while (stuIt.hasNext())
        {
            Student stuTmp = stuIt.next();
            map.put(stuTmp.getName(), stuTmp);
//            System.out.println(stuTmp);
        }
        return map;
    }

    public static Student getARandomStudents()
    {
        return new Student(Util.getRandomName(1, 100), Util.getRandomNumber(5, 25));
    }

    /**
     * @param n
     * @return 生成随机学生
     */
    public static List<Student> getRandomStudents(int n)
    {
        List<Student> studentList = new ArrayList<>();
        Student student;
        for (int i = 0; i < n; i++)
        {
            student = getARandomStudents();
            studentList.add(student);
        }
        return studentList;
    }

    /**
     * @param stuMap
     * @param name
     * @return 根据指定的name返回对应的学生，如果没有找到返回null
     */
    public static Student searchStudent(Map<String, Student> stuMap, String name)
    {
        return stuMap.get(name);
    }

    public static Student searchName(List<Student> stuList, String name)
    {
        return stuList.get(stuList.indexOf(name));
    }


    /**
     * @param n
     * @return 生成n个字符串的NameList并返回
     */
    public static List generateNameList(int n)
    {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < n; i++)
        {
            list.add(getRandomName(1, 100));
        }

        return list;
    }

    /**
     * @param n
     * @return 生成包含n个键的的StudentMap并返回。
     */
    public static Map generateStudentMap(int n)
    {
        List<Student> students = getRandomStudents(n);
        return makeStudentMap(students);
    }
}
