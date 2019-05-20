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
}