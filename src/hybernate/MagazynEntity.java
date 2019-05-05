package hybernate;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "magazyn", schema = "projekt", catalog = "")
public class MagazynEntity {
    private int id;
    private String nazwa;
    private Double cenaNetto;
    private Double cenaBrutto;
    private Double stan;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "Nazwa")
    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    @Basic
    @Column(name = "Cena Netto")
    public Double getCenaNetto() {
        return cenaNetto;
    }

    public void setCenaNetto(Double cenaNetto) {
        this.cenaNetto = cenaNetto;
    }

    @Basic
    @Column(name = "Cena Brutto")
    public Double getCenaBrutto() {
        return cenaBrutto;
    }

    public void setCenaBrutto(Double cenaBrutto) {
        this.cenaBrutto = cenaBrutto;
    }

    @Basic
    @Column(name = "Stan")
    public Double getStan() {
        return stan;
    }

    public void setStan(Double stan) {
        this.stan = stan;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MagazynEntity that = (MagazynEntity) o;
        return id == that.id &&
                Objects.equals(nazwa, that.nazwa) &&
                Objects.equals(cenaNetto, that.cenaNetto) &&
                Objects.equals(cenaBrutto, that.cenaBrutto) &&
                Objects.equals(stan, that.stan);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nazwa, cenaNetto, cenaBrutto, stan);
    }
}
