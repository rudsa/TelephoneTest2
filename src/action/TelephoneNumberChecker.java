package action;

public class TelephoneNumberChecker {
        private String telNumber = "";
        public void setTelNumber(String telNumber){
            this.telNumber = telNumber;
        }

        public String getTelNumber(){
            return this.telNumber;
        }

        public boolean telAreaNumberChecker(){
            if(getTelNumber().matches("(0(1(0)))(\\d{4})(\\d{4})")){
                return true;
            }else if(getTelNumber().matches("(0(1(1|7|8)))(\\d{3})(\\d{4})")){
                return true;
            }else if(getTelNumber().matches("(0(2|3(1|2|3)|4(1|2|3)|5(1|2|3|4|5)|6(1|2|3|4)))(\\d{3})(\\d{4})")){
                return true;
            }
            return false;
        }
}
