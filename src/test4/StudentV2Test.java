package test4;

import test3.Student;
import test3.collectionTest.Util;

import java.util.*;

public class StudentV2Test
{
    public static void main(String[] args)
    {
        //(2)随机生成100个Student对象放入students数组。
        int size = 100;
        StudentV2[] stuV2s = new StudentV2[size];
        Student stuTmp;
        for (int i = 0; i < stuV2s.length; i++)
        {
            stuTmp = Util.getARandomStudents();
            stuV2s[i] = new StudentV2(stuTmp.getName(), stuTmp.getAge(), Util.getRandomNumber(100));
        }

        //(3)将students数组转换成studentList(List类型)。
        List<StudentV2> stuV2list = Arrays.asList(stuV2s);

        //(4)使用Collections.sort对student的成绩进行排序。
//        Comparator<StudentV2> com = (o1, o2) -> o1.getGrade() - o2.getGrade();
        Collections.sort(stuV2list);

        //(5)使用Collections的min和max方法找到成绩最高的和成绩最低学生。
        System.out.println(Collections.max(stuV2list));
        System.out.println(Collections.min(stuV2list));

        //(6)使用Collections的binarySearch查找成绩等于60的学生。
        System.out.println(Collections.binarySearch(stuV2list, new StudentV2("", 0, 60)));

        //(7)编写方法从studentList找出grade小于60的学生，放入otherList。
        List<StudentV2> otherList = pick(stuV2list);

        //(9)使用Collections的shuffle方法，打乱studentList中学生排列的顺序。
        Collections.shuffle(stuV2list);

        //(8)使用List的removeAll方法，从studentList中移除otherList。
        otherList.removeAll(stuV2list);

        //(10)将studentList转换为数组。
        StudentV2[] tmpArr = new StudentV2[stuV2list.size()];
        stuV2list.toArray(tmpArr);

    }

    public static List<StudentV2> pick(List<StudentV2> list)
    {
        List<StudentV2> studentV2List = new ArrayList<>();
        for (StudentV2 x : list)
        {
            if (x.getGrade() < 60)
            {
                studentV2List.add(x);
            }
        }

        return studentV2List;
    }
}
