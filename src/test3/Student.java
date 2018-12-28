package test3;


import java.util.Objects;

public class Student
{
    private String name;
    private int age;

    public Student(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

   /* public static List<StudentV2> getRandomStudents(int n)
    {
        List<StudentV2> studentList = new ArrayList<>();
        StudentV2 student;
        for (int i = 0; i < n; i++)
        {
            student = new StudentV2(Util.getRandomName(3, 5), Util.getRandomNumber(5, 25));
            studentList.add(student);
        }
        return studentList;
    }*/

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age &&
                Objects.equals(name, student.name);
    }

    @Override
    public String toString()
    {
        return String.format("name:%s,age:%d", name, age);
    }

    @Override
    public int hashCode()


    {

        return Objects.hash(name, age);
    }
}
