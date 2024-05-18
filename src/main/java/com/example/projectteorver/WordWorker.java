package com.example.projectteorver;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;

import java.io.FileOutputStream;
import java.io.IOException;

import java.io.FileOutputStream;
import java.util.Random;


public class WordWorker {

    public static void createVariant(int seed) {
        System.out.println("!!!!!!!!!!!!");
        A1 ferst= new A1(seed);
        A2 two = new A2(seed);
        A3 three = new A3(seed);
        A4 four = new A4(seed);
        A8 eight = new A8(seed);
        A9 nine = new A9(seed);
        XWPFDocument document = new XWPFDocument();
        XWPFParagraph paragraph = document.createParagraph();
        paragraph.createRun().setText(ferst.get()+"\n"+two.get()+"\n"+three.get()+"\n"+two.aswer()+"\n"+nine.aswer()+"\n");

        try (FileOutputStream out = new FileOutputStream("createdocument.docx")) {
            document.write(out);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}