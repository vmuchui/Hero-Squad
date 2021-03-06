import org.junit.*;
import static org.junit.Assert.*;

public class SquadTest {

  @Test
  public void Squad_instatiatesCorrectly_true() {
    Squad wasupaa = new Squad("wasupaa",12, "fight buttsniffers");
    assertEquals(true, wasupaa instanceof Squad);
  }

  @Test
  public void Squad_instatiatesWithNameOfSquad_String() {
  Squad wasupaa = new Squad("wasupaa",12, "fight buttsniffers");
   assertEquals("wasupaa", wasupaa.getSquadName());
  }

  @Test
  public void Squad_instatiateswithMaxSizeofSquad_int () {
    Squad wasupaa = new Squad("wasupaa",12, "fight buttsniffers");
    assertEquals(12, wasupaa.getSize());
  }
  @Test
  public void Squad_instatiatesWithCorrectCause_String() {
    Squad wasupaa = new Squad("wasupaa",12, "fight buttsniffers");
    assertEquals("fight buttsniffers", wasupaa.getCause());
  }
 

  @Test
  public void addHero_addsHeroTomHeroesArrayList_true() {
    Squad.clear();
    Squad wasupaa = new Squad("wasupaa",12, "fight buttsniffers");
    Hero mnati = new Hero("name", 12, "tea", "wasupaa");
    wasupaa.addHero(mnati);
    assertTrue(wasupaa.getHeroes().contains(mnati));
  }
  @Test
  public void addHero_doesNotAddMoreHeroesThanTheSquadSize_boolean() {
    Squad wasupaa = new Squad("wasupaa", 1, "fight buttsniffers");
    Hero mnati = new Hero("name", 12, "tea", "wasupaa");
    Hero mrui = new Hero("name", 12, "tea", "wasupaa");
    wasupaa.addHero(mnati);
    wasupaa.addHero(mrui);
    assertTrue(wasupaa.getHeroes().contains(mnati));
    assertEquals(false,wasupaa.getHeroes().contains(mrui));
  }
  @Test
  public void find_returnsSquad_Squad() {
    Squad wasupaa = new Squad("wasupaa", 1, "fight buttsniffers");
    assertEquals(wasupaa, Squad.find(1));

  }
}