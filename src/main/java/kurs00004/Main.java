package kurs00004;

import java.io.*;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
//      System.out.println(bufferedReaderTest());
//      System.out.println(streamTokenizerTest());
//      saveText("Dev tekst");

        List<String> aList = new ArrayList<String>(32);
        List<String> bList = new LinkedList<String>();

        aList.add("przedmiot1");
        bList.add("przedmiot 2");

        System.out.println(aList);
        System.out.println(bList);
    }



    public static String bufferedReaderTest() {
        BufferedReader bfIn = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Wprowadź tekst i naciśnij enter");
        try {
            return bfIn.readLine();
        } catch (Exception e) {
            return "-1";
        }
    }

    public static String streamTokenizerTest()
    {
        StreamTokenizer streamTokenizer = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
        System.out.println("Wprowadź liczbę");
        try{
            streamTokenizer.nextToken();
            if(streamTokenizer.ttype == StreamTokenizer.TT_NUMBER)
            {
                return streamTokenizer.toString();
            }else{return "-1";}
        }
        catch (Exception e)
        {
            return "-1";
        }

    }

    public static void saveText (String text)
    {
        try
        {
            File file = new File("D:/text.txt");
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write(text);
            fileWriter.close();
        }catch (Exception e)
        {
            System.out.println(e);
        }
    }
}
