package test4;

public class StudentV2 implements Comparable<StudentV2>
{
    private String name;
    private int age;
    private int grade;


    public StudentV2(String name, int age, int grade)
    {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public int getGrade()
    {
        return grade;
    }

    public void setGrade(int grade)
    {
        this.grade = grade;
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
    public String toString()
    {
        return String.format("name:%s,age:%d,grade:%d", name, age, grade);
    }


    @Override
    public int compareTo(StudentV2 o)
    {
        return grade - o.grade;
    }}
