package edu.cnm.deepdive.io;


import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
// import java.sql.Struct;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Fille {


  private static final String FILENAME = "largest-product-data.txt";

  public static String[] getLines(String filename)
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
      public static int[][] getMatrix(String[] lines, String delimiter) {
       int[][] data = new int[lines.length][];
       for (int i = 0; i <lines.length; i++) {
         String[] parts =lines[i].split(delimiter);
         int[] row = new int[parts.length];
         for (int j = 0; j <parts.length; j++) {
          row[j] = Integer.parseInt(parts[j]);
         }
         data[i] = row;
       }
       return data;
    }


  public static void main(String[] args)
    throws IOException {
    for (int[]  row: getMatrix(getLines(FILENAME),  "\\s")) {
        System.out.println(Arrays.toString(row));

    }


  }

}
