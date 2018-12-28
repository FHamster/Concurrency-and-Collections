package test2;

import test2.NameDAOPack.NameDaoImpl;

import java.util.List;

public class NameDAOTest
{
    public static void main(String[] args)
    {
        String[] strings = {"asd", "5446", "123", "as65d", "ads65"};
        NameDaoImpl nameDao = new NameDaoImpl();

        List list = nameDao.getNameFromArray(strings);

        System.out.println("strings:asd at " + nameDao.searchName(list, "asd"));


        try
        {
            nameDao.removeFromList(list, -1);
        } catch (IllegalArgumentException e)
        {
            System.err.println("越下界情况");
        }

        try
        {
            nameDao.removeFromList(list, 6);
        } catch (IllegalArgumentException e)
        {
            System.err.println("越上界情况");
        }

        try
        {
            nameDao.removeFromList(list, 4);
        } catch (IllegalArgumentException e)
        {
            e.printStackTrace();
        }
    }
}
