package com.epam.homework10;

import java.io.*;
import java.util.Scanner;

public class Serializator {
    Scanner sc1 = new Scanner(System.in);
    String fileName = sc1.nextLine();
    public boolean serialization(Books books) {

        boolean flag = false;

        File file = new File("C:\\Users\\Dell\\JavaHomework\\homework10\\" + fileName + ".txt");

        ObjectOutputStream oos = null;

        try {
            FileOutputStream fos = new FileOutputStream(file);
            if (fos != null) {
                oos = new ObjectOutputStream(fos);
                oos.writeObject(books);
                flag = true;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (oos != null) {
                try {
                    oos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        return flag;
    }

    public Books deserialization() throws InvalidObjectException {
        File file = new File("C:\\Users\\Dell\\JavaHomework\\homework10\\" + fileName + ".txt");
        ObjectInputStream ois = null;
        try {
            FileInputStream fis = new FileInputStream(file);
            if (fis != null) {
                ois = new ObjectInputStream(fis);
                Books books = (Books) ois.readObject();
                return books;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                ois.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        throw new InvalidObjectException("Obj failed");
    }
}
