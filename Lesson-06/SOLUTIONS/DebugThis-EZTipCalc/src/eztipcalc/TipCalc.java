package eztipcalc;

/**
 * This class implements a tip calculator
 */
public class TipCalc {
    
    private double _billAmount;
    private double _tipPct;
    
    public TipCalc(double billAmount, double tipPct) {
        this._billAmount = billAmount;
        this._tipPct = tipPct;
    }
    
    public TipCalc(){
        this._billAmount = 0;
        this._tipPct = 0;        
    }
    
    public double getBillAmount() {
        return _billAmount;
    }
    
    public double setBillAmount( double billAmount )
    {
        return (_billAmount = billAmount);
    }
    
    public double getTipPct() {
        return _tipPct;
    }
    
    public double setTipPct (double tipPct ){
        return (this._tipPct=tipPct);
    }
    
    public double tipAmount() {
        return _tipPct * _billAmount;
    }
    
    public double billTotal() {
        return (1 + _tipPct) * _billAmount;
    }
    
}
