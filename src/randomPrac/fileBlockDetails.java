package randomPrac;

public class fileBlockDetails {

   String fbNum;
   double supportVal;
   long ts = 0;

   public fileBlockDetails(String fbNum, double supportVal) {
      this.fbNum = fbNum;
      this.supportVal = supportVal;
   }

   public String getFbNum() {
      return fbNum;
   }

   public void setFbNum(String fbNum) {
      this.fbNum = fbNum;
   }

   public double getSupportVal() {
      return supportVal;
   }

   public void setSupportVal(double supportVal) {
      this.supportVal = supportVal;
   }

   public long getTs() {
      return ts;
   }

   public void setTs(long ts) {
      this.ts = ts;
   }

}
