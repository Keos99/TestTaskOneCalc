package mvc.model.impl;

import mvc.model.FileHandler;

import java.io.*;
import java.util.ArrayList;

public class MainModel implements FileHandler {
    private BufferedReader bufferedReader;

    @Override
    public File getFilePath(String path) {
        return new File(path);
    }

    @Override
    public ArrayList<Integer> processFile(File file) {
        ArrayList<Integer> result = new ArrayList<>();

        try {
            bufferedReader = new BufferedReader(new FileReader(file));
            while (bufferedReader.ready()) {
                result.add(Integer.parseInt(bufferedReader.readLine()));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }
}
