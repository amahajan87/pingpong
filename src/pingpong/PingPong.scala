package pingpong
import akka.actor._
import messages.Messages._

/**
 * @author apur8881
 */
class PingPong extends Actor{

      def receive = {
        case Start(to: ActorRef) =>
            println("Start Ping Pong!")
            println(self.toString() + "\tStart Received from:\t" + context.parent.toString())
            Thread.sleep(1000)
            to ! Ping

        case Pong =>
            println(self.toString() + "\tPong Received from:\t" + sender.toString())
            Thread.sleep(1000)
            sender ! Ping                     
            
        case Ping =>
            println(self.toString() + "\tPing Received from:\t" + sender.toString())
            Thread.sleep(1000)
            sender ! Pong        
    }  

}