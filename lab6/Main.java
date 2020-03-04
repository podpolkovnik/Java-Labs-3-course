package lab6;

import java.io.*;
import java.util.Random;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        File sin = new File("./lab6/sin.txt");
        File input = new File("./lab6/input.txt");
        try {
            sin.createNewFile();
            input.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            Random rand = new Random();
            PrintWriter sinWriter = new PrintWriter(sin);
            PrintWriter inputWriter = new PrintWriter(input);
            for (int i = 0; i < 361; ++i) {
                sinWriter.println(Math.sin(i));
            }
            inputWriter.println(rand.nextInt(360));
            sinWriter.close();
            inputWriter.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
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
            Vector<Double> vector = new Vector<Double>();
            vector = (Vector<Double>) objectInputStream.readObject();
            System.out.println(vector);

            objectOutputStream.close();
            objectInputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}