public class able {
    databaseControl databaseControl = new databaseControl();
    int sum=0;
    public double probabilityOfYesAbleDoctor(String productID){
        sum = databaseControl.doctorNotAbleBuy(productID)+ databaseControl.doctorAbleBuy(productID);
        return (double) sum/databaseControl.allWorkers(productID);
    }
    public double probabilityOfYesAbleTeacher(String productID){
        sum= databaseControl.teacherAbleBuy(productID)+databaseControl.teacherNotAbleBuy(productID);
        return (double)sum/databaseControl.allWorkers(productID);
    }
    public double probabilityOfYesAbleFarmer(String productID){
        sum = databaseControl.farmerAbleBuy(productID)+ databaseControl.farmerNotAbleBuy(productID);
        return (double) sum/databaseControl.allWorkers(productID);
    }
    public double probabilityOfYesAbleIndustry(String productID){
        sum = databaseControl.industryAbleBuy(productID)+ databaseControl.indurstryNotAbleBuy(productID);
        return (double)sum/databaseControl.allWorkers(productID);
    }
    public double probabilityOfYesAbleBusiness(String productID){
        sum = databaseControl.businessAbleBuy(productID)+ databaseControl.businessNotAbleBuy(productID);
        return (double) sum/databaseControl.allWorkers(productID);
    }
    public  double probabilityOfStudent(String productID){
        sum= databaseControl.studentAbleBuy(productID)+ databaseControl.studentNotAbleBuy(productID);
        return  (double) sum/ databaseControl.allResponders(productID);
    }
    public double probabilityOfYesAbleBuy(String productID){
        sum= databaseControl.doctorAbleBuy(productID)+
                databaseControl.teacherAbleBuy(productID)+
                databaseControl.farmerAbleBuy(productID)+
                databaseControl.industryAbleBuy(productID)+
                databaseControl.businessAbleBuy(productID)+
                databaseControl.studentAbleBuy(productID);
        return (double) sum/ databaseControl.allResponders(productID);
    }
/*    public double probabilityOfNoBuy(){
        sum= databaseControl.doctorNotAbleBuy()+
                databaseControl.teacherNotAbleBuy()+
                databaseControl.farmerNotAbleBuy()+
                databaseControl.indurstryNotAbleBuy()+
                databaseControl.businessNotAbleBuy()+
                databaseControl.studentNotAbleBuy();
        return  (double) sum/ databaseControl.allResponders();
    }*/
    //probability of a buy give it's a doctor
    public  double probabilityOfAbleBuyGivenDoctor(String productID){
        return (double) ((databaseControl.doctorAbleBuy(productID)/ databaseControl.allYesAbleBuy(productID))*probabilityOfYesAbleBuy(productID))/probabilityOfYesAbleDoctor(productID);
    }
    public  double probabilityOfAbleBuyGivenTeacher(String productID){
        return (double) ((databaseControl.teacherAbleBuy(productID)/ databaseControl.allYesAbleBuy(productID))*probabilityOfYesAbleBuy(productID))/probabilityOfYesAbleTeacher(productID);
    }
    public  double probabilityOfAbleBuyGivenFarmer(String productID){
        return (double) ((databaseControl.farmerAbleBuy(productID)/ databaseControl.allYesAbleBuy(productID))*probabilityOfYesAbleBuy(productID))/probabilityOfYesAbleFarmer(productID);
    }
    public  double probabilityOfAbleBuyGivenIndustry(String productID){
        return (double) ((databaseControl.industryAbleBuy(productID)/ databaseControl.allYesAbleBuy(productID))*probabilityOfYesAbleBuy(productID))/probabilityOfYesAbleIndustry(productID);
    }
    public  double probabilityOfAbleBuyGivenBusiness(String productID){
        return (double) ((databaseControl.businessAbleBuy(productID)/ databaseControl.allYesAbleBuy(productID))*probabilityOfYesAbleBuy(productID))/probabilityOfYesAbleBusiness(productID);
    }
    public  double probabilityOfAbleBuyGivenStudent(String productID){
        return (double) ((databaseControl.studentAbleBuy(productID)/ databaseControl.allYesBuy(productID))*probabilityOfYesAbleBuy(productID))/probabilityOfStudent(productID);
    }
}
