import java.util.List;
import java.util.ArrayList;

public class Squad {
  
  private String mSquadname;
  private int mSize;
  private String mCause;
  private static List<Squad> mSquads = new ArrayList<>();
  private ArrayList<Hero> mHeroes;
  private int mId;
  

  public Squad(String name, int size, String cause) {
    mSquadname = name;
    mSize = size;
    mCause = cause;
    mSquads.add(this);
    mId = mSquads.size();
    mHeroes = new ArrayList<Hero>();
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
  public List<Hero> getHeroes() {
    return mHeroes;
  }
  public static List<Squad> getSquads() {
    return mSquads;
  }
  public int getId() {
    return mId;
  }
  public void addHero(Hero hero) {
    if (mHeroes.size()< mSize) {
      mHeroes.add(hero);
    } else {
      // nothing
    }
    
  }
  // public static Squad find(int id) {
  //   try {
  //     return mSquads.get(id - 1);
  //   } catch (IndexOutOfBoundsException exception) {
  //     return null;
  //   }
  // }
  public static void clear() {
    mSquads.clear();
  }
}