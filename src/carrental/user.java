
package carrental;

public class user {
   String Company,model;
   double CarNum; 

    public user(String Company, String model, double CarNum) {
        this.Company = Company;
        this.model = model;
        this.CarNum = CarNum;
    }

    user(double CarNum, String Company, String Model) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
}
