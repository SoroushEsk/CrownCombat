package com.tokyo.game.tokyo_game.log;

import java.io.FileWriter;
import java.io.IOException;

public class TestLog {

    FileWriter file;
    public TestLog() throws IOException {
        file = new FileWriter(".\\log\\test.log");
        file.flush();
    }
    public void print(String input) throws IOException{
        file.append(input );
        file.append("\n");
    }
    public void close() throws IOException{
        file.close();
    }
}