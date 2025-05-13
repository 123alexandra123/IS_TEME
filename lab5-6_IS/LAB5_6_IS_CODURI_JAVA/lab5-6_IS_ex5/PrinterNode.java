package org.ex5;

public abstract class PrinterNode extends Node {
    public PrinterNode(String name) {
        super(name);
    }

    public abstract void printDocument(Document document);
}

