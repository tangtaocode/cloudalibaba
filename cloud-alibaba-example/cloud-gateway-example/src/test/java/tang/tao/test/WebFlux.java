package tang.tao.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.reactive.server.WebTestClient;
import reactor.core.publisher.Flux;

import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

@RunWith(SpringRunner.class)
@SpringBootTest
public class WebFlux {
    @Autowired
    private WebTestClient webTestClient;

    @Test
    public void fluxtest() throws InterruptedException {
        Flux.range(0, 100).subscribe(System.out::println);

        Flux.interval(Duration.of(500, ChronoUnit.MILLIS))
                .subscribe(System.out::println);
        //防止程序过早退出，放一个CountDownLatch拦住
        CountDownLatch latch = new CountDownLatch(1);
        latch.await(10000, TimeUnit.MILLISECONDS);
    }
}
