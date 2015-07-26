package main
import akka.actor._
import messages.Messages._
import pingpong.PingPong

/**
 * @author apur8881
 */

object Main {
    def main(args : Array[String]) = {      
        val system = ActorSystem("PingPongActors")

        val Actor1 = system.actorOf(Props[PingPong], "Actor1")
        val Actor2 = system.actorOf(Props[PingPong], "Actor2")
        
        Actor1 ! Start(Actor2)
    }
}