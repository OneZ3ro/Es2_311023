package angelomoreno.Es2_311023;

import angelomoreno.Es2_311023.entities.Ordine;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class MyRunner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(Es2311023Application.class);
        Ordine ord1 = (Ordine) ctx.getBean("ord1");
        ord1.faiOrdine();
        ctx.close();
    }
}
