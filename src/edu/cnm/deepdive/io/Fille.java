package edu.cnm.deepdive.io;


import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
// import java.sql.Struct;
import java.util.LinkedList;
import java.util.List;

public class Fille {


  private static final String FILENAME = "largest-product-data.txt";

  public static String[] getline(String filename)
      throws FileNotFoundException, IOException {

    String[] result = null;
    try (
        FileInputStream inStream = new FileInputStream(filename);
        InputStreamReader reader = new InputStreamReader(inStream);
        BufferedReader buffer = new BufferedReader(reader);
    ) {

      List<String> lines = new LinkedList<>();

      String line;
      while ((line = buffer.readLine()) != null) {
        line = line.trim();
        if (!line.isEmpty()) {
          lines.add(line);
        }
      }
        return lines.toArray(new String[0]);
        /*
         for (String line = buffer.readLine();
         line ! = null;
         line = buffer.readLine()) { another way of writing the while condition

      }
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }  /finally {
      try {
        if (buffer != null) {
          buffer.close();
        }
        if (reader != null) {
          reader.close();
        }
        if (inStream != null) {
          inStream.close();
        }
      } catch (IOException e) {
        e.printStackTrace();
      }
    }*/

      }
    }

  public static void main(String[] args)  {
    try {
      for (String line : getline(FILENAME)) {
        System.out.println(line);
      }
    } catch (IOException e) {
      e.printStackTrace();
    }

  }

}
