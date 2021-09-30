package a.kosmaty.PcRent.pc;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "processor")
public class Procesor {
    @Id
    private int id;
    private String name;
    private int price;
    private int clock;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getClock() {
        return clock;
    }

    public void setClock(int memory) {
        this.clock = memory;
    }
}
