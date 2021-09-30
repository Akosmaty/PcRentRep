package a.kosmaty.PcRent.pc;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class PcRenter {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private int idcpu;
    private int idmem;
    private int idprc;
    private int cpuprice = 0;
    private  int memprice = 0;
    private  int prcprice = 0;
    private int fullprice = 0;

    public PcRenter(int id, int idcpu, int idmem, int idprc, int cpuprice, int memprice, int prcpric, int fullprice) {
        this.id = id;
        this.idcpu = idcpu;
        this.idmem = idmem;
        this.idprc = idprc;
        this.cpuprice = cpuprice;
        this.memprice = memprice;
        this.prcprice = prcprice;
        this.fullprice = fullprice;
    }

    public PcRenter() {
    }

    public static PcRenterBuilder builder() {
        return new PcRenterBuilder();
    }


    public void setCpuprice(int cpuprice) {
        this.cpuprice = cpuprice;
    }

    public void setMemprice(int memprice) {
        this.memprice = memprice;
    }

    public void setPrcprice(int prcprice) {
        this.prcprice = prcprice;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdcpu() {
        return idcpu;
    }

    public void setIdcpu(int idcpu) {
        this.idcpu = idcpu;
    }

    public int getIdmem() {
        return idmem;
    }

    public void setIdmem(int idmem) {
        this.idmem = idmem;
    }

    public int getIdprc() {
        return idprc;
    }

    public void setIdprc(int idprc) {
        this.idprc = idprc;
    }

    public int getCpuprice() {
        return cpuprice;
    }

    public int getMemprice() {
        return memprice;
    }

    public int getPrcprice() {
        return prcprice;
    }
    public int getFullprice() { return fullprice; }

    public void setFullprice(int fullprice) { this.fullprice = fullprice; }

    public static class PcRenterBuilder {
        private int id;
        private int idcpu;
        private int idmem;
        private int idprc;
        private int cpuprice;
        private int memprice;
        private int prcprice;
        public  int fullprice;

        PcRenterBuilder() {
        }



        public PcRenterBuilder id(int id) {
            this.id = id;
            return this;
        }

        public PcRenterBuilder idcpu(int idcpu) {
            this.idcpu = idcpu;
            return this;
        }

        public PcRenterBuilder idmem(int idmem) {
            this.idmem = idmem;
            return this;
        }

        public PcRenterBuilder idprc(int idprc) {
            this.idprc = idprc;
            return this;
        }

        public PcRenterBuilder cpuprice(int cpuprice) {
            this.cpuprice = cpuprice;
            return this;
        }

        public PcRenterBuilder memprice(int memprice) {
            this.memprice = memprice;
            return this;
        }

        public PcRenterBuilder prcprice(int prcprice) {
            this.prcprice = prcprice;
            return this;
        }




    }
}