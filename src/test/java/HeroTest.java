import org.junit.*;
import static org.junit.Assert.*;

public class HeroTest {

  
  @Test
  public void newHero_instatiatesCorrectly_boolean() {
    Hero superMario = new Hero("Super Mario",102, "Garlic", 12, "NduthiGeng");
    assertEquals(true, superMario instanceof Hero);
  }

  @Test
  public void Hero_instatiatesCorrectlyWithName_String() {
    Hero superMario = new Hero("Super Mario", 102, "Garlic", 10, "Kimonyoski");
    assertEquals("Super Mario", superMario.getName());
  }

  @Test
  public void Hero_instatiatesCorrectlyWithAge_int() {
    Hero superMario = new Hero("SuperMario", 102, "Garlic", 12, "Mbogi");
    assertEquals(102, superMario.getAge());
  }

  @Test
  public void Hero_instatiatesCorrectlyWithWeakness_String() {
    Hero superMario = new Hero("Super Mario", 102, "Garlic", 10, "mambati");
    assertEquals("Garlic", superMario.getWeakness());
  }

  @Test
  public void Hero_returnsCorrectSpecialPowers_String() {
    Hero superMario = new Hero("Super Mario", 102, "Garlic", 12, "Watiaji");
    assertEquals(12, superMario.getStrength());
  }

  @Test
  public void Hero_canBelongToSquad_String() {
    Hero superMario = new Hero("super", 23, "onions", 12, "SuperSoupes");
    assertEquals("SuperSoupes", superMario.getSquad());
  }
}