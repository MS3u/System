package hybernate;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "users", schema = "projekt")
public class UsersEntity {
    private int id;




    private String imię;
    private String nazwisko;
    private String stanowisko;

    @javax.persistence.Id
    @Basic
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "Imię")
    public String getImię() {
        return imię;
    }

    public void setImię(String imię) {
        this.imię = imię;
    }

    @Basic
    @Column(name = "Nazwisko")
    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    @Basic
    @Column(name = "Stanowisko")
    public String getStanowisko() {
        return stanowisko;
    }

    public void setStanowisko(String stanowisko) {
        this.stanowisko = stanowisko;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UsersEntity that = (UsersEntity) o;
        return id == that.id &&
                Objects.equals(imię, that.imię) &&
                Objects.equals(nazwisko, that.nazwisko) &&
                Objects.equals(stanowisko, that.stanowisko);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, imię, nazwisko, stanowisko);
    }
}
