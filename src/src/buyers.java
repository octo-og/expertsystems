public class buyers {
    willing willing= new willing();
    able able = new able();
    public double probabilityOfDoctorBuying(){
        return (double) willing.probabilityOfBuyGivenDoctor()* able.probabilityOfAbleBuyGivenDoctor()*100;
    }
    public double probabilityOfTeacherBuying(){
        return (double) willing.probabilityOfBuyGivenTeacher()* able.probabilityOfAbleBuyGivenTeacher()*100;
    }
    public double probabilityOfFarmerBuying(){
        return (double) willing.probabilityOfBuyGivenFarmer()* able.probabilityOfAbleBuyGivenFarmer()*100;
    }
    public double probabilityOfIndustryBuying(){
        return (double) willing.probabilityOfBuyGivenIndurstry()* able.probabilityOfAbleBuyGivenIndustry()*100;
    }
    public double probabilityOfBusinessBuying(){
        return (double) willing.probabilityOfBuyGivenBusiness()* able.probabilityOfAbleBuyGivenBusiness()*100;
    }
    public double probabilityOfStudentBuying(){
        return (double) willing.probabilityOfBuyGivenStudent()* able.probabilityOfAbleBuyGivenStudent()*100;
    }
}
