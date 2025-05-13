package org.ex5;

public class PostScriptPrinter extends PrinterNode {
    public PostScriptPrinter(String name) {
        super(name);
    }

    @Override
    public void printDocument(Document document) {
        System.out.println(getName() + " a tiparit documentul de tip " + document.getType() + ": " + document.getContent());
    }
}
