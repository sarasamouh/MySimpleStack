package dcll.ssam;

import java.util.Objects;

/**
 * Created by mousa on 19/02/2016.
 */
public class Item {

    private Object value ;
    Item(Object value){ setValue(value);}

    /**
     * Exigence nume 3
     */

    public Object getValue(){
        return value ;
    }

    public void setValue(Object value) {
        this.value = value;
    }
}
