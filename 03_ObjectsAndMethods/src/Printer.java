public class Printer {
    public static void main(String[] args) {
        Printer printer = new Printer();
        printer.append("Книга","Анна Каренина", 5);
        printer.append("Журнал","Бизнес", 2);
        printer.append("Книга","Властелин Колец", 3);
        System.out.println("\n" + "Количество страниц на печать: " + printer.getPagesCount() + " шт.");
        System.out.println("Количество документов на печать: " + printer.getDocumentsCount() + " шт.");
        printer.print();
        System.out.println("\n" + "Всего распечатанных документов: " + printer.getPrintDocumentsCount()+ " шт.");
    }

    private String queue = "";
    private int pagesCount = 0;
    private int documentsCount = 0;
    private int printDocumentsCount = 0;

    public void append(String text, String name, int pagesCount){
        queue = queue + "\n" + text + " (" + name + ") - " + pagesCount + " стр.";
        this.pagesCount = this.pagesCount + pagesCount;
        this.documentsCount = this.documentsCount + 1;
           }

    public void append(String text){
        append(text, "без названия", 0);
    }

    public void append(String text, String name){
        append(text, name, 0);
    }

    public void clear(){
        queue = "";
        pagesCount = 0;
        documentsCount = 0;
    }

    public void print(){
        this.printDocumentsCount = this.printDocumentsCount + 1;
        System.out.println(queue);
        clear();
    }

    public int getPagesCount(){
        return pagesCount;
    }

    public int getDocumentsCount(){
        return documentsCount;
    }

    public int getPrintDocumentsCount() {
        return printDocumentsCount;
    }
}
