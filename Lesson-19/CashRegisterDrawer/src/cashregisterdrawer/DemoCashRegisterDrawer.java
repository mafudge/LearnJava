package cashregisterdrawer;

public class DemoCashRegisterDrawer implements ICashRegisterDrawer {

    private DrawerStatus drawerstatus;
    
    /**
     * Constructor for this class
     */
    public DemoCashRegisterDrawer() {
        // let's start out with a closed drawer.
        this.drawerstatus = DrawerStatus.Closed;
    }
    
    @Override
    public DrawerStatus getDrawerStatus() {
        return this.drawerstatus;
    }

    @Override
    public void Open() {
        this.drawerstatus = DrawerStatus.Open;
    }

    @Override
    public void Close() {
        this.drawerstatus = DrawerStatus.Closed;
    }

    @Override
    public boolean isOpen() {
        return this.drawerstatus == DrawerStatus.Open;
    }

    @Override
    public boolean isClosed() {
        return this.drawerstatus == DrawerStatus.Closed;
    }
        
}
