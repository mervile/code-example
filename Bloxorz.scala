package streams

/**
 * A main object that can be used to execute the Bloxorz solver
 */
object Bloxorz extends App {

  /**
   * A level constructed using the `InfiniteTerrain` trait which defines
   * the terrain to be valid at every position.
   */
  object InfiniteLevel extends Solver with InfiniteTerrain {
    val startPos = Pos(1,3)
    val goal = Pos(5,8)
  }
  
  println(InfiniteLevel.solution)

  /**
   * A simple level constructed using the StringParserTerrain 
   */
  abstract class Level extends Solver with StringParserTerrain
  
  object Level0 extends Level {
    val level =
      """------------
      -----oo-ooo----
      -----oooooo----
      ooo---oo-ooooo-
      oSooooooo--oo--
      -----oo-oo-ooo-
      -----oooooo-oo-
      ooo--oooooo-ooo
      oooooo-o--ooo-T
      ooo--ooo---oooo
      ooo---------ooo
      """.stripMargin
  }

  /*object Level2 extends Level {
    val level1 =
      """------------
      -----oo-ooo----
      -----ooooooo---
      ooo---oo-ooooo-
      ooooooooo--oo--
      -----oo-oo-ooo-
      -----oooooo-oo-
      ooo--oooooo-ooo
      oToooo-o--ooo-S
      ooo--ooo---oooo
      ooo---------ooo
      """.stripMargin
  }*/

  println(Level0.solution)

  /**
   * Level 1 of the official Bloxorz game
   */
  object Level1 extends Level {
    val level = """------------
      -----oo-ooo----
      -----oooooo----
      ooo---oo-ooooo-
      oSooooooo--oo--
      -----oo-oo-ooo-
      -----oooooo-oo-
      ooo--oooooo-ooo
      oooooo-o--ooo-T
      ooo--ooo---oooo
      ooo---------ooo
      """.stripMargin
  }

  println(Level1.solution)
}
