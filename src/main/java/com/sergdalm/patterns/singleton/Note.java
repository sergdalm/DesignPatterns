package main.java.com.sergdalm.patterns.singleton;

public class Note {
    private static Note note;
    private static String content = "";

    private Note() {
    }

    public static synchronized Note getNote() {
        if(note == null)
            note = new Note();

        return note;
    }

    public synchronized void addNote(String s) {
        content += s + "\n";
    }

    public void showNote() {
        System.out.println(content);
    }

}
