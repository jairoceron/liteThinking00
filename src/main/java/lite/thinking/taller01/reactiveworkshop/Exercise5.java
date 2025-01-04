package lite.thinking.taller01.reactiveworkshop;

import org.reactivestreams.Subscription;
import reactor.core.publisher.BaseSubscriber;

import java.io.IOException;

public class Exercise5 {

    public static void main(String[] args) throws IOException {

        // Use ReactiveSources.intNumberMono() and ReactiveSources.userMono()

        // Subscribe to a flux using the error and completion hooks

        // ReactiveSources.intNumberMono().subscribe( x -> System.out.println(x),
        //        err -> System.out.println(err.getMessage()),
        //        () -> System.out.println("Complete") );
        // TODO: Write code here




        // Subscribe to a flux using an implementation of BaseSubscriber
        // ReactiveSources.intNumbersFlux().subscribe(new MySubscriber<>());
        // TODO: Write code here




        System.out.println("Press a key to end");
        System.in.read();
    }

}

class MySubscriber<T> extends BaseSubscriber<T> {
    public void hookOnSubscribe(Subscription subscription) {
        System.out.println("Subscripción hecha");
    }
    public void hookOnNext(T value) {
        System.out.println(value.toString() + " recibida ");
    }

}