package hybernate;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "users")
public class UsersEntity {
    private int id;
    private String imie;
    private String nazwisko;
    private String stanowisko;
    private String haslo;

    public UsersEntity(String imie, String nazwisko, String stanowisko, String haslo) {
    }

    @Id
    @GeneratedValue
    @Column(name = "Id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "Imie", nullable = false, length = 30)
    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    @Basic
    @Column(name = "Nazwisko", nullable = false, length = 30)
    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    @Basic
    @Column(name = "Stanowisko", nullable = false, length = 30)
    public String getStanowisko() {
        return stanowisko;
    }

    public void setStanowisko(String stanowisko) {
        this.stanowisko = stanowisko;
    }

    @Basic
    @Column(name = "Haslo", nullable = false, length = 30)
    public String getHaslo() {
        return haslo;
    }

    public void setHaslo(String haslo) {
        this.haslo = haslo;
    }

    public UsersEntity(int id, String imie, String nazwisko, String stanowisko, String haslo) {
        this.id = id;
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.stanowisko = stanowisko;
        this.haslo = haslo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UsersEntity entity = (UsersEntity) o;
        return id == entity.id &&
                Objects.equals(imie, entity.imie) &&
                Objects.equals(nazwisko, entity.nazwisko) &&
                Objects.equals(stanowisko, entity.stanowisko) &&
                Objects.equals(haslo, entity.haslo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, imie, nazwisko, stanowisko, haslo);
    }
}
