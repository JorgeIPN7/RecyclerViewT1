package jorgeipn7.com.recyclerviewt1;

/**
 * Created by Jorge on 23/09/2017.
 */

public class Pais {

    private int _id;
    private String nombre;

    public Pais() {
    }

    public Pais(int _id, String nombre) {
        this._id = _id;
        this.nombre = nombre;
    }

    public int get_id() {
        return _id;
    }

    public void set_id(int _id) {
        this._id = _id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Pais{" +
                "_id=" + _id +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
