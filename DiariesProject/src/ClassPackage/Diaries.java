package ClassPackage;
import java.util.List;
import java.util.ArrayList;

public class Diaries {
    private boolean isLocked;
    private String userName;
    private String password;
    private List<Entry> entries = new ArrayList<>();

public Diaries(String userName, String password) {
    this.userName = userName;
    this.password = password;
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

    public void createEntry(int id, String title, String body) {
    entries.add(new Entry(id, title, body));
    }

    public Entry findEntry(int id) {
        for (Entry entry : entries) {
            if (entry.getId() == id) {
                return entry;
            }
        }
        return null;
    }
}
