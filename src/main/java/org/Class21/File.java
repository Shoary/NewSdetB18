package org.Class21;

public  abstract class File {
    // File.java

        private  String name;
        private  long size;

        public File(String name, long size) {
            this.name = name;
            this.size = size;
        }

        public abstract void open();

        public void edit() {
            System.out.println(name + " is being edited.");
        }

        public void close() {
            System.out.println(name + " is closed.");
        }

        public String getName() {
            return name;
        }

        public long getSize() {
            return size;
        }
    }

    // JavaFile.java
    class JavaFile extends File {

        public JavaFile(String name, long size) {
            super(name, size);
        }

        @Override
        public void open() {
            System.out.println("Opening " + getName() + " with Notepad++ or Sublime Text.");
        }
    }

    // WordFile.java
    class WordFile extends File {

        public WordFile(String name, long size) {
            super(name, size);
        }

        @Override
        public void open() {
            System.out.println("Opening " + getName() + " with Microsoft Word.");
        }
    }

    // PdfFile.java
    class PdfFile extends File {

        public PdfFile(String name, long size) {
            super(name, size);
        }

        @Override
        public void open() {
            System.out.println("Opening " + getName() + " with Adobe Acrobat Reader.");
        }
    }

