import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by Андрюха on 04.10.2018.
 */
public class Main {

    static Alph alph = new Alph();



    static String read(String name)
    {
        String text = "";

        try{
            FileInputStream fstream = new FileInputStream(name);
            BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
            String strLine;

            while ((strLine = br.readLine()) != null){
                text += strLine + "\n";
            }
        }catch (IOException e){
            System.out.println("Ошибка");
        }

        return text;
    }

    static void task4()
    {
        Cezar cezar = new Cezar();
        String text = read("glava.txt");
        String encrText = cezar.encrypt(text, alph, 3);

        Bigram bigram = new Bigram();
        System.out.println("_________________________________\n" + bigram.bigram(encrText));
    }

    public static void task3()
    {
        String part = read("glava.txt");
        String book = read("tom1.txt");

        Cezar cezar = new Cezar();
        String encrPart = cezar.encrypt(part, alph, 3);

        Table tBoook = new Table(book);
        Table tPart = new Table(encrPart);

        Analiz analiz = new Analiz();
        System.out.println(analiz.analiz(tPart, tBoook, part, book));
    }

    public static void task12()
    {
        int key = 4;
        String text = "Не важно, что говорят крысы за спиной у кисы!";


        Cezar cezar = new Cezar();

        System.out.println("Исходный текст:\n" + text);

        String encrText = cezar.encrypt(text, alph, key);

        System.out.println("Зашифрованный текст:");
        System.out.println(encrText);

        String decrText = cezar.decrypt(encrText, alph, key);
        System.out.println("Дешифрованный текст:");
        System.out.println(decrText);
    }

    public static void main(String [] args)
    {
        //task12();
        //task3();
        task4();
    }

}
