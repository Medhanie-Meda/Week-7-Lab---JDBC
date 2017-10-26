package businesslogic;

import dataaccess.NoteDB;
import domainmodel.Note;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class NoteService {

    private NoteDB userDB;

    public NoteService() {
        userDB = new NoteDB();
    }

    public Note get(int noteId) throws Exception {
        return userDB.getNote(noteId);
    }

    public List<Note> getAll() throws Exception {
        return userDB.getAll();
    }

    public int update(int noteId, String contents) throws Exception {
        Note note = new Note(noteId, contents);
        return userDB.update(note);
    }

    public int delete(int noteId) throws Exception {
        Note deletedNote = userDB.getNote(noteId);
        return userDB.delete(deletedNote);
    }

    public int insert(String contents) throws Exception {
        Note note = new Note(contents);
        //note.setDateCreated();
        return userDB.insert(note);
    }
    
    public String getBackupFolderName() {
        Date date = Calendar.getInstance().getTime();
        SimpleDateFormat sdf = new SimpleDateFormat("mm-dd-yyyy");
        return sdf.format(date);
    }
}
