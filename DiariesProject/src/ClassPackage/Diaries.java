package ClassPackage;

import java.util.ArrayList;
import java.util.List;

public class Diaries {
    private String password;
    private String userName;
    private List<Diary> diaries;

    public Diaries(String userName, String password) {
        this.userName = userName;
        this.password = password;
        this.diaries = new ArrayList<>();
    }

    public void add(String userName, String password) {
        diaries.add(new Diary(userName, password));
    }

    public List<Diary> getDiaries() {
        return diaries;
    }

    public Diary findByUserName(String userName) {
        for (Diary diary : diaries) {
            if (diary.getUserName().equals(userName)) {
                return diary;
            }
        }
        throw new InvalidUserNameException("No diary with userName " + userName);
    }

    public void delete(String userName, String password) {
        for (Diary diary : diaries) {
            if (diary.getUserName().equals(userName) && diary.getPassword().equals(password)) {
                diaries.remove(diary);
                break;
            }
        }
    }


}
