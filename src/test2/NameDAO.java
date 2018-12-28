package test2;

import java.util.List;

public interface NameDAO
{
    //将数组中的字符串放入列表，该方法需要使用ListIterator接口实现添加
    public List getNameFromArray(String[] names);

//在列表中搜索到与name相同的项目，就返回该name所在的序号，找不到返回-1。
    public int searchName(List nameList, String name);

//根据指定id，从列表中移除指定的项目，如果id指定错误(负数或者超出列表最大值)-，移除成功返回true
    public boolean removeFromList(List nameList, int id);
}
