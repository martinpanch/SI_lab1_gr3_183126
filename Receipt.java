import java.io.*;
import java.util.LinkedList;
import java.util.List;

public class Receipt {
    File file = new File("itemss.csv");

    BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
    String line="";
    String csvSplit=",";

    List<Item> Products = new LinkedList<>();

    public Receipt() throws FileNotFoundException {
    }

    public void readFromFile() throws IOException {
        while((line = bufferedReader.readLine())!=null){
           String[] cells  = line.split(csvSplit);

            Products.add(new Item(Integer.parseInt(cells[0]) , cells[1] ,(double)Integer.parseInt(cells[2])  , 'B'));

        }

    }

    public void printCsvFile() {
        System.out.println(Products);
    }

    public void deleteItem(int id){
        Products.remove(id-1);
    }


}