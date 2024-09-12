module Counter(
  input        clock,
  input        reset,
  output [3:0] io_out // @[src/main/scala/Counter.scala 6:14]
);
  reg [3:0] counter; // @[src/main/scala/Counter.scala 13:24]
  wire [3:0] _counter_T_1 = counter + 4'h1; // @[src/main/scala/Counter.scala 14:22]
  assign io_out = counter; // @[src/main/scala/Counter.scala 16:10]
  always @(posedge clock) begin
    if (reset) begin // @[src/main/scala/Counter.scala 13:24]
      counter <= 4'h0; // @[src/main/scala/Counter.scala 13:24]
    end else begin
      counter <= _counter_T_1; // @[src/main/scala/Counter.scala 14:11]
    end
  end
endmodule
