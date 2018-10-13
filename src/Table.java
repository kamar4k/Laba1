import java.util.*;

/**
 * Created by Андрюха on 04.10.2018.
 */
public class Table {
    public char [] alphArr = new char[66];
    public double [] values = new double[66];

    public int numInTable(char c)
    {
        for (int i = 0; i < alphArr.length; i++)
        {
            if (c == alphArr[i])
            {
                return i;
            }
        }
        return -1;
    }


    public String show(int i)
    {
        return "**" + alphArr[i] + "**" + values[i] + "|***|";
    }

    public void sort()
    {
        for (int i = 0; i < alphArr.length - 1; i++)
        {
            for (int j = 1; j < alphArr.length; j++)
            {
                if (values[i] < values[j])
                {
                    char arrTemp = alphArr[i];
                    double valTemp = values[i];
                    alphArr[i] = alphArr[j];
                    values[i] = values[j];
                    alphArr[j] = arrTemp;
                    values[j] = valTemp;
                }
            }
        }
    }

    public Table(String text)
    {

    }

    public void setArrays(String text)
    {
        char[] arr = text.toCharArray();

        for (int i = 0; i < alphArr.length; i++)
        {
            int k = 0;
            for (int j = 0; j < arr.length; j++)
            {
                if (alphArr[i] == arr[j]) k++;
            }
            values[i] = (double)k / text.length() * 1000;
        }

        sort();
    }


}
