package angelomoreno.Es2_311023;

import angelomoreno.Es2_311023.entities.*;
import angelomoreno.Es2_311023.enums.StatoOrdine;
import angelomoreno.Es2_311023.enums.StatoTavolo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Configuration
public class BeansConfiguration {
    @Bean
    Pizza margherita() {
        List<String> ingredienti = new ArrayList<>();
        ingredienti.add("pomodoro");
        ingredienti.add("mozzarella");
        return new Pizza("margherita", 1104, 4.99, ingredienti);
    }

    @Bean
    Pizza odiolitalia() {
        List<String> ingredienti = new ArrayList<>();
        ingredienti.add("pomodoro");
        ingredienti.add("mozzarella");
        ingredienti.add("prosciutto");
        ingredienti.add("ananas");
        return new Pizza("odiolitalia", 1024, 6.49, ingredienti);
    }

    @Bean
    Pizza salume() {
        List<String> ingredienti = new ArrayList<>();
        ingredienti.add("pomodoro");
        ingredienti.add("mozzarella");
        ingredienti.add("salame");
        return new Pizza("salume", 1160, 5.99, ingredienti);
    }

    @Bean
    Topping formaggio() {
        return new Topping("formaggio", 92, 0.69);
    }

    @Bean
    Topping prosciutto() {
        return new Topping("prosciutto", 35, 0.99);
    }

    @Bean
    Topping cipolla() {
        return new Topping("cipolla", 22, 0.69);
    }

    @Bean
    Topping pineapple() {
        return new Topping("pineapple", 24, 0.79);
    }

    @Bean
    Topping salami() {
        return new Topping("salami", 86, 0.99);
    }

    @Bean
    Drink limonata() {
        return new Drink("limonata", 128, 1.29, 0.33);
    }

    @Bean
    Drink acqua() {
        return new Drink("acqua", 0, 1.29, 0.5);
    }

    @Bean
    Drink vino() {
        return new Drink("vino", 607, 7.49, 0.75, 13);
    }

    @Bean
    Menu menu() {
        List<Pizza> pizze = new ArrayList<>();
        pizze.add(margherita());
        pizze.add(odiolitalia());
        pizze.add(salume());

        List<Topping> aggiunte = new ArrayList<>();
        aggiunte.add(formaggio());
        aggiunte.add(prosciutto());
        aggiunte.add(cipolla());
        aggiunte.add(pineapple());
        aggiunte.add(salami());

        List<Drink> bevande = new ArrayList<>();
        bevande.add(limonata());
        bevande.add(acqua());
        bevande.add(vino());
        return new Menu(pizze, aggiunte, bevande);
    }

    @Bean
    Tavolo tavolo1() {
        return new Tavolo(1, 10, StatoTavolo.LIBERO);
    }

    @Bean
    List<Product> getElementiOrdine() {
        List<Product> products = new ArrayList<>();
        products.add(margherita());
        products.add(margherita());
        products.add(formaggio());
        products.add(cipolla());
        products.add(odiolitalia());
        products.add(limonata());
        products.add(limonata());
        return products;
    }

    @Bean
    Ordine ord1() {
        return new Ordine(1, tavolo1(), getElementiOrdine(), StatoOrdine.IN_CORSO, 4, LocalDate.now());
    }
}
