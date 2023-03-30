public class able {
    databaseControl databaseControl = new databaseControl();
    int allWorkers= databaseControl.allWorkers();
    int sum=0;
    public double probabilityOfYesAbleDoctor(){
        sum = databaseControl.doctorNotAbleBuy()+ databaseControl.doctorAbleBuy();
        return (double) sum/allWorkers;
    }
    public double probabilityOfYesAbleTeacher(){
        sum= databaseControl.teacherAbleBuy()+databaseControl.teacherNotAbleBuy();
        return (double) sum/allWorkers;
    }
    public double probabilityOfYesAbleFarmer(){
        sum = databaseControl.farmerAbleBuy()+ databaseControl.farmerNotAbleBuy();
        return (double) sum/allWorkers;
    }
    public double probabilityOfYesAbleIndustry(){
        sum = databaseControl.indurstryAbleBuy()+ databaseControl.indurstryNotAbleBuy();
        return (double) sum/allWorkers;
    }
    public double probabilityOfYesAbleBusiness(){
        sum = databaseControl.businessAbleBuy()+ databaseControl.businessNotAbleBuy();
        return (double) sum/allWorkers;
    }
    public  double probabilityOfStudent(){
        sum= databaseControl.studentAbleBuy()+ databaseControl.studentNotAbleBuy();
        return  (double) sum/ databaseControl.allResponders();
    }
    public double probabilityOfYesAbleBuy(){
        sum= databaseControl.doctorAbleBuy()+
                databaseControl.teacherAbleBuy()+
                databaseControl.farmerAbleBuy()+
                databaseControl.indurstryAbleBuy()+
                databaseControl.businessAbleBuy()+
                databaseControl.studentAbleBuy();
        return (double) sum/ databaseControl.allResponders();
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
    public  double probabilityOfAbleBuyGivenDoctor(){
        return (double) ((databaseControl.doctorAbleBuy()/ databaseControl.allYesAbleBuy())*probabilityOfYesAbleBuy())/probabilityOfYesAbleDoctor();
    }
    public  double probabilityOfAbleBuyGivenTeacher(){
        return (double) ((databaseControl.teacherAbleBuy()/ databaseControl.allYesAbleBuy())*probabilityOfYesAbleBuy())/probabilityOfYesAbleTeacher();
    }
    public  double probabilityOfAbleBuyGivenFarmer(){
        return (double) ((databaseControl.farmerAbleBuy()/ databaseControl.allYesAbleBuy())*probabilityOfYesAbleBuy())/probabilityOfYesAbleFarmer();
    }
    public  double probabilityOfAbleBuyGivenIndustry(){
        return (double) ((databaseControl.indurstryAbleBuy()/ databaseControl.allYesAbleBuy())*probabilityOfYesAbleBuy())/probabilityOfYesAbleIndustry();
    }
    public  double probabilityOfAbleBuyGivenBusiness(){
        return (double) ((databaseControl.businessAbleBuy()/ databaseControl.allYesAbleBuy())*probabilityOfYesAbleBuy())/probabilityOfYesAbleBusiness();
    }
    public  double probabilityOfAbleBuyGivenStudent(){
        return (double) ((databaseControl.studentAbleBuy()/ databaseControl.allYesBuy())*probabilityOfYesAbleBuy())/probabilityOfStudent();
    }
}
