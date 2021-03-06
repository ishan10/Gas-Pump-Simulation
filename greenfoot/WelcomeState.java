/**
 * Write a description of class WelcomeState here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WelcomeState implements State 
{
    // instance variables - replace the example below with your own

    StatesImplementation statesImplementation;
    
    public WelcomeState(StatesImplementation statesImplementation){
        this.statesImplementation = statesImplementation;
    }
   
    
   public String getMessage(){
       return "             Welcome!\n\nStart by swiping credit card";
   }
    
   public void setState(){
       statesImplementation.setCurrentState(statesImplementation.getValidateCardState());
   }
   
   public State getCurrentState(){
       return statesImplementation.getCurrentState();
   }
        
   public void onButtonClick(int buttonId){
       switch(buttonId){
            case 1:
                System.out.println("Button 1");
                break;
            case 2:
                System.out.println("Button 2");
                break;
            case 3:
                System.out.println("Button 3");
                break;
            case 4:
                System.out.println("Button 4");
                break;
            case 5:
                System.out.println("Button 5");
                break;
            case 6:
                System.out.println("Button 6");
                break;                
            case 7:
                System.out.println("Button 7");
                break;                
            case 8:
                System.out.println("Button 8");
                break;                
            default:
                System.out.println("Default");
                break;                
        }
   }
}
