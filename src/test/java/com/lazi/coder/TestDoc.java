//package com.lazi.coder;
//
//import java.io.File;
//import java.io.FileInputStream;
//import java.io.FileOutputStream;
//import java.util.Collections;
//
//import org.apache.poi.POITextExtractor;
//import org.apache.poi.hwpf.HWPFDocument;
//import org.apache.poi.hwpf.extractor.WordExtractor;
//import org.apache.poi.openxml4j.opc.OPCPackage;
//import org.apache.poi.xwpf.extractor.XWPFWordExtractor;
//import org.apache.poi.xwpf.usermodel.XWPFDocument;
//import org.apache.poi.xwpf.usermodel.XWPFParagraph;
//import org.apache.poi.xwpf.usermodel.XWPFRun;
//
///**
// * Created by vietnguyen on 7/11/2017.
// */
//public class TestDoc {
//    public static void main(String[] args) throws Exception {
//        //Create Blank workbook
//        XWPFDocument doc = new XWPFDocument(OPCPackage.open("C:\\AAA\\a.docx"));
//        for (XWPFParagraph p : doc.getParagraphs()) {
//            for (XWPFRun r : p.getRuns()) {
//                String text = r.getText(0);
//                System.out.println(text);
//                if (text!= null && text.contains("{{Name}}"))
//                {
//                    text = text.replace("{{Name}}", "viet");
//                    r.setText(text, 0);
//                    System.out.println(text);
//                }
//            }
//        }
//        doc.write(new FileOutputStream("C:\\AAA\\output.docx"));
//    }
//}
