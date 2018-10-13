import java.util.Iterator;

/**
 * Created by Андрюха on 04.10.2018.
 */
public class Analiz {


    public Analiz() {

    }

    public String analiz(Table tPart, Table tBook, String part, String book)
    {
        Switch sw = new Switch();
        char [] arrPart = part.toCharArray();
        char [] arrBook = book.toCharArray();

        for (int i = 0; i < part.length(); i++)
        {
            if(sw.key(arrPart[i]) >=0) tPart.alphArr[sw.key(arrPart[i])] = arrPart[i];
        }

        for (int i = 0; i < book.length(); i++)
        {
            if(sw.key(arrBook[i]) >=0) tBook.alphArr[sw.key(arrBook[i])] = arrBook[i];
        }

        tBook.setArrays(book);
        tPart.setArrays(part);

        for (int i = 0; i < 66; i++)
        {
            System.out.println(tPart.alphArr[i] + "***" + tPart.values[i]);
        }

        for (int i = 0; i < arrPart.length; i++)
        {
            for (int j = 0; j < tBook.alphArr.length; j++)
            {
                if (arrPart[i] == tPart.alphArr[j])
                {
                    arrPart[i] = tBook.alphArr[j];
                    break;
                }

            }
        }
        return new String(arrPart);
    }
}