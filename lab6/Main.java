package lab6;

import java.io.*;
import java.util.Vector;

public class Main {
    public static void main(String[] args) throws IOException, FileNotFoundException, ClassNotFoundException {
        File sin = new File("./lab6/sin.txt");
        File input = new File("./lab6/input.txt");
        sin.createNewFile();
        PrintWriter sinWriter = new PrintWriter(sin);
        for (int i = 0; i < 361; ++i) {
            sinWriter.println(Math.sin(i));
        }
        sinWriter.close();
        BufferedReader sinReader = new BufferedReader(new FileReader(sin));
        BufferedReader inputReader = new BufferedReader(new FileReader(input));

        Vector<Double> sinValues = new Vector<Double>();

        String line;
        while((line = sinReader.readLine()) != null) {
            double sinValue = Double.parseDouble(line);
            sinValues.add(sinValue);
        }
        int degree = Integer.parseInt(inputReader.readLine());

        System.out.println(sinValues.get(degree));
        
        sinReader.close();
        inputReader.close();

        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("./lab6/sin2.dat"));
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("./lab6/sin2.dat"));
        objectOutputStream.writeObject(sinValues);
        objectOutputStream.writeObject(sinValues);
        Vector<Double> vector = new Vector<Double>();
        Object readedValue = objectInputStream.readObject();

        if (readedValue instanceof Vector<?>) {
            vector = (Vector<Double>) readedValue;
            System.out.println(vector);
        }
        else {
            System.out.println("Error, unable to convert data");
        }

        objectOutputStream.close();
        objectInputStream.close();
    }
}