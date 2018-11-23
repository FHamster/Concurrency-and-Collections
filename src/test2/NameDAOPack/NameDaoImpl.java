package test2.NameDAOPack;

import test2.NameDAO;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NameDaoImpl implements NameDAO
{
    @Override
    public List getNameFromArray(String[] names)
    {

        List<String> nameList = new ArrayList<>();
        for (String it : names)
        {
            nameList.add(it);
        }
//        List<String> nameList = Arrays.asList(names);
        return nameList;
    }

    @Override
    public int searchName(List nameList, String name)
    {
        return nameList.indexOf(name);
    }

    @Override
    public boolean removeFromList(List nameList, int id) throws IllegalArgumentException
    {
        if (id > nameList.size() - 1 || id < 0)
        {
            throw new IllegalArgumentException();
        }
        System.out.println(nameList.remove(id)+" deleted");

        return true;
    }
}
