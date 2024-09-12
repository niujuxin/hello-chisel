import chisel3._
import chiseltest._
import org.scalatest.flatspec.AnyFlatSpec

import Counter._

class CounterTester extends AnyFlatSpec with ChiselScalatestTester {
  behavior of "Counter"

  it should "increment counter" in {
    test(new Counter) { c =>
      // The counter is initialized to 0
      c.io.out.expect(0.U)
      // Increment the counter for 16 cycles
      // For each cycle, the counter should increment by 1
      // After the final cycle, the counter overflows and wraps around to 0
      for (i <- 1 to 16) {
        c.clock.step(1)
        if (i < 16) {
          // First 15 cycles
          c.io.out.expect(i.U)
        } else {
          // 16th cycle
          c.io.out.expect(0.U)
        }
      }
    }
  }
}
