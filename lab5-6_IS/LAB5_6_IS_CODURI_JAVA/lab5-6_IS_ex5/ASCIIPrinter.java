package org.ex5;

public class ASCIIPrinter extends PrinterNode {
    public ASCIIPrinter(String name) {
        super(name);
    }

    @Override
    public void printDocument(Document document) {
        if (document.getType().equals("ASCII")) {
            System.out.println(getName() + " a tiparit documentul ASCII: " + document.getContent());
        } else {
            System.out.println(getName() + " nu poate tipari documentul PostScript.");
        }
    }
}
