package com.example.projectteorver;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;
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

        for(int i=0;i<check.length;i++)
            System.out.print(check[i]+" ");
        XWPFDocument documentV = new XWPFDocument();
        XWPFDocument documentA = new XWPFDocument();
        XWPFParagraph paragraph = documentV.createParagraph();
        XWPFParagraph paragraphA = documentA.createParagraph();
        XWPFRun runA = paragraphA.createRun();
        XWPFRun run = paragraph.createRun();
        run.setText("Вариант №"+seed);
        run.addCarriageReturn();
        runA.setText("Ответы для Варианта №"+seed);
        runA.addCarriageReturn();
        int g=1;
        if(check[0]){
            A1 a1=new A1(seed);
            run.setText(g+a1.get());
            run.addCarriageReturn();
            runA.setText(g+a1.aswer());
            runA.addCarriageReturn();
            g++;
        }
        if(check[1]){
            A2 a2=new A2(seed);
            run.setText(g+a2.get());
            run.addCarriageReturn();
            runA.setText(g+a2.aswer());
            runA.addCarriageReturn();
            g++;
        }
        if(check[2]){
            A3 a3 = new A3(seed);
            run.setText(g+a3.get());
            run.addCarriageReturn();
            runA.setText(g+a3.aswer());
            runA.addCarriageReturn();
            g++;
        }
        if(check[3]){
            A4 a4=new A4(seed);
            run.setText(g+a4.get());
            run.addCarriageReturn();
            runA.setText(g+a4.aswer());
            runA.addCarriageReturn();
            g++;
        }
        if(check[4]){
            A5 a5=new A5(seed);
            run.setText(g+a5.get());
            run.addCarriageReturn();
            runA.setText(g+a5.aswer());
            runA.addCarriageReturn();
            g++;
        }
        if(check[5]){
            A6 a6=new A6(seed);
            run.setText(g+a6.get());
            run.addCarriageReturn();
            runA.setText(g+a6.aswer());
            runA.addCarriageReturn();
            g++;
        }
        if(check[6]){
            A7 a7=new A7(seed);
            run.setText(g+a7.get());
            run.addCarriageReturn();
            runA.setText(g+a7.aswer());
            runA.addCarriageReturn();
            g++;
        }
        if(check[7]){
            A8 a8=new A8(seed);
            run.setText(g+a8.get());
            run.addCarriageReturn();
            runA.setText(g+a8.aswer());
            runA.addCarriageReturn();
            g++;
        }
        if(check[8]){
            A9 a9=new A9(seed);
            run.setText(g+a9.get());
            run.addCarriageReturn();
            runA.setText(g+a9.aswer());
            runA.addCarriageReturn();
            g++;
        }
        if(check[9]){
            A10 a10=new A10(seed);
            run.setText(g+a10.get());
            run.addCarriageReturn();
            runA.setText(g+a10.aswer());
            runA.addCarriageReturn();
            g++;
        }
        if(check[10]){
            A11 a11=new A11(seed);
            run.setText(g+a11.get());
            run.addCarriageReturn();
            runA.setText(g+a11.aswer());
            runA.addCarriageReturn();
            g++;
        }
        if(check[11]){
            A12 a12=new A12(seed);
            run.setText(g+a12.get());
            run.addCarriageReturn();
            runA.setText(g+a12.aswer());
            runA.addCarriageReturn();
            g++;
        }
        if(check[12]){
            A13 a13=new A13(seed);
            run.setText(g+a13.get());
            run.addCarriageReturn();
            runA.setText(g+a13.aswer());
            runA.addCarriageReturn();
            g++;
        }
        if(check[13]){
            A14 a14=new A14(seed);
            run.setText(g+a14.get());
            run.addCarriageReturn();
            runA.setText(g+a14.aswer());
            runA.addCarriageReturn();
            g++;
        }
        if(check[14]){
            A15 a15=new A15(seed);
            run.setText(g+a15.get());
            run.addCarriageReturn();
            runA.setText(g+a15.aswer());
            runA.addCarriageReturn();
            g++;
        }
        if(check[15]){
            A16 a16=new A16(seed);
            run.setText(g+a16.get());
            run.addCarriageReturn();
            runA.setText(g+a16.aswer());
            runA.addCarriageReturn();
            g++;
        }
        if(check[16]){
            A17 a17=new A17(seed);
            run.setText(g+a17.get());
            run.addCarriageReturn();
            runA.setText(g+a17.aswer());
            runA.addCarriageReturn();
            g++;
        }
        if(check[17]){
            A18 a18=new A18(seed);
            run.setText(g+a18.get());
            run.addCarriageReturn();
            runA.setText(g+a18.aswer());
            runA.addCarriageReturn();
            g++;
        }
        if(check[18]){
            A19 a19=new A19(seed);
            run.setText(g+a19.get());
            run.addCarriageReturn();
            runA.setText(g+a19.aswer());
            runA.addCarriageReturn();
            g++;
        }
        if(check[19]){
            A20 a20=new A20(seed);
            run.setText(g+a20.get());
            run.addCarriageReturn();
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