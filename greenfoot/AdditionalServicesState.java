/**
 * Write a description of class AdditionalServices here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AdditionalServicesState  implements State 
{
    // instance variables - replace the example below with your own

    StatesImplementation statesImplementation;
    
    public AdditionalServicesState(StatesImplementation statesImplementation){
        this.statesImplementation = statesImplementation;
    }
   
    
   public String getMessage(){
       return "Additional Services";
   }
    
   public void setState(){
       statesImplementation.setCurrentState(statesImplementation.getValidateCardState());
   }
   
   public State getCurrentState(){
       return statesImplementation.getCurrentState();
   }
        
   public void onButtonClick(int buttonId){
       // TODO Instead of setting the state here, set when credit card is on card reader
       switch(buttonId){
            case 1:
                System.out.println("Button 1");
                break;
            case 2:
                System.out.println("Button 2");
                
                break;
            case 3:
                System.out.println("Button 3");
                statesImplementation.getServices().add("Car Wash");                             
                break;
            case 4:
                System.out.println("Button 4");
                statesImplementation.getServices().add("Car Maintainence");             
                break;
            case 5:
                System.out.println("Button 5");
                break;
            case 6:
                System.out.println("Button 6");
                break;                
            case 7:
                System.out.println("Button 7");
                statesImplementation.getServices().add("Air Filling");
                break;                
            case 8:
                System.out.println("Button 8");
                statesImplementation.setCurrentState(statesImplementation.getBillState());
                //statesImplementation;
                break;                
            default:
                System.out.println("Default");
                break;                
        }
   }
}
