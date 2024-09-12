package Counter

import chisel3._

class Counter extends Module {
  val io = IO(
    new Bundle {
      val out = Output(UInt(4.W))
    }
  )

  // Counter register
  val counter = RegInit(0.U(4.W))
  counter := counter + 1.U
  // Output the counter value
  io.out := counter
  
}
