import java.util.*;

/**
 * Created by Андрюха on 05.10.2018.
 */
public class Bigram {

    public String[] bigramInt = {"ов", "но", "ко", "ен", "во"};
    public String[] bigramText = new String[5];
    Map<Integer, String> bigrams = new HashMap<>();
    List<Integer> biNum = new ArrayList<>();
    List<String> biString = new ArrayList<>();
    List<String> biWithNum = new ArrayList<>();
    List<Character> listCh2 = new ArrayList<>();

    public Bigram() {

    }

    public String bigram(String text) {


        char [] textArr = text.toCharArray();

        for (int i = 0; i < textArr.length - 1; i++)
        {
            String temp = String.valueOf(textArr[i]);
            temp += String.valueOf(textArr[i+1]);
            biString.add(temp);
        }

        String [] allBigrams = new String[biString.size()];

        for (int i = 0; i < biString.size(); i++)
        {
            allBigrams[i] = biString.get(i);
        }

        for (int i = 0; i < allBigrams.length - 1; i++)
        {
            int k = 1;
            for (int j = i+1; j < allBigrams.length; j++)
            {
                if (allBigrams[i] == allBigrams[j])
                {
                    k++;
                }
                biNum.add(k);
                biWithNum.add(allBigrams[i]);
            }
        }

        int [] arrNum = new int[biNum.size()];
        String [] arrBiWithNum = new String[biWithNum.size()];

        for (int i = 0; i < arrNum.length; i++)
        {
            arrNum[i] = biNum.get(i);
            arrBiWithNum[i] = biWithNum.get(i);
        }

        return "";
    }
}
