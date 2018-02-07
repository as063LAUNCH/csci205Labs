/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab12;

/**
 *
 * @author as063
 */
    
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

public class WordCount {
    private String filename;
    private File file;
    private int numChars;
    private int numLines;
    private int numWords;

    public WordCount(File file) {
        this.file = file;
        this.numChars = numChars;
        this.numLines = numLines;
        this.numWords = numWords;
    }

    public WordCount(String filename) {
        this.filename = filename;
        this.numChars = numChars;
        this.numLines = numLines;
        this.numWords = numWords;
    }
    
    public void doIt() {
       File fileName;
        if (this.filename.isEmpty()) {
            fileName = this.file;
        } else {
            fileName = new File(this.filename);
        }

        this.numChars = getNumChars(fileName);
        this.numWords = getNumWords(fileName);
        this.numLines = getNumLines(fileName);
    }
    
     

    public int getNumChars(File file) {
        FileReader fileReader = null;
        int numchar = 0;

        try {
            fileReader = new FileReader(file);
            while (fileReader.read() > -1) {
                numchar++;
            }

        } catch (FileNotFoundException ex) {
        } catch (IOException ex) {
        } finally {
            if (null != fileReader) {
                try {
                    fileReader.close();
                } catch (IOException ex) {
                }
            }
        }
        return numchar;
    }
        
       
    public int getNumLines(File file) {
        int numLines = 0;
        FileReader fileReader;
        try {
            fileReader = new FileReader(file);

            LineNumberReader lineNumReader = new LineNumberReader(fileReader);
            while (lineNumReader.readLine() != null) {
                numLines++;
            }
            lineNumReader.close();

            return numLines;
        } catch (FileNotFoundException ex) {
        } catch (IOException ex) {
        }
        return numLines;
    }

    public int getNumWords(File file) {
        int numWords = 0;
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader buffReader = new BufferedReader(fileReader);

            String line = buffReader.readLine();
            while (line != null) {
                String[] sec = line.split(" ");
                for (String s : sec) {
                    numWords++;
                }
                line = buffReader.readLine();
            }

        } catch (FileNotFoundException ex) {
        } catch (IOException ex) {
        }
        return numWords;
    }

    @Override
    public String toString() {
        String s = Integer.toString(this.numChars) + Integer.toString(
                this.numWords) + Integer.toString(this.numLines);
        return s;
    }

}
