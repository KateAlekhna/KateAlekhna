package by.epam.tr.entity;

import java.util.ArrayList;
import java.util.Objects;

public class NoteBook {
    private ArrayList<Note> notes = new ArrayList<>();

    public ArrayList<Note> getNotes() {
        return notes;
    }

    public void setNotes(ArrayList<Note> notes) {
        this.notes = notes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NoteBook notebook = (NoteBook) o;
        return Objects.equals(notes, notebook.notes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(notes);
    }

    @Override
    public String toString() {
        return "StoreDate{" +
                "notes=" + notes +
                '}';
    }
}