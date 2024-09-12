FIRRTL version 1.2.0
circuit Counter :
  module Counter :
    input clock : Clock
    input reset : UInt<1>
    output io : { out : UInt<4>} @[src/main/scala/Counter.scala 6:14]

    reg counter : UInt<4>, clock with :
      reset => (reset, UInt<4>("h0")) @[src/main/scala/Counter.scala 13:24]
    node _counter_T = add(counter, UInt<1>("h1")) @[src/main/scala/Counter.scala 14:22]
    node _counter_T_1 = tail(_counter_T, 1) @[src/main/scala/Counter.scala 14:22]
    counter <= _counter_T_1 @[src/main/scala/Counter.scala 14:11]
    io.out <= counter @[src/main/scala/Counter.scala 16:10]

