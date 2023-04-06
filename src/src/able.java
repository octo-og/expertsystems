public class able {
    databaseControl databaseControl = new databaseControl();
    int sum=0;
    double div=0;
    double multiplication=0;
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
        div =(double) databaseControl.doctorAbleBuy(productID)/ databaseControl.allYesAbleBuy(productID);
        multiplication =div*probabilityOfYesAbleBuy(productID);
        return multiplication/probabilityOfYesAbleDoctor(productID);
    }
    public  double probabilityOfAbleBuyGivenTeacher(String productID){
        div = (double) databaseControl.teacherAbleBuy(productID)/ databaseControl.allYesAbleBuy(productID);
        multiplication=div*probabilityOfYesAbleBuy(productID);
        return multiplication/probabilityOfYesAbleTeacher(productID);
    }
    public  double probabilityOfAbleBuyGivenFarmer(String productID){
        div = (double) databaseControl.farmerAbleBuy(productID)/ databaseControl.allYesAbleBuy(productID);
        multiplication = div * probabilityOfYesAbleBuy(productID);
        return multiplication/probabilityOfYesAbleFarmer(productID);
    }
    public  double probabilityOfAbleBuyGivenIndustry(String productID){
        div = (double) databaseControl.industryAbleBuy(productID)/ databaseControl.allYesAbleBuy(productID);
        multiplication =div*probabilityOfYesAbleBuy(productID);
        return  multiplication/probabilityOfYesAbleIndustry(productID);
    }
    public  double probabilityOfAbleBuyGivenBusiness(String productID){
        div =(double) databaseControl.businessAbleBuy(productID)/ databaseControl.allYesAbleBuy(productID);
        multiplication = div*probabilityOfYesAbleBuy(productID);
        return multiplication/probabilityOfYesAbleBusiness(productID);
    }
    public  double probabilityOfAbleBuyGivenStudent(String productID){
        div =(double) databaseControl.studentAbleBuy(productID)/ databaseControl.allYesBuy(productID);
        multiplication = div * probabilityOfYesAbleBuy(productID);
        return multiplication/probabilityOfStudent(productID);
    }

    public static  void main(String args[]){
able able =new able();
        databaseControl databaseControl1 = new databaseControl();
        System.out.println(able.probabilityOfAbleBuyGivenTeacher("15"));
    }
}
