package org.example;

public class Main {
    public static void main(String[] args) {

        Document docA = new Document(1, "D 1");
        Document docB = new Document(2, "D 2");
        Document docC = new Document(3, "D 3");

        docA.addRelatedDocument(docB);
        docB.addRelatedDocument(docA);
        docB.addRelatedDocument(docC);
        docC.addRelatedDocument(docB);

        Thread t1 = new Thread(docA::edit, "Thread - 1");
        Thread t2 = new Thread(docB::edit, "Thread - 2");
        Thread t3 = new Thread(docC::edit, "Thread - 3");

        t1.start();
        t2.start();
        t3.start();

    }
}