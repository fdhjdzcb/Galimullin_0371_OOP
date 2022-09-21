import java.util.Date;

public class halls {
    private int hall_id;
    private int capacity;
    private boolean is3D;
    private boolean isIMAX;

    public int getHallID() {
        return hall_id;
    }

    public void setHallID(int hall_id) {
        this.hall_id = hall_id;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public boolean getIs3D() {
        return is3D;
    }

    public void setIs3D(boolean is3D) {
        this.is3D = is3D;
    }

    public boolean getIsIMAX() {
        return isIMAX;
    }

    public void setIsIMAX(boolean isIMAX) {
        this.isIMAX = isIMAX;
    }
}
