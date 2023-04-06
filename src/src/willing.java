public class willing {
    databaseControl databaseControl = new databaseControl();

    int sum=0;
    double div=0;
    double multiplication=0;
    public double probabilityOfYesDoctor(String productID){
         sum = databaseControl.doctorNotBuy(productID)+ databaseControl.doctorBuy(productID);
        return (double) sum/databaseControl.allWorkers(productID);
    }
    public double probabilityOfYesTeacher(String productID){
        sum= databaseControl.teacherBuy(productID)+databaseControl.teacherNotBuy(productID);
        return (double) sum/databaseControl.allWorkers(productID);
    }
    public double probabilityOfYesFarmer(String productID){
         sum = databaseControl.farmerBuy(productID)+ databaseControl.farmerNotBuy(productID);
        return (double) sum/databaseControl.allWorkers(productID);
    }
    public double probabilityOfYesIndustry(String productID){
        sum = databaseControl.indurstryBuy(productID)+ databaseControl.industryNotBuy(productID);
        return (double)sum/databaseControl.allWorkers(productID);
    }
    public double probabilityOfYesBusiness(String productID){
        sum = databaseControl.businessBuy(productID)+ databaseControl.businessNotBuy(productID);
        return (double) sum/databaseControl.allWorkers(productID);
    }
    public  double probabilityOfStudent(String productID){
        sum= databaseControl.studentBuy(productID)+ databaseControl.studentNotBuy(productID);
        return  (double) sum/ databaseControl.allResponders(productID);
    }
    public double probabilityOfYesBuy(String productID){
        sum= databaseControl.doctorBuy(productID)+
                databaseControl.teacherBuy(productID)+
                databaseControl.farmerBuy(productID)+
                databaseControl.indurstryBuy(productID)+
                databaseControl.businessBuy(productID)+
                databaseControl.studentBuy(productID);

        return (double) sum/databaseControl.allResponders(productID);
    }
/*    public double probabilityOfNoBuy(String productID){
        sum= databaseControl.doctorNotBuy(productID)+
                databaseControl.teacherNotBuy(productID)+
                databaseControl.farmerNotBuy(productID)+
                databaseControl.industryNotBuy(productID)+
                databaseControl.businessNotBuy(productID)+
                databaseControl.studentNotBuy(productID);
        return  (double) sum/ databaseControl.allResponders(productID);
    }*/
    //probability of a buy give it's a doctor
    public  double probabilityOfBuyGivenDoctor(String productID){
        return (double) ((databaseControl.doctorBuy(productID)/ databaseControl.allYesBuy(productID))*probabilityOfYesBuy(productID))/probabilityOfYesDoctor(productID);
    }
    public  double probabilityOfBuyGivenTeacher(String productID){
         div=(double) databaseControl.teacherBuy(productID)/databaseControl.allYesBuy(productID);
         multiplication=div*probabilityOfYesBuy(productID);
       return multiplication/probabilityOfYesTeacher(productID);
    }
    public  double probabilityOfBuyGivenFarmer(String productID){
         div=(double) databaseControl.farmerBuy(productID)/ databaseControl.allYesBuy(productID);
         multiplication=div*probabilityOfYesBuy(productID);
        return multiplication/probabilityOfYesFarmer(productID);
    }
    public  double probabilityOfBuyGivenIndurstry(String productID){
        div =(double) databaseControl.indurstryBuy(productID)/ databaseControl.allYesBuy(productID);
        multiplication=div*probabilityOfYesBuy(productID);
        return multiplication/probabilityOfYesIndustry(productID);
    }
    public  double probabilityOfBuyGivenBusiness(String productID){
        div =(double) databaseControl.businessBuy(productID)/ databaseControl.allYesBuy(productID);
        multiplication=div*probabilityOfYesBuy(productID);
        return multiplication/probabilityOfYesBusiness(productID);
    }
    public  double probabilityOfBuyGivenStudent(String productID){
        div=(double) databaseControl.studentBuy(productID)/ databaseControl.allYesBuy(productID);
        multiplication=div*probabilityOfYesBuy(productID);
        return multiplication/probabilityOfStudent(productID);
    }

}
