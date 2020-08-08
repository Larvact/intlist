package org.toby.intlist.reader;

import org.toby.intlist.Constants;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Map;

public class IntListReader<S, T> implements TextFileReader{

    private final String testFilePath;
    private BufferedReader reader;
    private Map<S, T> fileDetails;

    public IntListReader(String textFilePath) {
        this.testFilePath = textFilePath;
        try {
            this.reader = new BufferedReader(new FileReader(this.testFilePath));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void readFile() {


    }

    public Map<S, T> getFileDetails() {
        return fileDetails;
    }
}
