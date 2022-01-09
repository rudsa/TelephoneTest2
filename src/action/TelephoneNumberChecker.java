package action;

public class TelephoneNumberChecker {
        public boolean telAreaNumberChecker(String telNumber){
            if(telNumber.matches("(0(1(0)))(\\d{4})(\\d{4})")){
                return true;
            }else if(telNumber.matches("(0(1(1|7|8)))(\\d{3})(\\d{4})")){
                return true;
            }else if(telNumber.matches("(0(2|3(1|2|3)|4(1|2|3)|5(1|2|3|4|5)|6(1|2|3|4)))(\\d{3})(\\d{4})")){
                return true;
            }
            return false;
        }
}
