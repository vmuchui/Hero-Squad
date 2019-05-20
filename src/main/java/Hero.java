import java.util.List;
import java.util.ArrayList;


public class Hero {

  private String mName;
  private int mAge;
  private String mWeakness;
  private int mStrength;
  private String mSquad;
  private int mId;
  private static List<Hero> mHeroesList = new ArrayList<Hero>();
  
  public Hero(String name, int age, String weakness, int strength, String squad) {
    mName = name;
    mAge = age;
    mWeakness = weakness;
    mStrength = strength;
    mSquad = squad;
    mHeroesList.add(this);
    mId = mHeroesList.size();
  }
  public static Hero find(int id) {
    return mHeroesList.get(id-1);
  }
  public static List<Hero> getHeroes() {
    return mHeroesList;
  }
  public String getName() {
    return mName;
  }
  public int getAge() {
    return mAge;
  }
  public String getWeakness() {
    return mWeakness;
  }
  public int getStrength() {
    return mStrength;
  }
  public String getSquad() {
    return mSquad;
  }
  public int getId() {
    return mId;
  }
}