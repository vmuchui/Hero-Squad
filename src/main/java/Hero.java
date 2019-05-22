import java.util.List;
import java.util.ArrayList;


public class Hero {

  private String mName;
  private int mAge;
  private String mWeakness;
  private String mStrength;
  private int mId;
  private static List<Hero> mHeroesList = new ArrayList<Hero>();
  
  public Hero(String name, int age, String weakness, String strength) {
    mName = name;
    mAge = age;
    mWeakness = weakness;
    mStrength = strength;
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
  public String getStrength() {
    return mStrength;
  }
  
  public int getId() {
    return mId;
  }
}