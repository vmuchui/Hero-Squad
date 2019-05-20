import java.util.List;
import java.util.ArrayList;

public class Squad {
  
  private String mSquadname;
  private int mSize;
  private String mCause;
  // private List<Squad> mSquads = new ArrayList<>();
  // private List<Hero> mHeroes;

  public Squad(String name, int size, String cause) {
    mSquadname = name;
    mSize = size;
    mCause = cause;

  }
  public String getSquadName() {
    return mSquadname;
  }
  public int getSize() {
    return mSize;
  }
  public String getCause() {
    return mCause;
  }
}