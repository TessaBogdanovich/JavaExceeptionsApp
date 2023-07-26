
public class ExtEmpty extends Exception{
    private String s;
    // public void setS(String s) {
    //   this.s = s;
    // }
    
    public void str(String s) throws Exception{
      this.s = s;
    try 
    {
      if (this.s.equals("")) {
       throw new Exception("String is empty!");
      }
    } catch (NullPointerException e) {
      throw new NullPointerException("String is null!");
  
    }
  }
  }