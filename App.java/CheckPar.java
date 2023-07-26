
public class CheckPar {
    String[] arr;
    int num_par;
    int res;
  
    public int Qn() {
      res = 0;
  
      if (arr.length > num_par) {
        return -1;
      } else if (arr.length < num_par) {
        return -2;
      }
      return res;
    }
  
    public void setArr(String[] arr) {
      this.arr = arr;
    }
  
    public void setNum_par(int num_par) {
      this.num_par = num_par;
    }
  
  }