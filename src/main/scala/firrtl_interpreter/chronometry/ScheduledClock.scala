// See LICENSE for license details.

package firrtl_interpreter.chronometry

import firrtl_interpreter.executable.Symbol

case class ScheduledClock(symbol: Symbol, period: Long, offset: Long = 0L) {
  assert(period > 0, s"Error: creating scheduled clock with bad period $period")
  assert(offset >= 0, s"Error: creating scheduled clock with bad offset $offset")
}