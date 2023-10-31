package angelomoreno.Es2_311023;

import angelomoreno.Es2_311023.entities.Ordine;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class Es2311023Application {

    public static void main(String[] args) {
        SpringApplication.run(Es2311023Application.class, args);
        configurationClass();
    }

    public static void configurationClass() {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(Es2311023Application.class);
        Ordine ord1 = (Ordine) ctx.getBean("ord1");
        ord1.faiOrdine();
        ctx.close();
    }
}
