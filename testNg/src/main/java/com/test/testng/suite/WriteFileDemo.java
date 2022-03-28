package com.test.testng.suite;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteFileDemo {

    public static void main(String[] args) throws IOException {

        File file = new File("/user/liuhui/StudyProjects/study_notes/testNg/src/main/resources/files.txt");
        try {
            file.createNewFile();
        } catch (IOException e1) {
            e1.printStackTrace();
        }
        try{
            FileOutputStream fos = new FileOutputStream(file);

            String sr = "还记得那场音乐会的烟火，还记得那个凉凉的深秋";
            fos.write(sr.getBytes());
            fos.close();

        }catch (FileNotFoundException e){
            e.printStackTrace();
        }






    }
}