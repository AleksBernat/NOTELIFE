package NoteSystem;

import java.util.Calendar;

public class Note {
    Calendar date;
    String title;
    String description;
    int numOfFiles;
    long size;


    public Note(String title, String description, Calendar date, int numOfFiles, long size){
        this.title = title;
        this.description = description;
        this.date = date;
        this.numOfFiles = numOfFiles;
        this.size = size;
    }
    
}
