package rocks.zipcode.quiz4.collections.culonary;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author leon on 27/12/2018.
 */
public class Food {
    private List<Spice> spiceList = new ArrayList<>();


    public List<Spice> getAllSpices() {
        return spiceList;
    }

    public <SpiceType extends Class<? extends Spice>> Map<SpiceType, Integer> getSpiceCount() {
        Map<SpiceType, Integer> spicesToAdd = new HashMap<>();
        spicesToAdd.put((SpiceType) spiceList.get(0).getClass(), getAllSpices().size());
        return spicesToAdd;
    }

    public void applySpice(Spice spice) {
        spiceList.add(spice);
    }
}
