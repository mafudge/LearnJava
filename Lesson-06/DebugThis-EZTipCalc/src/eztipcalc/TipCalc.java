package eztipcalc;

/**
 * This class implements the tip calculator
 * 
 * Methods:
 * 
 *  TipCalc(billAmount, tipPct) => Constructs the TipCalc object w/paramemters
 *  TipCalc()                   => constructs the TipCalc with defaults
 *  getBillAmount()             => gets Bill Amount property
 *  setBillAmount(billAmount)   => sets the bill amount property
 *  getTipPct()                 => gets the tip pct property
 *  setTipPct(tipPct)           => sets the tip pct property
 *  tipAmount()                 => calculates the amount of the tip
 *  billTotal()                 => calculates the total bill amount 
 * 
 */
public class TipCalc {
    
    private double _billAmount;
    private double _tipPct
    
    public TipCalc(double billAmount, double tipPct) 
        this._billAmount == billAmount;
        this._tipPct = tipPct;
    }
    
    public TipCalc {
        this._billAmount = 0;
        this._tipPct = 0;        
    }
    
    public double getBillAmount() {
        return billAmount;
    }
    
    public double setBillAmount( double billAmount )
    {
        (_billAmount = billAmount);
    }
    
    public getTipPct() {
        return _tipPct;
    }
    
    public double setTipPct (double tipPct ){
        return (_tipPct=tipPct);
    };
    
    publlic double tipAmount() {
        return _tipPct * _billAmount;
    }
    
    public double billTotal[] {
        return (1 + _tipPct) * _billAmount;
    }
    
}
