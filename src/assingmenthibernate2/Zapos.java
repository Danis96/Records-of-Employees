package assingmenthibernate2;
// Generated May 5, 2019 11:37:57 AM by Hibernate Tools 4.3.1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "zapos",
         catalog = "HZaposleni"
)
public class Zapos implements java.io.Serializable {

    private int zaposleniId;
    private String ZIme;
    private int ZGod;
    private String ZAdresa;
    private int ZVisinad;

    public Zapos() {
    }

    public Zapos(String ZIme, int ZGod, String ZAdresa, int ZVisinad) {
        
        this.ZIme = ZIme;
        this.ZGod = ZGod;
        this.ZAdresa = ZAdresa;
        this.ZVisinad = ZVisinad;
    }

    @Id
    @Column(name = "zaposleni_id", unique = true, nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getZaposleniId() {
        return this.zaposleniId;
    }

    public void setZaposleniId(int zaposleniId) {
        this.zaposleniId = zaposleniId;
    }

    @Column(name = "z_ime", nullable = false, length = 200)
    public String getZIme() {
        return this.ZIme;
    }

    public void setZIme(String ZIme) {
        this.ZIme = ZIme;
    }

    @Column(name = "z_god", nullable = false)
    public int getZGod() {
        return this.ZGod;
    }

    public void setZGod(int ZGod) {
        this.ZGod = ZGod;
    }

    @Column(name = "z_adresa", nullable = false, length = 200)
    public String getZAdresa() {
        return this.ZAdresa;
    }

    public void setZAdresa(String ZAdresa) {
        this.ZAdresa = ZAdresa;
    }

    @Column(name = "z_visinad", nullable = false)
    public int getZVisinad() {
        return this.ZVisinad;
    }

    public void setZVisinad(int ZVisinad) {
        this.ZVisinad = ZVisinad;
    }

    @Override
    public String toString() {
        return "Zapos{" + "zaposleniId=" + zaposleniId + ", ZIme=" + ZIme + ", ZGod=" + ZGod + ", ZAdresa=" + ZAdresa + ", ZVisinad=" + ZVisinad + '}';
    }
    
    

}
