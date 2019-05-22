import org.junit.*;
import static org.junit.Assert.*;

public class HeroTest {


  @Test
  public void newHero_instatiatesCorrectly_boolean() {
    Hero superMario = new Hero("Super Mario",102, "Garlic", "superspeed");
    assertEquals(true, superMario instanceof Hero);
  }

  @Test
  public void Hero_instatiatesCorrectlyWithName_String() {
    Hero superMario = new Hero("Super Mario", 102, "Garlic", "superstrength");
    assertEquals("Super Mario", superMario.getName());
  }

  @Test
  public void Hero_instatiatesCorrectlyWithAge_int() {
    Hero superMario = new Hero("SuperMario", 102, "Garlic", "superspeed");
    assertEquals(102, superMario.getAge());
  }

  @Test
  public void Hero_instatiatesCorrectlyWithWeakness_String() {
    Hero superMario = new Hero("Super Mario", 102, "Garlic", "superspeed");
    assertEquals("Garlic", superMario.getWeakness());
  }

  @Test
  public void Hero_returnsCorrectSpecialPowers_String() {
    Hero superMario = new Hero("Super Mario", 102, "Garlic", "superspeed");
    assertEquals("superspeed", superMario.getStrength());
  }
  @Test
  public void find_returnsHero_Hero() {
    Hero muchui = new Hero("name", 21, "shorties", "tech-guy");
    assertEquals(muchui, Hero.find(1));
  }
  
}