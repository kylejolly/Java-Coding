package labex2;
public class Card
{
    private String sSuit;
    private int iId;
    private String sFaceValue;
    
    public Card()
    {
    }
    public Card(int iFace, String sSuit)
    {
        this.sFaceValue = String.valueOf(iFace);
        this.sSuit = sSuit;
        
    }
    public Card(String sFace, String sSui)
    {
        sFaceValue = sFace;
        sSuit= sSui;
    }
    public String getSuit() 
    {
        return (sSuit);
    }
    public void setSuit(String sSuit) 
    {
        this.sSuit = sSuit;
    }
    public int getId() 
    {
        return iId;
    }
    public void setId(int iId) 
    {
        this.iId = iId;
    }
    public String getFaceValue() 
    {
        return sFaceValue;
    }
    public void setFaceValue(String sFace) 
    {
        this.sFaceValue = sFace;
    }
    public String checkFaceValue()
    {
        String value;
        switch(sFaceValue)
        {
            case "0": value = "Ace  ";
                break;
            case "1": value = "2    ";
                break;
            case "2": value = "3    ";
                break;
            case "3": value = "4    ";
                break;
            case "4": value = "5    ";
                break;
            case "5": value = "6    ";
                break;
            case "6": value = "7    ";
                break;
            case "7": value = "8    ";
                break;
            case "8": value = "9    ";
                break;
            case "9": value = "10   ";
                break;
            case "10": value = "Jack ";
                break;
            case "11": value = "Queen";
                break;
            case "12": value = "King ";
                break;
            default: value = "error";
                break;
        }
        return value;
    }
}