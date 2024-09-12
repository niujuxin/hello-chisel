
import chisel3._
import chisel3.stage.ChiselStage

import Counter._

object Main extends App {

  def writeVerilog(dut: => Module): Unit = {
    val verilog = (new ChiselStage).emitVerilog(
      dut, 
      Array(
        "--target-dir", "generated",
        // To disable randomization of memory and registers
        "--emission-options=disableMemRandomization,disableRegisterRandomization",
      )
    )
  }

  writeVerilog(new Counter)
}
