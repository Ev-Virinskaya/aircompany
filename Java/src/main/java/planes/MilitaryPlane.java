package planes;

import models.MilitaryType;

import java.util.Objects;

public class MilitaryPlane extends Plane{

    private MilitaryType typeOfPlane;

    public MilitaryPlane(String model, int maxSpeed, int maxFlightDistance, int maxLoadCapacity, MilitaryType typeOfPlane) {
        super(model, maxSpeed, maxFlightDistance, maxLoadCapacity);
        this.typeOfPlane = typeOfPlane;
    }

    public MilitaryType getTypeOfPlane() {
        return typeOfPlane;
    }

    @Override
    public String toString() {
        return super.toString().replace("}",
                ", type=" + typeOfPlane +
                        '}');
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof MilitaryPlane)) {
            return false;
        }
        if (!super.equals(o)) {
            return false;
        }
        MilitaryPlane that = (MilitaryPlane) o;
        return typeOfPlane == that.typeOfPlane;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), typeOfPlane);
    }
}
