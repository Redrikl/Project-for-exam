package com.example.projectteorver;
import org.apache.poi.xwpf.usermodel.*;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Paths;
import java.io.FileOutputStream;
import java.util.Random;
import java.io.File;

public class WordWorker {
  private int seed;
public WordWorker(int seed){
    this.seed =seed;
};
    public void createVariant(String adres,boolean[] check) {

        for (int i=0;i<check.length;i++)
            System.out.print(check[i]+" ");
        XWPFDocument documentV = new XWPFDocument();
        XWPFDocument documentA = new XWPFDocument();
        XWPFParagraph paragraph = documentV.createParagraph();
        XWPFParagraph paragraphA = documentA.createParagraph();
        XWPFRun run = paragraph.createRun();
        XWPFRun runA = paragraphA.createRun();
        run.setText("Вариант №"+seed);
        run.addCarriageReturn();
        runA.setText("Ответы для Варианта №"+seed);
        runA.addCarriageReturn();
        int g=1;
        if ( check[0] ) {
            A1 a1 = new A1(seed);
            XWPFParagraph paragraph1 = documentV.createParagraph();
            XWPFRun run1 = paragraph1.createRun();
            run1.setText(g+a1.get());
            run1.addCarriageReturn();
            runA.setText(g+a1.aswer());
            runA.addCarriageReturn();
            g++;
        }
        if ( check[1] ) {
            A2 a2 = new A2(seed);
            XWPFParagraph paragraph1 = documentV.createParagraph();
            XWPFRun run1 = paragraph1.createRun();
            run1.setText(g+a2.get());
            run1.addCarriageReturn();
            runA.setText(g+a2.aswer());
            runA.addCarriageReturn();
            g++;
        }
        if ( check[2] ) {
            A3 a3 = new A3(seed);
            XWPFParagraph paragraph1 = documentV.createParagraph();
            XWPFRun run1 = paragraph1.createRun();
            run1.setText(g+a3.get());
            run1.addCarriageReturn();
            runA.setText(g+a3.aswer());
            runA.addCarriageReturn();
            g++;
        }
        if ( check[3] ) {
            A4 a4=new A4(seed);
            XWPFParagraph paragraph1 = documentV.createParagraph();
            XWPFRun run1 = paragraph1.createRun();
            run1.setText(g+a4.get());
            run1.addCarriageReturn();
            runA.setText(g+a4.aswer());
            runA.addCarriageReturn();
            g++;
        }
        if ( check[4] ) {
            A5 a5 = new A5(seed);
            XWPFParagraph paragraph1 = documentV.createParagraph();
            XWPFRun run1 = paragraph1.createRun();
            run1.setText(g+a5.get());
            run1.addCarriageReturn();
            runA.setText(g+a5.aswer());
            runA.addCarriageReturn();
            g++;
        }
        if ( check[5] ) {
            A6 a6 = new A6(seed);
            XWPFParagraph paragraph1 = documentV.createParagraph();
            XWPFRun run1 = paragraph1.createRun();
            run1.setText(g+a6.get());
            run1.addCarriageReturn();
            runA.setText(g+a6.aswer());
            runA.addCarriageReturn();
            g++;
        }
        if ( check[6] ) {
            A7 a7 = new A7(seed);
            XWPFParagraph paragraph1 = documentV.createParagraph();
            XWPFRun run1 = paragraph1.createRun();
            run1.setText(g+a7.get());
            run1.addCarriageReturn();
            runA.setText(g+a7.aswer());
            runA.addCarriageReturn();
            g++;
        }
        if ( check[7] ) {
            A8 a8 = new A8(seed);
            XWPFParagraph paragraph1 = documentV.createParagraph();
            XWPFRun run1 = paragraph1.createRun();
            run1.setText(g+a8.get());
            run1.addCarriageReturn();
            runA.setText(g+a8.aswer());
            runA.addCarriageReturn();
            g++;
        }
        if ( check[8] ) {
            A9 a9 = new A9(seed);
            XWPFParagraph paragraph1 = documentV.createParagraph();
            XWPFRun run1 = paragraph1.createRun();
            run1.setText(g+a9.get());
            run1.addCarriageReturn();
            runA.setText(g+a9.aswer());
            runA.addCarriageReturn();
            g++;
        }
        if ( check[9] ) {
            A10 a10 = new A10(seed);
            XWPFParagraph paragraph1 = documentV.createParagraph();
            XWPFRun run1 = paragraph1.createRun();
            run1.setText(g+a10.get());
            run1.addCarriageReturn();
            runA.setText(g+a10.aswer());
            runA.addCarriageReturn();
            g++;
        }
        if ( check[10] ) {
            A11 a11 = new A11(seed);
            XWPFParagraph paragraph1 = documentV.createParagraph();
            XWPFRun run1 = paragraph1.createRun();
            run1.setText(g+a11.get());
            run1.addCarriageReturn();
            runA.setText(g+a11.aswer());
            runA.addCarriageReturn();
            g++;
        }
        if ( check[11] ) {
            A12 a12 = new A12(seed);
            XWPFParagraph paragraph1 = documentV.createParagraph();
            XWPFRun run1 = paragraph1.createRun();
            run1.setText(g+a12.get());
            run1.addCarriageReturn();
            runA.setText(g+a12.aswer());
            runA.addCarriageReturn();
            g++;
        }
        if ( check[12] ) {
            A13 a13 = new A13(seed);
            XWPFParagraph paragraph1 = documentV.createParagraph();
            XWPFRun run1 = paragraph1.createRun();
            run1.setText(g+a13.get());
            run1.addCarriageReturn();
            runA.setText(g+a13.aswer());
            runA.addCarriageReturn();
            g++;
        }
        if ( check[13] ) {
            A14 a14 = new A14(seed);
            XWPFParagraph paragraph1 = documentV.createParagraph();
            paragraph1.isKeepNext();
            XWPFRun run1 = paragraph1.createRun();
            run1.setText(g+a14.get());



            // create table for X
            XWPFTable tableX = documentV.createTable();
            tableX.setCellMargins(200, 200, 200, 200);

            // create first row
            XWPFTableRow rowX0 = tableX.getRow(0);
            rowX0.setCantSplitRow(true);
            rowX0.getCell(0).setText("X");
            rowX0.addNewTableCell().setText(String.valueOf(a14.getX()[0]));
            rowX0.addNewTableCell().setText(String.valueOf(a14.getX()[1]));
            rowX0.addNewTableCell().setText(String.valueOf(a14.getX()[2]));
            // create second row
            XWPFTableRow rowX1 = tableX.createRow();
            rowX1.setCantSplitRow(true);
            rowX1.getCell(0).setText("p");
            rowX1.getCell(1).setText(String.format("%.1f",a14.getPX()[0]));
            rowX1.getCell(2).setText(String.format("%.1f",a14.getPX()[1]));
            rowX1.getCell(3).setText(String.format("%.1f",a14.getPX()[2]));


            //Чтобы вторую таблицу не переносило
            XWPFParagraph paragraphH = documentV.createParagraph();
            paragraphH.isKeepNext();
            XWPFRun runH = paragraph1.createRun();
            runH.addCarriageReturn();
            //runH.addCarriageReturn();
            // runH.addCarriageReturn();



            // create table for Y
            XWPFTable tableY = documentV.createTable();
            tableY.setCellMargins(200, 200, 200, 200);

            // create first row
            XWPFTableRow rowY0 = tableY.getRow(0);
            rowY0.setCantSplitRow(true);
            rowY0.getCell(0).setText("Y");
            rowY0.addNewTableCell().setText(String.valueOf(a14.getY()[0]));
            rowY0.addNewTableCell().setText(String.valueOf(a14.getY()[1]));

            // create second row
            XWPFTableRow rowY1 = tableY.createRow();
            rowY1.setCantSplitRow(true);
            rowY1.getCell(0).setText("p");
            rowY1.getCell(1).setText(String.format("%.1f",a14.getPY()[0]));
            rowY1.getCell(2).setText(String.format("%.1f",a14.getPY()[1]));



            XWPFParagraph paragraph2 = documentV.createParagraph();
            paragraph2.isKeepNext();
            XWPFRun run2 = paragraph2.createRun();
            run.addCarriageReturn();
            runA.setText(g+a14.aswer());
            runA.addCarriageReturn();
            g++;
        }
        if ( check[14] ) {
            A15 a15 = new A15(seed);
            XWPFParagraph paragraph1 = documentV.createParagraph();
            XWPFRun run1 = paragraph1.createRun();
            run1.setText(g+a15.get());
            run1.addCarriageReturn();
            runA.setText(g+a15.aswer());
            runA.addCarriageReturn();
            g++;
        }
        if ( check[15] ) {
            A16 a16 = new A16(seed);
            XWPFParagraph paragraph1 = documentV.createParagraph();
            XWPFRun run1 = paragraph1.createRun();
            run1.setText(g+a16.get());
            run1.addCarriageReturn();
            runA.setText(g+a16.aswer());
            runA.addCarriageReturn();
            g++;
        }
        if ( check[16] ) {
            A17 a17 = new A17(seed);
            XWPFParagraph paragraph1 = documentV.createParagraph();
            XWPFRun run1 = paragraph1.createRun();
            run1.setText(g+a17.get());
            run1.addCarriageReturn();
            runA.setText(g+a17.aswer());
            runA.addCarriageReturn();
            g++;
        }
        if ( check[17] ) {
            A18 a18 = new A18(seed);
            XWPFParagraph paragraph1 = documentV.createParagraph();
            XWPFRun run1 = paragraph1.createRun();
            run1.setText(g+a18.get());
            run1.addCarriageReturn();
            runA.setText(g+a18.aswer());
            runA.addCarriageReturn();
            g++;
        }
        if ( check[18] ) {
            A19 a19 = new A19(seed);
            XWPFParagraph paragraph1 = documentV.createParagraph();
            XWPFRun run1 = paragraph1.createRun();
            run1.setText(g+a19.get());
            run1.addCarriageReturn();
            runA.setText(g+a19.aswer());
            runA.addCarriageReturn();
            g++;
        }
        if ( check[19] ) {
            A20 a20 = new A20(seed);
            XWPFParagraph paragraph1 = documentV.createParagraph();
            XWPFRun run1 = paragraph1.createRun();
            run1.setText(g+a20.get());
            run1.addCarriageReturn();
            runA.setText(g+a20.aswer());
            runA.addCarriageReturn();
            g++;
        }
        String filePath;
        String filePathA;
        if (adres.isEmpty()) {
            System.out.println("................");
            String userHome = System.getProperty("user.home");
            String desktopPath = Paths.get(userHome, "Desktop").toString();
            filePath = Paths.get(desktopPath,"Вариант_"+seed + ".docx").toString();
            filePathA = Paths.get(desktopPath,"Ответы_"+seed + ".docx").toString();
            File directory = new File(desktopPath);
            if (!directory.exists()) {
                directory.mkdirs();
            }
        } else {
            filePath = adres + "\\" + "Вариант_" + seed + ".docx";
            filePathA= adres + "\\" + "Ответы_" + seed + ".docx";
        }
        System.out.println(filePath);
        try (FileOutputStream out = new FileOutputStream(filePath)) {
            documentV.write(out);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try (FileOutputStream out = new FileOutputStream(filePathA)) {
            documentA.write(out);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}