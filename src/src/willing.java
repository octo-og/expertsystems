public class willing {
    databaseControl databaseControl = new databaseControl();
    int allWorkers= databaseControl.allWorkers();
    int sum=0;
    public double probabilityOfYesDoctor(){
         sum = databaseControl.doctorNotBuy()+ databaseControl.doctorBuy();
        return (double) sum/allWorkers;
    }
    public double probabilityOfYesTeacher(){
        sum= databaseControl.teacherBuy()+databaseControl.teacherNotBuy();
        return (double) sum/allWorkers;
    }
    public double probabilityOfYesFarmer(){
         sum = databaseControl.farmerBuy()+ databaseControl.farmerNotBuy();
        return (double) sum/allWorkers;
    }
    public double probabilityOfYesIndustry(){
        sum = databaseControl.indurstryBuy()+ databaseControl.indurstryNotBuy();
        return (double) sum/allWorkers;
    }
    public double probabilityOfYesBusiness(){
        sum = databaseControl.businessBuy()+ databaseControl.businessNotBuy();
        return (double) sum/allWorkers;
    }
    public  double probabilityOfStudent(){
        sum= databaseControl.studentBuy()+ databaseControl.studentNotBuy();
        return  (double) sum/ databaseControl.allResponders();
    }
    public double probabilityOfYesBuy(){
        sum= databaseControl.doctorBuy()+
                databaseControl.teacherBuy()+
                databaseControl.farmerBuy()+
                databaseControl.indurstryBuy()+
                databaseControl.businessBuy()+
                databaseControl.studentBuy();
        return (double) sum/ databaseControl.allResponders();
    }
    public double probabilityOfNoBuy(){
        sum= databaseControl.doctorNotBuy()+
                databaseControl.teacherNotBuy()+
                databaseControl.farmerNotBuy()+
                databaseControl.indurstryNotBuy()+
                databaseControl.businessNotBuy()+
                databaseControl.studentNotBuy();
        return  (double) sum/ databaseControl.allResponders();
    }
    //probability of a buy give it's a doctor
    public  double probabilityOfBuyGivenDoctor(){
        return (double) ((databaseControl.doctorBuy()/ databaseControl.allYesBuy())*probabilityOfYesBuy())/probabilityOfYesDoctor();
    }
    public  double probabilityOfBuyGivenTeacher(){
        return (double) ((databaseControl.teacherBuy()/ databaseControl.allYesBuy())*probabilityOfYesBuy())/probabilityOfYesTeacher();
    }
    public  double probabilityOfBuyGivenFarmer(){
        return (double) ((databaseControl.farmerBuy()/ databaseControl.allYesBuy())*probabilityOfYesBuy())/probabilityOfYesFarmer();
    }
    public  double probabilityOfBuyGivenIndurstry(){
        return (double) ((databaseControl.indurstryBuy()/ databaseControl.allYesBuy())*probabilityOfYesBuy())/probabilityOfYesIndustry();
    }
    public  double probabilityOfBuyGivenBusiness(){
        return (double) ((databaseControl.businessBuy()/ databaseControl.allYesBuy())*probabilityOfYesBuy())/probabilityOfYesBusiness();
    }
    public  double probabilityOfBuyGivenStudent(){
        return (double) ((databaseControl.studentBuy()/ databaseControl.allYesBuy())*probabilityOfYesBuy())/probabilityOfStudent();
    }
}
