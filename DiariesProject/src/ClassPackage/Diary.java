package ClassPackage;
import java.util.List;
import java.util.ArrayList;

public class Diary {
    private boolean isLocked;
    private String userName;
    private String password;
    private List<Entry> entries;

    private static int userId = 100;

public Diary(String userName, String password) {
    this.userName = userName;
    this.password = password;
    this.entries = new ArrayList<>();
}
    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public void lockDiary() {
        this.isLocked = true;
    }

    public void unlockDiary(String code) {
        this.isLocked = false;
    }

    public boolean isLocked() {
        return isLocked;
    }

    public void createEntry( String title, String body) {
    entries.add(new Entry(++userId,title, body));
    }

    public List<Entry> getEntries() {
    return entries;
    }

    private void validateEmptyDiary() {
        if(entries.isEmpty()) {
            throw new EmptyDiaryException("Diary cannot be empty");
        }
    }

    public void deleteEntry(int id) {
        validateEmptyDiary();
        for(Entry entry: entries) {
            if(entry.getId() == id) {
                entries.remove(entry);
                break;
            }
        }
    }

    public Entry findEntryById(int id) {
        validateEmptyDiary();
        for(Entry entry: entries) {
            if(entry.getId() == id) {
                return entry;
            }
        }
        throw new EmptyDiaryException("Entry with id " + id + " not found");
    }

    public void updateEntry(int id, String title, String body) {
        validateEmptyDiary();
        for(Entry entry: entries) {
            if(entry.getId() == id) {
                entry.setTitle(title);
                entry.setBody(body);
            }
        }
    }
}



