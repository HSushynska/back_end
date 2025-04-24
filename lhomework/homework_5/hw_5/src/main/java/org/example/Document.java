package org.example;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

class Document {
    private final int id;
    private final String name;
    private final List<Document> relatedDocs = new ArrayList<>();

    public Document(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<Document> getRelatedDocs() {
        return relatedDocs;
    }


    public void addRelatedDocument(Document doc) {
        relatedDocs.add(doc);
    }

    public void edit() {
        List<Document> docsToLock = new ArrayList<>(relatedDocs);
        docsToLock.add(this);

        docsToLock.sort(Comparator.comparing(Document::getId));

        List<Object> locks = new ArrayList<>(docsToLock);

        synchronized(locks, () -> {
            System.out.println(Thread.currentThread().getName() + " редактирует " + name);
            for (Document doc : relatedDocs) {
                    System.out.println(Thread.currentThread().getName() + " редактирует связанный документ " + doc.name);
                    // имитация редактирования
                }
            }
        }
    }


}



