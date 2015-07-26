package messages

/**
 * @author apur8881
 */

import akka.actor._

object Messages {

    case object Ping
    case object Pong
    case class Start(to: ActorRef)
}