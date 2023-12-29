package org.Class21;

public class TesterClass {

    public static void main(String[] args) {
        // Creating instances of each file type
        File javaFile = new JavaFile("Sample.java", 1530);
        File wordFile = new WordFile("Document.doc", 2530);
        File pdfFile = new PdfFile("Report.pdf", 3072);

        // Calling methods on each file type
        javaFile.open();
        javaFile.edit();
        javaFile.close();

        System.out.println();

        wordFile.open();
        wordFile.edit();
        wordFile.close();

        System.out.println();

        pdfFile.open();
        pdfFile.edit();
        pdfFile.close();
    }
}

