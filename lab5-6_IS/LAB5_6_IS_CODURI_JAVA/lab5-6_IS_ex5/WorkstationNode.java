package org.ex5;

public class WorkstationNode extends Node {
    private Document documentToPrint;

    public WorkstationNode(String name, Document document) {
        super(name);
        this.documentToPrint = document;
    }

    public void sendToPrinter(PrinterNode printer) {
        System.out.println(getName() + " trimite documentul catre " + printer.getName());
        printer.printDocument(documentToPrint);
    }
}

