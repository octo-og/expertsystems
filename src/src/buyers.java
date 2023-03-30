public class buyers {
    willing willing= new willing();
    able able = new able();
    public double probabilityOfDoctorBuying(String productID){
        return (double) willing.probabilityOfBuyGivenDoctor(productID)* able.probabilityOfAbleBuyGivenDoctor(productID)*100;
    }
    public double probabilityOfTeacherBuying(String productID){
        return (double) willing.probabilityOfBuyGivenTeacher(productID)* able.probabilityOfAbleBuyGivenTeacher(productID)*100;
    }
    public double probabilityOfFarmerBuying(String productID){
        return (double) willing.probabilityOfBuyGivenFarmer(productID)* able.probabilityOfAbleBuyGivenFarmer(productID)*100;
    }
    public double probabilityOfIndustryBuying(String productId){
        return (double) willing.probabilityOfBuyGivenIndurstry(productId)* able.probabilityOfAbleBuyGivenIndustry(productId)*100;
    }
    public double probabilityOfBusinessBuying(String productID){
        return (double) willing.probabilityOfBuyGivenBusiness(productID)* able.probabilityOfAbleBuyGivenBusiness(productID)*100;
    }
    public double probabilityOfStudentBuying(String productID){
        return (double) willing.probabilityOfBuyGivenStudent(productID)* able.probabilityOfAbleBuyGivenStudent(productID)*100;
    }
}
