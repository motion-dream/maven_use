package com.cn.soft19;

import com.soft19.MyMath;
import org.apache.poi.hwpf.extractor.WordExtractor;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

public class Test {
    public static void main(String ar[])throws Exception{
        String path="src/main/resources/上课.doc";
        InputStream is =
                new FileInputStream(new File(path));
        WordExtractor we=new WordExtractor(is);
        String [] ss=we.getParagraphText();
        for (String s : ss) {
            System.out.println("**"+s);
        }
    }
}
