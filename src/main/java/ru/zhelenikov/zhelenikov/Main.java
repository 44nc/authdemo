package ru.zhelenikov.zhelenikov;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Agreement> list = new ArrayList<>();
        Agreement agreement1 = null;
        Agreement agreement2 = new Agreement("100");

        list.add(agreement2);
//        list.add(agreement1);


        String num = "100";

        for (Agreement agreement : list) {
            if (agreement.agreementId != null && agreement.agreementId.equals("100")){
                System.out.println("hello");
            }
//            else System.out.println("else");
        }


    }



    static class Agreement{
        String agreementId;
        String NUM = "100";

        Agreement(String agreementId){
            this.agreementId = agreementId;
        }

        String getAgreementId(){
            return agreementId;
        }

    }
}
