/**
 * This interface defines what it means to be a cash register drawer
 * is models the behavior that every drawer should have but implements no details.
 */
package cashregisterdrawer;

public interface ICashRegisterDrawer {
    
    public DrawerStatus getDrawerStatus();
    public void Open();
    public void Close();
    public boolean isOpen();
    public boolean isClosed();
       
}
