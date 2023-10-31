package angelomoreno.Es2_311023.entities;

import angelomoreno.Es2_311023.enums.StatoTavolo;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Component
public class Tavolo {
    private int id;
    private int numCopertiMax;
    private StatoTavolo statoTavolo;
}
