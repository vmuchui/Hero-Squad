import java.util.List;
import java.util.ArrayList;


public class Hero {

  private String mName;
  private int mAge;
  private String mWeakness;
  private int mStrength;
  private String mSquad;
  private int mId;
  private static List<Hero> mHeroes;
  
  public Hero(String name, int age, String weakness, int strength, String squad) {
    mName = name;
    mAge = age;
    mWeakness = weakness;
    mStrength = strength;
    mSquad = squad;
    mHeroes.add(this);
    mId = mHeroes.size();
  }
  public int getId() {
    return mHeroes.size()-1;
  }
  public static List<Hero> getHeroes() {
    return mHeroes;
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
}